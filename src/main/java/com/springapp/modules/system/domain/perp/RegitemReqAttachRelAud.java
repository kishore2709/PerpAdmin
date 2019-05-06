// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="regitem_req_attach_rel_aud")
public class RegitemReqAttachRelAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "rirarAudUid";

    @Id
    @Column(name="RIRARAud_UID", unique=true, nullable=false, precision=10)
    private Integer rirarAudUid;
    @Column(name="RIRARel_UID", nullable=false, precision=10)
    private Integer riraRelUid;
    @Column(name="RegItem_UID", precision=10)
    private Integer regItemUid;
    @Column(name="AttachementType_UID", precision=10)
    private Integer attachementTypeUid;
    @Column(name="Note_Attachment_UID", precision=10)
    private Integer noteAttachmentUid;
    @Column(name="Inspection_UID", precision=10)
    private Integer inspectionUid;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public RegitemReqAttachRelAud() {
        super();
    }

    /**
     * Access method for rirarAudUid.
     *
     * @return the current value of rirarAudUid
     */
    public Integer getRirarAudUid() {
        return rirarAudUid;
    }

    /**
     * Setter method for rirarAudUid.
     *
     * @param aRirarAudUid the new value for rirarAudUid
     */
    public void setRirarAudUid(Integer aRirarAudUid) {
        rirarAudUid = aRirarAudUid;
    }

    /**
     * Access method for riraRelUid.
     *
     * @return the current value of riraRelUid
     */
    public Integer getRiraRelUid() {
        return riraRelUid;
    }

    /**
     * Setter method for riraRelUid.
     *
     * @param aRiraRelUid the new value for riraRelUid
     */
    public void setRiraRelUid(Integer aRiraRelUid) {
        riraRelUid = aRiraRelUid;
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
     * Access method for attachementTypeUid.
     *
     * @return the current value of attachementTypeUid
     */
    public Integer getAttachementTypeUid() {
        return attachementTypeUid;
    }

    /**
     * Setter method for attachementTypeUid.
     *
     * @param aAttachementTypeUid the new value for attachementTypeUid
     */
    public void setAttachementTypeUid(Integer aAttachementTypeUid) {
        attachementTypeUid = aAttachementTypeUid;
    }

    /**
     * Access method for noteAttachmentUid.
     *
     * @return the current value of noteAttachmentUid
     */
    public Integer getNoteAttachmentUid() {
        return noteAttachmentUid;
    }

    /**
     * Setter method for noteAttachmentUid.
     *
     * @param aNoteAttachmentUid the new value for noteAttachmentUid
     */
    public void setNoteAttachmentUid(Integer aNoteAttachmentUid) {
        noteAttachmentUid = aNoteAttachmentUid;
    }

    /**
     * Access method for inspectionUid.
     *
     * @return the current value of inspectionUid
     */
    public Integer getInspectionUid() {
        return inspectionUid;
    }

    /**
     * Setter method for inspectionUid.
     *
     * @param aInspectionUid the new value for inspectionUid
     */
    public void setInspectionUid(Integer aInspectionUid) {
        inspectionUid = aInspectionUid;
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
     * Compares the key for this instance with another RegitemReqAttachRelAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RegitemReqAttachRelAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RegitemReqAttachRelAud)) {
            return false;
        }
        RegitemReqAttachRelAud that = (RegitemReqAttachRelAud) other;
        Object myRirarAudUid = this.getRirarAudUid();
        Object yourRirarAudUid = that.getRirarAudUid();
        if (myRirarAudUid==null ? yourRirarAudUid!=null : !myRirarAudUid.equals(yourRirarAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RegitemReqAttachRelAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RegitemReqAttachRelAud)) return false;
        return this.equalKeys(other) && ((RegitemReqAttachRelAud)other).equalKeys(this);
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
        if (getRirarAudUid() == null) {
            i = 0;
        } else {
            i = getRirarAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[RegitemReqAttachRelAud |");
        sb.append(" rirarAudUid=").append(getRirarAudUid());
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
        ret.put("rirarAudUid", getRirarAudUid());
        return ret;
    }

}
