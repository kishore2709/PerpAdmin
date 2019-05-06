// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="perp_fee_type_rel_aud")
public class PerpFeeTypeRelAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "pftrAudUid";

    @Id
    @Column(name="PFTRAud_UID", unique=true, nullable=false, precision=10)
    private Integer pftrAudUid;
    @Column(name="RegItemTypes_UID", nullable=false, precision=10)
    private Integer regItemTypesUid;
    @Column(name="PerpFeeLookup_UID", nullable=false, precision=10)
    private Integer perpFeeLookupUid;
    @Column(name="Create_Modified_By", length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date")
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public PerpFeeTypeRelAud() {
        super();
    }

    /**
     * Access method for pftrAudUid.
     *
     * @return the current value of pftrAudUid
     */
    public Integer getPftrAudUid() {
        return pftrAudUid;
    }

    /**
     * Setter method for pftrAudUid.
     *
     * @param aPftrAudUid the new value for pftrAudUid
     */
    public void setPftrAudUid(Integer aPftrAudUid) {
        pftrAudUid = aPftrAudUid;
    }

    /**
     * Access method for regItemTypesUid.
     *
     * @return the current value of regItemTypesUid
     */
    public Integer getRegItemTypesUid() {
        return regItemTypesUid;
    }

    /**
     * Setter method for regItemTypesUid.
     *
     * @param aRegItemTypesUid the new value for regItemTypesUid
     */
    public void setRegItemTypesUid(Integer aRegItemTypesUid) {
        regItemTypesUid = aRegItemTypesUid;
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
     * Compares the key for this instance with another PerpFeeTypeRelAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpFeeTypeRelAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpFeeTypeRelAud)) {
            return false;
        }
        PerpFeeTypeRelAud that = (PerpFeeTypeRelAud) other;
        Object myPftrAudUid = this.getPftrAudUid();
        Object yourPftrAudUid = that.getPftrAudUid();
        if (myPftrAudUid==null ? yourPftrAudUid!=null : !myPftrAudUid.equals(yourPftrAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpFeeTypeRelAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpFeeTypeRelAud)) return false;
        return this.equalKeys(other) && ((PerpFeeTypeRelAud)other).equalKeys(this);
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
        if (getPftrAudUid() == null) {
            i = 0;
        } else {
            i = getPftrAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[PerpFeeTypeRelAud |");
        sb.append(" pftrAudUid=").append(getPftrAudUid());
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
        ret.put("pftrAudUid", getPftrAudUid());
        return ret;
    }

}
