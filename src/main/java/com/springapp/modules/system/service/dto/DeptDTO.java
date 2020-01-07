package com.springapp.modules.system.service.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
public class DeptDTO implements Serializable {

    /**
     * ID
     */
    private Long id;

    /**
     *  
     */
    private String name;

    @NotNull
    private Boolean enabled;

    /**
     *  
     */
    private Long pid;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<DeptDTO> children;

    private Timestamp createTime;

    public String getLabel() {
        return name;
    }
}