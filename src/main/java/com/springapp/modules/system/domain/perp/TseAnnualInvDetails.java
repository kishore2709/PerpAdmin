// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="tse_annual_inv_details")
public class TseAnnualInvDetails implements Serializable {

    /** Primary key. */
    protected static final String PK = "tseaidUid";

    @Id
    @Column(name="TSEAID_UID", unique=true, nullable=false, precision=10)
    private Integer tseaidUid;
    @Column(name="RegItemDet_UID", precision=10)
    private Integer regItemDetUid;
    @Column(name="RegItem_UID", precision=10)
    private Integer regItemUid;
    @Column(name="AddEquipInforType_UID", precision=10)
    private Integer addEquipInforTypeUid;
    @Column(name="Adjusted_PM_Factor", precision=10, scale=2)
    private BigDecimal adjustedPmFactor;
    @Column(name="APCE_ExecOrderNo", length=20)
    private Character apceExecOrderNo;
    @Column(name="APCEFilterType_UID", precision=10)
    private Integer apceFilterTypeUid;
    @Column(name="Aux_Engine_Flag", length=1)
    private Character auxEngineFlag;
    @Column(name="BrakeHPRanges_UID", precision=10)
    private Integer brakeHpRangesUid;
    @Column(name="BrakeHPRanges_Units_UID", precision=10)
    private Integer brakeHpRangesUnitsUid;
    @Column(name="BrakeHPValue", precision=10)
    private Integer brakeHpValue;
    @Column(name="CARB_Cert_PM_Factor_Override", precision=10, scale=2)
    private BigDecimal carbCertPmFactorOverride;
    @Column(name="CCTS_OnHighway", precision=5)
    private Short cctsOnHighway;
    @Column(name="CO", precision=10)
    private Integer co;
    @Column(name="CO_Other_Units", length=12)
    private String coOtherUnits;
    @Column(name="CO_Units_UID", precision=10)
    private Integer coUnitsUid;
    @Column(name="Company_Unit_ID", length=60)
    private String companyUnitId;
    @Column(name="Crusher_Equiped_Flag", length=1)
    private Character crusherEquipedFlag;
    @Column(name="CurrentTier_UID", precision=10)
    private Integer currentTierUid;
    @Column(name="Description")
    private String description;
    @Column(name="Electrification_Percent", precision=10)
    private Integer electrificationPercent;
    @Column(name="Emission_Points")
    private String emissionPoints;
    @Column(name="Engine_Family", length=12)
    private String engineFamily;
    @Column(name="EnginePowersOther")
    private String enginePowersOther;
    @Column(name="EnginePowersType_UID", precision=10)
    private Integer enginePowersTypeUid;
    @Column(name="EngineTypeLookup_UID", precision=10)
    private Integer engineTypeLookupUid;
    @Column(name="EngineUseType_UID", precision=10)
    private Integer engineUseTypeUid;
    @Column(name="Equipment_ID", length=70)
    private String equipmentId;
    @Column(name="Flowrate", length=20)
    private String flowrate;
    @Column(name="FlowRate_Units_UID", precision=10)
    private Integer flowRateUnitsUid;
    @Column(name="FuelAdd_ExecOrderNo", length=20)
    private Character fuelAddExecOrderNo;
    @Column(name="FuelAdditive_UID", precision=10)
    private Integer fuelAdditiveUid;
    @Column(name="Fuel_Consumption_Rate", precision=15, scale=5)
    private BigDecimal fuelConsumptionRate;
    @Column(name="FuelConsumption_Units_UID", precision=10)
    private Integer fuelConsumptionUnitsUid;
    @Column(name="FuelTypeUsed_UID", precision=10)
    private Integer fuelTypeUsedUid;
    @Column(name="List_Description")
    private String listDescription;
    @Column(name="Manufacturer_UID", precision=10)
    private Integer manufacturerUid;
    @Column(name="Manufacturer_Other", length=60)
    private String manufacturerOther;
    @Column(name="Model", length=45)
    private String model;
    @Column(name="ModelYears_UID", precision=10)
    private Integer modelYearsUid;
    @Column(name="Monitoring_Other", length=50)
    private String monitoringOther;
    @Column(name="MonitoringMethods_UID", precision=10)
    private Integer monitoringMethodsUid;
    @Column(name="Name_Other_Emis_Data", length=40)
    private String nameOtherEmisData;
    @Column(name="Name_Src_Test_Emis_Data", length=40)
    private String nameSrcTestEmisData;
    @Column(name="NOx", precision=10)
    private Integer nOx;
    @Column(name="NOx_Other_Units", length=12)
    private String nOxOtherUnits;
    @Column(name="NOx_Units_UID", precision=10)
    private Integer nOxUnitsUid;
    @Column(name="Nozzle_Diameter", length=15)
    private String nozzleDiameter;
    @Column(name="NozzleDiameter_Units_UID", precision=10)
    private Integer nozzleDiameterUnitsUid;
    @Column(name="Nozzle_Pressure", length=15)
    private String nozzlePressure;
    @Column(name="NosslePressure_Units_UID", precision=10)
    private Integer nosslePressureUnitsUid;
    @Column(name="Number_Of_Units", precision=5)
    private Short numberOfUnits;
    @Column(name="PM_Control_Efficiency", precision=10)
    private Integer pmControlEfficiency;
    @Column(name="PM10", precision=10)
    private Integer pm10;
    @Column(name="PM10_Other_Units", length=12)
    private String pm10OtherUnits;
    @Column(name="PM10_Units_UID", precision=10)
    private Integer pm10UnitsUid;
    @Column(name="PowerUoM_UID", precision=10)
    private Integer powerUoMUid;
    @Column(name="Power_Rating", precision=15, scale=5)
    private BigDecimal powerRating;
    @Column(name="Pressure_Gauge_Flag", length=1)
    private Character pressureGaugeFlag;
    @Column(name="Primary_Component_Indicator", nullable=false, length=10)
    private String primaryComponentIndicator;
    @Column(name="RegItemCompType_UID", precision=10)
    private Integer regItemCompTypeUid;
    @Column(name="Resident", length=2)
    private String resident;
    @Column(name="Resident_1995", length=2)
    private String resident1995;
    @Column(name="Self_Propelled_Flag", length=1)
    private Character selfPropelledFlag;
    @Column(name="Serial_No", length=30)
    private String serialNo;
    @Column(name="Series", length=20)
    private String series;
    @Column(name="Silo_Crusher_Count", precision=10)
    private Integer siloCrusherCount;
    @Column(name="Silo_Crushers")
    private String siloCrushers;
    @Column(name="Source_Emissions_Data", length=10)
    private String sourceEmissionsData;
    @Column(name="SOx", precision=10)
    private Integer sOx;
    @Column(name="SOx_Other_Units", length=12)
    private String sOxOtherUnits;
    @Column(name="SOx_Units_UID", precision=10)
    private Integer sOxUnitsUid;
    @Column(name="STWTypes_UID", precision=10)
    private Integer stwTypesUid;
    @Column(name="Throughput_Rating", length=40)
    private String throughputRating;
    @Column(name="Tier_UID", precision=10)
    private Integer tierUid;
    @Column(name="Transfer_Points")
    private String transferPoints;
    @Column(name="ThroughputRating_Units_UID", precision=10)
    private Integer throughputRatingUnitsUid;
    @Column(name="Truck_CentralMix_Flag", length=1)
    private Character truckCentralMixFlag;
    @Column(name="VOC", precision=10)
    private Integer voc;
    @Column(name="VOC_Other_Units", length=12)
    private String vocOtherUnits;
    @Column(name="VOC_Units_UID", precision=10)
    private Integer vocUnitsUid;
    @Column(name="Wet_Blasting_Percentage", precision=10)
    private Integer wetBlastingPercentage;
    @Column(name="WoodProcAck_Date")
    private Date woodProcAckDate;
    @Column(name="WoodProcAck_Flag", length=1)
    private Character woodProcAckFlag;
    @Column(name="WoodProcAck_User", length=45)
    private String woodProcAckUser;
    @Column(name="Active_Flag", length=1)
    private Character activeFlag;
    @Column(name="Orig_Create_Modified_By", length=45)
    private String origCreateModifiedBy;
    @Column(name="Orig_Create_Modified_Date")
    private Timestamp origCreateModifiedDate;
    @Column(name="AppTransRegRel_UID", nullable=false, precision=10)
    private Integer appTransRegRelUid;
    @Column(name="TSEAID_Year", nullable=false)
    private Date tseaidYear;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public TseAnnualInvDetails() {
        super();
    }

    /**
     * Access method for tseaidUid.
     *
     * @return the current value of tseaidUid
     */
    public Integer getTseaidUid() {
        return tseaidUid;
    }

    /**
     * Setter method for tseaidUid.
     *
     * @param aTseaidUid the new value for tseaidUid
     */
    public void setTseaidUid(Integer aTseaidUid) {
        tseaidUid = aTseaidUid;
    }

    /**
     * Access method for regItemDetUid.
     *
     * @return the current value of regItemDetUid
     */
    public Integer getRegItemDetUid() {
        return regItemDetUid;
    }

    /**
     * Setter method for regItemDetUid.
     *
     * @param aRegItemDetUid the new value for regItemDetUid
     */
    public void setRegItemDetUid(Integer aRegItemDetUid) {
        regItemDetUid = aRegItemDetUid;
    }

    /**
     * Access method for regItemUid.
     *
     * @return the current value of regItemUid
     */
    public Integer getRegItemUid() {
        return regItemUid;
    }

    /**
     * Setter method for regItemUid.
     *
     * @param aRegItemUid the new value for regItemUid
     */
    public void setRegItemUid(Integer aRegItemUid) {
        regItemUid = aRegItemUid;
    }

    /**
     * Access method for addEquipInforTypeUid.
     *
     * @return the current value of addEquipInforTypeUid
     */
    public Integer getAddEquipInforTypeUid() {
        return addEquipInforTypeUid;
    }

    /**
     * Setter method for addEquipInforTypeUid.
     *
     * @param aAddEquipInforTypeUid the new value for addEquipInforTypeUid
     */
    public void setAddEquipInforTypeUid(Integer aAddEquipInforTypeUid) {
        addEquipInforTypeUid = aAddEquipInforTypeUid;
    }

    /**
     * Access method for adjustedPmFactor.
     *
     * @return the current value of adjustedPmFactor
     */
    public BigDecimal getAdjustedPmFactor() {
        return adjustedPmFactor;
    }

    /**
     * Setter method for adjustedPmFactor.
     *
     * @param aAdjustedPmFactor the new value for adjustedPmFactor
     */
    public void setAdjustedPmFactor(BigDecimal aAdjustedPmFactor) {
        adjustedPmFactor = aAdjustedPmFactor;
    }

    /**
     * Access method for apceExecOrderNo.
     *
     * @return the current value of apceExecOrderNo
     */
    public Character getApceExecOrderNo() {
        return apceExecOrderNo;
    }

    /**
     * Setter method for apceExecOrderNo.
     *
     * @param aApceExecOrderNo the new value for apceExecOrderNo
     */
    public void setApceExecOrderNo(Character aApceExecOrderNo) {
        apceExecOrderNo = aApceExecOrderNo;
    }

    /**
     * Access method for apceFilterTypeUid.
     *
     * @return the current value of apceFilterTypeUid
     */
    public Integer getApceFilterTypeUid() {
        return apceFilterTypeUid;
    }

    /**
     * Setter method for apceFilterTypeUid.
     *
     * @param aApceFilterTypeUid the new value for apceFilterTypeUid
     */
    public void setApceFilterTypeUid(Integer aApceFilterTypeUid) {
        apceFilterTypeUid = aApceFilterTypeUid;
    }

    /**
     * Access method for auxEngineFlag.
     *
     * @return the current value of auxEngineFlag
     */
    public Character getAuxEngineFlag() {
        return auxEngineFlag;
    }

    /**
     * Setter method for auxEngineFlag.
     *
     * @param aAuxEngineFlag the new value for auxEngineFlag
     */
    public void setAuxEngineFlag(Character aAuxEngineFlag) {
        auxEngineFlag = aAuxEngineFlag;
    }

    /**
     * Access method for brakeHpRangesUid.
     *
     * @return the current value of brakeHpRangesUid
     */
    public Integer getBrakeHpRangesUid() {
        return brakeHpRangesUid;
    }

    /**
     * Setter method for brakeHpRangesUid.
     *
     * @param aBrakeHpRangesUid the new value for brakeHpRangesUid
     */
    public void setBrakeHpRangesUid(Integer aBrakeHpRangesUid) {
        brakeHpRangesUid = aBrakeHpRangesUid;
    }

    /**
     * Access method for brakeHpRangesUnitsUid.
     *
     * @return the current value of brakeHpRangesUnitsUid
     */
    public Integer getBrakeHpRangesUnitsUid() {
        return brakeHpRangesUnitsUid;
    }

    /**
     * Setter method for brakeHpRangesUnitsUid.
     *
     * @param aBrakeHpRangesUnitsUid the new value for brakeHpRangesUnitsUid
     */
    public void setBrakeHpRangesUnitsUid(Integer aBrakeHpRangesUnitsUid) {
        brakeHpRangesUnitsUid = aBrakeHpRangesUnitsUid;
    }

    /**
     * Access method for brakeHpValue.
     *
     * @return the current value of brakeHpValue
     */
    public Integer getBrakeHpValue() {
        return brakeHpValue;
    }

    /**
     * Setter method for brakeHpValue.
     *
     * @param aBrakeHpValue the new value for brakeHpValue
     */
    public void setBrakeHpValue(Integer aBrakeHpValue) {
        brakeHpValue = aBrakeHpValue;
    }

    /**
     * Access method for carbCertPmFactorOverride.
     *
     * @return the current value of carbCertPmFactorOverride
     */
    public BigDecimal getCarbCertPmFactorOverride() {
        return carbCertPmFactorOverride;
    }

    /**
     * Setter method for carbCertPmFactorOverride.
     *
     * @param aCarbCertPmFactorOverride the new value for carbCertPmFactorOverride
     */
    public void setCarbCertPmFactorOverride(BigDecimal aCarbCertPmFactorOverride) {
        carbCertPmFactorOverride = aCarbCertPmFactorOverride;
    }

    /**
     * Access method for cctsOnHighway.
     *
     * @return the current value of cctsOnHighway
     */
    public Short getCctsOnHighway() {
        return cctsOnHighway;
    }

    /**
     * Setter method for cctsOnHighway.
     *
     * @param aCctsOnHighway the new value for cctsOnHighway
     */
    public void setCctsOnHighway(Short aCctsOnHighway) {
        cctsOnHighway = aCctsOnHighway;
    }

    /**
     * Access method for co.
     *
     * @return the current value of co
     */
    public Integer getCo() {
        return co;
    }

    /**
     * Setter method for co.
     *
     * @param aCo the new value for co
     */
    public void setCo(Integer aCo) {
        co = aCo;
    }

    /**
     * Access method for coOtherUnits.
     *
     * @return the current value of coOtherUnits
     */
    public String getCoOtherUnits() {
        return coOtherUnits;
    }

    /**
     * Setter method for coOtherUnits.
     *
     * @param aCoOtherUnits the new value for coOtherUnits
     */
    public void setCoOtherUnits(String aCoOtherUnits) {
        coOtherUnits = aCoOtherUnits;
    }

    /**
     * Access method for coUnitsUid.
     *
     * @return the current value of coUnitsUid
     */
    public Integer getCoUnitsUid() {
        return coUnitsUid;
    }

    /**
     * Setter method for coUnitsUid.
     *
     * @param aCoUnitsUid the new value for coUnitsUid
     */
    public void setCoUnitsUid(Integer aCoUnitsUid) {
        coUnitsUid = aCoUnitsUid;
    }

    /**
     * Access method for companyUnitId.
     *
     * @return the current value of companyUnitId
     */
    public String getCompanyUnitId() {
        return companyUnitId;
    }

    /**
     * Setter method for companyUnitId.
     *
     * @param aCompanyUnitId the new value for companyUnitId
     */
    public void setCompanyUnitId(String aCompanyUnitId) {
        companyUnitId = aCompanyUnitId;
    }

    /**
     * Access method for crusherEquipedFlag.
     *
     * @return the current value of crusherEquipedFlag
     */
    public Character getCrusherEquipedFlag() {
        return crusherEquipedFlag;
    }

    /**
     * Setter method for crusherEquipedFlag.
     *
     * @param aCrusherEquipedFlag the new value for crusherEquipedFlag
     */
    public void setCrusherEquipedFlag(Character aCrusherEquipedFlag) {
        crusherEquipedFlag = aCrusherEquipedFlag;
    }

    /**
     * Access method for currentTierUid.
     *
     * @return the current value of currentTierUid
     */
    public Integer getCurrentTierUid() {
        return currentTierUid;
    }

    /**
     * Setter method for currentTierUid.
     *
     * @param aCurrentTierUid the new value for currentTierUid
     */
    public void setCurrentTierUid(Integer aCurrentTierUid) {
        currentTierUid = aCurrentTierUid;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for electrificationPercent.
     *
     * @return the current value of electrificationPercent
     */
    public Integer getElectrificationPercent() {
        return electrificationPercent;
    }

    /**
     * Setter method for electrificationPercent.
     *
     * @param aElectrificationPercent the new value for electrificationPercent
     */
    public void setElectrificationPercent(Integer aElectrificationPercent) {
        electrificationPercent = aElectrificationPercent;
    }

    /**
     * Access method for emissionPoints.
     *
     * @return the current value of emissionPoints
     */
    public String getEmissionPoints() {
        return emissionPoints;
    }

    /**
     * Setter method for emissionPoints.
     *
     * @param aEmissionPoints the new value for emissionPoints
     */
    public void setEmissionPoints(String aEmissionPoints) {
        emissionPoints = aEmissionPoints;
    }

    /**
     * Access method for engineFamily.
     *
     * @return the current value of engineFamily
     */
    public String getEngineFamily() {
        return engineFamily;
    }

    /**
     * Setter method for engineFamily.
     *
     * @param aEngineFamily the new value for engineFamily
     */
    public void setEngineFamily(String aEngineFamily) {
        engineFamily = aEngineFamily;
    }

    /**
     * Access method for enginePowersOther.
     *
     * @return the current value of enginePowersOther
     */
    public String getEnginePowersOther() {
        return enginePowersOther;
    }

    /**
     * Setter method for enginePowersOther.
     *
     * @param aEnginePowersOther the new value for enginePowersOther
     */
    public void setEnginePowersOther(String aEnginePowersOther) {
        enginePowersOther = aEnginePowersOther;
    }

    /**
     * Access method for enginePowersTypeUid.
     *
     * @return the current value of enginePowersTypeUid
     */
    public Integer getEnginePowersTypeUid() {
        return enginePowersTypeUid;
    }

    /**
     * Setter method for enginePowersTypeUid.
     *
     * @param aEnginePowersTypeUid the new value for enginePowersTypeUid
     */
    public void setEnginePowersTypeUid(Integer aEnginePowersTypeUid) {
        enginePowersTypeUid = aEnginePowersTypeUid;
    }

    /**
     * Access method for engineTypeLookupUid.
     *
     * @return the current value of engineTypeLookupUid
     */
    public Integer getEngineTypeLookupUid() {
        return engineTypeLookupUid;
    }

    /**
     * Setter method for engineTypeLookupUid.
     *
     * @param aEngineTypeLookupUid the new value for engineTypeLookupUid
     */
    public void setEngineTypeLookupUid(Integer aEngineTypeLookupUid) {
        engineTypeLookupUid = aEngineTypeLookupUid;
    }

    /**
     * Access method for engineUseTypeUid.
     *
     * @return the current value of engineUseTypeUid
     */
    public Integer getEngineUseTypeUid() {
        return engineUseTypeUid;
    }

    /**
     * Setter method for engineUseTypeUid.
     *
     * @param aEngineUseTypeUid the new value for engineUseTypeUid
     */
    public void setEngineUseTypeUid(Integer aEngineUseTypeUid) {
        engineUseTypeUid = aEngineUseTypeUid;
    }

    /**
     * Access method for equipmentId.
     *
     * @return the current value of equipmentId
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * Setter method for equipmentId.
     *
     * @param aEquipmentId the new value for equipmentId
     */
    public void setEquipmentId(String aEquipmentId) {
        equipmentId = aEquipmentId;
    }

    /**
     * Access method for flowrate.
     *
     * @return the current value of flowrate
     */
    public String getFlowrate() {
        return flowrate;
    }

    /**
     * Setter method for flowrate.
     *
     * @param aFlowrate the new value for flowrate
     */
    public void setFlowrate(String aFlowrate) {
        flowrate = aFlowrate;
    }

    /**
     * Access method for flowRateUnitsUid.
     *
     * @return the current value of flowRateUnitsUid
     */
    public Integer getFlowRateUnitsUid() {
        return flowRateUnitsUid;
    }

    /**
     * Setter method for flowRateUnitsUid.
     *
     * @param aFlowRateUnitsUid the new value for flowRateUnitsUid
     */
    public void setFlowRateUnitsUid(Integer aFlowRateUnitsUid) {
        flowRateUnitsUid = aFlowRateUnitsUid;
    }

    /**
     * Access method for fuelAddExecOrderNo.
     *
     * @return the current value of fuelAddExecOrderNo
     */
    public Character getFuelAddExecOrderNo() {
        return fuelAddExecOrderNo;
    }

    /**
     * Setter method for fuelAddExecOrderNo.
     *
     * @param aFuelAddExecOrderNo the new value for fuelAddExecOrderNo
     */
    public void setFuelAddExecOrderNo(Character aFuelAddExecOrderNo) {
        fuelAddExecOrderNo = aFuelAddExecOrderNo;
    }

    /**
     * Access method for fuelAdditiveUid.
     *
     * @return the current value of fuelAdditiveUid
     */
    public Integer getFuelAdditiveUid() {
        return fuelAdditiveUid;
    }

    /**
     * Setter method for fuelAdditiveUid.
     *
     * @param aFuelAdditiveUid the new value for fuelAdditiveUid
     */
    public void setFuelAdditiveUid(Integer aFuelAdditiveUid) {
        fuelAdditiveUid = aFuelAdditiveUid;
    }

    /**
     * Access method for fuelConsumptionRate.
     *
     * @return the current value of fuelConsumptionRate
     */
    public BigDecimal getFuelConsumptionRate() {
        return fuelConsumptionRate;
    }

    /**
     * Setter method for fuelConsumptionRate.
     *
     * @param aFuelConsumptionRate the new value for fuelConsumptionRate
     */
    public void setFuelConsumptionRate(BigDecimal aFuelConsumptionRate) {
        fuelConsumptionRate = aFuelConsumptionRate;
    }

    /**
     * Access method for fuelConsumptionUnitsUid.
     *
     * @return the current value of fuelConsumptionUnitsUid
     */
    public Integer getFuelConsumptionUnitsUid() {
        return fuelConsumptionUnitsUid;
    }

    /**
     * Setter method for fuelConsumptionUnitsUid.
     *
     * @param aFuelConsumptionUnitsUid the new value for fuelConsumptionUnitsUid
     */
    public void setFuelConsumptionUnitsUid(Integer aFuelConsumptionUnitsUid) {
        fuelConsumptionUnitsUid = aFuelConsumptionUnitsUid;
    }

    /**
     * Access method for fuelTypeUsedUid.
     *
     * @return the current value of fuelTypeUsedUid
     */
    public Integer getFuelTypeUsedUid() {
        return fuelTypeUsedUid;
    }

    /**
     * Setter method for fuelTypeUsedUid.
     *
     * @param aFuelTypeUsedUid the new value for fuelTypeUsedUid
     */
    public void setFuelTypeUsedUid(Integer aFuelTypeUsedUid) {
        fuelTypeUsedUid = aFuelTypeUsedUid;
    }

    /**
     * Access method for listDescription.
     *
     * @return the current value of listDescription
     */
    public String getListDescription() {
        return listDescription;
    }

    /**
     * Setter method for listDescription.
     *
     * @param aListDescription the new value for listDescription
     */
    public void setListDescription(String aListDescription) {
        listDescription = aListDescription;
    }

    /**
     * Access method for manufacturerUid.
     *
     * @return the current value of manufacturerUid
     */
    public Integer getManufacturerUid() {
        return manufacturerUid;
    }

    /**
     * Setter method for manufacturerUid.
     *
     * @param aManufacturerUid the new value for manufacturerUid
     */
    public void setManufacturerUid(Integer aManufacturerUid) {
        manufacturerUid = aManufacturerUid;
    }

    /**
     * Access method for manufacturerOther.
     *
     * @return the current value of manufacturerOther
     */
    public String getManufacturerOther() {
        return manufacturerOther;
    }

    /**
     * Setter method for manufacturerOther.
     *
     * @param aManufacturerOther the new value for manufacturerOther
     */
    public void setManufacturerOther(String aManufacturerOther) {
        manufacturerOther = aManufacturerOther;
    }

    /**
     * Access method for model.
     *
     * @return the current value of model
     */
    public String getModel() {
        return model;
    }

    /**
     * Setter method for model.
     *
     * @param aModel the new value for model
     */
    public void setModel(String aModel) {
        model = aModel;
    }

    /**
     * Access method for modelYearsUid.
     *
     * @return the current value of modelYearsUid
     */
    public Integer getModelYearsUid() {
        return modelYearsUid;
    }

    /**
     * Setter method for modelYearsUid.
     *
     * @param aModelYearsUid the new value for modelYearsUid
     */
    public void setModelYearsUid(Integer aModelYearsUid) {
        modelYearsUid = aModelYearsUid;
    }

    /**
     * Access method for monitoringOther.
     *
     * @return the current value of monitoringOther
     */
    public String getMonitoringOther() {
        return monitoringOther;
    }

    /**
     * Setter method for monitoringOther.
     *
     * @param aMonitoringOther the new value for monitoringOther
     */
    public void setMonitoringOther(String aMonitoringOther) {
        monitoringOther = aMonitoringOther;
    }

    /**
     * Access method for monitoringMethodsUid.
     *
     * @return the current value of monitoringMethodsUid
     */
    public Integer getMonitoringMethodsUid() {
        return monitoringMethodsUid;
    }

    /**
     * Setter method for monitoringMethodsUid.
     *
     * @param aMonitoringMethodsUid the new value for monitoringMethodsUid
     */
    public void setMonitoringMethodsUid(Integer aMonitoringMethodsUid) {
        monitoringMethodsUid = aMonitoringMethodsUid;
    }

    /**
     * Access method for nameOtherEmisData.
     *
     * @return the current value of nameOtherEmisData
     */
    public String getNameOtherEmisData() {
        return nameOtherEmisData;
    }

    /**
     * Setter method for nameOtherEmisData.
     *
     * @param aNameOtherEmisData the new value for nameOtherEmisData
     */
    public void setNameOtherEmisData(String aNameOtherEmisData) {
        nameOtherEmisData = aNameOtherEmisData;
    }

    /**
     * Access method for nameSrcTestEmisData.
     *
     * @return the current value of nameSrcTestEmisData
     */
    public String getNameSrcTestEmisData() {
        return nameSrcTestEmisData;
    }

    /**
     * Setter method for nameSrcTestEmisData.
     *
     * @param aNameSrcTestEmisData the new value for nameSrcTestEmisData
     */
    public void setNameSrcTestEmisData(String aNameSrcTestEmisData) {
        nameSrcTestEmisData = aNameSrcTestEmisData;
    }

    /**
     * Access method for nOx.
     *
     * @return the current value of nOx
     */
    public Integer getNOx() {
        return nOx;
    }

    /**
     * Setter method for nOx.
     *
     * @param aNOx the new value for nOx
     */
    public void setNOx(Integer aNOx) {
        nOx = aNOx;
    }

    /**
     * Access method for nOxOtherUnits.
     *
     * @return the current value of nOxOtherUnits
     */
    public String getNOxOtherUnits() {
        return nOxOtherUnits;
    }

    /**
     * Setter method for nOxOtherUnits.
     *
     * @param aNOxOtherUnits the new value for nOxOtherUnits
     */
    public void setNOxOtherUnits(String aNOxOtherUnits) {
        nOxOtherUnits = aNOxOtherUnits;
    }

    /**
     * Access method for nOxUnitsUid.
     *
     * @return the current value of nOxUnitsUid
     */
    public Integer getNOxUnitsUid() {
        return nOxUnitsUid;
    }

    /**
     * Setter method for nOxUnitsUid.
     *
     * @param aNOxUnitsUid the new value for nOxUnitsUid
     */
    public void setNOxUnitsUid(Integer aNOxUnitsUid) {
        nOxUnitsUid = aNOxUnitsUid;
    }

    /**
     * Access method for nozzleDiameter.
     *
     * @return the current value of nozzleDiameter
     */
    public String getNozzleDiameter() {
        return nozzleDiameter;
    }

    /**
     * Setter method for nozzleDiameter.
     *
     * @param aNozzleDiameter the new value for nozzleDiameter
     */
    public void setNozzleDiameter(String aNozzleDiameter) {
        nozzleDiameter = aNozzleDiameter;
    }

    /**
     * Access method for nozzleDiameterUnitsUid.
     *
     * @return the current value of nozzleDiameterUnitsUid
     */
    public Integer getNozzleDiameterUnitsUid() {
        return nozzleDiameterUnitsUid;
    }

    /**
     * Setter method for nozzleDiameterUnitsUid.
     *
     * @param aNozzleDiameterUnitsUid the new value for nozzleDiameterUnitsUid
     */
    public void setNozzleDiameterUnitsUid(Integer aNozzleDiameterUnitsUid) {
        nozzleDiameterUnitsUid = aNozzleDiameterUnitsUid;
    }

    /**
     * Access method for nozzlePressure.
     *
     * @return the current value of nozzlePressure
     */
    public String getNozzlePressure() {
        return nozzlePressure;
    }

    /**
     * Setter method for nozzlePressure.
     *
     * @param aNozzlePressure the new value for nozzlePressure
     */
    public void setNozzlePressure(String aNozzlePressure) {
        nozzlePressure = aNozzlePressure;
    }

    /**
     * Access method for nosslePressureUnitsUid.
     *
     * @return the current value of nosslePressureUnitsUid
     */
    public Integer getNosslePressureUnitsUid() {
        return nosslePressureUnitsUid;
    }

    /**
     * Setter method for nosslePressureUnitsUid.
     *
     * @param aNosslePressureUnitsUid the new value for nosslePressureUnitsUid
     */
    public void setNosslePressureUnitsUid(Integer aNosslePressureUnitsUid) {
        nosslePressureUnitsUid = aNosslePressureUnitsUid;
    }

    /**
     * Access method for numberOfUnits.
     *
     * @return the current value of numberOfUnits
     */
    public Short getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Setter method for numberOfUnits.
     *
     * @param aNumberOfUnits the new value for numberOfUnits
     */
    public void setNumberOfUnits(Short aNumberOfUnits) {
        numberOfUnits = aNumberOfUnits;
    }

    /**
     * Access method for pmControlEfficiency.
     *
     * @return the current value of pmControlEfficiency
     */
    public Integer getPmControlEfficiency() {
        return pmControlEfficiency;
    }

    /**
     * Setter method for pmControlEfficiency.
     *
     * @param aPmControlEfficiency the new value for pmControlEfficiency
     */
    public void setPmControlEfficiency(Integer aPmControlEfficiency) {
        pmControlEfficiency = aPmControlEfficiency;
    }

    /**
     * Access method for pm10.
     *
     * @return the current value of pm10
     */
    public Integer getPm10() {
        return pm10;
    }

    /**
     * Setter method for pm10.
     *
     * @param aPm10 the new value for pm10
     */
    public void setPm10(Integer aPm10) {
        pm10 = aPm10;
    }

    /**
     * Access method for pm10OtherUnits.
     *
     * @return the current value of pm10OtherUnits
     */
    public String getPm10OtherUnits() {
        return pm10OtherUnits;
    }

    /**
     * Setter method for pm10OtherUnits.
     *
     * @param aPm10OtherUnits the new value for pm10OtherUnits
     */
    public void setPm10OtherUnits(String aPm10OtherUnits) {
        pm10OtherUnits = aPm10OtherUnits;
    }

    /**
     * Access method for pm10UnitsUid.
     *
     * @return the current value of pm10UnitsUid
     */
    public Integer getPm10UnitsUid() {
        return pm10UnitsUid;
    }

    /**
     * Setter method for pm10UnitsUid.
     *
     * @param aPm10UnitsUid the new value for pm10UnitsUid
     */
    public void setPm10UnitsUid(Integer aPm10UnitsUid) {
        pm10UnitsUid = aPm10UnitsUid;
    }

    /**
     * Access method for powerUoMUid.
     *
     * @return the current value of powerUoMUid
     */
    public Integer getPowerUoMUid() {
        return powerUoMUid;
    }

    /**
     * Setter method for powerUoMUid.
     *
     * @param aPowerUoMUid the new value for powerUoMUid
     */
    public void setPowerUoMUid(Integer aPowerUoMUid) {
        powerUoMUid = aPowerUoMUid;
    }

    /**
     * Access method for powerRating.
     *
     * @return the current value of powerRating
     */
    public BigDecimal getPowerRating() {
        return powerRating;
    }

    /**
     * Setter method for powerRating.
     *
     * @param aPowerRating the new value for powerRating
     */
    public void setPowerRating(BigDecimal aPowerRating) {
        powerRating = aPowerRating;
    }

    /**
     * Access method for pressureGaugeFlag.
     *
     * @return the current value of pressureGaugeFlag
     */
    public Character getPressureGaugeFlag() {
        return pressureGaugeFlag;
    }

    /**
     * Setter method for pressureGaugeFlag.
     *
     * @param aPressureGaugeFlag the new value for pressureGaugeFlag
     */
    public void setPressureGaugeFlag(Character aPressureGaugeFlag) {
        pressureGaugeFlag = aPressureGaugeFlag;
    }

    /**
     * Access method for primaryComponentIndicator.
     *
     * @return the current value of primaryComponentIndicator
     */
    public String getPrimaryComponentIndicator() {
        return primaryComponentIndicator;
    }

    /**
     * Setter method for primaryComponentIndicator.
     *
     * @param aPrimaryComponentIndicator the new value for primaryComponentIndicator
     */
    public void setPrimaryComponentIndicator(String aPrimaryComponentIndicator) {
        primaryComponentIndicator = aPrimaryComponentIndicator;
    }

    /**
     * Access method for regItemCompTypeUid.
     *
     * @return the current value of regItemCompTypeUid
     */
    public Integer getRegItemCompTypeUid() {
        return regItemCompTypeUid;
    }

    /**
     * Setter method for regItemCompTypeUid.
     *
     * @param aRegItemCompTypeUid the new value for regItemCompTypeUid
     */
    public void setRegItemCompTypeUid(Integer aRegItemCompTypeUid) {
        regItemCompTypeUid = aRegItemCompTypeUid;
    }

    /**
     * Access method for resident.
     *
     * @return the current value of resident
     */
    public String getResident() {
        return resident;
    }

    /**
     * Setter method for resident.
     *
     * @param aResident the new value for resident
     */
    public void setResident(String aResident) {
        resident = aResident;
    }

    /**
     * Access method for resident1995.
     *
     * @return the current value of resident1995
     */
    public String getResident1995() {
        return resident1995;
    }

    /**
     * Setter method for resident1995.
     *
     * @param aResident1995 the new value for resident1995
     */
    public void setResident1995(String aResident1995) {
        resident1995 = aResident1995;
    }

    /**
     * Access method for selfPropelledFlag.
     *
     * @return the current value of selfPropelledFlag
     */
    public Character getSelfPropelledFlag() {
        return selfPropelledFlag;
    }

    /**
     * Setter method for selfPropelledFlag.
     *
     * @param aSelfPropelledFlag the new value for selfPropelledFlag
     */
    public void setSelfPropelledFlag(Character aSelfPropelledFlag) {
        selfPropelledFlag = aSelfPropelledFlag;
    }

    /**
     * Access method for serialNo.
     *
     * @return the current value of serialNo
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Setter method for serialNo.
     *
     * @param aSerialNo the new value for serialNo
     */
    public void setSerialNo(String aSerialNo) {
        serialNo = aSerialNo;
    }

    /**
     * Access method for series.
     *
     * @return the current value of series
     */
    public String getSeries() {
        return series;
    }

    /**
     * Setter method for series.
     *
     * @param aSeries the new value for series
     */
    public void setSeries(String aSeries) {
        series = aSeries;
    }

    /**
     * Access method for siloCrusherCount.
     *
     * @return the current value of siloCrusherCount
     */
    public Integer getSiloCrusherCount() {
        return siloCrusherCount;
    }

    /**
     * Setter method for siloCrusherCount.
     *
     * @param aSiloCrusherCount the new value for siloCrusherCount
     */
    public void setSiloCrusherCount(Integer aSiloCrusherCount) {
        siloCrusherCount = aSiloCrusherCount;
    }

    /**
     * Access method for siloCrushers.
     *
     * @return the current value of siloCrushers
     */
    public String getSiloCrushers() {
        return siloCrushers;
    }

    /**
     * Setter method for siloCrushers.
     *
     * @param aSiloCrushers the new value for siloCrushers
     */
    public void setSiloCrushers(String aSiloCrushers) {
        siloCrushers = aSiloCrushers;
    }

    /**
     * Access method for sourceEmissionsData.
     *
     * @return the current value of sourceEmissionsData
     */
    public String getSourceEmissionsData() {
        return sourceEmissionsData;
    }

    /**
     * Setter method for sourceEmissionsData.
     *
     * @param aSourceEmissionsData the new value for sourceEmissionsData
     */
    public void setSourceEmissionsData(String aSourceEmissionsData) {
        sourceEmissionsData = aSourceEmissionsData;
    }

    /**
     * Access method for sOx.
     *
     * @return the current value of sOx
     */
    public Integer getSOx() {
        return sOx;
    }

    /**
     * Setter method for sOx.
     *
     * @param aSOx the new value for sOx
     */
    public void setSOx(Integer aSOx) {
        sOx = aSOx;
    }

    /**
     * Access method for sOxOtherUnits.
     *
     * @return the current value of sOxOtherUnits
     */
    public String getSOxOtherUnits() {
        return sOxOtherUnits;
    }

    /**
     * Setter method for sOxOtherUnits.
     *
     * @param aSOxOtherUnits the new value for sOxOtherUnits
     */
    public void setSOxOtherUnits(String aSOxOtherUnits) {
        sOxOtherUnits = aSOxOtherUnits;
    }

    /**
     * Access method for sOxUnitsUid.
     *
     * @return the current value of sOxUnitsUid
     */
    public Integer getSOxUnitsUid() {
        return sOxUnitsUid;
    }

    /**
     * Setter method for sOxUnitsUid.
     *
     * @param aSOxUnitsUid the new value for sOxUnitsUid
     */
    public void setSOxUnitsUid(Integer aSOxUnitsUid) {
        sOxUnitsUid = aSOxUnitsUid;
    }

    /**
     * Access method for stwTypesUid.
     *
     * @return the current value of stwTypesUid
     */
    public Integer getStwTypesUid() {
        return stwTypesUid;
    }

    /**
     * Setter method for stwTypesUid.
     *
     * @param aStwTypesUid the new value for stwTypesUid
     */
    public void setStwTypesUid(Integer aStwTypesUid) {
        stwTypesUid = aStwTypesUid;
    }

    /**
     * Access method for throughputRating.
     *
     * @return the current value of throughputRating
     */
    public String getThroughputRating() {
        return throughputRating;
    }

    /**
     * Setter method for throughputRating.
     *
     * @param aThroughputRating the new value for throughputRating
     */
    public void setThroughputRating(String aThroughputRating) {
        throughputRating = aThroughputRating;
    }

    /**
     * Access method for tierUid.
     *
     * @return the current value of tierUid
     */
    public Integer getTierUid() {
        return tierUid;
    }

    /**
     * Setter method for tierUid.
     *
     * @param aTierUid the new value for tierUid
     */
    public void setTierUid(Integer aTierUid) {
        tierUid = aTierUid;
    }

    /**
     * Access method for transferPoints.
     *
     * @return the current value of transferPoints
     */
    public String getTransferPoints() {
        return transferPoints;
    }

    /**
     * Setter method for transferPoints.
     *
     * @param aTransferPoints the new value for transferPoints
     */
    public void setTransferPoints(String aTransferPoints) {
        transferPoints = aTransferPoints;
    }

    /**
     * Access method for throughputRatingUnitsUid.
     *
     * @return the current value of throughputRatingUnitsUid
     */
    public Integer getThroughputRatingUnitsUid() {
        return throughputRatingUnitsUid;
    }

    /**
     * Setter method for throughputRatingUnitsUid.
     *
     * @param aThroughputRatingUnitsUid the new value for throughputRatingUnitsUid
     */
    public void setThroughputRatingUnitsUid(Integer aThroughputRatingUnitsUid) {
        throughputRatingUnitsUid = aThroughputRatingUnitsUid;
    }

    /**
     * Access method for truckCentralMixFlag.
     *
     * @return the current value of truckCentralMixFlag
     */
    public Character getTruckCentralMixFlag() {
        return truckCentralMixFlag;
    }

    /**
     * Setter method for truckCentralMixFlag.
     *
     * @param aTruckCentralMixFlag the new value for truckCentralMixFlag
     */
    public void setTruckCentralMixFlag(Character aTruckCentralMixFlag) {
        truckCentralMixFlag = aTruckCentralMixFlag;
    }

    /**
     * Access method for voc.
     *
     * @return the current value of voc
     */
    public Integer getVoc() {
        return voc;
    }

    /**
     * Setter method for voc.
     *
     * @param aVoc the new value for voc
     */
    public void setVoc(Integer aVoc) {
        voc = aVoc;
    }

    /**
     * Access method for vocOtherUnits.
     *
     * @return the current value of vocOtherUnits
     */
    public String getVocOtherUnits() {
        return vocOtherUnits;
    }

    /**
     * Setter method for vocOtherUnits.
     *
     * @param aVocOtherUnits the new value for vocOtherUnits
     */
    public void setVocOtherUnits(String aVocOtherUnits) {
        vocOtherUnits = aVocOtherUnits;
    }

    /**
     * Access method for vocUnitsUid.
     *
     * @return the current value of vocUnitsUid
     */
    public Integer getVocUnitsUid() {
        return vocUnitsUid;
    }

    /**
     * Setter method for vocUnitsUid.
     *
     * @param aVocUnitsUid the new value for vocUnitsUid
     */
    public void setVocUnitsUid(Integer aVocUnitsUid) {
        vocUnitsUid = aVocUnitsUid;
    }

    /**
     * Access method for wetBlastingPercentage.
     *
     * @return the current value of wetBlastingPercentage
     */
    public Integer getWetBlastingPercentage() {
        return wetBlastingPercentage;
    }

    /**
     * Setter method for wetBlastingPercentage.
     *
     * @param aWetBlastingPercentage the new value for wetBlastingPercentage
     */
    public void setWetBlastingPercentage(Integer aWetBlastingPercentage) {
        wetBlastingPercentage = aWetBlastingPercentage;
    }

    /**
     * Access method for woodProcAckDate.
     *
     * @return the current value of woodProcAckDate
     */
    public Date getWoodProcAckDate() {
        return woodProcAckDate;
    }

    /**
     * Setter method for woodProcAckDate.
     *
     * @param aWoodProcAckDate the new value for woodProcAckDate
     */
    public void setWoodProcAckDate(Date aWoodProcAckDate) {
        woodProcAckDate = aWoodProcAckDate;
    }

    /**
     * Access method for woodProcAckFlag.
     *
     * @return the current value of woodProcAckFlag
     */
    public Character getWoodProcAckFlag() {
        return woodProcAckFlag;
    }

    /**
     * Setter method for woodProcAckFlag.
     *
     * @param aWoodProcAckFlag the new value for woodProcAckFlag
     */
    public void setWoodProcAckFlag(Character aWoodProcAckFlag) {
        woodProcAckFlag = aWoodProcAckFlag;
    }

    /**
     * Access method for woodProcAckUser.
     *
     * @return the current value of woodProcAckUser
     */
    public String getWoodProcAckUser() {
        return woodProcAckUser;
    }

    /**
     * Setter method for woodProcAckUser.
     *
     * @param aWoodProcAckUser the new value for woodProcAckUser
     */
    public void setWoodProcAckUser(String aWoodProcAckUser) {
        woodProcAckUser = aWoodProcAckUser;
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
     * Access method for origCreateModifiedBy.
     *
     * @return the current value of origCreateModifiedBy
     */
    public String getOrigCreateModifiedBy() {
        return origCreateModifiedBy;
    }

    /**
     * Setter method for origCreateModifiedBy.
     *
     * @param aOrigCreateModifiedBy the new value for origCreateModifiedBy
     */
    public void setOrigCreateModifiedBy(String aOrigCreateModifiedBy) {
        origCreateModifiedBy = aOrigCreateModifiedBy;
    }

    /**
     * Access method for origCreateModifiedDate.
     *
     * @return the current value of origCreateModifiedDate
     */
    public Timestamp getOrigCreateModifiedDate() {
        return origCreateModifiedDate;
    }

    /**
     * Setter method for origCreateModifiedDate.
     *
     * @param aOrigCreateModifiedDate the new value for origCreateModifiedDate
     */
    public void setOrigCreateModifiedDate(Timestamp aOrigCreateModifiedDate) {
        origCreateModifiedDate = aOrigCreateModifiedDate;
    }

    /**
     * Access method for appTransRegRelUid.
     *
     * @return the current value of appTransRegRelUid
     */
    public Integer getAppTransRegRelUid() {
        return appTransRegRelUid;
    }

    /**
     * Setter method for appTransRegRelUid.
     *
     * @param aAppTransRegRelUid the new value for appTransRegRelUid
     */
    public void setAppTransRegRelUid(Integer aAppTransRegRelUid) {
        appTransRegRelUid = aAppTransRegRelUid;
    }

    /**
     * Access method for tseaidYear.
     *
     * @return the current value of tseaidYear
     */
    public Date getTseaidYear() {
        return tseaidYear;
    }

    /**
     * Setter method for tseaidYear.
     *
     * @param aTseaidYear the new value for tseaidYear
     */
    public void setTseaidYear(Date aTseaidYear) {
        tseaidYear = aTseaidYear;
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
     * Compares the key for this instance with another TseAnnualInvDetails.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TseAnnualInvDetails and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TseAnnualInvDetails)) {
            return false;
        }
        TseAnnualInvDetails that = (TseAnnualInvDetails) other;
        Object myTseaidUid = this.getTseaidUid();
        Object yourTseaidUid = that.getTseaidUid();
        if (myTseaidUid==null ? yourTseaidUid!=null : !myTseaidUid.equals(yourTseaidUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TseAnnualInvDetails.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TseAnnualInvDetails)) return false;
        return this.equalKeys(other) && ((TseAnnualInvDetails)other).equalKeys(this);
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
        if (getTseaidUid() == null) {
            i = 0;
        } else {
            i = getTseaidUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[TseAnnualInvDetails |");
        sb.append(" tseaidUid=").append(getTseaidUid());
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
        ret.put("tseaidUid", getTseaidUid());
        return ret;
    }

}
