// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="company_programs")
public class CompanyPrograms implements Serializable {

    /** Primary key. */
    protected static final String PK = "companyProgramsUid";

    @Id
    @Column(name="Company_Programs_UID", unique=true, nullable=false, precision=10)
    private Integer companyProgramsUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_UID", nullable=false)
    private Company company;
    @ManyToOne(optional=false)
    @JoinColumn(name="Programs_UID", nullable=false)
    private Programs programs;

    /** Default constructor. */
    public CompanyPrograms() {
        super();
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

    /**
     * Access method for createModifiedBy.
     *
     * @return the current value of createModifiedBy
     */
    public String getCreateModifiedBy() {
        return createModifiedBy;
    }

    /**
     * Setter method for createModifiedBy.
     *
     * @param aCreateModifiedBy the new value for createModifiedBy
     */
    public void setCreateModifiedBy(String aCreateModifiedBy) {
        createModifiedBy = aCreateModifiedBy;
    }

    /**
     * Access method for createModifiedDate.
     *
     * @return the current value of createModifiedDate
     */
    public Timestamp getCreateModifiedDate() {
        return createModifiedDate;
    }

    /**
     * Setter method for createModifiedDate.
     *
     * @param aCreateModifiedDate the new value for createModifiedDate
     */
    public void setCreateModifiedDate(Timestamp aCreateModifiedDate) {
        createModifiedDate = aCreateModifiedDate;
    }

    /**
     * Access method for company.
     *
     * @return the current value of company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Setter method for company.
     *
     * @param aCompany the new value for company
     */
    public void setCompany(Company aCompany) {
        company = aCompany;
    }

    /**
     * Access method for programs.
     *
     * @return the current value of programs
     */
    public Programs getPrograms() {
        return programs;
    }

    /**
     * Setter method for programs.
     *
     * @param aPrograms the new value for programs
     */
    public void setPrograms(Programs aPrograms) {
        programs = aPrograms;
    }

    /**
     * Compares the key for this instance with another CompanyPrograms.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CompanyPrograms and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CompanyPrograms)) {
            return false;
        }
        CompanyPrograms that = (CompanyPrograms) other;
        Object myCompanyProgramsUid = this.getCompanyProgramsUid();
        Object yourCompanyProgramsUid = that.getCompanyProgramsUid();
        if (myCompanyProgramsUid==null ? yourCompanyProgramsUid!=null : !myCompanyProgramsUid.equals(yourCompanyProgramsUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CompanyPrograms.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CompanyPrograms)) return false;
        return this.equalKeys(other) && ((CompanyPrograms)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getCompanyProgramsUid() == null) {
            i = 0;
        } else {
            i = getCompanyProgramsUid().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[CompanyPrograms |");
        sb.append(" companyProgramsUid=").append(getCompanyProgramsUid());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("companyProgramsUid", getCompanyProgramsUid());
        return ret;
    }

}
