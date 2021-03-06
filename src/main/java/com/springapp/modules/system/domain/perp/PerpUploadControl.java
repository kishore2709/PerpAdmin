// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="perp_upload_control")
public class PerpUploadControl implements Serializable {

    /** Primary key. */
    protected static final String PK = "perpUploadControlUid";

    @Id
    @Column(name="PERP_UPLOAD_CONTROL_UID", unique=true, nullable=false, precision=10)
    private Integer perpUploadControlUid;
    @Column(name="Company_UID", precision=10)
    private Integer companyUid;
    @Column(name="User_UID", precision=10)
    private Integer userUid;
    @Column(name="Status", length=128)
    private String status;
    @Column(name="Notes", length=128)
    private String notes;
    @Column(name="Records_Processed", precision=10)
    private Integer recordsProcessed;
    @Column(name="Orig_Filename", length=512)
    private String origFilename;
    @Column(name="File_Uploaded_Date", nullable=false)
    private Timestamp fileUploadedDate;
    @Column(name="Sys_Filename", length=128)
    private String sysFilename;
    @Column(name="Processed_Flag", length=1)
    private Character processedFlag;
    @Column(name="Archived_Flag", length=1)
    private Character archivedFlag;
    @Column(name="Create_Modify_By", nullable=false, length=45)
    private String createModifyBy;
    @Column(name="Create_Modify_Date", nullable=false)
    private Timestamp createModifyDate;

    /** Default constructor. */
    public PerpUploadControl() {
        super();
    }

    /**
     * Access method for perpUploadControlUid.
     *
     * @return the current value of perpUploadControlUid
     */
    public Integer getPerpUploadControlUid() {
        return perpUploadControlUid;
    }

    /**
     * Setter method for perpUploadControlUid.
     *
     * @param aPerpUploadControlUid the new value for perpUploadControlUid
     */
    public void setPerpUploadControlUid(Integer aPerpUploadControlUid) {
        perpUploadControlUid = aPerpUploadControlUid;
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
     * Access method for userUid.
     *
     * @return the current value of userUid
     */
    public Integer getUserUid() {
        return userUid;
    }

    /**
     * Setter method for userUid.
     *
     * @param aUserUid the new value for userUid
     */
    public void setUserUid(Integer aUserUid) {
        userUid = aUserUid;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(String aStatus) {
        status = aStatus;
    }

    /**
     * Access method for notes.
     *
     * @return the current value of notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Setter method for notes.
     *
     * @param aNotes the new value for notes
     */
    public void setNotes(String aNotes) {
        notes = aNotes;
    }

    /**
     * Access method for recordsProcessed.
     *
     * @return the current value of recordsProcessed
     */
    public Integer getRecordsProcessed() {
        return recordsProcessed;
    }

    /**
     * Setter method for recordsProcessed.
     *
     * @param aRecordsProcessed the new value for recordsProcessed
     */
    public void setRecordsProcessed(Integer aRecordsProcessed) {
        recordsProcessed = aRecordsProcessed;
    }

    /**
     * Access method for origFilename.
     *
     * @return the current value of origFilename
     */
    public String getOrigFilename() {
        return origFilename;
    }

    /**
     * Setter method for origFilename.
     *
     * @param aOrigFilename the new value for origFilename
     */
    public void setOrigFilename(String aOrigFilename) {
        origFilename = aOrigFilename;
    }

    /**
     * Access method for fileUploadedDate.
     *
     * @return the current value of fileUploadedDate
     */
    public Timestamp getFileUploadedDate() {
        return fileUploadedDate;
    }

    /**
     * Setter method for fileUploadedDate.
     *
     * @param aFileUploadedDate the new value for fileUploadedDate
     */
    public void setFileUploadedDate(Timestamp aFileUploadedDate) {
        fileUploadedDate = aFileUploadedDate;
    }

    /**
     * Access method for sysFilename.
     *
     * @return the current value of sysFilename
     */
    public String getSysFilename() {
        return sysFilename;
    }

    /**
     * Setter method for sysFilename.
     *
     * @param aSysFilename the new value for sysFilename
     */
    public void setSysFilename(String aSysFilename) {
        sysFilename = aSysFilename;
    }

    /**
     * Access method for processedFlag.
     *
     * @return the current value of processedFlag
     */
    public Character getProcessedFlag() {
        return processedFlag;
    }

    /**
     * Setter method for processedFlag.
     *
     * @param aProcessedFlag the new value for processedFlag
     */
    public void setProcessedFlag(Character aProcessedFlag) {
        processedFlag = aProcessedFlag;
    }

    /**
     * Access method for archivedFlag.
     *
     * @return the current value of archivedFlag
     */
    public Character getArchivedFlag() {
        return archivedFlag;
    }

    /**
     * Setter method for archivedFlag.
     *
     * @param aArchivedFlag the new value for archivedFlag
     */
    public void setArchivedFlag(Character aArchivedFlag) {
        archivedFlag = aArchivedFlag;
    }

    /**
     * Access method for createModifyBy.
     *
     * @return the current value of createModifyBy
     */
    public String getCreateModifyBy() {
        return createModifyBy;
    }

    /**
     * Setter method for createModifyBy.
     *
     * @param aCreateModifyBy the new value for createModifyBy
     */
    public void setCreateModifyBy(String aCreateModifyBy) {
        createModifyBy = aCreateModifyBy;
    }

    /**
     * Access method for createModifyDate.
     *
     * @return the current value of createModifyDate
     */
    public Timestamp getCreateModifyDate() {
        return createModifyDate;
    }

    /**
     * Setter method for createModifyDate.
     *
     * @param aCreateModifyDate the new value for createModifyDate
     */
    public void setCreateModifyDate(Timestamp aCreateModifyDate) {
        createModifyDate = aCreateModifyDate;
    }

    /**
     * Compares the key for this instance with another PerpUploadControl.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpUploadControl and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpUploadControl)) {
            return false;
        }
        PerpUploadControl that = (PerpUploadControl) other;
        Object myPerpUploadControlUid = this.getPerpUploadControlUid();
        Object yourPerpUploadControlUid = that.getPerpUploadControlUid();
        if (myPerpUploadControlUid==null ? yourPerpUploadControlUid!=null : !myPerpUploadControlUid.equals(yourPerpUploadControlUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpUploadControl.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpUploadControl)) return false;
        return this.equalKeys(other) && ((PerpUploadControl)other).equalKeys(this);
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
        if (getPerpUploadControlUid() == null) {
            i = 0;
        } else {
            i = getPerpUploadControlUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[PerpUploadControl |");
        sb.append(" perpUploadControlUid=").append(getPerpUploadControlUid());
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
        ret.put("perpUploadControlUid", getPerpUploadControlUid());
        return ret;
    }

}
