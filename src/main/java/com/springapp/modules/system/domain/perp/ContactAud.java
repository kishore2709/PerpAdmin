// Generated with g9.

package com.springapp.modules.system.domain.perp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity(name="contact_aud")
public class ContactAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "contactAudUid";

    @Id
    @Column(name="Contact_Aud_UID", unique=true, nullable=false, precision=10)
    private Integer contactAudUid;
    @Column(name="Contact_UID", nullable=false, precision=10)
    private Integer contactUid;
    @Column(name="Contact_Type_UID", nullable=false, precision=10)
    private Integer contactTypeUid;
    @Column(name="Company_UID", precision=10)
    private Integer companyUid;
    @Column(name="Terminal_UID", precision=10)
    private Integer terminalUid;
    @Column(name="Compliance_Information_UID", precision=10)
    private Integer complianceInformationUid;
    @Column(name="Sold_UID", precision=10)
    private Integer soldUid;
    @Column(name="Contact_Name", nullable=false, length=60)
    private String contactName;
    @Column(name="First_Name", length=20)
    private String firstName;
    @Column(name="Last_Name", length=40)
    private String lastName;
    @Column(name="Contact_Title", length=60)
    private String contactTitle;
    @Column(name="Salutation_Type_UID", length=5)
    private String salutationTypeUid;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;
    @Column(name="District_UID", precision=10)
    private Integer districtUid;

    /** Default constructor. */
    public ContactAud() {
        super();
    }

    /**
     * Access method for contactAudUid.
     *
     * @return the current value of contactAudUid
     */
    public Integer getContactAudUid() {
        return contactAudUid;
    }

    /**
     * Setter method for contactAudUid.
     *
     * @param aContactAudUid the new value for contactAudUid
     */
    public void setContactAudUid(Integer aContactAudUid) {
        contactAudUid = aContactAudUid;
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
     * Access method for contactTypeUid.
     *
     * @return the current value of contactTypeUid
     */
    public Integer getContactTypeUid() {
        return contactTypeUid;
    }

    /**
     * Setter method for contactTypeUid.
     *
     * @param aContactTypeUid the new value for contactTypeUid
     */
    public void setContactTypeUid(Integer aContactTypeUid) {
        contactTypeUid = aContactTypeUid;
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
     * Access method for terminalUid.
     *
     * @return the current value of terminalUid
     */
    public Integer getTerminalUid() {
        return terminalUid;
    }

    /**
     * Setter method for terminalUid.
     *
     * @param aTerminalUid the new value for terminalUid
     */
    public void setTerminalUid(Integer aTerminalUid) {
        terminalUid = aTerminalUid;
    }

    /**
     * Access method for complianceInformationUid.
     *
     * @return the current value of complianceInformationUid
     */
    public Integer getComplianceInformationUid() {
        return complianceInformationUid;
    }

    /**
     * Setter method for complianceInformationUid.
     *
     * @param aComplianceInformationUid the new value for complianceInformationUid
     */
    public void setComplianceInformationUid(Integer aComplianceInformationUid) {
        complianceInformationUid = aComplianceInformationUid;
    }

    /**
     * Access method for soldUid.
     *
     * @return the current value of soldUid
     */
    public Integer getSoldUid() {
        return soldUid;
    }

    /**
     * Setter method for soldUid.
     *
     * @param aSoldUid the new value for soldUid
     */
    public void setSoldUid(Integer aSoldUid) {
        soldUid = aSoldUid;
    }

    /**
     * Access method for contactName.
     *
     * @return the current value of contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Setter method for contactName.
     *
     * @param aContactName the new value for contactName
     */
    public void setContactName(String aContactName) {
        contactName = aContactName;
    }

    /**
     * Access method for firstName.
     *
     * @return the current value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter method for firstName.
     *
     * @param aFirstName the new value for firstName
     */
    public void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    /**
     * Access method for lastName.
     *
     * @return the current value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter method for lastName.
     *
     * @param aLastName the new value for lastName
     */
    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    /**
     * Access method for contactTitle.
     *
     * @return the current value of contactTitle
     */
    public String getContactTitle() {
        return contactTitle;
    }

    /**
     * Setter method for contactTitle.
     *
     * @param aContactTitle the new value for contactTitle
     */
    public void setContactTitle(String aContactTitle) {
        contactTitle = aContactTitle;
    }

    /**
     * Access method for salutationTypeUid.
     *
     * @return the current value of salutationTypeUid
     */
    public String getSalutationTypeUid() {
        return salutationTypeUid;
    }

    /**
     * Setter method for salutationTypeUid.
     *
     * @param aSalutationTypeUid the new value for salutationTypeUid
     */
    public void setSalutationTypeUid(String aSalutationTypeUid) {
        salutationTypeUid = aSalutationTypeUid;
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
     * Access method for districtUid.
     *
     * @return the current value of districtUid
     */
    public Integer getDistrictUid() {
        return districtUid;
    }

    /**
     * Setter method for districtUid.
     *
     * @param aDistrictUid the new value for districtUid
     */
    public void setDistrictUid(Integer aDistrictUid) {
        districtUid = aDistrictUid;
    }

    /**
     * Compares the key for this instance with another ContactAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ContactAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ContactAud)) {
            return false;
        }
        ContactAud that = (ContactAud) other;
        Object myContactAudUid = this.getContactAudUid();
        Object yourContactAudUid = that.getContactAudUid();
        if (myContactAudUid==null ? yourContactAudUid!=null : !myContactAudUid.equals(yourContactAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ContactAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ContactAud)) return false;
        return this.equalKeys(other) && ((ContactAud)other).equalKeys(this);
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
        if (getContactAudUid() == null) {
            i = 0;
        } else {
            i = getContactAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[ContactAud |");
        sb.append(" contactAudUid=").append(getContactAudUid());
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
        ret.put("contactAudUid", getContactAudUid());
        return ret;
    }

}
