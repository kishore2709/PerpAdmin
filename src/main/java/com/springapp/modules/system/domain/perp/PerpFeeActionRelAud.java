// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="perp_fee_action_rel_aud")
public class PerpFeeActionRelAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "pfarAudUid";

    @Id
    @Column(name="PFARAud_UID", unique=true, nullable=false, precision=10)
    private Integer pfarAudUid;
    @Column(name="AppRegItemActions_UID", nullable=false, precision=10)
    private Integer appRegItemActionsUid;
    @Column(name="PerpFeeLookup_UID", nullable=false, precision=10)
    private Integer perpFeeLookupUid;
    @Column(name="Create_Modified_By", length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date")
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=20)
    private String operation;

    /** Default constructor. */
    public PerpFeeActionRelAud() {
        super();
    }

    /**
     * Access method for pfarAudUid.
     *
     * @return the current value of pfarAudUid
     */
    public Integer getPfarAudUid() {
        return pfarAudUid;
    }

    /**
     * Setter method for pfarAudUid.
     *
     * @param aPfarAudUid the new value for pfarAudUid
     */
    public void setPfarAudUid(Integer aPfarAudUid) {
        pfarAudUid = aPfarAudUid;
    }

    /**
     * Access method for appRegItemActionsUid.
     *
     * @return the current value of appRegItemActionsUid
     */
    public Integer getAppRegItemActionsUid() {
        return appRegItemActionsUid;
    }

    /**
     * Setter method for appRegItemActionsUid.
     *
     * @param aAppRegItemActionsUid the new value for appRegItemActionsUid
     */
    public void setAppRegItemActionsUid(Integer aAppRegItemActionsUid) {
        appRegItemActionsUid = aAppRegItemActionsUid;
    }

    /**
     * Access method for perpFeeLookupUid.
     *
     * @return the current value of perpFeeLookupUid
     */
    public Integer getPerpFeeLookupUid() {
        return perpFeeLookupUid;
    }

    /**
     * Setter method for perpFeeLookupUid.
     *
     * @param aPerpFeeLookupUid the new value for perpFeeLookupUid
     */
    public void setPerpFeeLookupUid(Integer aPerpFeeLookupUid) {
        perpFeeLookupUid = aPerpFeeLookupUid;
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
     * Compares the key for this instance with another PerpFeeActionRelAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpFeeActionRelAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpFeeActionRelAud)) {
            return false;
        }
        PerpFeeActionRelAud that = (PerpFeeActionRelAud) other;
        Object myPfarAudUid = this.getPfarAudUid();
        Object yourPfarAudUid = that.getPfarAudUid();
        if (myPfarAudUid==null ? yourPfarAudUid!=null : !myPfarAudUid.equals(yourPfarAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpFeeActionRelAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpFeeActionRelAud)) return false;
        return this.equalKeys(other) && ((PerpFeeActionRelAud)other).equalKeys(this);
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
        if (getPfarAudUid() == null) {
            i = 0;
        } else {
            i = getPfarAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[PerpFeeActionRelAud |");
        sb.append(" pfarAudUid=").append(getPfarAudUid());
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
        ret.put("pfarAudUid", getPfarAudUid());
        return ret;
    }

}
