// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vin_override_aud")
public class VinOverrideAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "vinOverrideAudUid";

    @Id
    @Column(name="Vin_Override_Aud_UID", unique=true, nullable=false, precision=10)
    private Integer vinOverrideAudUid;
    @Column(name="VinOverride_UID", nullable=false, precision=10)
    private Integer vinOverrideUid;
    @Column(name="VIN", nullable=false, length=45)
    private String vin;
    @Column(name="Programs_UID", precision=10)
    private Integer programsUid;
    @Column(name="Vin_Type_UID", precision=10)
    private Integer vinTypeUid;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public VinOverrideAud() {
        super();
    }

    /**
     * Access method for vinOverrideAudUid.
     *
     * @return the current value of vinOverrideAudUid
     */
    public Integer getVinOverrideAudUid() {
        return vinOverrideAudUid;
    }

    /**
     * Setter method for vinOverrideAudUid.
     *
     * @param aVinOverrideAudUid the new value for vinOverrideAudUid
     */
    public void setVinOverrideAudUid(Integer aVinOverrideAudUid) {
        vinOverrideAudUid = aVinOverrideAudUid;
    }

    /**
     * Access method for vinOverrideUid.
     *
     * @return the current value of vinOverrideUid
     */
    public Integer getVinOverrideUid() {
        return vinOverrideUid;
    }

    /**
     * Setter method for vinOverrideUid.
     *
     * @param aVinOverrideUid the new value for vinOverrideUid
     */
    public void setVinOverrideUid(Integer aVinOverrideUid) {
        vinOverrideUid = aVinOverrideUid;
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
     * Access method for vinTypeUid.
     *
     * @return the current value of vinTypeUid
     */
    public Integer getVinTypeUid() {
        return vinTypeUid;
    }

    /**
     * Setter method for vinTypeUid.
     *
     * @param aVinTypeUid the new value for vinTypeUid
     */
    public void setVinTypeUid(Integer aVinTypeUid) {
        vinTypeUid = aVinTypeUid;
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
     * Compares the key for this instance with another VinOverrideAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VinOverrideAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VinOverrideAud)) {
            return false;
        }
        VinOverrideAud that = (VinOverrideAud) other;
        Object myVinOverrideAudUid = this.getVinOverrideAudUid();
        Object yourVinOverrideAudUid = that.getVinOverrideAudUid();
        if (myVinOverrideAudUid==null ? yourVinOverrideAudUid!=null : !myVinOverrideAudUid.equals(yourVinOverrideAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VinOverrideAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VinOverrideAud)) return false;
        return this.equalKeys(other) && ((VinOverrideAud)other).equalKeys(this);
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
        if (getVinOverrideAudUid() == null) {
            i = 0;
        } else {
            i = getVinOverrideAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[VinOverrideAud |");
        sb.append(" vinOverrideAudUid=").append(getVinOverrideAudUid());
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
        ret.put("vinOverrideAudUid", getVinOverrideAudUid());
        return ret;
    }

}
