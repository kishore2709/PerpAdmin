// Generated with g9.

package com.springapp.modules.system.domain.perp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity(name="company_aud")
public class CompanyAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "companyAudUid";

    @Id
    @Column(name="Company_Aud_UID", unique=true, nullable=false, precision=10)
    private Integer companyAudUid;
    @Column(name="Company_UID", nullable=false, precision=10)
    private Integer companyUid;
    @Column(name="Company_Name", length=100)
    private String companyName;
    @Column(name="OON", length=25)
    private String oon;
    @Column(name="Taxid_ARBN", nullable=false, length=25)
    private String taxidArbn;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Batch_Upload_Flag", length=1)
    private Character batchUploadFlag;
    @Column(name="Ftp_Pswd", length=64)
    private String ftpPswd;
    @Column(name="Manages_Companies_Flag", nullable=false, length=1)
    private Character managesCompaniesFlag;
    @Column(name="Registers_Equipment_Flag", nullable=false, length=1)
    private Character registersEquipmentFlag;
    @Column(name="Old_Company_Number", length=60)
    private String oldCompanyNumber;
    @Column(name="Fleetsize_Lookup_UID", precision=10)
    private Integer fleetsizeLookupUid;
    @Column(name="DOT_Number", length=20)
    private String dotNumber;
    @Column(name="Motor_Carrier_Number", length=45)
    private String motorCarrierNumber;
    @Column(name="General_NOB", length=256)
    private String generalNob;
    @Column(name="WS_Token", length=256)
    private String wsToken;
    @Column(name="WS_Flag", nullable=false, length=1)
    private Character wsFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Public_Flag", nullable=false, length=1)
    private Character publicFlag;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;
    @Column(name="PEPS_Flag", length=1)
    private Character pepsFlag;
    @Column(name="Military_Flag", nullable=false, length=1)
    private Character militaryFlag;
    @Column(name="Rental_Co_Flag", nullable=false, length=1)
    private Character rentalCoFlag;
    @Column(name="Perp_Equip_Duration", precision=10)
    private Integer perpEquipDuration;
    @Column(name="MilitaryDistrict_UID", precision=10)
    private Integer militaryDistrictUid;
    @Column(name="DistrictCode_UID", precision=10)
    private Integer districtCodeUid;
    @Column(name="AGSource_Flag", nullable=false, length=1)
    private Character agSourceFlag;
    @Column(name="Confidential_Flag", length=1)
    private Character confidentialFlag;

    /** Default constructor. */
    public CompanyAud() {
        super();
    }

    /**
     * Access method for companyAudUid.
     *
     * @return the current value of companyAudUid
     */
    public Integer getCompanyAudUid() {
        return companyAudUid;
    }

    /**
     * Setter method for companyAudUid.
     *
     * @param aCompanyAudUid the new value for companyAudUid
     */
    public void setCompanyAudUid(Integer aCompanyAudUid) {
        companyAudUid = aCompanyAudUid;
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
     * Access method for companyName.
     *
     * @return the current value of companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Setter method for companyName.
     *
     * @param aCompanyName the new value for companyName
     */
    public void setCompanyName(String aCompanyName) {
        companyName = aCompanyName;
    }

    /**
     * Access method for oon.
     *
     * @return the current value of oon
     */
    public String getOon() {
        return oon;
    }

    /**
     * Setter method for oon.
     *
     * @param aOon the new value for oon
     */
    public void setOon(String aOon) {
        oon = aOon;
    }

    /**
     * Access method for taxidArbn.
     *
     * @return the current value of taxidArbn
     */
    public String getTaxidArbn() {
        return taxidArbn;
    }

    /**
     * Setter method for taxidArbn.
     *
     * @param aTaxidArbn the new value for taxidArbn
     */
    public void setTaxidArbn(String aTaxidArbn) {
        taxidArbn = aTaxidArbn;
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
     * Access method for batchUploadFlag.
     *
     * @return the current value of batchUploadFlag
     */
    public Character getBatchUploadFlag() {
        return batchUploadFlag;
    }

    /**
     * Setter method for batchUploadFlag.
     *
     * @param aBatchUploadFlag the new value for batchUploadFlag
     */
    public void setBatchUploadFlag(Character aBatchUploadFlag) {
        batchUploadFlag = aBatchUploadFlag;
    }

    /**
     * Access method for ftpPswd.
     *
     * @return the current value of ftpPswd
     */
    public String getFtpPswd() {
        return ftpPswd;
    }

    /**
     * Setter method for ftpPswd.
     *
     * @param aFtpPswd the new value for ftpPswd
     */
    public void setFtpPswd(String aFtpPswd) {
        ftpPswd = aFtpPswd;
    }

    /**
     * Access method for managesCompaniesFlag.
     *
     * @return the current value of managesCompaniesFlag
     */
    public Character getManagesCompaniesFlag() {
        return managesCompaniesFlag;
    }

    /**
     * Setter method for managesCompaniesFlag.
     *
     * @param aManagesCompaniesFlag the new value for managesCompaniesFlag
     */
    public void setManagesCompaniesFlag(Character aManagesCompaniesFlag) {
        managesCompaniesFlag = aManagesCompaniesFlag;
    }

    /**
     * Access method for registersEquipmentFlag.
     *
     * @return the current value of registersEquipmentFlag
     */
    public Character getRegistersEquipmentFlag() {
        return registersEquipmentFlag;
    }

    /**
     * Setter method for registersEquipmentFlag.
     *
     * @param aRegistersEquipmentFlag the new value for registersEquipmentFlag
     */
    public void setRegistersEquipmentFlag(Character aRegistersEquipmentFlag) {
        registersEquipmentFlag = aRegistersEquipmentFlag;
    }

    /**
     * Access method for oldCompanyNumber.
     *
     * @return the current value of oldCompanyNumber
     */
    public String getOldCompanyNumber() {
        return oldCompanyNumber;
    }

    /**
     * Setter method for oldCompanyNumber.
     *
     * @param aOldCompanyNumber the new value for oldCompanyNumber
     */
    public void setOldCompanyNumber(String aOldCompanyNumber) {
        oldCompanyNumber = aOldCompanyNumber;
    }

    /**
     * Access method for fleetsizeLookupUid.
     *
     * @return the current value of fleetsizeLookupUid
     */
    public Integer getFleetsizeLookupUid() {
        return fleetsizeLookupUid;
    }

    /**
     * Setter method for fleetsizeLookupUid.
     *
     * @param aFleetsizeLookupUid the new value for fleetsizeLookupUid
     */
    public void setFleetsizeLookupUid(Integer aFleetsizeLookupUid) {
        fleetsizeLookupUid = aFleetsizeLookupUid;
    }

    /**
     * Access method for dotNumber.
     *
     * @return the current value of dotNumber
     */
    public String getDotNumber() {
        return dotNumber;
    }

    /**
     * Setter method for dotNumber.
     *
     * @param aDotNumber the new value for dotNumber
     */
    public void setDotNumber(String aDotNumber) {
        dotNumber = aDotNumber;
    }

    /**
     * Access method for motorCarrierNumber.
     *
     * @return the current value of motorCarrierNumber
     */
    public String getMotorCarrierNumber() {
        return motorCarrierNumber;
    }

    /**
     * Setter method for motorCarrierNumber.
     *
     * @param aMotorCarrierNumber the new value for motorCarrierNumber
     */
    public void setMotorCarrierNumber(String aMotorCarrierNumber) {
        motorCarrierNumber = aMotorCarrierNumber;
    }

    /**
     * Access method for generalNob.
     *
     * @return the current value of generalNob
     */
    public String getGeneralNob() {
        return generalNob;
    }

    /**
     * Setter method for generalNob.
     *
     * @param aGeneralNob the new value for generalNob
     */
    public void setGeneralNob(String aGeneralNob) {
        generalNob = aGeneralNob;
    }

    /**
     * Access method for wsToken.
     *
     * @return the current value of wsToken
     */
    public String getWsToken() {
        return wsToken;
    }

    /**
     * Setter method for wsToken.
     *
     * @param aWsToken the new value for wsToken
     */
    public void setWsToken(String aWsToken) {
        wsToken = aWsToken;
    }

    /**
     * Access method for wsFlag.
     *
     * @return the current value of wsFlag
     */
    public Character getWsFlag() {
        return wsFlag;
    }

    /**
     * Setter method for wsFlag.
     *
     * @param aWsFlag the new value for wsFlag
     */
    public void setWsFlag(Character aWsFlag) {
        wsFlag = aWsFlag;
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
     * Access method for publicFlag.
     *
     * @return the current value of publicFlag
     */
    public Character getPublicFlag() {
        return publicFlag;
    }

    /**
     * Setter method for publicFlag.
     *
     * @param aPublicFlag the new value for publicFlag
     */
    public void setPublicFlag(Character aPublicFlag) {
        publicFlag = aPublicFlag;
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
     * Access method for pepsFlag.
     *
     * @return the current value of pepsFlag
     */
    public Character getPepsFlag() {
        return pepsFlag;
    }

    /**
     * Setter method for pepsFlag.
     *
     * @param aPepsFlag the new value for pepsFlag
     */
    public void setPepsFlag(Character aPepsFlag) {
        pepsFlag = aPepsFlag;
    }

    /**
     * Access method for militaryFlag.
     *
     * @return the current value of militaryFlag
     */
    public Character getMilitaryFlag() {
        return militaryFlag;
    }

    /**
     * Setter method for militaryFlag.
     *
     * @param aMilitaryFlag the new value for militaryFlag
     */
    public void setMilitaryFlag(Character aMilitaryFlag) {
        militaryFlag = aMilitaryFlag;
    }

    /**
     * Access method for rentalCoFlag.
     *
     * @return the current value of rentalCoFlag
     */
    public Character getRentalCoFlag() {
        return rentalCoFlag;
    }

    /**
     * Setter method for rentalCoFlag.
     *
     * @param aRentalCoFlag the new value for rentalCoFlag
     */
    public void setRentalCoFlag(Character aRentalCoFlag) {
        rentalCoFlag = aRentalCoFlag;
    }

    /**
     * Access method for perpEquipDuration.
     *
     * @return the current value of perpEquipDuration
     */
    public Integer getPerpEquipDuration() {
        return perpEquipDuration;
    }

    /**
     * Setter method for perpEquipDuration.
     *
     * @param aPerpEquipDuration the new value for perpEquipDuration
     */
    public void setPerpEquipDuration(Integer aPerpEquipDuration) {
        perpEquipDuration = aPerpEquipDuration;
    }

    /**
     * Access method for militaryDistrictUid.
     *
     * @return the current value of militaryDistrictUid
     */
    public Integer getMilitaryDistrictUid() {
        return militaryDistrictUid;
    }

    /**
     * Setter method for militaryDistrictUid.
     *
     * @param aMilitaryDistrictUid the new value for militaryDistrictUid
     */
    public void setMilitaryDistrictUid(Integer aMilitaryDistrictUid) {
        militaryDistrictUid = aMilitaryDistrictUid;
    }

    /**
     * Access method for districtCodeUid.
     *
     * @return the current value of districtCodeUid
     */
    public Integer getDistrictCodeUid() {
        return districtCodeUid;
    }

    /**
     * Setter method for districtCodeUid.
     *
     * @param aDistrictCodeUid the new value for districtCodeUid
     */
    public void setDistrictCodeUid(Integer aDistrictCodeUid) {
        districtCodeUid = aDistrictCodeUid;
    }

    /**
     * Access method for agSourceFlag.
     *
     * @return the current value of agSourceFlag
     */
    public Character getAgSourceFlag() {
        return agSourceFlag;
    }

    /**
     * Setter method for agSourceFlag.
     *
     * @param aAgSourceFlag the new value for agSourceFlag
     */
    public void setAgSourceFlag(Character aAgSourceFlag) {
        agSourceFlag = aAgSourceFlag;
    }

    /**
     * Access method for confidentialFlag.
     *
     * @return the current value of confidentialFlag
     */
    public Character getConfidentialFlag() {
        return confidentialFlag;
    }

    /**
     * Setter method for confidentialFlag.
     *
     * @param aConfidentialFlag the new value for confidentialFlag
     */
    public void setConfidentialFlag(Character aConfidentialFlag) {
        confidentialFlag = aConfidentialFlag;
    }

    /**
     * Compares the key for this instance with another CompanyAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CompanyAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CompanyAud)) {
            return false;
        }
        CompanyAud that = (CompanyAud) other;
        Object myCompanyAudUid = this.getCompanyAudUid();
        Object yourCompanyAudUid = that.getCompanyAudUid();
        if (myCompanyAudUid==null ? yourCompanyAudUid!=null : !myCompanyAudUid.equals(yourCompanyAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CompanyAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CompanyAud)) return false;
        return this.equalKeys(other) && ((CompanyAud)other).equalKeys(this);
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
        if (getCompanyAudUid() == null) {
            i = 0;
        } else {
            i = getCompanyAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[CompanyAud |");
        sb.append(" companyAudUid=").append(getCompanyAudUid());
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
        ret.put("companyAudUid", getCompanyAudUid());
        return ret;
    }

}
