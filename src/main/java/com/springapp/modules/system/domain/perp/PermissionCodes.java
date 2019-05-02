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
import javax.persistence.Version;

@Entity(name="permission_codes")
public class PermissionCodes implements Serializable {

    /** Primary key. */
    protected static final String PK = "permissionCodesUid";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="Permission_Codes_UID", unique=true, nullable=false, precision=10)
    private int permissionCodesUid;
    @Column(name="PC_Code", nullable=false, length=45)
    private String pcCode;
    @Column(name="PC_Description", length=256)
    private String pcDescription;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="permissionCodes")
    private Set<Permissions> permissions;

    /** Default constructor. */
    public PermissionCodes() {
        super();
    }

    /**
     * Access method for permissionCodesUid.
     *
     * @return the current value of permissionCodesUid
     */
    public int getPermissionCodesUid() {
        return permissionCodesUid;
    }

    /**
     * Setter method for permissionCodesUid.
     *
     * @param aPermissionCodesUid the new value for permissionCodesUid
     */
    public void setPermissionCodesUid(int aPermissionCodesUid) {
        permissionCodesUid = aPermissionCodesUid;
    }

    /**
     * Access method for pcCode.
     *
     * @return the current value of pcCode
     */
    public String getPcCode() {
        return pcCode;
    }

    /**
     * Setter method for pcCode.
     *
     * @param aPcCode the new value for pcCode
     */
    public void setPcCode(String aPcCode) {
        pcCode = aPcCode;
    }

    /**
     * Access method for pcDescription.
     *
     * @return the current value of pcDescription
     */
    public String getPcDescription() {
        return pcDescription;
    }

    /**
     * Setter method for pcDescription.
     *
     * @param aPcDescription the new value for pcDescription
     */
    public void setPcDescription(String aPcDescription) {
        pcDescription = aPcDescription;
    }

    /**
     * Access method for activeFlag.
     *
     * @return the current value of activeFlag
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Setter method for activeFlag.
     *
     * @param aActiveFlag the new value for activeFlag
     */
    public void setActiveFlag(String aActiveFlag) {
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
     * Access method for permissions.
     *
     * @return the current value of permissions
     */
    public Set<Permissions> getPermissions() {
        return permissions;
    }

    /**
     * Setter method for permissions.
     *
     * @param aPermissions the new value for permissions
     */
    public void setPermissions(Set<Permissions> aPermissions) {
        permissions = aPermissions;
    }

    /**
     * Compares the key for this instance with another PermissionCodes.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PermissionCodes and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PermissionCodes)) {
            return false;
        }
        PermissionCodes that = (PermissionCodes) other;
        if (this.getPermissionCodesUid() != that.getPermissionCodesUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PermissionCodes.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PermissionCodes)) return false;
        return this.equalKeys(other) && ((PermissionCodes)other).equalKeys(this);
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
        i = getPermissionCodesUid();
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
        StringBuffer sb = new StringBuffer("[PermissionCodes |");
        sb.append(" permissionCodesUid=").append(getPermissionCodesUid());
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
        ret.put("permissionCodesUid", Integer.valueOf(getPermissionCodesUid()));
        return ret;
    }

}
