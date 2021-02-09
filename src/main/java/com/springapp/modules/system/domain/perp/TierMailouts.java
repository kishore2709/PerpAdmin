// Generated with g9.

package com.springapp.modules.system.domain.perp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity(name="tier_mailouts")
public class TierMailouts implements Serializable {

    /** Primary key. */
    protected static final String PK = "uid";

    @Id
    @Column(name="UID", unique=true, nullable=false, precision=10)
    private Integer uid;
    @Column(length=45)
    private String appno;
    @Column(length=45)
    private String regno;
    @Column(length=45)
    private String trackingno;
    @Column(length=1)
    private Character status;
    @Column(name="Create_Modified_Date")
    private Timestamp createModifiedDate;
    @Column(precision=10)
    private Integer appCount;
    @Column(name="company_uid", precision=10)
    private Integer companyUid;
    @Column(name="Expiration_Date")
    private Timestamp expirationDate;
    @Column(name="RegItem_UID", precision=10)
    private Integer regItemUid;
    @Column(length=45)
    private String apptranno;

    /** Default constructor. */
    public TierMailouts() {
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
     * Access method for appno.
     *
     * @return the current value of appno
     */
    public String getAppno() {
        return appno;
    }

    /**
     * Setter method for appno.
     *
     * @param aAppno the new value for appno
     */
    public void setAppno(String aAppno) {
        appno = aAppno;
    }

    /**
     * Access method for regno.
     *
     * @return the current value of regno
     */
    public String getRegno() {
        return regno;
    }

    /**
     * Setter method for regno.
     *
     * @param aRegno the new value for regno
     */
    public void setRegno(String aRegno) {
        regno = aRegno;
    }

    /**
     * Access method for trackingno.
     *
     * @return the current value of trackingno
     */
    public String getTrackingno() {
        return trackingno;
    }

    /**
     * Setter method for trackingno.
     *
     * @param aTrackingno the new value for trackingno
     */
    public void setTrackingno(String aTrackingno) {
        trackingno = aTrackingno;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public Character getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(Character aStatus) {
        status = aStatus;
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
     * Access method for appCount.
     *
     * @return the current value of appCount
     */
    public Integer getAppCount() {
        return appCount;
    }

    /**
     * Setter method for appCount.
     *
     * @param aAppCount the new value for appCount
     */
    public void setAppCount(Integer aAppCount) {
        appCount = aAppCount;
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
     * Access method for expirationDate.
     *
     * @return the current value of expirationDate
     */
    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    /**
     * Setter method for expirationDate.
     *
     * @param aExpirationDate the new value for expirationDate
     */
    public void setExpirationDate(Timestamp aExpirationDate) {
        expirationDate = aExpirationDate;
    }

    /**
     * Access method for regItemUid.
     *
     * @return the current value of regItemUid
     */
    public Integer getRegItemUid() {
        return regItemUid;
    }

    /**
     * Setter method for regItemUid.
     *
     * @param aRegItemUid the new value for regItemUid
     */
    public void setRegItemUid(Integer aRegItemUid) {
        regItemUid = aRegItemUid;
    }

    /**
     * Access method for apptranno.
     *
     * @return the current value of apptranno
     */
    public String getApptranno() {
        return apptranno;
    }

    /**
     * Setter method for apptranno.
     *
     * @param aApptranno the new value for apptranno
     */
    public void setApptranno(String aApptranno) {
        apptranno = aApptranno;
    }

    /**
     * Compares the key for this instance with another TierMailouts.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TierMailouts and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TierMailouts)) {
            return false;
        }
        TierMailouts that = (TierMailouts) other;
        Object myUid = this.getUid();
        Object yourUid = that.getUid();
        if (myUid==null ? yourUid!=null : !myUid.equals(yourUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TierMailouts.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TierMailouts)) return false;
        return this.equalKeys(other) && ((TierMailouts)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[TierMailouts |");
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
