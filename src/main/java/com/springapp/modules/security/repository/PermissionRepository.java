package com.springapp.modules.security.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.springapp.modules.system.domain.perp.RolePermissionRelation;


public interface PermissionRepository extends JpaRepository<RolePermissionRelation, Long>, JpaSpecificationExecutor {

//    /**
//     * findByName
//     * @param name
//     * @return
//     */
//    Permission findByName(String name);
//
//    /**
//     * findByPid
//     * @param pid
//     * @return
//     */
//    List<Permission> findByPid(long pid);
//
//    Set<Permission> findByRoles_Id(Long id);
	
	
    Set<RolePermissionRelation> findByRoles_rolesUid(Integer integer);

}
