// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="manufacturer_type_aud")
public class ManufacturerTypeAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "manufacturerTypeAudUid";

    @Id
    @Column(name="Manufacturer_Type_Aud_UID", unique=true, nullable=false, precision=10)
    private Integer manufacturerTypeAudUid;
    @Column(name="UID", nullable=false, precision=10)
    private Integer uid;
    @Column(name="Name", nullable=false, length=45)
    private String name;
    @Column(name="Display", nullable=false, length=60)
    private String display;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Identifier", nullable=false, length=45)
    private String identifier;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public ManufacturerTypeAud() {
        super();
    }

    /**
     * Access method for manufacturerTypeAudUid.
     *
     * @return the current value of manufacturerTypeAudUid
     */
    public Integer getManufacturerTypeAudUid() {
        return manufacturerTypeAudUid;
    }

    /**
     * Setter method for manufacturerTypeAudUid.
     *
     * @param aManufacturerTypeAudUid the new value for manufacturerTypeAudUid
     */
    public void setManufacturerTypeAudUid(Integer aManufacturerTypeAudUid) {
        manufacturerTypeAudUid = aManufacturerTypeAudUid;
    }

    /**
     * Access method for uid.
     *
     * @return the current value of uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * Setter method for uid.
     *
     * @param aUid the new value for uid
     */
    public void setUid(Integer aUid) {
        uid = aUid;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for display.
     *
     * @return the current value of display
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Setter method for display.
     *
     * @param aDisplay the new value for display
     */
    public void setDisplay(String aDisplay) {
        display = aDisplay;
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
     * Access method for identifier.
     *
     * @return the current value of identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Setter method for identifier.
     *
     * @param aIdentifier the new value for identifier
     */
    public void setIdentifier(String aIdentifier) {
        identifier = aIdentifier;
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
     * Compares the key for this instance with another ManufacturerTypeAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ManufacturerTypeAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ManufacturerTypeAud)) {
            return false;
        }
        ManufacturerTypeAud that = (ManufacturerTypeAud) other;
        Object myManufacturerTypeAudUid = this.getManufacturerTypeAudUid();
        Object yourManufacturerTypeAudUid = that.getManufacturerTypeAudUid();
        if (myManufacturerTypeAudUid==null ? yourManufacturerTypeAudUid!=null : !myManufacturerTypeAudUid.equals(yourManufacturerTypeAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ManufacturerTypeAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ManufacturerTypeAud)) return false;
        return this.equalKeys(other) && ((ManufacturerTypeAud)other).equalKeys(this);
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
        if (getManufacturerTypeAudUid() == null) {
            i = 0;
        } else {
            i = getManufacturerTypeAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[ManufacturerTypeAud |");
        sb.append(" manufacturerTypeAudUid=").append(getManufacturerTypeAudUid());
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
        ret.put("manufacturerTypeAudUid", getManufacturerTypeAudUid());
        return ret;
    }

}
