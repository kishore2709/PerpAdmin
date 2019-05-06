// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="type_table_associations")
public class TypeTableAssociations implements Serializable {

    /** Primary key. */
    protected static final String PK = "ttaUid";

    @Id
    @Column(name="TTA_UID", unique=true, nullable=false, precision=10)
    private Integer ttaUid;
    @Column(name="Order_By", precision=10)
    private Integer orderBy;
    @ManyToOne(optional=false)
    @JoinColumn(name="Dependent_On_UID", nullable=false)
    private TypeTableLookup typeTableLookup;
    @ManyToOne(optional=false)
    @JoinColumn(name="Type_Table_Lookup_UID", nullable=false)
    private TypeTableLookup typeTableLookup2;

    /** Default constructor. */
    public TypeTableAssociations() {
        super();
    }

    /**
     * Access method for ttaUid.
     *
     * @return the current value of ttaUid
     */
    public Integer getTtaUid() {
        return ttaUid;
    }

    /**
     * Setter method for ttaUid.
     *
     * @param aTtaUid the new value for ttaUid
     */
    public void setTtaUid(Integer aTtaUid) {
        ttaUid = aTtaUid;
    }

    /**
     * Access method for orderBy.
     *
     * @return the current value of orderBy
     */
    public Integer getOrderBy() {
        return orderBy;
    }

    /**
     * Setter method for orderBy.
     *
     * @param aOrderBy the new value for orderBy
     */
    public void setOrderBy(Integer aOrderBy) {
        orderBy = aOrderBy;
    }

    /**
     * Access method for typeTableLookup.
     *
     * @return the current value of typeTableLookup
     */
    public TypeTableLookup getTypeTableLookup() {
        return typeTableLookup;
    }

    /**
     * Setter method for typeTableLookup.
     *
     * @param aTypeTableLookup the new value for typeTableLookup
     */
    public void setTypeTableLookup(TypeTableLookup aTypeTableLookup) {
        typeTableLookup = aTypeTableLookup;
    }

    /**
     * Access method for typeTableLookup2.
     *
     * @return the current value of typeTableLookup2
     */
    public TypeTableLookup getTypeTableLookup2() {
        return typeTableLookup2;
    }

    /**
     * Setter method for typeTableLookup2.
     *
     * @param aTypeTableLookup2 the new value for typeTableLookup2
     */
    public void setTypeTableLookup2(TypeTableLookup aTypeTableLookup2) {
        typeTableLookup2 = aTypeTableLookup2;
    }

    /**
     * Compares the key for this instance with another TypeTableAssociations.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TypeTableAssociations and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TypeTableAssociations)) {
            return false;
        }
        TypeTableAssociations that = (TypeTableAssociations) other;
        Object myTtaUid = this.getTtaUid();
        Object yourTtaUid = that.getTtaUid();
        if (myTtaUid==null ? yourTtaUid!=null : !myTtaUid.equals(yourTtaUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TypeTableAssociations.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TypeTableAssociations)) return false;
        return this.equalKeys(other) && ((TypeTableAssociations)other).equalKeys(this);
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
        if (getTtaUid() == null) {
            i = 0;
        } else {
            i = getTtaUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[TypeTableAssociations |");
        sb.append(" ttaUid=").append(getTtaUid());
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
        ret.put("ttaUid", getTtaUid());
        return ret;
    }

}
