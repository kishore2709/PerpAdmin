package com.springapp.modules.system.service.mapper;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.springapp.mapper.EntityMapper;
import com.springapp.modules.system.domain.perp.Email;
import com.springapp.modules.system.domain.perp.Users;
import com.springapp.modules.system.service.dto.EmailDTO;
import com.springapp.modules.system.service.dto.UserDTO;
@Mapper(componentModel = "spring",uses = {RoleMapper.class, DeptMapper.class, JobMapper.class, EmailMapper.class},
//@Mapper(componentModel = "spring",
unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper extends EntityMapper<UserDTO, Users> {
	

    Set<Email> map(Set<EmailDTO> value);
    

}


