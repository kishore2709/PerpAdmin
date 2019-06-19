
package com.springapp.modules.system.service.mapper;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.springapp.modules.system.domain.perp.Email;
import com.springapp.modules.system.service.dto.EmailDTO;

//@Mapper(componentModel = "spring",uses = {RoleMapper.class, DeptMapper.class, JobMapper.class},
@Mapper(componentModel = "default" , unmappedTargetPolicy = ReportingPolicy.WARN)
public interface EmailMapper  {

//	@Mapping(target="emailUid", source="emailUid")
//	EmailDTO emailDto(Email email);
//	
 //   Set<Email> map(Set<EmailDTO> value);
  
}


