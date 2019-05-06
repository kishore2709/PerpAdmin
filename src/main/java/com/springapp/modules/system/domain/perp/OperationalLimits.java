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

@Entity(name="operational_limits")
public class OperationalLimits implements Serializable {

    /** Primary key. */
    protected static final String PK = "operationLimitsUid";

    @Id
    @Column(name="Operation_Limits_UID", unique=true, nullable=false, precision=10)
    private Integer operationLimitsUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_UID", nullable=false)
    private Company company;
    @ManyToOne
    @JoinColumn(name="RegItem_UID")
    private RegistrationItems registrationItems;

    /** Default constructor. */
    public OperationalLimits() {
        super();
    }

    /**
     * Access method for operationLimitsUid.
     *
     * @return the current value of operationLimitsUid
     */
    public Integer getOperationLimitsUid() {
        return operationLimitsUid;
    }

    /**
     * Setter method for operationLimitsUid.
     *
     * @param aOperationLimitsUid the new value for operationLimitsUid
     */
    public void setOperationLimitsUid(Integer aOperationLimitsUid) {
        operationLimitsUid = aOperationLimitsUid;
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
     * Access method for registrationItems.
     *
     * @return the current value of registrationItems
     */
    public RegistrationItems getRegistrationItems() {
        return registrationItems;
    }

    /**
     * Setter method for registrationItems.
     *
     * @param aRegistrationItems the new value for registrationItems
     */
    public void setRegistrationItems(RegistrationItems aRegistrationItems) {
        registrationItems = aRegistrationItems;
    }

    /**
     * Compares the key for this instance with another OperationalLimits.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OperationalLimits and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OperationalLimits)) {
            return false;
        }
        OperationalLimits that = (OperationalLimits) other;
        Object myOperationLimitsUid = this.getOperationLimitsUid();
        Object yourOperationLimitsUid = that.getOperationLimitsUid();
        if (myOperationLimitsUid==null ? yourOperationLimitsUid!=null : !myOperationLimitsUid.equals(yourOperationLimitsUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OperationalLimits.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OperationalLimits)) return false;
        return this.equalKeys(other) && ((OperationalLimits)other).equalKeys(this);
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
        if (getOperationLimitsUid() == null) {
            i = 0;
        } else {
            i = getOperationLimitsUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[OperationalLimits |");
        sb.append(" operationLimitsUid=").append(getOperationLimitsUid());
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
        ret.put("operationLimitsUid", getOperationLimitsUid());
        return ret;
    }

}
