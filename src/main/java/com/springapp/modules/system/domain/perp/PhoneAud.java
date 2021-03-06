// Generated with g9.

package com.springapp.modules.system.domain.perp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity(name="phone_aud")
public class PhoneAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "phoneAudUid";

    @Id
    @Column(name="Phone_Aud_UID", unique=true, nullable=false, precision=10)
    private Integer phoneAudUid;
    @Column(name="Phone_UID", nullable=false, precision=10)
    private Integer phoneUid;
    @Column(name="Phone_Type_UID", nullable=false, precision=10)
    private Integer phoneTypeUid;
    @Column(name="Contact_UID", precision=10)
    private Integer contactUid;
    @Column(name="Users_UID", precision=10)
    private Integer usersUid;
    @Column(name="Company_UID", precision=10)
    private Integer companyUid;
    @Column(name="Phone_Number", nullable=false, length=45)
    private String phoneNumber;
    @Column(name="Extension", length=10)
    private String extension;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public PhoneAud() {
        super();
    }

    /**
     * Access method for phoneAudUid.
     *
     * @return the current value of phoneAudUid
     */
    public Integer getPhoneAudUid() {
        return phoneAudUid;
    }

    /**
     * Setter method for phoneAudUid.
     *
     * @param aPhoneAudUid the new value for phoneAudUid
     */
    public void setPhoneAudUid(Integer aPhoneAudUid) {
        phoneAudUid = aPhoneAudUid;
    }

    /**
     * Access method for phoneUid.
     *
     * @return the current value of phoneUid
     */
    public Integer getPhoneUid() {
        return phoneUid;
    }

    /**
     * Setter method for phoneUid.
     *
     * @param aPhoneUid the new value for phoneUid
     */
    public void setPhoneUid(Integer aPhoneUid) {
        phoneUid = aPhoneUid;
    }

    /**
     * Access method for phoneTypeUid.
     *
     * @return the current value of phoneTypeUid
     */
    public Integer getPhoneTypeUid() {
        return phoneTypeUid;
    }

    /**
     * Setter method for phoneTypeUid.
     *
     * @param aPhoneTypeUid the new value for phoneTypeUid
     */
    public void setPhoneTypeUid(Integer aPhoneTypeUid) {
        phoneTypeUid = aPhoneTypeUid;
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
     * Access method for phoneNumber.
     *
     * @return the current value of phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter method for phoneNumber.
     *
     * @param aPhoneNumber the new value for phoneNumber
     */
    public void setPhoneNumber(String aPhoneNumber) {
        phoneNumber = aPhoneNumber;
    }

    /**
     * Access method for extension.
     *
     * @return the current value of extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Setter method for extension.
     *
     * @param aExtension the new value for extension
     */
    public void setExtension(String aExtension) {
        extension = aExtension;
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
     * Compares the key for this instance with another PhoneAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PhoneAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PhoneAud)) {
            return false;
        }
        PhoneAud that = (PhoneAud) other;
        Object myPhoneAudUid = this.getPhoneAudUid();
        Object yourPhoneAudUid = that.getPhoneAudUid();
        if (myPhoneAudUid==null ? yourPhoneAudUid!=null : !myPhoneAudUid.equals(yourPhoneAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PhoneAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PhoneAud)) return false;
        return this.equalKeys(other) && ((PhoneAud)other).equalKeys(this);
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
        if (getPhoneAudUid() == null) {
            i = 0;
        } else {
            i = getPhoneAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[PhoneAud |");
        sb.append(" phoneAudUid=").append(getPhoneAudUid());
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
        ret.put("phoneAudUid", getPhoneAudUid());
        return ret;
    }

}
