// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="materialtype_relations_aud")
public class MaterialtypeRelationsAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "mtrAudUid";

    @Id
    @Column(name="MTRAud_UID", unique=true, nullable=false, precision=10)
    private Integer mtrAudUid;
    @Column(name="MaterialType_UID", nullable=false, precision=10)
    private Integer materialTypeUid;
    @Column(name="RegItemDet_UID", nullable=false, precision=10)
    private Integer regItemDetUid;
    @Column(name="Other_Type_Text", length=255)
    private String otherTypeText;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public MaterialtypeRelationsAud() {
        super();
    }

    /**
     * Access method for mtrAudUid.
     *
     * @return the current value of mtrAudUid
     */
    public Integer getMtrAudUid() {
        return mtrAudUid;
    }

    /**
     * Setter method for mtrAudUid.
     *
     * @param aMtrAudUid the new value for mtrAudUid
     */
    public void setMtrAudUid(Integer aMtrAudUid) {
        mtrAudUid = aMtrAudUid;
    }

    /**
     * Access method for materialTypeUid.
     *
     * @return the current value of materialTypeUid
     */
    public Integer getMaterialTypeUid() {
        return materialTypeUid;
    }

    /**
     * Setter method for materialTypeUid.
     *
     * @param aMaterialTypeUid the new value for materialTypeUid
     */
    public void setMaterialTypeUid(Integer aMaterialTypeUid) {
        materialTypeUid = aMaterialTypeUid;
    }

    /**
     * Access method for regItemDetUid.
     *
     * @return the current value of regItemDetUid
     */
    public Integer getRegItemDetUid() {
        return regItemDetUid;
    }

    /**
     * Setter method for regItemDetUid.
     *
     * @param aRegItemDetUid the new value for regItemDetUid
     */
    public void setRegItemDetUid(Integer aRegItemDetUid) {
        regItemDetUid = aRegItemDetUid;
    }

    /**
     * Access method for otherTypeText.
     *
     * @return the current value of otherTypeText
     */
    public String getOtherTypeText() {
        return otherTypeText;
    }

    /**
     * Setter method for otherTypeText.
     *
     * @param aOtherTypeText the new value for otherTypeText
     */
    public void setOtherTypeText(String aOtherTypeText) {
        otherTypeText = aOtherTypeText;
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
     * Compares the key for this instance with another MaterialtypeRelationsAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MaterialtypeRelationsAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MaterialtypeRelationsAud)) {
            return false;
        }
        MaterialtypeRelationsAud that = (MaterialtypeRelationsAud) other;
        Object myMtrAudUid = this.getMtrAudUid();
        Object yourMtrAudUid = that.getMtrAudUid();
        if (myMtrAudUid==null ? yourMtrAudUid!=null : !myMtrAudUid.equals(yourMtrAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MaterialtypeRelationsAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MaterialtypeRelationsAud)) return false;
        return this.equalKeys(other) && ((MaterialtypeRelationsAud)other).equalKeys(this);
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
        if (getMtrAudUid() == null) {
            i = 0;
        } else {
            i = getMtrAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[MaterialtypeRelationsAud |");
        sb.append(" mtrAudUid=").append(getMtrAudUid());
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
        ret.put("mtrAudUid", getMtrAudUid());
        return ret;
    }

}
