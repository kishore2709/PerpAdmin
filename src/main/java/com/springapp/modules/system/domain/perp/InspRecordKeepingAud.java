// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="insp_record_keeping_aud")
public class InspRecordKeepingAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "irkAudUid";

    @Id
    @Column(name="IRKAud_UID", unique=true, nullable=false, precision=10)
    private Integer irkAudUid;
    @Column(name="InspectionRK_UID", nullable=false, precision=10)
    private Integer inspectionRkUid;
    @Column(name="Inspection_UID", precision=10)
    private Integer inspectionUid;
    @Column(name="AmtMaterialProcessed_Flag", length=1)
    private Character amtMaterialProcessedFlag;
    @Column(name="AmtMaterialProcByRenter_Flag", length=1)
    private Character amtMaterialProcByRenterFlag;
    @Column(name="BeenAtSameLoc_Flag", length=1)
    private Character beenAtSameLocFlag;
    @Column(name="DistrictNotified_Flag", length=1)
    private Character districtNotifiedFlag;
    @Column(name="HoursOperating_Flag", length=1)
    private Character hoursOperatingFlag;
    @Column(name="LocRecordedMontly_Flag", length=1)
    private Character locRecordedMontlyFlag;
    @Column(name="LocRecordedByRenter_Flag", length=1)
    private Character locRecordedByRenterFlag;
    @Column(name="LocRecordedEveryMove_Flag", length=1)
    private Character locRecordedEveryMoveFlag;
    @Column(name="NotCarbAb_Desc", length=256)
    private String notCarbAbDesc;
    @Column(name="RecordKeepingAccessible_Flag", length=1)
    private Character recordKeepingAccessibleFlag;
    @Column(name="RentalDocGiven_Flag", length=1)
    private Character rentalDocGivenFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Date createModifiedDate;
    @Column(name="Legacy_RecordKeepingInfo", length=50)
    private String legacyRecordKeepingInfo;
    @Column(name="Legacy_RentalHoursAltMethod", length=50)
    private String legacyRentalHoursAltMethod;
    @Column(name="Legacy_RentalHoursAltMethodHow", length=50)
    private String legacyRentalHoursAltMethodHow;
    @Column(name="Legacy_RentalHoursDone", length=50)
    private String legacyRentalHoursDone;
    @Column(name="Legacy_RentalHoursMethod", length=50)
    private String legacyRentalHoursMethod;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public InspRecordKeepingAud() {
        super();
    }

    /**
     * Access method for irkAudUid.
     *
     * @return the current value of irkAudUid
     */
    public Integer getIrkAudUid() {
        return irkAudUid;
    }

    /**
     * Setter method for irkAudUid.
     *
     * @param aIrkAudUid the new value for irkAudUid
     */
    public void setIrkAudUid(Integer aIrkAudUid) {
        irkAudUid = aIrkAudUid;
    }

    /**
     * Access method for inspectionRkUid.
     *
     * @return the current value of inspectionRkUid
     */
    public Integer getInspectionRkUid() {
        return inspectionRkUid;
    }

    /**
     * Setter method for inspectionRkUid.
     *
     * @param aInspectionRkUid the new value for inspectionRkUid
     */
    public void setInspectionRkUid(Integer aInspectionRkUid) {
        inspectionRkUid = aInspectionRkUid;
    }

    /**
     * Access method for inspectionUid.
     *
     * @return the current value of inspectionUid
     */
    public Integer getInspectionUid() {
        return inspectionUid;
    }

    /**
     * Setter method for inspectionUid.
     *
     * @param aInspectionUid the new value for inspectionUid
     */
    public void setInspectionUid(Integer aInspectionUid) {
        inspectionUid = aInspectionUid;
    }

    /**
     * Access method for amtMaterialProcessedFlag.
     *
     * @return the current value of amtMaterialProcessedFlag
     */
    public Character getAmtMaterialProcessedFlag() {
        return amtMaterialProcessedFlag;
    }

    /**
     * Setter method for amtMaterialProcessedFlag.
     *
     * @param aAmtMaterialProcessedFlag the new value for amtMaterialProcessedFlag
     */
    public void setAmtMaterialProcessedFlag(Character aAmtMaterialProcessedFlag) {
        amtMaterialProcessedFlag = aAmtMaterialProcessedFlag;
    }

    /**
     * Access method for amtMaterialProcByRenterFlag.
     *
     * @return the current value of amtMaterialProcByRenterFlag
     */
    public Character getAmtMaterialProcByRenterFlag() {
        return amtMaterialProcByRenterFlag;
    }

    /**
     * Setter method for amtMaterialProcByRenterFlag.
     *
     * @param aAmtMaterialProcByRenterFlag the new value for amtMaterialProcByRenterFlag
     */
    public void setAmtMaterialProcByRenterFlag(Character aAmtMaterialProcByRenterFlag) {
        amtMaterialProcByRenterFlag = aAmtMaterialProcByRenterFlag;
    }

    /**
     * Access method for beenAtSameLocFlag.
     *
     * @return the current value of beenAtSameLocFlag
     */
    public Character getBeenAtSameLocFlag() {
        return beenAtSameLocFlag;
    }

    /**
     * Setter method for beenAtSameLocFlag.
     *
     * @param aBeenAtSameLocFlag the new value for beenAtSameLocFlag
     */
    public void setBeenAtSameLocFlag(Character aBeenAtSameLocFlag) {
        beenAtSameLocFlag = aBeenAtSameLocFlag;
    }

    /**
     * Access method for districtNotifiedFlag.
     *
     * @return the current value of districtNotifiedFlag
     */
    public Character getDistrictNotifiedFlag() {
        return districtNotifiedFlag;
    }

    /**
     * Setter method for districtNotifiedFlag.
     *
     * @param aDistrictNotifiedFlag the new value for districtNotifiedFlag
     */
    public void setDistrictNotifiedFlag(Character aDistrictNotifiedFlag) {
        districtNotifiedFlag = aDistrictNotifiedFlag;
    }

    /**
     * Access method for hoursOperatingFlag.
     *
     * @return the current value of hoursOperatingFlag
     */
    public Character getHoursOperatingFlag() {
        return hoursOperatingFlag;
    }

    /**
     * Setter method for hoursOperatingFlag.
     *
     * @param aHoursOperatingFlag the new value for hoursOperatingFlag
     */
    public void setHoursOperatingFlag(Character aHoursOperatingFlag) {
        hoursOperatingFlag = aHoursOperatingFlag;
    }

    /**
     * Access method for locRecordedMontlyFlag.
     *
     * @return the current value of locRecordedMontlyFlag
     */
    public Character getLocRecordedMontlyFlag() {
        return locRecordedMontlyFlag;
    }

    /**
     * Setter method for locRecordedMontlyFlag.
     *
     * @param aLocRecordedMontlyFlag the new value for locRecordedMontlyFlag
     */
    public void setLocRecordedMontlyFlag(Character aLocRecordedMontlyFlag) {
        locRecordedMontlyFlag = aLocRecordedMontlyFlag;
    }

    /**
     * Access method for locRecordedByRenterFlag.
     *
     * @return the current value of locRecordedByRenterFlag
     */
    public Character getLocRecordedByRenterFlag() {
        return locRecordedByRenterFlag;
    }

    /**
     * Setter method for locRecordedByRenterFlag.
     *
     * @param aLocRecordedByRenterFlag the new value for locRecordedByRenterFlag
     */
    public void setLocRecordedByRenterFlag(Character aLocRecordedByRenterFlag) {
        locRecordedByRenterFlag = aLocRecordedByRenterFlag;
    }

    /**
     * Access method for locRecordedEveryMoveFlag.
     *
     * @return the current value of locRecordedEveryMoveFlag
     */
    public Character getLocRecordedEveryMoveFlag() {
        return locRecordedEveryMoveFlag;
    }

    /**
     * Setter method for locRecordedEveryMoveFlag.
     *
     * @param aLocRecordedEveryMoveFlag the new value for locRecordedEveryMoveFlag
     */
    public void setLocRecordedEveryMoveFlag(Character aLocRecordedEveryMoveFlag) {
        locRecordedEveryMoveFlag = aLocRecordedEveryMoveFlag;
    }

    /**
     * Access method for notCarbAbDesc.
     *
     * @return the current value of notCarbAbDesc
     */
    public String getNotCarbAbDesc() {
        return notCarbAbDesc;
    }

    /**
     * Setter method for notCarbAbDesc.
     *
     * @param aNotCarbAbDesc the new value for notCarbAbDesc
     */
    public void setNotCarbAbDesc(String aNotCarbAbDesc) {
        notCarbAbDesc = aNotCarbAbDesc;
    }

    /**
     * Access method for recordKeepingAccessibleFlag.
     *
     * @return the current value of recordKeepingAccessibleFlag
     */
    public Character getRecordKeepingAccessibleFlag() {
        return recordKeepingAccessibleFlag;
    }

    /**
     * Setter method for recordKeepingAccessibleFlag.
     *
     * @param aRecordKeepingAccessibleFlag the new value for recordKeepingAccessibleFlag
     */
    public void setRecordKeepingAccessibleFlag(Character aRecordKeepingAccessibleFlag) {
        recordKeepingAccessibleFlag = aRecordKeepingAccessibleFlag;
    }

    /**
     * Access method for rentalDocGivenFlag.
     *
     * @return the current value of rentalDocGivenFlag
     */
    public Character getRentalDocGivenFlag() {
        return rentalDocGivenFlag;
    }

    /**
     * Setter method for rentalDocGivenFlag.
     *
     * @param aRentalDocGivenFlag the new value for rentalDocGivenFlag
     */
    public void setRentalDocGivenFlag(Character aRentalDocGivenFlag) {
        rentalDocGivenFlag = aRentalDocGivenFlag;
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
    public Date getCreateModifiedDate() {
        return createModifiedDate;
    }

    /**
     * Setter method for createModifiedDate.
     *
     * @param aCreateModifiedDate the new value for createModifiedDate
     */
    public void setCreateModifiedDate(Date aCreateModifiedDate) {
        createModifiedDate = aCreateModifiedDate;
    }

    /**
     * Access method for legacyRecordKeepingInfo.
     *
     * @return the current value of legacyRecordKeepingInfo
     */
    public String getLegacyRecordKeepingInfo() {
        return legacyRecordKeepingInfo;
    }

    /**
     * Setter method for legacyRecordKeepingInfo.
     *
     * @param aLegacyRecordKeepingInfo the new value for legacyRecordKeepingInfo
     */
    public void setLegacyRecordKeepingInfo(String aLegacyRecordKeepingInfo) {
        legacyRecordKeepingInfo = aLegacyRecordKeepingInfo;
    }

    /**
     * Access method for legacyRentalHoursAltMethod.
     *
     * @return the current value of legacyRentalHoursAltMethod
     */
    public String getLegacyRentalHoursAltMethod() {
        return legacyRentalHoursAltMethod;
    }

    /**
     * Setter method for legacyRentalHoursAltMethod.
     *
     * @param aLegacyRentalHoursAltMethod the new value for legacyRentalHoursAltMethod
     */
    public void setLegacyRentalHoursAltMethod(String aLegacyRentalHoursAltMethod) {
        legacyRentalHoursAltMethod = aLegacyRentalHoursAltMethod;
    }

    /**
     * Access method for legacyRentalHoursAltMethodHow.
     *
     * @return the current value of legacyRentalHoursAltMethodHow
     */
    public String getLegacyRentalHoursAltMethodHow() {
        return legacyRentalHoursAltMethodHow;
    }

    /**
     * Setter method for legacyRentalHoursAltMethodHow.
     *
     * @param aLegacyRentalHoursAltMethodHow the new value for legacyRentalHoursAltMethodHow
     */
    public void setLegacyRentalHoursAltMethodHow(String aLegacyRentalHoursAltMethodHow) {
        legacyRentalHoursAltMethodHow = aLegacyRentalHoursAltMethodHow;
    }

    /**
     * Access method for legacyRentalHoursDone.
     *
     * @return the current value of legacyRentalHoursDone
     */
    public String getLegacyRentalHoursDone() {
        return legacyRentalHoursDone;
    }

    /**
     * Setter method for legacyRentalHoursDone.
     *
     * @param aLegacyRentalHoursDone the new value for legacyRentalHoursDone
     */
    public void setLegacyRentalHoursDone(String aLegacyRentalHoursDone) {
        legacyRentalHoursDone = aLegacyRentalHoursDone;
    }

    /**
     * Access method for legacyRentalHoursMethod.
     *
     * @return the current value of legacyRentalHoursMethod
     */
    public String getLegacyRentalHoursMethod() {
        return legacyRentalHoursMethod;
    }

    /**
     * Setter method for legacyRentalHoursMethod.
     *
     * @param aLegacyRentalHoursMethod the new value for legacyRentalHoursMethod
     */
    public void setLegacyRentalHoursMethod(String aLegacyRentalHoursMethod) {
        legacyRentalHoursMethod = aLegacyRentalHoursMethod;
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
     * Compares the key for this instance with another InspRecordKeepingAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class InspRecordKeepingAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof InspRecordKeepingAud)) {
            return false;
        }
        InspRecordKeepingAud that = (InspRecordKeepingAud) other;
        Object myIrkAudUid = this.getIrkAudUid();
        Object yourIrkAudUid = that.getIrkAudUid();
        if (myIrkAudUid==null ? yourIrkAudUid!=null : !myIrkAudUid.equals(yourIrkAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another InspRecordKeepingAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof InspRecordKeepingAud)) return false;
        return this.equalKeys(other) && ((InspRecordKeepingAud)other).equalKeys(this);
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
        if (getIrkAudUid() == null) {
            i = 0;
        } else {
            i = getIrkAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[InspRecordKeepingAud |");
        sb.append(" irkAudUid=").append(getIrkAudUid());
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
        ret.put("irkAudUid", getIrkAudUid());
        return ret;
    }

}
