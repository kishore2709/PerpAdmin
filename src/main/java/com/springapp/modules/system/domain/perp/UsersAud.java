// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="users_aud")
public class UsersAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "usersAudUid";

    @Id
    @Column(name="Users_Aud_UID", unique=true, nullable=false, precision=10)
    private Integer usersAudUid;
    @Column(name="Users_UID", nullable=false, precision=10)
    private Integer usersUid;
    @Column(name="Company_UID", precision=10)
    private Integer companyUid;
    @Column(name="Username", nullable=false, length=45)
    private String username;
    @Column(name="Password", nullable=false, length=64)
    private String password;
    @Column(name="Fullname", nullable=false, length=60)
    private String fullname;
    @Column(name="First_name", nullable=false, length=20)
    private String firstName;
    @Column(name="Last_name", nullable=false, length=40)
    private String lastName;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="User_Type_UID", nullable=false, precision=10)
    private Integer userTypeUid;
    @Column(name="Salutation_Type_UID", precision=10)
    private Integer salutationTypeUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;
    @Column(name="District_UID", precision=10)
    private Integer districtUid;

    /** Default constructor. */
    public UsersAud() {
        super();
    }

    /**
     * Access method for usersAudUid.
     *
     * @return the current value of usersAudUid
     */
    public Integer getUsersAudUid() {
        return usersAudUid;
    }

    /**
     * Setter method for usersAudUid.
     *
     * @param aUsersAudUid the new value for usersAudUid
     */
    public void setUsersAudUid(Integer aUsersAudUid) {
        usersAudUid = aUsersAudUid;
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
     * Access method for username.
     *
     * @return the current value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter method for username.
     *
     * @param aUsername the new value for username
     */
    public void setUsername(String aUsername) {
        username = aUsername;
    }

    /**
     * Access method for password.
     *
     * @return the current value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for password.
     *
     * @param aPassword the new value for password
     */
    public void setPassword(String aPassword) {
        password = aPassword;
    }

    /**
     * Access method for fullname.
     *
     * @return the current value of fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Setter method for fullname.
     *
     * @param aFullname the new value for fullname
     */
    public void setFullname(String aFullname) {
        fullname = aFullname;
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
     * Access method for userTypeUid.
     *
     * @return the current value of userTypeUid
     */
    public Integer getUserTypeUid() {
        return userTypeUid;
    }

    /**
     * Setter method for userTypeUid.
     *
     * @param aUserTypeUid the new value for userTypeUid
     */
    public void setUserTypeUid(Integer aUserTypeUid) {
        userTypeUid = aUserTypeUid;
    }

    /**
     * Access method for salutationTypeUid.
     *
     * @return the current value of salutationTypeUid
     */
    public Integer getSalutationTypeUid() {
        return salutationTypeUid;
    }

    /**
     * Setter method for salutationTypeUid.
     *
     * @param aSalutationTypeUid the new value for salutationTypeUid
     */
    public void setSalutationTypeUid(Integer aSalutationTypeUid) {
        salutationTypeUid = aSalutationTypeUid;
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
     * Compares the key for this instance with another UsersAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UsersAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UsersAud)) {
            return false;
        }
        UsersAud that = (UsersAud) other;
        Object myUsersAudUid = this.getUsersAudUid();
        Object yourUsersAudUid = that.getUsersAudUid();
        if (myUsersAudUid==null ? yourUsersAudUid!=null : !myUsersAudUid.equals(yourUsersAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UsersAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UsersAud)) return false;
        return this.equalKeys(other) && ((UsersAud)other).equalKeys(this);
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
        if (getUsersAudUid() == null) {
            i = 0;
        } else {
            i = getUsersAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[UsersAud |");
        sb.append(" usersAudUid=").append(getUsersAudUid());
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
        ret.put("usersAudUid", getUsersAudUid());
        return ret;
    }

}
