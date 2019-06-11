package com.springapp.modules.security.repository;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.springapp.modules.system.domain.Role;
import com.springapp.modules.system.domain.perp.UserRole;

public interface RoleRepository extends JpaRepository<UserRole, Long>, JpaSpecificationExecutor {

    /**
     * findByName
     * @param name
     * @return
     */
//	Optional<Role> findByName(String name);

    Set<UserRole> findByUsers_usersUid(Integer integer);

//    Set<UserRole> findByMenus_Id(Long id);
}
