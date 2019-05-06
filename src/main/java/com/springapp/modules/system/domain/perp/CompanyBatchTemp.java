// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="company_batch_temp")
public class CompanyBatchTemp implements Serializable {
	 @Id
    @Column(name="Company_UID", nullable=false, precision=10)
    private Integer companyUid;

    /** Default constructor. */
    public CompanyBatchTemp() {
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

}
