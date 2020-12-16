package com.springapp.modules.security;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springapp.modules.system.domain.perp.Email;
import com.springapp.modules.system.domain.perp.Phone;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class JwtUser implements UserDetails {
	/*
	user.getUsersUid(),
    user.getUsername(),
    user.getPassword(),
    user.getEmail(),
    user.getPhone(),
   // Optional.ofNullable(user.getDept()).map(Dept::getName).orElse(null),
  //  Optional.ofNullable(user.getJob()).map(Job::getName).orElse(null),
   // permissionService.mapToGrantedAuthorities(user),
    user.getActiveFlag(),
    user.getCreateModifiedDate()
*/
    @JsonIgnore
    private final Integer id;

    private final String username;

    @JsonIgnore
    private final String password;

   // private final String avatar;
    @JsonIgnore
    private Set<Email> email;
    @JsonIgnore
    private Set<Phone> phone;

 //   private final String dept;

  //  private final String job;

   @JsonIgnore
    private final Collection<GrantedAuthority> authorities;
   
    private final Character enabled;

    private Timestamp createTime;

    //@JsonIgnore
    //private final Date lastPasswordResetDate;

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }


    public Collection getRoles() {
        return authorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toSet());
    }

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		if(enabled.equals("Y"))
			return true;
		return false;
	}

}
