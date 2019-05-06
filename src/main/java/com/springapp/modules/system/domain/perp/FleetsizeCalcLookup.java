// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="fleetsize_calc_lookup")
public class FleetsizeCalcLookup implements Serializable {

    /** Primary key. */
    protected static final String PK = "fleetCalcLookupUid";

    @Id
    @Column(name="FleetCalcLookup_UID", unique=true, nullable=false, precision=10)
    private Integer fleetCalcLookupUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public FleetsizeCalcLookup() {
        super();
    }

    /**
     * Access method for fleetCalcLookupUid.
     *
     * @return the current value of fleetCalcLookupUid
     */
    public Integer getFleetCalcLookupUid() {
        return fleetCalcLookupUid;
    }

    /**
     * Setter method for fleetCalcLookupUid.
     *
     * @param aFleetCalcLookupUid the new value for fleetCalcLookupUid
     */
    public void setFleetCalcLookupUid(Integer aFleetCalcLookupUid) {
        fleetCalcLookupUid = aFleetCalcLookupUid;
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
     * Compares the key for this instance with another FleetsizeCalcLookup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FleetsizeCalcLookup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FleetsizeCalcLookup)) {
            return false;
        }
        FleetsizeCalcLookup that = (FleetsizeCalcLookup) other;
        Object myFleetCalcLookupUid = this.getFleetCalcLookupUid();
        Object yourFleetCalcLookupUid = that.getFleetCalcLookupUid();
        if (myFleetCalcLookupUid==null ? yourFleetCalcLookupUid!=null : !myFleetCalcLookupUid.equals(yourFleetCalcLookupUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FleetsizeCalcLookup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FleetsizeCalcLookup)) return false;
        return this.equalKeys(other) && ((FleetsizeCalcLookup)other).equalKeys(this);
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
        if (getFleetCalcLookupUid() == null) {
            i = 0;
        } else {
            i = getFleetCalcLookupUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[FleetsizeCalcLookup |");
        sb.append(" fleetCalcLookupUid=").append(getFleetCalcLookupUid());
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
        ret.put("fleetCalcLookupUid", getFleetCalcLookupUid());
        return ret;
    }

}
