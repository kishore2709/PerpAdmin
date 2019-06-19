package com.springapp.modules.system.service.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

import lombok.Data;


@Data
public class EmailDTO implements Serializable {

    private Integer emailUid;
    private String email;
    private String createModifiedBy;
    private Timestamp createModifiedDate;

}