// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="batch_control")
public class BatchControl implements Serializable {

    /** Primary key. */
    protected static final String PK = "batchControlUid";

    @Id
    @Column(name="BATCH_CONTROL_UID", unique=true, nullable=false, precision=10)
    private Integer batchControlUid;
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
    @Column(name="BatchControlType_UID", precision=10)
    private Integer batchControlTypeUid;
    @OneToMany(mappedBy="batchControl")
    private Set<BatchErrors> batchErrors;
    @OneToMany(mappedBy="batchControl")
    private Set<BatchRecovery> batchRecovery;

    /** Default constructor. */
    public BatchControl() {
        super();
    }

    /**
     * Access method for batchControlUid.
     *
     * @return the current value of batchControlUid
     */
    public Integer getBatchControlUid() {
        return batchControlUid;
    }

    /**
     * Setter method for batchControlUid.
     *
     * @param aBatchControlUid the new value for batchControlUid
     */
    public void setBatchControlUid(Integer aBatchControlUid) {
        batchControlUid = aBatchControlUid;
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
     * Access method for batchControlTypeUid.
     *
     * @return the current value of batchControlTypeUid
     */
    public Integer getBatchControlTypeUid() {
        return batchControlTypeUid;
    }

    /**
     * Setter method for batchControlTypeUid.
     *
     * @param aBatchControlTypeUid the new value for batchControlTypeUid
     */
    public void setBatchControlTypeUid(Integer aBatchControlTypeUid) {
        batchControlTypeUid = aBatchControlTypeUid;
    }

    /**
     * Access method for batchErrors.
     *
     * @return the current value of batchErrors
     */
    public Set<BatchErrors> getBatchErrors() {
        return batchErrors;
    }

    /**
     * Setter method for batchErrors.
     *
     * @param aBatchErrors the new value for batchErrors
     */
    public void setBatchErrors(Set<BatchErrors> aBatchErrors) {
        batchErrors = aBatchErrors;
    }

    /**
     * Access method for batchRecovery.
     *
     * @return the current value of batchRecovery
     */
    public Set<BatchRecovery> getBatchRecovery() {
        return batchRecovery;
    }

    /**
     * Setter method for batchRecovery.
     *
     * @param aBatchRecovery the new value for batchRecovery
     */
    public void setBatchRecovery(Set<BatchRecovery> aBatchRecovery) {
        batchRecovery = aBatchRecovery;
    }

    /**
     * Compares the key for this instance with another BatchControl.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BatchControl and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BatchControl)) {
            return false;
        }
        BatchControl that = (BatchControl) other;
        Object myBatchControlUid = this.getBatchControlUid();
        Object yourBatchControlUid = that.getBatchControlUid();
        if (myBatchControlUid==null ? yourBatchControlUid!=null : !myBatchControlUid.equals(yourBatchControlUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BatchControl.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BatchControl)) return false;
        return this.equalKeys(other) && ((BatchControl)other).equalKeys(this);
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
        if (getBatchControlUid() == null) {
            i = 0;
        } else {
            i = getBatchControlUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[BatchControl |");
        sb.append(" batchControlUid=").append(getBatchControlUid());
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
        ret.put("batchControlUid", getBatchControlUid());
        return ret;
    }

}
