// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="user_company_programs_temp")
public class UserCompanyProgramsTemp implements Serializable {

    @Id
    @Column(name="user_company_programs_UID", nullable=false, precision=10)
    private Integer userCompanyProgramsUid;

    /** Default constructor. */
    public UserCompanyProgramsTemp() {
        super();
    }

    /**
     * Access method for userCompanyProgramsUid.
     *
     * @return the current value of userCompanyProgramsUid
     */
    public Integer getUserCompanyProgramsUid() {
        return userCompanyProgramsUid;
    }

    /**
     * Setter method for userCompanyProgramsUid.
     *
     * @param aUserCompanyProgramsUid the new value for userCompanyProgramsUid
     */
    public void setUserCompanyProgramsUid(Integer aUserCompanyProgramsUid) {
        userCompanyProgramsUid = aUserCompanyProgramsUid;
    }

}
