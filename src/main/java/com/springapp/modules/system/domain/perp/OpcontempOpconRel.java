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

@Entity(name="opcontemp_opcon_rel")
public class OpcontempOpconRel implements Serializable {

    /** Primary key. */
    protected static final String PK = "OpcontempOpconRelPrimary";

    @Column(name="Default_Flag", nullable=false, length=1)
    private Character defaultFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Id
    @ManyToOne(optional=false)
    @JoinColumn(name="OpCon_UID", nullable=false)
    private OperatingConditions operatingConditions;
    @ManyToOne(optional=false)
    @JoinColumn(name="OpConTemplate_UID", nullable=false)
    private OpconTemplates opconTemplates;

    /** Default constructor. */
    public OpcontempOpconRel() {
        super();
    }

    /**
     * Access method for defaultFlag.
     *
     * @return the current value of defaultFlag
     */
    public Character getDefaultFlag() {
        return defaultFlag;
    }

    /**
     * Setter method for defaultFlag.
     *
     * @param aDefaultFlag the new value for defaultFlag
     */
    public void setDefaultFlag(Character aDefaultFlag) {
        defaultFlag = aDefaultFlag;
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
     * Access method for operatingConditions.
     *
     * @return the current value of operatingConditions
     */
    public OperatingConditions getOperatingConditions() {
        return operatingConditions;
    }

    /**
     * Setter method for operatingConditions.
     *
     * @param aOperatingConditions the new value for operatingConditions
     */
    public void setOperatingConditions(OperatingConditions aOperatingConditions) {
        operatingConditions = aOperatingConditions;
    }

    /**
     * Access method for opconTemplates.
     *
     * @return the current value of opconTemplates
     */
    public OpconTemplates getOpconTemplates() {
        return opconTemplates;
    }

    /**
     * Setter method for opconTemplates.
     *
     * @param aOpconTemplates the new value for opconTemplates
     */
    public void setOpconTemplates(OpconTemplates aOpconTemplates) {
        opconTemplates = aOpconTemplates;
    }

    /** Temporary value holder for group key fragment opconTemplatesOpConTemplateUid */
    private transient Integer tempOpconTemplatesOpConTemplateUid;

    /**
     * Gets the key fragment opConTemplateUid for member opconTemplates.
     * If this.opconTemplates is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setOpconTemplatesOpConTemplateUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see OpconTemplates
     */
    public Integer getOpconTemplatesOpConTemplateUid() {
        return (getOpconTemplates() == null ? tempOpconTemplatesOpConTemplateUid : getOpconTemplates().getOpConTemplateUid());
    }

    /**
     * Sets the key fragment opConTemplateUid from member opconTemplates.
     * If this.opconTemplates is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getOpconTemplatesOpConTemplateUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aOpConTemplateUid New value for the key fragment
     * @see OpconTemplates
     */
    public void setOpconTemplatesOpConTemplateUid(Integer aOpConTemplateUid) {
        if (getOpconTemplates() == null) {
            tempOpconTemplatesOpConTemplateUid = aOpConTemplateUid;
        } else {
            getOpconTemplates().setOpConTemplateUid(aOpConTemplateUid);
        }
    }

    /**
     * Compares the key for this instance with another OpcontempOpconRel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OpcontempOpconRel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OpcontempOpconRel)) {
            return false;
        }
        OpcontempOpconRel that = (OpcontempOpconRel) other;
        Object myOpconTemplatesOpConTemplateUid = this.getOpconTemplatesOpConTemplateUid();
        Object yourOpconTemplatesOpConTemplateUid = that.getOpconTemplatesOpConTemplateUid();
        if (myOpconTemplatesOpConTemplateUid==null ? yourOpconTemplatesOpConTemplateUid!=null : !myOpconTemplatesOpConTemplateUid.equals(yourOpconTemplatesOpConTemplateUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OpcontempOpconRel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OpcontempOpconRel)) return false;
        return this.equalKeys(other) && ((OpcontempOpconRel)other).equalKeys(this);
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
        if (getOpconTemplatesOpConTemplateUid() == null) {
            i = 0;
        } else {
            i = getOpconTemplatesOpConTemplateUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[OpcontempOpconRel |");
        sb.append(" opconTemplatesOpConTemplateUid=").append(getOpconTemplatesOpConTemplateUid());
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
        ret.put("opconTemplatesOpConTemplateUid", getOpconTemplatesOpConTemplateUid());
        return ret;
    }

}
