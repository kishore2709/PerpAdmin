// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="company_programs_temp")
public class CompanyProgramsTemp implements Serializable {

	 @Id
    @Column(name="Company_UID", nullable=false, precision=10)
    private Integer companyUid;
    @Column(name="company_programs_uid", precision=10)
    private Integer companyProgramsUid;

    /** Default constructor. */
    public CompanyProgramsTemp() {
        super();
    }

    /**
     * Access method for companyUid.
     *
     * @return the current value of companyUid
     */
    public Integer getCompanyUid() {
        return companyUid;
    }

    /**
     * Setter method for companyUid.
     *
     * @param aCompanyUid the new value for companyUid
     */
    public void setCompanyUid(Integer aCompanyUid) {
        companyUid = aCompanyUid;
    }

    /**
     * Access method for companyProgramsUid.
     *
     * @return the current value of companyProgramsUid
     */
    public Integer getCompanyProgramsUid() {
        return companyProgramsUid;
    }

    /**
     * Setter method for companyProgramsUid.
     *
     * @param aCompanyProgramsUid the new value for companyProgramsUid
     */
    public void setCompanyProgramsUid(Integer aCompanyProgramsUid) {
        companyProgramsUid = aCompanyProgramsUid;
    }

}
