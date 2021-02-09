// Generated with g9.

package com.springapp.modules.system.domain.perp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity(name="email_aud")
public class EmailAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "emailAudUid";

    @Id
    @Column(name="Email_Aud_UID", unique=true, nullable=false, precision=10)
    private Integer emailAudUid;
    @Column(name="Email_UID", nullable=false, precision=10)
    private Integer emailUid;
    @Column(name="Email_Type_UID", nullable=false, precision=10)
    private Integer emailTypeUid;
    @Column(name="Users_UID", precision=10)
    private Integer usersUid;
    @Column(name="Contact_UID", precision=10)
    private Integer contactUid;
    @Column(name="Email_Address", nullable=false, length=128)
    private String emailAddress;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public EmailAud() {
        super();
    }

    /**
     * Access method for emailAudUid.
     *
     * @return the current value of emailAudUid
     */
    public Integer getEmailAudUid() {
        return emailAudUid;
    }

    /**
     * Setter method for emailAudUid.
     *
     * @param aEmailAudUid the new value for emailAudUid
     */
    public void setEmailAudUid(Integer aEmailAudUid) {
        emailAudUid = aEmailAudUid;
    }

    /**
     * Access method for emailUid.
     *
     * @return the current value of emailUid
     */
    public Integer getEmailUid() {
        return emailUid;
    }

    /**
     * Setter method for emailUid.
     *
     * @param aEmailUid the new value for emailUid
     */
    public void setEmailUid(Integer aEmailUid) {
        emailUid = aEmailUid;
    }

    /**
     * Access method for emailTypeUid.
     *
     * @return the current value of emailTypeUid
     */
    public Integer getEmailTypeUid() {
        return emailTypeUid;
    }

    /**
     * Setter method for emailTypeUid.
     *
     * @param aEmailTypeUid the new value for emailTypeUid
     */
    public void setEmailTypeUid(Integer aEmailTypeUid) {
        emailTypeUid = aEmailTypeUid;
    }

    /**
     * Access method for usersUid.
     *
     * @return the current value of usersUid
     */
    public Integer getUsersUid() {
        return usersUid;
    }

    /**
     * Setter method for usersUid.
     *
     * @param aUsersUid the new value for usersUid
     */
    public void setUsersUid(Integer aUsersUid) {
        usersUid = aUsersUid;
    }

    /**
     * Access method for contactUid.
     *
     * @return the current value of contactUid
     */
    public Integer getContactUid() {
        return contactUid;
    }

    /**
     * Setter method for contactUid.
     *
     * @param aContactUid the new value for contactUid
     */
    public void setContactUid(Integer aContactUid) {
        contactUid = aContactUid;
    }

    /**
     * Access method for emailAddress.
     *
     * @return the current value of emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter method for emailAddress.
     *
     * @param aEmailAddress the new value for emailAddress
     */
    public void setEmailAddress(String aEmailAddress) {
        emailAddress = aEmailAddress;
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
     * Compares the key for this instance with another EmailAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EmailAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EmailAud)) {
            return false;
        }
        EmailAud that = (EmailAud) other;
        Object myEmailAudUid = this.getEmailAudUid();
        Object yourEmailAudUid = that.getEmailAudUid();
        if (myEmailAudUid==null ? yourEmailAudUid!=null : !myEmailAudUid.equals(yourEmailAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EmailAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EmailAud)) return false;
        return this.equalKeys(other) && ((EmailAud)other).equalKeys(this);
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
        if (getEmailAudUid() == null) {
            i = 0;
        } else {
            i = getEmailAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[EmailAud |");
        sb.append(" emailAudUid=").append(getEmailAudUid());
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
        ret.put("emailAudUid", getEmailAudUid());
        return ret;
    }

}
