// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="blastingtype_relations")
public class BlastingtypeRelations implements Serializable {

    /** Primary key. */
    protected static final String PK = "BlastingtypeRelationsPrimary";

    @Column(name="Other_Type_Text", length=255)
    private String otherTypeText;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="BlastingType_UID", nullable=false)
    private BlastingType blastingType;
    @Id
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItemDet_UID", nullable=false)
    private RegitemDetails regitemDetails;

    /** Default constructor. */
    public BlastingtypeRelations() {
        super();
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
     * Access method for blastingType.
     *
     * @return the current value of blastingType
     */
    public BlastingType getBlastingType() {
        return blastingType;
    }

    /**
     * Setter method for blastingType.
     *
     * @param aBlastingType the new value for blastingType
     */
    public void setBlastingType(BlastingType aBlastingType) {
        blastingType = aBlastingType;
    }

    /**
     * Access method for regitemDetails.
     *
     * @return the current value of regitemDetails
     */
    public RegitemDetails getRegitemDetails() {
        return regitemDetails;
    }

    /**
     * Setter method for regitemDetails.
     *
     * @param aRegitemDetails the new value for regitemDetails
     */
    public void setRegitemDetails(RegitemDetails aRegitemDetails) {
        regitemDetails = aRegitemDetails;
    }

    /** Temporary value holder for group key fragment blastingTypeUid */
    private transient Integer tempBlastingTypeUid;

    /**
     * Gets the key fragment uid for member blastingType.
     * If this.blastingType is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setBlastingTypeUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see BlastingType
     */
    public Integer getBlastingTypeUid() {
        return (getBlastingType() == null ? tempBlastingTypeUid : getBlastingType().getUid());
    }

    /**
     * Sets the key fragment uid from member blastingType.
     * If this.blastingType is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getBlastingTypeUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aUid New value for the key fragment
     * @see BlastingType
     */
    public void setBlastingTypeUid(Integer aUid) {
        if (getBlastingType() == null) {
            tempBlastingTypeUid = aUid;
        } else {
            getBlastingType().setUid(aUid);
        }
    }

    /** Temporary value holder for group key fragment regitemDetailsRegItemDetUid */
    private transient Integer tempRegitemDetailsRegItemDetUid;

    /**
     * Gets the key fragment regItemDetUid for member regitemDetails.
     * If this.regitemDetails is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setRegitemDetailsRegItemDetUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see RegitemDetails
     */
    public Integer getRegitemDetailsRegItemDetUid() {
        return (getRegitemDetails() == null ? tempRegitemDetailsRegItemDetUid : getRegitemDetails().getRegItemDetUid());
    }

    /**
     * Sets the key fragment regItemDetUid from member regitemDetails.
     * If this.regitemDetails is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getRegitemDetailsRegItemDetUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aRegItemDetUid New value for the key fragment
     * @see RegitemDetails
     */
    public void setRegitemDetailsRegItemDetUid(Integer aRegItemDetUid) {
        if (getRegitemDetails() == null) {
            tempRegitemDetailsRegItemDetUid = aRegItemDetUid;
        } else {
            getRegitemDetails().setRegItemDetUid(aRegItemDetUid);
        }
    }

    /**
     * Compares the key for this instance with another BlastingtypeRelations.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BlastingtypeRelations and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BlastingtypeRelations)) {
            return false;
        }
        BlastingtypeRelations that = (BlastingtypeRelations) other;
        Object myBlastingTypeUid = this.getBlastingTypeUid();
        Object yourBlastingTypeUid = that.getBlastingTypeUid();
        if (myBlastingTypeUid==null ? yourBlastingTypeUid!=null : !myBlastingTypeUid.equals(yourBlastingTypeUid)) {
            return false;
        }
        Object myRegitemDetailsRegItemDetUid = this.getRegitemDetailsRegItemDetUid();
        Object yourRegitemDetailsRegItemDetUid = that.getRegitemDetailsRegItemDetUid();
        if (myRegitemDetailsRegItemDetUid==null ? yourRegitemDetailsRegItemDetUid!=null : !myRegitemDetailsRegItemDetUid.equals(yourRegitemDetailsRegItemDetUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BlastingtypeRelations.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BlastingtypeRelations)) return false;
        return this.equalKeys(other) && ((BlastingtypeRelations)other).equalKeys(this);
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
        if (getBlastingTypeUid() == null) {
            i = 0;
        } else {
            i = getBlastingTypeUid().hashCode();
        }
        result = 37*result + i;
        if (getRegitemDetailsRegItemDetUid() == null) {
            i = 0;
        } else {
            i = getRegitemDetailsRegItemDetUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[BlastingtypeRelations |");
        sb.append(" blastingTypeUid=").append(getBlastingTypeUid());
        sb.append(" regitemDetailsRegItemDetUid=").append(getRegitemDetailsRegItemDetUid());
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
        ret.put("blastingTypeUid", getBlastingTypeUid());
        ret.put("regitemDetailsRegItemDetUid", getRegitemDetailsRegItemDetUid());
        return ret;
    }

}
