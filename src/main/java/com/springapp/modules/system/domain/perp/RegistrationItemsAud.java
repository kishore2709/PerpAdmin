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

@Entity(name="registration_items_aud")
public class RegistrationItemsAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "riAudUid";

    @Id
    @Column(name="RIAud_UID", unique=true, nullable=false, precision=10)
    private Integer riAudUid;
    @Column(name="RegItem_UID", nullable=false, precision=10)
    private Integer regItemUid;
    @Column(name="RegItemType_UID", nullable=false, precision=10)
    private Integer regItemTypeUid;
    @Column(name="Additional_Info")
    private String additionalInfo;
    @Column(name="Application_UID", precision=10)
    private Integer applicationUid;
    @Column(name="Cert_Description")
    private String certDescription;
    @Column(name="Certificate_No", precision=10)
    private Integer certificateNo;
    @Column(name="Certified_Flag", length=1)
    private Character certifiedFlag;
    @Column(name="Company_UID", precision=10)
    private Integer companyUid;
    @Column(name="Created_Date")
    private Timestamp createdDate;
    @Column(name="Current_Flag", nullable=false, length=1)
    private Character currentFlag;
    @Column(name="Discount_Type_UID", precision=10)
    private Integer discountTypeUid;
    @Column(name="District_UID", precision=10)
    private Integer districtUid;
    @Column(name="DistAppProof_Flag", length=1)
    private Character distAppProofFlag;
    @Column(name="DistPermitProof_Flag", length=1)
    private Character distPermitProofFlag;
    @Column(name="District_Permit_Flag", length=1)
    private Character districtPermitFlag;
    @Column(name="EPA_Cert_No", length=50)
    private String epaCertNo;
    @Column(name="Est_Days_Per_Week", precision=5)
    private Short estDaysPerWeek;
    @Column(name="Est_Hours_Per_Day", precision=5)
    private Short estHoursPerDay;
    @Column(name="Est_Weeks_Per_Year", precision=5)
    private Short estWeeksPerYear;
    @Column(name="Estimated_Fees", precision=10, scale=2)
    private BigDecimal estimatedFees;
    @Column(name="Expiration_Date")
    private Timestamp expirationDate;
    @Column(name="Flex_Eng_Proof_Flag", length=1)
    private Character flexEngProofFlag;
    @Column(name="Flex_Eng_Request_Flag", length=1)
    private Character flexEngRequestFlag;
    @Column(name="Fuel_Proof_Flag", length=1)
    private Character fuelProofFlag;
    @Column(name="Fuel_Request_Flag", length=1)
    private Character fuelRequestFlag;
    @Column(name="Initial_Eval", length=1)
    private Character initialEval;
    @Column(name="Initial_Issuance_Date")
    private Timestamp initialIssuanceDate;
    @Column(name="Not_Going_To_Renew_Flag", length=1)
    private Character notGoingToRenewFlag;
    @Column(name="Operational_Flag", length=1)
    private Character operationalFlag;
    @Column(name="Operational_Indicator", length=1)
    private Character operationalIndicator;
    @Column(name="Parent_UID", precision=10)
    private Integer parentUid;
    @Column(name="PTO_App_Comp_Date")
    private Timestamp ptoAppCompDate;
    @Column(name="PTO_App_Date")
    private Timestamp ptoAppDate;
    @Column(name="PTO_App_DistID", precision=10)
    private Integer ptoAppDistId;
    @Column(name="PTO_Date")
    private Timestamp ptoDate;
    @Column(name="PTO_District_ID", precision=10)
    private Integer ptoDistrictId;
    @Column(name="PTO_No", length=20)
    private String ptoNo;
    @Column(name="Purchase_Date")
    private Timestamp purchaseDate;
    @Column(name="RegItemStatus_UID", precision=10)
    private Integer regItemStatusUid;
    @Column(name="RegItemSubType_UID", nullable=false, precision=10)
    private Integer regItemSubTypeUid;
    @Column(name="RegItemSubSubTypes_UID", precision=10)
    private Integer regItemSubSubTypesUid;
    @Column(name="Renewal_Open_Flag", length=1)
    private Character renewalOpenFlag;
    @Column(name="Rental_Flag", length=1)
    private Character rentalFlag;
    @Column(name="ReplacedBy_RegItem_UID", precision=10)
    private Integer replacedByRegItemUid;
    @Column(name="Residency_Proof_Flag", length=1)
    private Character residencyProofFlag;
    @Column(name="Residency_Request_Flag", length=1)
    private Character residencyRequestFlag;
    @Column(name="Stolen_Flag", nullable=false, length=1)
    private Character stolenFlag;
    @Column(name="Table1_STD_Proof_Flag", length=1)
    private Character table1StdProofFlag;
    @Column(name="Table1_STD_Request_Flag", length=1)
    private Character table1StdRequestFlag;
    @Column(name="Tracking_No", precision=10)
    private Integer trackingNo;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public RegistrationItemsAud() {
        super();
    }

    /**
     * Access method for riAudUid.
     *
     * @return the current value of riAudUid
     */
    public Integer getRiAudUid() {
        return riAudUid;
    }

    /**
     * Setter method for riAudUid.
     *
     * @param aRiAudUid the new value for riAudUid
     */
    public void setRiAudUid(Integer aRiAudUid) {
        riAudUid = aRiAudUid;
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
     * Access method for regItemTypeUid.
     *
     * @return the current value of regItemTypeUid
     */
    public Integer getRegItemTypeUid() {
        return regItemTypeUid;
    }

    /**
     * Setter method for regItemTypeUid.
     *
     * @param aRegItemTypeUid the new value for regItemTypeUid
     */
    public void setRegItemTypeUid(Integer aRegItemTypeUid) {
        regItemTypeUid = aRegItemTypeUid;
    }

    /**
     * Access method for additionalInfo.
     *
     * @return the current value of additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Setter method for additionalInfo.
     *
     * @param aAdditionalInfo the new value for additionalInfo
     */
    public void setAdditionalInfo(String aAdditionalInfo) {
        additionalInfo = aAdditionalInfo;
    }

    /**
     * Access method for applicationUid.
     *
     * @return the current value of applicationUid
     */
    public Integer getApplicationUid() {
        return applicationUid;
    }

    /**
     * Setter method for applicationUid.
     *
     * @param aApplicationUid the new value for applicationUid
     */
    public void setApplicationUid(Integer aApplicationUid) {
        applicationUid = aApplicationUid;
    }

    /**
     * Access method for certDescription.
     *
     * @return the current value of certDescription
     */
    public String getCertDescription() {
        return certDescription;
    }

    /**
     * Setter method for certDescription.
     *
     * @param aCertDescription the new value for certDescription
     */
    public void setCertDescription(String aCertDescription) {
        certDescription = aCertDescription;
    }

    /**
     * Access method for certificateNo.
     *
     * @return the current value of certificateNo
     */
    public Integer getCertificateNo() {
        return certificateNo;
    }

    /**
     * Setter method for certificateNo.
     *
     * @param aCertificateNo the new value for certificateNo
     */
    public void setCertificateNo(Integer aCertificateNo) {
        certificateNo = aCertificateNo;
    }

    /**
     * Access method for certifiedFlag.
     *
     * @return the current value of certifiedFlag
     */
    public Character getCertifiedFlag() {
        return certifiedFlag;
    }

    /**
     * Setter method for certifiedFlag.
     *
     * @param aCertifiedFlag the new value for certifiedFlag
     */
    public void setCertifiedFlag(Character aCertifiedFlag) {
        certifiedFlag = aCertifiedFlag;
    }

    /**
     * Access method for companyUid.
     *
     * @return the current value of companyUid
     */
    public Integer getCompanyUid() {
        return companyUid;
    }

    /**
     * Setter method for companyUid.
     *
     * @param aCompanyUid the new value for companyUid
     */
    public void setCompanyUid(Integer aCompanyUid) {
        companyUid = aCompanyUid;
    }

    /**
     * Access method for createdDate.
     *
     * @return the current value of createdDate
     */
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter method for createdDate.
     *
     * @param aCreatedDate the new value for createdDate
     */
    public void setCreatedDate(Timestamp aCreatedDate) {
        createdDate = aCreatedDate;
    }

    /**
     * Access method for currentFlag.
     *
     * @return the current value of currentFlag
     */
    public Character getCurrentFlag() {
        return currentFlag;
    }

    /**
     * Setter method for currentFlag.
     *
     * @param aCurrentFlag the new value for currentFlag
     */
    public void setCurrentFlag(Character aCurrentFlag) {
        currentFlag = aCurrentFlag;
    }

    /**
     * Access method for discountTypeUid.
     *
     * @return the current value of discountTypeUid
     */
    public Integer getDiscountTypeUid() {
        return discountTypeUid;
    }

    /**
     * Setter method for discountTypeUid.
     *
     * @param aDiscountTypeUid the new value for discountTypeUid
     */
    public void setDiscountTypeUid(Integer aDiscountTypeUid) {
        discountTypeUid = aDiscountTypeUid;
    }

    /**
     * Access method for districtUid.
     *
     * @return the current value of districtUid
     */
    public Integer getDistrictUid() {
        return districtUid;
    }

    /**
     * Setter method for districtUid.
     *
     * @param aDistrictUid the new value for districtUid
     */
    public void setDistrictUid(Integer aDistrictUid) {
        districtUid = aDistrictUid;
    }

    /**
     * Access method for distAppProofFlag.
     *
     * @return the current value of distAppProofFlag
     */
    public Character getDistAppProofFlag() {
        return distAppProofFlag;
    }

    /**
     * Setter method for distAppProofFlag.
     *
     * @param aDistAppProofFlag the new value for distAppProofFlag
     */
    public void setDistAppProofFlag(Character aDistAppProofFlag) {
        distAppProofFlag = aDistAppProofFlag;
    }

    /**
     * Access method for distPermitProofFlag.
     *
     * @return the current value of distPermitProofFlag
     */
    public Character getDistPermitProofFlag() {
        return distPermitProofFlag;
    }

    /**
     * Setter method for distPermitProofFlag.
     *
     * @param aDistPermitProofFlag the new value for distPermitProofFlag
     */
    public void setDistPermitProofFlag(Character aDistPermitProofFlag) {
        distPermitProofFlag = aDistPermitProofFlag;
    }

    /**
     * Access method for districtPermitFlag.
     *
     * @return the current value of districtPermitFlag
     */
    public Character getDistrictPermitFlag() {
        return districtPermitFlag;
    }

    /**
     * Setter method for districtPermitFlag.
     *
     * @param aDistrictPermitFlag the new value for districtPermitFlag
     */
    public void setDistrictPermitFlag(Character aDistrictPermitFlag) {
        districtPermitFlag = aDistrictPermitFlag;
    }

    /**
     * Access method for epaCertNo.
     *
     * @return the current value of epaCertNo
     */
    public String getEpaCertNo() {
        return epaCertNo;
    }

    /**
     * Setter method for epaCertNo.
     *
     * @param aEpaCertNo the new value for epaCertNo
     */
    public void setEpaCertNo(String aEpaCertNo) {
        epaCertNo = aEpaCertNo;
    }

    /**
     * Access method for estDaysPerWeek.
     *
     * @return the current value of estDaysPerWeek
     */
    public Short getEstDaysPerWeek() {
        return estDaysPerWeek;
    }

    /**
     * Setter method for estDaysPerWeek.
     *
     * @param aEstDaysPerWeek the new value for estDaysPerWeek
     */
    public void setEstDaysPerWeek(Short aEstDaysPerWeek) {
        estDaysPerWeek = aEstDaysPerWeek;
    }

    /**
     * Access method for estHoursPerDay.
     *
     * @return the current value of estHoursPerDay
     */
    public Short getEstHoursPerDay() {
        return estHoursPerDay;
    }

    /**
     * Setter method for estHoursPerDay.
     *
     * @param aEstHoursPerDay the new value for estHoursPerDay
     */
    public void setEstHoursPerDay(Short aEstHoursPerDay) {
        estHoursPerDay = aEstHoursPerDay;
    }

    /**
     * Access method for estWeeksPerYear.
     *
     * @return the current value of estWeeksPerYear
     */
    public Short getEstWeeksPerYear() {
        return estWeeksPerYear;
    }

    /**
     * Setter method for estWeeksPerYear.
     *
     * @param aEstWeeksPerYear the new value for estWeeksPerYear
     */
    public void setEstWeeksPerYear(Short aEstWeeksPerYear) {
        estWeeksPerYear = aEstWeeksPerYear;
    }

    /**
     * Access method for estimatedFees.
     *
     * @return the current value of estimatedFees
     */
    public BigDecimal getEstimatedFees() {
        return estimatedFees;
    }

    /**
     * Setter method for estimatedFees.
     *
     * @param aEstimatedFees the new value for estimatedFees
     */
    public void setEstimatedFees(BigDecimal aEstimatedFees) {
        estimatedFees = aEstimatedFees;
    }

    /**
     * Access method for expirationDate.
     *
     * @return the current value of expirationDate
     */
    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    /**
     * Setter method for expirationDate.
     *
     * @param aExpirationDate the new value for expirationDate
     */
    public void setExpirationDate(Timestamp aExpirationDate) {
        expirationDate = aExpirationDate;
    }

    /**
     * Access method for flexEngProofFlag.
     *
     * @return the current value of flexEngProofFlag
     */
    public Character getFlexEngProofFlag() {
        return flexEngProofFlag;
    }

    /**
     * Setter method for flexEngProofFlag.
     *
     * @param aFlexEngProofFlag the new value for flexEngProofFlag
     */
    public void setFlexEngProofFlag(Character aFlexEngProofFlag) {
        flexEngProofFlag = aFlexEngProofFlag;
    }

    /**
     * Access method for flexEngRequestFlag.
     *
     * @return the current value of flexEngRequestFlag
     */
    public Character getFlexEngRequestFlag() {
        return flexEngRequestFlag;
    }

    /**
     * Setter method for flexEngRequestFlag.
     *
     * @param aFlexEngRequestFlag the new value for flexEngRequestFlag
     */
    public void setFlexEngRequestFlag(Character aFlexEngRequestFlag) {
        flexEngRequestFlag = aFlexEngRequestFlag;
    }

    /**
     * Access method for fuelProofFlag.
     *
     * @return the current value of fuelProofFlag
     */
    public Character getFuelProofFlag() {
        return fuelProofFlag;
    }

    /**
     * Setter method for fuelProofFlag.
     *
     * @param aFuelProofFlag the new value for fuelProofFlag
     */
    public void setFuelProofFlag(Character aFuelProofFlag) {
        fuelProofFlag = aFuelProofFlag;
    }

    /**
     * Access method for fuelRequestFlag.
     *
     * @return the current value of fuelRequestFlag
     */
    public Character getFuelRequestFlag() {
        return fuelRequestFlag;
    }

    /**
     * Setter method for fuelRequestFlag.
     *
     * @param aFuelRequestFlag the new value for fuelRequestFlag
     */
    public void setFuelRequestFlag(Character aFuelRequestFlag) {
        fuelRequestFlag = aFuelRequestFlag;
    }

    /**
     * Access method for initialEval.
     *
     * @return the current value of initialEval
     */
    public Character getInitialEval() {
        return initialEval;
    }

    /**
     * Setter method for initialEval.
     *
     * @param aInitialEval the new value for initialEval
     */
    public void setInitialEval(Character aInitialEval) {
        initialEval = aInitialEval;
    }

    /**
     * Access method for initialIssuanceDate.
     *
     * @return the current value of initialIssuanceDate
     */
    public Timestamp getInitialIssuanceDate() {
        return initialIssuanceDate;
    }

    /**
     * Setter method for initialIssuanceDate.
     *
     * @param aInitialIssuanceDate the new value for initialIssuanceDate
     */
    public void setInitialIssuanceDate(Timestamp aInitialIssuanceDate) {
        initialIssuanceDate = aInitialIssuanceDate;
    }

    /**
     * Access method for notGoingToRenewFlag.
     *
     * @return the current value of notGoingToRenewFlag
     */
    public Character getNotGoingToRenewFlag() {
        return notGoingToRenewFlag;
    }

    /**
     * Setter method for notGoingToRenewFlag.
     *
     * @param aNotGoingToRenewFlag the new value for notGoingToRenewFlag
     */
    public void setNotGoingToRenewFlag(Character aNotGoingToRenewFlag) {
        notGoingToRenewFlag = aNotGoingToRenewFlag;
    }

    /**
     * Access method for operationalFlag.
     *
     * @return the current value of operationalFlag
     */
    public Character getOperationalFlag() {
        return operationalFlag;
    }

    /**
     * Setter method for operationalFlag.
     *
     * @param aOperationalFlag the new value for operationalFlag
     */
    public void setOperationalFlag(Character aOperationalFlag) {
        operationalFlag = aOperationalFlag;
    }

    /**
     * Access method for operationalIndicator.
     *
     * @return the current value of operationalIndicator
     */
    public Character getOperationalIndicator() {
        return operationalIndicator;
    }

    /**
     * Setter method for operationalIndicator.
     *
     * @param aOperationalIndicator the new value for operationalIndicator
     */
    public void setOperationalIndicator(Character aOperationalIndicator) {
        operationalIndicator = aOperationalIndicator;
    }

    /**
     * Access method for parentUid.
     *
     * @return the current value of parentUid
     */
    public Integer getParentUid() {
        return parentUid;
    }

    /**
     * Setter method for parentUid.
     *
     * @param aParentUid the new value for parentUid
     */
    public void setParentUid(Integer aParentUid) {
        parentUid = aParentUid;
    }

    /**
     * Access method for ptoAppCompDate.
     *
     * @return the current value of ptoAppCompDate
     */
    public Timestamp getPtoAppCompDate() {
        return ptoAppCompDate;
    }

    /**
     * Setter method for ptoAppCompDate.
     *
     * @param aPtoAppCompDate the new value for ptoAppCompDate
     */
    public void setPtoAppCompDate(Timestamp aPtoAppCompDate) {
        ptoAppCompDate = aPtoAppCompDate;
    }

    /**
     * Access method for ptoAppDate.
     *
     * @return the current value of ptoAppDate
     */
    public Timestamp getPtoAppDate() {
        return ptoAppDate;
    }

    /**
     * Setter method for ptoAppDate.
     *
     * @param aPtoAppDate the new value for ptoAppDate
     */
    public void setPtoAppDate(Timestamp aPtoAppDate) {
        ptoAppDate = aPtoAppDate;
    }

    /**
     * Access method for ptoAppDistId.
     *
     * @return the current value of ptoAppDistId
     */
    public Integer getPtoAppDistId() {
        return ptoAppDistId;
    }

    /**
     * Setter method for ptoAppDistId.
     *
     * @param aPtoAppDistId the new value for ptoAppDistId
     */
    public void setPtoAppDistId(Integer aPtoAppDistId) {
        ptoAppDistId = aPtoAppDistId;
    }

    /**
     * Access method for ptoDate.
     *
     * @return the current value of ptoDate
     */
    public Timestamp getPtoDate() {
        return ptoDate;
    }

    /**
     * Setter method for ptoDate.
     *
     * @param aPtoDate the new value for ptoDate
     */
    public void setPtoDate(Timestamp aPtoDate) {
        ptoDate = aPtoDate;
    }

    /**
     * Access method for ptoDistrictId.
     *
     * @return the current value of ptoDistrictId
     */
    public Integer getPtoDistrictId() {
        return ptoDistrictId;
    }

    /**
     * Setter method for ptoDistrictId.
     *
     * @param aPtoDistrictId the new value for ptoDistrictId
     */
    public void setPtoDistrictId(Integer aPtoDistrictId) {
        ptoDistrictId = aPtoDistrictId;
    }

    /**
     * Access method for ptoNo.
     *
     * @return the current value of ptoNo
     */
    public String getPtoNo() {
        return ptoNo;
    }

    /**
     * Setter method for ptoNo.
     *
     * @param aPtoNo the new value for ptoNo
     */
    public void setPtoNo(String aPtoNo) {
        ptoNo = aPtoNo;
    }

    /**
     * Access method for purchaseDate.
     *
     * @return the current value of purchaseDate
     */
    public Timestamp getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Setter method for purchaseDate.
     *
     * @param aPurchaseDate the new value for purchaseDate
     */
    public void setPurchaseDate(Timestamp aPurchaseDate) {
        purchaseDate = aPurchaseDate;
    }

    /**
     * Access method for regItemStatusUid.
     *
     * @return the current value of regItemStatusUid
     */
    public Integer getRegItemStatusUid() {
        return regItemStatusUid;
    }

    /**
     * Setter method for regItemStatusUid.
     *
     * @param aRegItemStatusUid the new value for regItemStatusUid
     */
    public void setRegItemStatusUid(Integer aRegItemStatusUid) {
        regItemStatusUid = aRegItemStatusUid;
    }

    /**
     * Access method for regItemSubTypeUid.
     *
     * @return the current value of regItemSubTypeUid
     */
    public Integer getRegItemSubTypeUid() {
        return regItemSubTypeUid;
    }

    /**
     * Setter method for regItemSubTypeUid.
     *
     * @param aRegItemSubTypeUid the new value for regItemSubTypeUid
     */
    public void setRegItemSubTypeUid(Integer aRegItemSubTypeUid) {
        regItemSubTypeUid = aRegItemSubTypeUid;
    }

    /**
     * Access method for regItemSubSubTypesUid.
     *
     * @return the current value of regItemSubSubTypesUid
     */
    public Integer getRegItemSubSubTypesUid() {
        return regItemSubSubTypesUid;
    }

    /**
     * Setter method for regItemSubSubTypesUid.
     *
     * @param aRegItemSubSubTypesUid the new value for regItemSubSubTypesUid
     */
    public void setRegItemSubSubTypesUid(Integer aRegItemSubSubTypesUid) {
        regItemSubSubTypesUid = aRegItemSubSubTypesUid;
    }

    /**
     * Access method for renewalOpenFlag.
     *
     * @return the current value of renewalOpenFlag
     */
    public Character getRenewalOpenFlag() {
        return renewalOpenFlag;
    }

    /**
     * Setter method for renewalOpenFlag.
     *
     * @param aRenewalOpenFlag the new value for renewalOpenFlag
     */
    public void setRenewalOpenFlag(Character aRenewalOpenFlag) {
        renewalOpenFlag = aRenewalOpenFlag;
    }

    /**
     * Access method for rentalFlag.
     *
     * @return the current value of rentalFlag
     */
    public Character getRentalFlag() {
        return rentalFlag;
    }

    /**
     * Setter method for rentalFlag.
     *
     * @param aRentalFlag the new value for rentalFlag
     */
    public void setRentalFlag(Character aRentalFlag) {
        rentalFlag = aRentalFlag;
    }

    /**
     * Access method for replacedByRegItemUid.
     *
     * @return the current value of replacedByRegItemUid
     */
    public Integer getReplacedByRegItemUid() {
        return replacedByRegItemUid;
    }

    /**
     * Setter method for replacedByRegItemUid.
     *
     * @param aReplacedByRegItemUid the new value for replacedByRegItemUid
     */
    public void setReplacedByRegItemUid(Integer aReplacedByRegItemUid) {
        replacedByRegItemUid = aReplacedByRegItemUid;
    }

    /**
     * Access method for residencyProofFlag.
     *
     * @return the current value of residencyProofFlag
     */
    public Character getResidencyProofFlag() {
        return residencyProofFlag;
    }

    /**
     * Setter method for residencyProofFlag.
     *
     * @param aResidencyProofFlag the new value for residencyProofFlag
     */
    public void setResidencyProofFlag(Character aResidencyProofFlag) {
        residencyProofFlag = aResidencyProofFlag;
    }

    /**
     * Access method for residencyRequestFlag.
     *
     * @return the current value of residencyRequestFlag
     */
    public Character getResidencyRequestFlag() {
        return residencyRequestFlag;
    }

    /**
     * Setter method for residencyRequestFlag.
     *
     * @param aResidencyRequestFlag the new value for residencyRequestFlag
     */
    public void setResidencyRequestFlag(Character aResidencyRequestFlag) {
        residencyRequestFlag = aResidencyRequestFlag;
    }

    /**
     * Access method for stolenFlag.
     *
     * @return the current value of stolenFlag
     */
    public Character getStolenFlag() {
        return stolenFlag;
    }

    /**
     * Setter method for stolenFlag.
     *
     * @param aStolenFlag the new value for stolenFlag
     */
    public void setStolenFlag(Character aStolenFlag) {
        stolenFlag = aStolenFlag;
    }

    /**
     * Access method for table1StdProofFlag.
     *
     * @return the current value of table1StdProofFlag
     */
    public Character getTable1StdProofFlag() {
        return table1StdProofFlag;
    }

    /**
     * Setter method for table1StdProofFlag.
     *
     * @param aTable1StdProofFlag the new value for table1StdProofFlag
     */
    public void setTable1StdProofFlag(Character aTable1StdProofFlag) {
        table1StdProofFlag = aTable1StdProofFlag;
    }

    /**
     * Access method for table1StdRequestFlag.
     *
     * @return the current value of table1StdRequestFlag
     */
    public Character getTable1StdRequestFlag() {
        return table1StdRequestFlag;
    }

    /**
     * Setter method for table1StdRequestFlag.
     *
     * @param aTable1StdRequestFlag the new value for table1StdRequestFlag
     */
    public void setTable1StdRequestFlag(Character aTable1StdRequestFlag) {
        table1StdRequestFlag = aTable1StdRequestFlag;
    }

    /**
     * Access method for trackingNo.
     *
     * @return the current value of trackingNo
     */
    public Integer getTrackingNo() {
        return trackingNo;
    }

    /**
     * Setter method for trackingNo.
     *
     * @param aTrackingNo the new value for trackingNo
     */
    public void setTrackingNo(Integer aTrackingNo) {
        trackingNo = aTrackingNo;
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
     * Compares the key for this instance with another RegistrationItemsAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RegistrationItemsAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RegistrationItemsAud)) {
            return false;
        }
        RegistrationItemsAud that = (RegistrationItemsAud) other;
        Object myRiAudUid = this.getRiAudUid();
        Object yourRiAudUid = that.getRiAudUid();
        if (myRiAudUid==null ? yourRiAudUid!=null : !myRiAudUid.equals(yourRiAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RegistrationItemsAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RegistrationItemsAud)) return false;
        return this.equalKeys(other) && ((RegistrationItemsAud)other).equalKeys(this);
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
        if (getRiAudUid() == null) {
            i = 0;
        } else {
            i = getRiAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[RegistrationItemsAud |");
        sb.append(" riAudUid=").append(getRiAudUid());
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
        ret.put("riAudUid", getRiAudUid());
        return ret;
    }

}
