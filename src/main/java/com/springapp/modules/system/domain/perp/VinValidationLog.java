// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vin_validation_log")
public class VinValidationLog implements Serializable {

    /** Primary key. */
    protected static final String PK = "vinValidationLogUid";

    @Id
    @Column(name="VIN_Validation_Log_UID", unique=true, nullable=false, precision=10)
    private Integer vinValidationLogUid;
    @Column(name="VIN", nullable=false, length=45)
    private String vin;
    @Column(name="Programs_UID", precision=10)
    private Integer programsUid;
    @Column(name="Result", nullable=false, length=65535)
    private String result;
    @Column(name="Success_Flag", nullable=false, length=1)
    private Character successFlag;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public VinValidationLog() {
        super();
    }

    /**
     * Access method for vinValidationLogUid.
     *
     * @return the current value of vinValidationLogUid
     */
    public Integer getVinValidationLogUid() {
        return vinValidationLogUid;
    }

    /**
     * Setter method for vinValidationLogUid.
     *
     * @param aVinValidationLogUid the new value for vinValidationLogUid
     */
    public void setVinValidationLogUid(Integer aVinValidationLogUid) {
        vinValidationLogUid = aVinValidationLogUid;
    }

    /**
     * Access method for vin.
     *
     * @return the current value of vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * Setter method for vin.
     *
     * @param aVin the new value for vin
     */
    public void setVin(String aVin) {
        vin = aVin;
    }

    /**
     * Access method for programsUid.
     *
     * @return the current value of programsUid
     */
    public Integer getProgramsUid() {
        return programsUid;
    }

    /**
     * Setter method for programsUid.
     *
     * @param aProgramsUid the new value for programsUid
     */
    public void setProgramsUid(Integer aProgramsUid) {
        programsUid = aProgramsUid;
    }

    /**
     * Access method for result.
     *
     * @return the current value of result
     */
    public String getResult() {
        return result;
    }

    /**
     * Setter method for result.
     *
     * @param aResult the new value for result
     */
    public void setResult(String aResult) {
        result = aResult;
    }

    /**
     * Access method for successFlag.
     *
     * @return the current value of successFlag
     */
    public Character getSuccessFlag() {
        return successFlag;
    }

    /**
     * Setter method for successFlag.
     *
     * @param aSuccessFlag the new value for successFlag
     */
    public void setSuccessFlag(Character aSuccessFlag) {
        successFlag = aSuccessFlag;
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
     * Compares the key for this instance with another VinValidationLog.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VinValidationLog and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VinValidationLog)) {
            return false;
        }
        VinValidationLog that = (VinValidationLog) other;
        Object myVinValidationLogUid = this.getVinValidationLogUid();
        Object yourVinValidationLogUid = that.getVinValidationLogUid();
        if (myVinValidationLogUid==null ? yourVinValidationLogUid!=null : !myVinValidationLogUid.equals(yourVinValidationLogUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VinValidationLog.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VinValidationLog)) return false;
        return this.equalKeys(other) && ((VinValidationLog)other).equalKeys(this);
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
        if (getVinValidationLogUid() == null) {
            i = 0;
        } else {
            i = getVinValidationLogUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[VinValidationLog |");
        sb.append(" vinValidationLogUid=").append(getVinValidationLogUid());
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
        ret.put("vinValidationLogUid", getVinValidationLogUid());
        return ret;
    }

}
