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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="opconinput_lookup")
public class OpconinputLookup implements Serializable {

    /** Primary key. */
    protected static final String PK = "opConInputRelationUid";

    @Id
    @Column(name="opConInput_Relation_UID", unique=true, nullable=false, precision=10)
    private Integer opConInputRelationUid;
    @Column(name="Var_Type", nullable=false, length=50)
    private String varType;
    @Column(name="Value_Default", nullable=false, length=45)
    private String valueDefault;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="opconinputLookup")
    private Set<OcrirInputValues> ocrirInputValues;
    @ManyToOne(optional=false)
    @JoinColumn(name="OpCon_UID", nullable=false)
    private OperatingConditions operatingConditions;

    /** Default constructor. */
    public OpconinputLookup() {
        super();
    }

    /**
     * Access method for opConInputRelationUid.
     *
     * @return the current value of opConInputRelationUid
     */
    public Integer getOpConInputRelationUid() {
        return opConInputRelationUid;
    }

    /**
     * Setter method for opConInputRelationUid.
     *
     * @param aOpConInputRelationUid the new value for opConInputRelationUid
     */
    public void setOpConInputRelationUid(Integer aOpConInputRelationUid) {
        opConInputRelationUid = aOpConInputRelationUid;
    }

    /**
     * Access method for varType.
     *
     * @return the current value of varType
     */
    public String getVarType() {
        return varType;
    }

    /**
     * Setter method for varType.
     *
     * @param aVarType the new value for varType
     */
    public void setVarType(String aVarType) {
        varType = aVarType;
    }

    /**
     * Access method for valueDefault.
     *
     * @return the current value of valueDefault
     */
    public String getValueDefault() {
        return valueDefault;
    }

    /**
     * Setter method for valueDefault.
     *
     * @param aValueDefault the new value for valueDefault
     */
    public void setValueDefault(String aValueDefault) {
        valueDefault = aValueDefault;
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
     * Access method for ocrirInputValues.
     *
     * @return the current value of ocrirInputValues
     */
    public Set<OcrirInputValues> getOcrirInputValues() {
        return ocrirInputValues;
    }

    /**
     * Setter method for ocrirInputValues.
     *
     * @param aOcrirInputValues the new value for ocrirInputValues
     */
    public void setOcrirInputValues(Set<OcrirInputValues> aOcrirInputValues) {
        ocrirInputValues = aOcrirInputValues;
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
     * Compares the key for this instance with another OpconinputLookup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OpconinputLookup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OpconinputLookup)) {
            return false;
        }
        OpconinputLookup that = (OpconinputLookup) other;
        Object myOpConInputRelationUid = this.getOpConInputRelationUid();
        Object yourOpConInputRelationUid = that.getOpConInputRelationUid();
        if (myOpConInputRelationUid==null ? yourOpConInputRelationUid!=null : !myOpConInputRelationUid.equals(yourOpConInputRelationUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OpconinputLookup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OpconinputLookup)) return false;
        return this.equalKeys(other) && ((OpconinputLookup)other).equalKeys(this);
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
        if (getOpConInputRelationUid() == null) {
            i = 0;
        } else {
            i = getOpConInputRelationUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[OpconinputLookup |");
        sb.append(" opConInputRelationUid=").append(getOpConInputRelationUid());
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
        ret.put("opConInputRelationUid", getOpConInputRelationUid());
        return ret;
    }

}
