package com.springapp.modules.security.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.springapp.modules.security.repository.PermissionRepository;
import com.springapp.modules.security.repository.RoleRepository;
import com.springapp.modules.system.domain.perp.RolePermissionRelation;
import com.springapp.modules.system.domain.perp.UserRole;
import com.springapp.modules.system.domain.perp.Users;

@Service
@CacheConfig(cacheNames = "role")
public class JwtPermissionService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private PermissionRepository permissionRepository;

	@Cacheable(key = "'loadPermissionByUser:' + #p0.username")
	public Collection<GrantedAuthority> mapToGrantedAuthorities(Users user) {

		System.out.println("--------------------loadPermissionByUser: " + user.getUsername() + " with userID "
				+ user.getUsersUid() + "-----------------");

		Set<UserRole> roles = roleRepository.findByUsers_usersUid(user.getUsersUid());
		Set<RolePermissionRelation> permissions = new HashSet<>();
		for (UserRole role : roles) {
			Set<UserRole> roleSet = new HashSet<>();
			roleSet.add(role);
			permissions.addAll(permissionRepository.findByRoles_rolesUid((role.getRolesRolesUid())));
		}

		System.out.println(permissions.iterator().next().getPermissions().getPermissionCodes().getPcDescription());

		return permissions.stream()
				.map(permission -> new SimpleGrantedAuthority(
						permissions.iterator().next().getPermissions().getPermissionCodes().getPcDescription()))
				.collect(Collectors.toList());
	}
}
