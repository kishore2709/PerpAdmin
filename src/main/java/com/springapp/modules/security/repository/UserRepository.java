package com.springapp.modules.security.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.springapp.modules.system.domain.perp.Users;

public interface UserRepository extends JpaRepository<Users, Integer>, JpaSpecificationExecutor {

	Optional<Users> findByUsernameOrEmail(String username, String email);
	Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
    /**
     * findByUsername
     * @param username
     * @return
     */
    Optional<Users> findByUsername(String username);

    /**
     * findByEmail
     * @param email
     * @return
     */
    Users findByEmail(String email);

    /**
     * Changing password
     * @param username
     * @param pass
     */
    @Modifying
    @Query(value = "update user set password = ?2 , last_password_reset_time = ?3 where username = ?1",nativeQuery = true)
    void updatePass(String username, String pass, Date lastPasswordResetTime);


    /**
     *Chnage email
     * @param username
     * @param email
     */
    @Modifying
    @Query(value = "update user set email = ?2 where username = ?1",nativeQuery = true)
    void updateEmail(String username, String email);
}
