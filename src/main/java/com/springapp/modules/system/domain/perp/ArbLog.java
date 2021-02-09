// Generated with g9.

package com.springapp.modules.system.domain.perp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity(name="arb_log")
public class ArbLog implements Serializable {

    /** Primary key. */
    protected static final String PK = "arbLogUid";

    @Id
    @Column(name="ARB_LOG_UID", unique=true, nullable=false, precision=10)
    private Integer arbLogUid;
    @Column(name="Operation", length=64)
    private String operation;
    @Column(name="Date_Time_Stamp")
    private Timestamp dateTimeStamp;
    @Column(name="Error_Flag")
    private Boolean errorFlag;
    @Column(name="User_UID", precision=10)
    private Integer userUid;
    @Column(name="Notes", length=128)
    private String notes;

    /** Default constructor. */
    public ArbLog() {
        super();
    }

    /**
     * Access method for arbLogUid.
     *
     * @return the current value of arbLogUid
     */
    public Integer getArbLogUid() {
        return arbLogUid;
    }

    /**
     * Setter method for arbLogUid.
     *
     * @param aArbLogUid the new value for arbLogUid
     */
    public void setArbLogUid(Integer aArbLogUid) {
        arbLogUid = aArbLogUid;
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
     * Access method for dateTimeStamp.
     *
     * @return the current value of dateTimeStamp
     */
    public Timestamp getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Setter method for dateTimeStamp.
     *
     * @param aDateTimeStamp the new value for dateTimeStamp
     */
    public void setDateTimeStamp(Timestamp aDateTimeStamp) {
        dateTimeStamp = aDateTimeStamp;
    }

    /**
     * Access method for errorFlag.
     *
     * @return the current value of errorFlag
     */
    public Boolean getErrorFlag() {
        return errorFlag;
    }

    /**
     * Setter method for errorFlag.
     *
     * @param aErrorFlag the new value for errorFlag
     */
    public void setErrorFlag(Boolean aErrorFlag) {
        errorFlag = aErrorFlag;
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
     * Compares the key for this instance with another ArbLog.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ArbLog and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ArbLog)) {
            return false;
        }
        ArbLog that = (ArbLog) other;
        Object myArbLogUid = this.getArbLogUid();
        Object yourArbLogUid = that.getArbLogUid();
        if (myArbLogUid==null ? yourArbLogUid!=null : !myArbLogUid.equals(yourArbLogUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ArbLog.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ArbLog)) return false;
        return this.equalKeys(other) && ((ArbLog)other).equalKeys(this);
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
        if (getArbLogUid() == null) {
            i = 0;
        } else {
            i = getArbLogUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[ArbLog |");
        sb.append(" arbLogUid=").append(getArbLogUid());
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
        ret.put("arbLogUid", getArbLogUid());
        return ret;
    }

}
