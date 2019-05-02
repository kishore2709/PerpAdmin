// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="terminal_aud")
public class TerminalAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "terminalAudUid";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="Terminal_Aud_UID", unique=true, nullable=false, precision=10)
    private int terminalAudUid;
    @Column(name="Terminal_UID", nullable=false, precision=10)
    private int terminalUid;
    @Column(name="Company_UID", nullable=false, precision=10)
    private int companyUid;
    @Column(name="Terminal_Type_UID", precision=10)
    private int terminalTypeUid;
    @Column(name="Terminal_Name", nullable=false, length=45)
    private String terminalName;
    @Column(name="Terminal_Description", length=256)
    private String terminalDescription;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public TerminalAud() {
        super();
    }

    /**
     * Access method for terminalAudUid.
     *
     * @return the current value of terminalAudUid
     */
    public int getTerminalAudUid() {
        return terminalAudUid;
    }

    /**
     * Setter method for terminalAudUid.
     *
     * @param aTerminalAudUid the new value for terminalAudUid
     */
    public void setTerminalAudUid(int aTerminalAudUid) {
        terminalAudUid = aTerminalAudUid;
    }

    /**
     * Access method for terminalUid.
     *
     * @return the current value of terminalUid
     */
    public int getTerminalUid() {
        return terminalUid;
    }

    /**
     * Setter method for terminalUid.
     *
     * @param aTerminalUid the new value for terminalUid
     */
    public void setTerminalUid(int aTerminalUid) {
        terminalUid = aTerminalUid;
    }

    /**
     * Access method for companyUid.
     *
     * @return the current value of companyUid
     */
    public int getCompanyUid() {
        return companyUid;
    }

    /**
     * Setter method for companyUid.
     *
     * @param aCompanyUid the new value for companyUid
     */
    public void setCompanyUid(int aCompanyUid) {
        companyUid = aCompanyUid;
    }

    /**
     * Access method for terminalTypeUid.
     *
     * @return the current value of terminalTypeUid
     */
    public int getTerminalTypeUid() {
        return terminalTypeUid;
    }

    /**
     * Setter method for terminalTypeUid.
     *
     * @param aTerminalTypeUid the new value for terminalTypeUid
     */
    public void setTerminalTypeUid(int aTerminalTypeUid) {
        terminalTypeUid = aTerminalTypeUid;
    }

    /**
     * Access method for terminalName.
     *
     * @return the current value of terminalName
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Setter method for terminalName.
     *
     * @param aTerminalName the new value for terminalName
     */
    public void setTerminalName(String aTerminalName) {
        terminalName = aTerminalName;
    }

    /**
     * Access method for terminalDescription.
     *
     * @return the current value of terminalDescription
     */
    public String getTerminalDescription() {
        return terminalDescription;
    }

    /**
     * Setter method for terminalDescription.
     *
     * @param aTerminalDescription the new value for terminalDescription
     */
    public void setTerminalDescription(String aTerminalDescription) {
        terminalDescription = aTerminalDescription;
    }

    /**
     * Access method for activeFlag.
     *
     * @return the current value of activeFlag
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Setter method for activeFlag.
     *
     * @param aActiveFlag the new value for activeFlag
     */
    public void setActiveFlag(String aActiveFlag) {
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
     * Access method for operation.
     *
     * @return the current value of operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Setter method for operation.
     *
     * @param aOperation the new value for operation
     */
    public void setOperation(String aOperation) {
        operation = aOperation;
    }

    /**
     * Compares the key for this instance with another TerminalAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TerminalAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TerminalAud)) {
            return false;
        }
        TerminalAud that = (TerminalAud) other;
        if (this.getTerminalAudUid() != that.getTerminalAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TerminalAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TerminalAud)) return false;
        return this.equalKeys(other) && ((TerminalAud)other).equalKeys(this);
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
        i = getTerminalAudUid();
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
        StringBuffer sb = new StringBuffer("[TerminalAud |");
        sb.append(" terminalAudUid=").append(getTerminalAudUid());
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
        ret.put("terminalAudUid", Integer.valueOf(getTerminalAudUid()));
        return ret;
    }

}
