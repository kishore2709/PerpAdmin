// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="regtypes_sectitles_rel_aud")
public class RegtypesSectitlesRelAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "rtstrAudUid";

    @Id
    @Column(name="RTSTRAud_UID", unique=true, nullable=false, precision=10)
    private Integer rtstrAudUid;
    @Column(name="RTSTRel_UID", nullable=false, precision=10)
    private Integer rtstRelUid;
    @Column(name="OpConSecTitle_UID", nullable=false, precision=10)
    private Integer opConSecTitleUid;
    @Column(name="RegItemType_UID", nullable=false, precision=10)
    private Integer regItemTypeUid;
    @Column(name="Section_Sort", precision=10)
    private Integer sectionSort;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public RegtypesSectitlesRelAud() {
        super();
    }

    /**
     * Access method for rtstrAudUid.
     *
     * @return the current value of rtstrAudUid
     */
    public Integer getRtstrAudUid() {
        return rtstrAudUid;
    }

    /**
     * Setter method for rtstrAudUid.
     *
     * @param aRtstrAudUid the new value for rtstrAudUid
     */
    public void setRtstrAudUid(Integer aRtstrAudUid) {
        rtstrAudUid = aRtstrAudUid;
    }

    /**
     * Access method for rtstRelUid.
     *
     * @return the current value of rtstRelUid
     */
    public Integer getRtstRelUid() {
        return rtstRelUid;
    }

    /**
     * Setter method for rtstRelUid.
     *
     * @param aRtstRelUid the new value for rtstRelUid
     */
    public void setRtstRelUid(Integer aRtstRelUid) {
        rtstRelUid = aRtstRelUid;
    }

    /**
     * Access method for opConSecTitleUid.
     *
     * @return the current value of opConSecTitleUid
     */
    public Integer getOpConSecTitleUid() {
        return opConSecTitleUid;
    }

    /**
     * Setter method for opConSecTitleUid.
     *
     * @param aOpConSecTitleUid the new value for opConSecTitleUid
     */
    public void setOpConSecTitleUid(Integer aOpConSecTitleUid) {
        opConSecTitleUid = aOpConSecTitleUid;
    }

    /**
     * Access method for regItemTypeUid.
     *
     * @return the current value of regItemTypeUid
     */
    public Integer getRegItemTypeUid() {
        return regItemTypeUid;
    }

    /**
     * Setter method for regItemTypeUid.
     *
     * @param aRegItemTypeUid the new value for regItemTypeUid
     */
    public void setRegItemTypeUid(Integer aRegItemTypeUid) {
        regItemTypeUid = aRegItemTypeUid;
    }

    /**
     * Access method for sectionSort.
     *
     * @return the current value of sectionSort
     */
    public Integer getSectionSort() {
        return sectionSort;
    }

    /**
     * Setter method for sectionSort.
     *
     * @param aSectionSort the new value for sectionSort
     */
    public void setSectionSort(Integer aSectionSort) {
        sectionSort = aSectionSort;
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
     * Compares the key for this instance with another RegtypesSectitlesRelAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RegtypesSectitlesRelAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RegtypesSectitlesRelAud)) {
            return false;
        }
        RegtypesSectitlesRelAud that = (RegtypesSectitlesRelAud) other;
        Object myRtstrAudUid = this.getRtstrAudUid();
        Object yourRtstrAudUid = that.getRtstrAudUid();
        if (myRtstrAudUid==null ? yourRtstrAudUid!=null : !myRtstrAudUid.equals(yourRtstrAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RegtypesSectitlesRelAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RegtypesSectitlesRelAud)) return false;
        return this.equalKeys(other) && ((RegtypesSectitlesRelAud)other).equalKeys(this);
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
        if (getRtstrAudUid() == null) {
            i = 0;
        } else {
            i = getRtstrAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[RegtypesSectitlesRelAud |");
        sb.append(" rtstrAudUid=").append(getRtstrAudUid());
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
        ret.put("rtstrAudUid", getRtstrAudUid());
        return ret;
    }

}
