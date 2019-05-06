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

@Entity(name="perp_fees_lookup")
public class PerpFeesLookup implements Serializable {

    /** Primary key. */
    protected static final String PK = "perpFeeLookupUid";

    @Id
    @Column(name="PerpFeeLookup_UID", unique=true, nullable=false, precision=10)
    private Integer perpFeeLookupUid;
    @Column(name="BackFee_Flag", nullable=false, length=1)
    private Character backFeeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="DiscountType_UID", nullable=false)
    private DiscountTypes discountTypes;
    @ManyToOne(optional=false)
    @JoinColumn(name="DistrictFeeType_UID", nullable=false)
    private DistrictFeeTypes districtFeeTypes;
    @ManyToOne(optional=false)
    @JoinColumn(name="FeeName_UID", nullable=false)
    private FeeNames feeNames;
    @OneToMany(mappedBy="perpFeesLookup")
    private Set<PerpFeeActionRel> perpFeeActionRel;
    @OneToMany(mappedBy="perpFeesLookup")
    private Set<PerpfeelookupDates> perpfeelookupDates;
    @OneToMany(mappedBy="perpFeesLookup")
    private Set<PerpFeeTypeRel> perpFeeTypeRel;

    /** Default constructor. */
    public PerpFeesLookup() {
        super();
    }

    /**
     * Access method for perpFeeLookupUid.
     *
     * @return the current value of perpFeeLookupUid
     */
    public Integer getPerpFeeLookupUid() {
        return perpFeeLookupUid;
    }

    /**
     * Setter method for perpFeeLookupUid.
     *
     * @param aPerpFeeLookupUid the new value for perpFeeLookupUid
     */
    public void setPerpFeeLookupUid(Integer aPerpFeeLookupUid) {
        perpFeeLookupUid = aPerpFeeLookupUid;
    }

    /**
     * Access method for backFeeFlag.
     *
     * @return the current value of backFeeFlag
     */
    public Character getBackFeeFlag() {
        return backFeeFlag;
    }

    /**
     * Setter method for backFeeFlag.
     *
     * @param aBackFeeFlag the new value for backFeeFlag
     */
    public void setBackFeeFlag(Character aBackFeeFlag) {
        backFeeFlag = aBackFeeFlag;
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
     * Access method for discountTypes.
     *
     * @return the current value of discountTypes
     */
    public DiscountTypes getDiscountTypes() {
        return discountTypes;
    }

    /**
     * Setter method for discountTypes.
     *
     * @param aDiscountTypes the new value for discountTypes
     */
    public void setDiscountTypes(DiscountTypes aDiscountTypes) {
        discountTypes = aDiscountTypes;
    }

    /**
     * Access method for districtFeeTypes.
     *
     * @return the current value of districtFeeTypes
     */
    public DistrictFeeTypes getDistrictFeeTypes() {
        return districtFeeTypes;
    }

    /**
     * Setter method for districtFeeTypes.
     *
     * @param aDistrictFeeTypes the new value for districtFeeTypes
     */
    public void setDistrictFeeTypes(DistrictFeeTypes aDistrictFeeTypes) {
        districtFeeTypes = aDistrictFeeTypes;
    }

    /**
     * Access method for feeNames.
     *
     * @return the current value of feeNames
     */
    public FeeNames getFeeNames() {
        return feeNames;
    }

    /**
     * Setter method for feeNames.
     *
     * @param aFeeNames the new value for feeNames
     */
    public void setFeeNames(FeeNames aFeeNames) {
        feeNames = aFeeNames;
    }

    /**
     * Access method for perpFeeActionRel.
     *
     * @return the current value of perpFeeActionRel
     */
    public Set<PerpFeeActionRel> getPerpFeeActionRel() {
        return perpFeeActionRel;
    }

    /**
     * Setter method for perpFeeActionRel.
     *
     * @param aPerpFeeActionRel the new value for perpFeeActionRel
     */
    public void setPerpFeeActionRel(Set<PerpFeeActionRel> aPerpFeeActionRel) {
        perpFeeActionRel = aPerpFeeActionRel;
    }

    /**
     * Access method for perpfeelookupDates.
     *
     * @return the current value of perpfeelookupDates
     */
    public Set<PerpfeelookupDates> getPerpfeelookupDates() {
        return perpfeelookupDates;
    }

    /**
     * Setter method for perpfeelookupDates.
     *
     * @param aPerpfeelookupDates the new value for perpfeelookupDates
     */
    public void setPerpfeelookupDates(Set<PerpfeelookupDates> aPerpfeelookupDates) {
        perpfeelookupDates = aPerpfeelookupDates;
    }

    /**
     * Access method for perpFeeTypeRel.
     *
     * @return the current value of perpFeeTypeRel
     */
    public Set<PerpFeeTypeRel> getPerpFeeTypeRel() {
        return perpFeeTypeRel;
    }

    /**
     * Setter method for perpFeeTypeRel.
     *
     * @param aPerpFeeTypeRel the new value for perpFeeTypeRel
     */
    public void setPerpFeeTypeRel(Set<PerpFeeTypeRel> aPerpFeeTypeRel) {
        perpFeeTypeRel = aPerpFeeTypeRel;
    }

    /**
     * Compares the key for this instance with another PerpFeesLookup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpFeesLookup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpFeesLookup)) {
            return false;
        }
        PerpFeesLookup that = (PerpFeesLookup) other;
        Object myPerpFeeLookupUid = this.getPerpFeeLookupUid();
        Object yourPerpFeeLookupUid = that.getPerpFeeLookupUid();
        if (myPerpFeeLookupUid==null ? yourPerpFeeLookupUid!=null : !myPerpFeeLookupUid.equals(yourPerpFeeLookupUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpFeesLookup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpFeesLookup)) return false;
        return this.equalKeys(other) && ((PerpFeesLookup)other).equalKeys(this);
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
        if (getPerpFeeLookupUid() == null) {
            i = 0;
        } else {
            i = getPerpFeeLookupUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[PerpFeesLookup |");
        sb.append(" perpFeeLookupUid=").append(getPerpFeeLookupUid());
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
        ret.put("perpFeeLookupUid", getPerpFeeLookupUid());
        return ret;
    }

}
