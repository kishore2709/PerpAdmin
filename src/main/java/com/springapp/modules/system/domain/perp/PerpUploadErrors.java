// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="perp_upload_errors")
public class PerpUploadErrors implements Serializable {

    /** Primary key. */
    protected static final String PK = "perpUploadErrorsUid";

    @Id
    @Column(name="PERP_Upload_Errors_UID", unique=true, nullable=false, precision=10)
    private Integer perpUploadErrorsUid;
    @Column(name="PERP_Upload_CONTROL_UID", nullable=false, precision=10)
    private Integer perpUploadControlUid;
    @Column(name="Operation", length=45)
    private String operation;
    @Column(name="Error_Flag", length=45)
    private String errorFlag;
    @Column(name="Error", length=2000)
    private String error;
    @Column(name="Create_Modify_By", nullable=false, length=45)
    private String createModifyBy;
    @Column(name="Create_Modify_Date", nullable=false)
    private Timestamp createModifyDate;

    /** Default constructor. */
    public PerpUploadErrors() {
        super();
    }

    /**
     * Access method for perpUploadErrorsUid.
     *
     * @return the current value of perpUploadErrorsUid
     */
    public Integer getPerpUploadErrorsUid() {
        return perpUploadErrorsUid;
    }

    /**
     * Setter method for perpUploadErrorsUid.
     *
     * @param aPerpUploadErrorsUid the new value for perpUploadErrorsUid
     */
    public void setPerpUploadErrorsUid(Integer aPerpUploadErrorsUid) {
        perpUploadErrorsUid = aPerpUploadErrorsUid;
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
     * Access method for errorFlag.
     *
     * @return the current value of errorFlag
     */
    public String getErrorFlag() {
        return errorFlag;
    }

    /**
     * Setter method for errorFlag.
     *
     * @param aErrorFlag the new value for errorFlag
     */
    public void setErrorFlag(String aErrorFlag) {
        errorFlag = aErrorFlag;
    }

    /**
     * Access method for error.
     *
     * @return the current value of error
     */
    public String getError() {
        return error;
    }

    /**
     * Setter method for error.
     *
     * @param aError the new value for error
     */
    public void setError(String aError) {
        error = aError;
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
     * Compares the key for this instance with another PerpUploadErrors.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpUploadErrors and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpUploadErrors)) {
            return false;
        }
        PerpUploadErrors that = (PerpUploadErrors) other;
        Object myPerpUploadErrorsUid = this.getPerpUploadErrorsUid();
        Object yourPerpUploadErrorsUid = that.getPerpUploadErrorsUid();
        if (myPerpUploadErrorsUid==null ? yourPerpUploadErrorsUid!=null : !myPerpUploadErrorsUid.equals(yourPerpUploadErrorsUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpUploadErrors.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpUploadErrors)) return false;
        return this.equalKeys(other) && ((PerpUploadErrors)other).equalKeys(this);
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
        if (getPerpUploadErrorsUid() == null) {
            i = 0;
        } else {
            i = getPerpUploadErrorsUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[PerpUploadErrors |");
        sb.append(" perpUploadErrorsUid=").append(getPerpUploadErrorsUid());
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
        ret.put("perpUploadErrorsUid", getPerpUploadErrorsUid());
        return ret;
    }

}
