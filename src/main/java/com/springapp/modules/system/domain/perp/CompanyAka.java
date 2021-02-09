// Generated with g9.

package com.springapp.modules.system.domain.perp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity(name="company_aka")
public class CompanyAka implements Serializable {

    /** Primary key. */
    protected static final String PK = "coAkaUid";

    @Id
    @Column(name="CoAKA_UID", unique=true, nullable=false, precision=10)
    private Integer coAkaUid;
    @Column(name="AKA_URL", length=50)
    private String akaUrl;
    @Column(name="AKA_Text")
    private String akaText;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_UID", nullable=false)
    private Company company;

    /** Default constructor. */
    public CompanyAka() {
        super();
    }

    /**
     * Access method for coAkaUid.
     *
     * @return the current value of coAkaUid
     */
    public Integer getCoAkaUid() {
        return coAkaUid;
    }

    /**
     * Setter method for coAkaUid.
     *
     * @param aCoAkaUid the new value for coAkaUid
     */
    public void setCoAkaUid(Integer aCoAkaUid) {
        coAkaUid = aCoAkaUid;
    }

    /**
     * Access method for akaUrl.
     *
     * @return the current value of akaUrl
     */
    public String getAkaUrl() {
        return akaUrl;
    }

    /**
     * Setter method for akaUrl.
     *
     * @param aAkaUrl the new value for akaUrl
     */
    public void setAkaUrl(String aAkaUrl) {
        akaUrl = aAkaUrl;
    }

    /**
     * Access method for akaText.
     *
     * @return the current value of akaText
     */
    public String getAkaText() {
        return akaText;
    }

    /**
     * Setter method for akaText.
     *
     * @param aAkaText the new value for akaText
     */
    public void setAkaText(String aAkaText) {
        akaText = aAkaText;
    }

    /**
     * Access method for activeFlag.
     *
     * @return the current value of activeFlag
     */
    public Character getActiveFlag() {
        return activeFlag;
    }

    /**
     * Setter method for activeFlag.
     *
     * @param aActiveFlag the new value for activeFlag
     */
    public void setActiveFlag(Character aActiveFlag) {
        activeFlag = aActiveFlag;
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
     * Compares the key for this instance with another CompanyAka.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CompanyAka and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CompanyAka)) {
            return false;
        }
        CompanyAka that = (CompanyAka) other;
        Object myCoAkaUid = this.getCoAkaUid();
        Object yourCoAkaUid = that.getCoAkaUid();
        if (myCoAkaUid==null ? yourCoAkaUid!=null : !myCoAkaUid.equals(yourCoAkaUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CompanyAka.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CompanyAka)) return false;
        return this.equalKeys(other) && ((CompanyAka)other).equalKeys(this);
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
        if (getCoAkaUid() == null) {
            i = 0;
        } else {
            i = getCoAkaUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[CompanyAka |");
        sb.append(" coAkaUid=").append(getCoAkaUid());
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
        ret.put("coAkaUid", getCoAkaUid());
        return ret;
    }

}
