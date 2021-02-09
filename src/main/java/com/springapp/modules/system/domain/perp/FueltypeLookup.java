// Generated with g9.

package com.springapp.modules.system.domain.perp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity(name="fueltype_lookup")
public class FueltypeLookup implements Serializable {

    /** Primary key. */
    protected static final String PK = "uid";

    @Id
    @Column(name="UID", unique=true, nullable=false, precision=10)
    private Integer uid;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="FuelType_UID", nullable=false)
    private FuelTypes fuelTypes;
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItemSubType_UID", nullable=false)
    private RegitemSubtypes regitemSubtypes;

    /** Default constructor. */
    public FueltypeLookup() {
        super();
    }

    /**
     * Access method for uid.
     *
     * @return the current value of uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * Setter method for uid.
     *
     * @param aUid the new value for uid
     */
    public void setUid(Integer aUid) {
        uid = aUid;
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
     * Access method for fuelTypes.
     *
     * @return the current value of fuelTypes
     */
    public FuelTypes getFuelTypes() {
        return fuelTypes;
    }

    /**
     * Setter method for fuelTypes.
     *
     * @param aFuelTypes the new value for fuelTypes
     */
    public void setFuelTypes(FuelTypes aFuelTypes) {
        fuelTypes = aFuelTypes;
    }

    /**
     * Access method for regitemSubtypes.
     *
     * @return the current value of regitemSubtypes
     */
    public RegitemSubtypes getRegitemSubtypes() {
        return regitemSubtypes;
    }

    /**
     * Setter method for regitemSubtypes.
     *
     * @param aRegitemSubtypes the new value for regitemSubtypes
     */
    public void setRegitemSubtypes(RegitemSubtypes aRegitemSubtypes) {
        regitemSubtypes = aRegitemSubtypes;
    }

    /**
     * Compares the key for this instance with another FueltypeLookup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FueltypeLookup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FueltypeLookup)) {
            return false;
        }
        FueltypeLookup that = (FueltypeLookup) other;
        Object myUid = this.getUid();
        Object yourUid = that.getUid();
        if (myUid==null ? yourUid!=null : !myUid.equals(yourUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FueltypeLookup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FueltypeLookup)) return false;
        return this.equalKeys(other) && ((FueltypeLookup)other).equalKeys(this);
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
        if (getUid() == null) {
            i = 0;
        } else {
            i = getUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[FueltypeLookup |");
        sb.append(" uid=").append(getUid());
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
        ret.put("uid", getUid());
        return ret;
    }

}
