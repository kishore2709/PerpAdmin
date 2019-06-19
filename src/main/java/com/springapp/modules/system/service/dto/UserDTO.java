package com.springapp.modules.system.service.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springapp.modules.system.domain.perp.Email;
import com.springapp.modules.system.domain.perp.Phone;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class UserDTO implements Serializable {

    @ApiModelProperty(hidden = true)
    private Long id;

    private String username;

    private String avatar;

    private Set<Email> email;

    private Set<Phone> phone;

    private Boolean enabled;

    @JsonIgnore
    private String password;

    private Timestamp createTime;

    private Date lastPasswordResetTime;

    @ApiModelProperty(hidden = true)
    private Set<RoleDTO> roles;

    //private Set<EmailDTO> emailDTO;
    
    @ApiModelProperty(hidden = true)
    private JobDTO job;

    private DeptDTO dept;

    private Long deptId;
}
