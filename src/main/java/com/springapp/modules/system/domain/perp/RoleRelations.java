// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="role_relations")
public class RoleRelations implements Serializable {

    /** Primary key. */
    protected static final String PK = "roleRelationsUid";

    @Id
    @Column(name="Role_Relations_UID", unique=true, nullable=false, precision=10)
    private Integer roleRelationsUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Child_Role_UID", nullable=false)
    private Roles roles2;
    @ManyToOne(optional=false)
    @JoinColumn(name="Parent_Role_UID", nullable=false)
    private Roles roles;

    /** Default constructor. */
    public RoleRelations() {
        super();
    }

    /**
     * Access method for roleRelationsUid.
     *
     * @return the current value of roleRelationsUid
     */
    public Integer getRoleRelationsUid() {
        return roleRelationsUid;
    }

    /**
     * Setter method for roleRelationsUid.
     *
     * @param aRoleRelationsUid the new value for roleRelationsUid
     */
    public void setRoleRelationsUid(Integer aRoleRelationsUid) {
        roleRelationsUid = aRoleRelationsUid;
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
     * Access method for roles2.
     *
     * @return the current value of roles2
     */
    public Roles getRoles2() {
        return roles2;
    }

    /**
     * Setter method for roles2.
     *
     * @param aRoles2 the new value for roles2
     */
    public void setRoles2(Roles aRoles2) {
        roles2 = aRoles2;
    }

    /**
     * Access method for roles.
     *
     * @return the current value of roles
     */
    public Roles getRoles() {
        return roles;
    }

    /**
     * Setter method for roles.
     *
     * @param aRoles the new value for roles
     */
    public void setRoles(Roles aRoles) {
        roles = aRoles;
    }

    /**
     * Compares the key for this instance with another RoleRelations.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RoleRelations and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RoleRelations)) {
            return false;
        }
        RoleRelations that = (RoleRelations) other;
        Object myRoleRelationsUid = this.getRoleRelationsUid();
        Object yourRoleRelationsUid = that.getRoleRelationsUid();
        if (myRoleRelationsUid==null ? yourRoleRelationsUid!=null : !myRoleRelationsUid.equals(yourRoleRelationsUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RoleRelations.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RoleRelations)) return false;
        return this.equalKeys(other) && ((RoleRelations)other).equalKeys(this);
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
        if (getRoleRelationsUid() == null) {
            i = 0;
        } else {
            i = getRoleRelationsUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[RoleRelations |");
        sb.append(" roleRelationsUid=").append(getRoleRelationsUid());
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
        ret.put("roleRelationsUid", getRoleRelationsUid());
        return ret;
    }

}
