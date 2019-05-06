// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="apptranreg_fees")
public class ApptranregFees implements Serializable {

    /** Primary key. */
    protected static final String PK = "appTransRegFeeUid";

    @Id
    @Column(name="AppTransRegFee_UID", unique=true, nullable=false, precision=10)
    private Integer appTransRegFeeUid;
    @Column(name="BackFee_Flag", nullable=false, length=1)
    private Character backFeeFlag;
    @Column(name="Actual_Amt", nullable=false, precision=10, scale=2)
    private BigDecimal actualAmt;
    @Column(name="Calculate_Amt", nullable=false, precision=10, scale=2)
    private BigDecimal calculateAmt;
    @Column(name="Override_Comment", length=128)
    private String overrideComment;
    @Column(name="AdjustmentFee_Flag", nullable=false, length=1)
    private Character adjustmentFeeFlag;
    @Column(name="Ledger_UID", precision=10)
    private Integer ledgerUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="HideDistrictReport_Flag", length=1)
    private String hideDistrictReportFlag;
    @ManyToOne(optional=false)
    @JoinColumn(name="AppTransRegRel_UID", nullable=false)
    private ApptransRegRel apptransRegRel;
    @ManyToOne(optional=false)
    @JoinColumn(name="DiscountTypes_UID", nullable=false)
    private DiscountTypes discountTypes;
    @ManyToOne(optional=false)
    @JoinColumn(name="DistrictFeeType_UID", nullable=false)
    private DistrictFeeTypes districtFeeTypes;
    @ManyToOne(optional=false)
    @JoinColumn(name="FeeName_UID", nullable=false)
    private FeeNames feeNames;

    /** Default constructor. */
    public ApptranregFees() {
        super();
    }

    /**
     * Access method for appTransRegFeeUid.
     *
     * @return the current value of appTransRegFeeUid
     */
    public Integer getAppTransRegFeeUid() {
        return appTransRegFeeUid;
    }

    /**
     * Setter method for appTransRegFeeUid.
     *
     * @param aAppTransRegFeeUid the new value for appTransRegFeeUid
     */
    public void setAppTransRegFeeUid(Integer aAppTransRegFeeUid) {
        appTransRegFeeUid = aAppTransRegFeeUid;
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
     * Access method for actualAmt.
     *
     * @return the current value of actualAmt
     */
    public BigDecimal getActualAmt() {
        return actualAmt;
    }

    /**
     * Setter method for actualAmt.
     *
     * @param aActualAmt the new value for actualAmt
     */
    public void setActualAmt(BigDecimal aActualAmt) {
        actualAmt = aActualAmt;
    }

    /**
     * Access method for calculateAmt.
     *
     * @return the current value of calculateAmt
     */
    public BigDecimal getCalculateAmt() {
        return calculateAmt;
    }

    /**
     * Setter method for calculateAmt.
     *
     * @param aCalculateAmt the new value for calculateAmt
     */
    public void setCalculateAmt(BigDecimal aCalculateAmt) {
        calculateAmt = aCalculateAmt;
    }

    /**
     * Access method for overrideComment.
     *
     * @return the current value of overrideComment
     */
    public String getOverrideComment() {
        return overrideComment;
    }

    /**
     * Setter method for overrideComment.
     *
     * @param aOverrideComment the new value for overrideComment
     */
    public void setOverrideComment(String aOverrideComment) {
        overrideComment = aOverrideComment;
    }

    /**
     * Access method for adjustmentFeeFlag.
     *
     * @return the current value of adjustmentFeeFlag
     */
    public Character getAdjustmentFeeFlag() {
        return adjustmentFeeFlag;
    }

    /**
     * Setter method for adjustmentFeeFlag.
     *
     * @param aAdjustmentFeeFlag the new value for adjustmentFeeFlag
     */
    public void setAdjustmentFeeFlag(Character aAdjustmentFeeFlag) {
        adjustmentFeeFlag = aAdjustmentFeeFlag;
    }

    /**
     * Access method for ledgerUid.
     *
     * @return the current value of ledgerUid
     */
    public Integer getLedgerUid() {
        return ledgerUid;
    }

    /**
     * Setter method for ledgerUid.
     *
     * @param aLedgerUid the new value for ledgerUid
     */
    public void setLedgerUid(Integer aLedgerUid) {
        ledgerUid = aLedgerUid;
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
     * Access method for hideDistrictReportFlag.
     *
     * @return the current value of hideDistrictReportFlag
     */
    public String getHideDistrictReportFlag() {
        return hideDistrictReportFlag;
    }

    /**
     * Setter method for hideDistrictReportFlag.
     *
     * @param aHideDistrictReportFlag the new value for hideDistrictReportFlag
     */
    public void setHideDistrictReportFlag(String aHideDistrictReportFlag) {
        hideDistrictReportFlag = aHideDistrictReportFlag;
    }

    /**
     * Access method for apptransRegRel.
     *
     * @return the current value of apptransRegRel
     */
    public ApptransRegRel getApptransRegRel() {
        return apptransRegRel;
    }

    /**
     * Setter method for apptransRegRel.
     *
     * @param aApptransRegRel the new value for apptransRegRel
     */
    public void setApptransRegRel(ApptransRegRel aApptransRegRel) {
        apptransRegRel = aApptransRegRel;
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
     * Compares the key for this instance with another ApptranregFees.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ApptranregFees and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ApptranregFees)) {
            return false;
        }
        ApptranregFees that = (ApptranregFees) other;
        Object myAppTransRegFeeUid = this.getAppTransRegFeeUid();
        Object yourAppTransRegFeeUid = that.getAppTransRegFeeUid();
        if (myAppTransRegFeeUid==null ? yourAppTransRegFeeUid!=null : !myAppTransRegFeeUid.equals(yourAppTransRegFeeUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ApptranregFees.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ApptranregFees)) return false;
        return this.equalKeys(other) && ((ApptranregFees)other).equalKeys(this);
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
        if (getAppTransRegFeeUid() == null) {
            i = 0;
        } else {
            i = getAppTransRegFeeUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[ApptranregFees |");
        sb.append(" appTransRegFeeUid=").append(getAppTransRegFeeUid());
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
        ret.put("appTransRegFeeUid", getAppTransRegFeeUid());
        return ret;
    }

}
