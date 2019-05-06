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

@Entity(name="inspections")
public class Inspections implements Serializable {

    /** Primary key. */
    protected static final String PK = "inspectionUid";

    @Id
    @Column(name="Inspection_UID", unique=true, nullable=false, precision=10)
    private Integer inspectionUid;
    @Column(name="AllCondComplied_Flag", length=1)
    private Character allCondCompliedFlag;
    @Column(name="AllCondCompliedNot", length=3000)
    private String allCondCompliedNot;
    @Column(name="CertAccessible_Flag", length=1)
    private Character certAccessibleFlag;
    @Column(name="In_Field_Inspection_Flag", length=1)
    private Character inFieldInspectionFlag;
    @Column(name="Inspection_Date")
    private Timestamp inspectionDate;
    @Column(name="InspectorsDistrict_UID", precision=10)
    private Integer inspectorsDistrictUid;
    @Column(name="ObservedOperating_Flag", length=1)
    private Character observedOperatingFlag;
    @Column(name="ObservedPortable_Flag", length=1)
    private Character observedPortableFlag;
    @Column(name="OrigAssigned_Date")
    private Timestamp origAssignedDate;
    @Column(name="PlacardAffixed_Flag", length=1)
    private Character placardAffixedFlag;
    @Column(name="Remarks", length=255)
    private String remarks;
    @Column(name="StickerAffixed_Flag", length=1)
    private Character stickerAffixedFlag;
    @Column(name="UsingCARBCetBlastMat_Flag", length=1)
    private Character usingCarbCetBlastMatFlag;
    @Column(name="VEEDone_Flag", length=1)
    private Character veeDoneFlag;
    @Column(name="Inspection_Certified_Date")
    private Timestamp inspectionCertifiedDate;
    @Column(name="Inspection_Certified_Flag", length=1)
    private Character inspectionCertifiedFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Legacy_DateCommenced")
    private Timestamp legacyDateCommenced;
    @Column(name="Legacy_DateEntered")
    private Timestamp legacyDateEntered;
    @Column(name="Legacy_DateRenewal")
    private Timestamp legacyDateRenewal;
    @Column(name="Legacy_DateRenewalStatus", precision=5)
    private Short legacyDateRenewalStatus;
    @Column(name="Legacy_DaysOperating", length=50)
    private String legacyDaysOperating;
    @Column(name="Legacy_Opacity", length=50)
    private String legacyOpacity;
    @Column(name="Legacy_VEERequired", length=50)
    private String legacyVeeRequired;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="ObservedTSE_Flag", length=1)
    private Character observedTseFlag;
    @ManyToOne
    @JoinColumn(name="Company_UID")
    private Company company;
    @OneToMany(mappedBy="inspections")
    private Set<PerpDocuments> perpDocuments;
    @ManyToOne
    @JoinColumn(name="InspectionType_UID")
    private InspectionType inspectionType;
    @OneToMany(mappedBy="inspections")
    private Set<InspRecordKeeping> inspRecordKeeping;
    @OneToMany(mappedBy="inspections")
    private Set<InspRegitemInfo> inspRegitemInfo;
    @OneToMany(mappedBy="inspections")
    private Set<InspViolations> inspViolations;
    @OneToMany(mappedBy="inspections")
    private Set<RegitemReqAttachRel> regitemReqAttachRel;
    @ManyToOne
    @JoinColumn(name="InspectionSite_UID")
    private InspectionSites inspectionSites;
    @ManyToOne(optional=false)
    @JoinColumn(name="InspectionStatus_UID", nullable=false)
    private InspectionStatus inspectionStatus;
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItem_UID", nullable=false)
    private RegistrationItems registrationItems;
    @ManyToOne
    @JoinColumn(name="OrigAssignedInspector_UID")
    private Users users2;
    @ManyToOne(optional=false)
    @JoinColumn(name="Inspector_UID", nullable=false)
    private Users users;

    /** Default constructor. */
    public Inspections() {
        super();
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
     * Access method for allCondCompliedFlag.
     *
     * @return the current value of allCondCompliedFlag
     */
    public Character getAllCondCompliedFlag() {
        return allCondCompliedFlag;
    }

    /**
     * Setter method for allCondCompliedFlag.
     *
     * @param aAllCondCompliedFlag the new value for allCondCompliedFlag
     */
    public void setAllCondCompliedFlag(Character aAllCondCompliedFlag) {
        allCondCompliedFlag = aAllCondCompliedFlag;
    }

    /**
     * Access method for allCondCompliedNot.
     *
     * @return the current value of allCondCompliedNot
     */
    public String getAllCondCompliedNot() {
        return allCondCompliedNot;
    }

    /**
     * Setter method for allCondCompliedNot.
     *
     * @param aAllCondCompliedNot the new value for allCondCompliedNot
     */
    public void setAllCondCompliedNot(String aAllCondCompliedNot) {
        allCondCompliedNot = aAllCondCompliedNot;
    }

    /**
     * Access method for certAccessibleFlag.
     *
     * @return the current value of certAccessibleFlag
     */
    public Character getCertAccessibleFlag() {
        return certAccessibleFlag;
    }

    /**
     * Setter method for certAccessibleFlag.
     *
     * @param aCertAccessibleFlag the new value for certAccessibleFlag
     */
    public void setCertAccessibleFlag(Character aCertAccessibleFlag) {
        certAccessibleFlag = aCertAccessibleFlag;
    }

    /**
     * Access method for inFieldInspectionFlag.
     *
     * @return the current value of inFieldInspectionFlag
     */
    public Character getInFieldInspectionFlag() {
        return inFieldInspectionFlag;
    }

    /**
     * Setter method for inFieldInspectionFlag.
     *
     * @param aInFieldInspectionFlag the new value for inFieldInspectionFlag
     */
    public void setInFieldInspectionFlag(Character aInFieldInspectionFlag) {
        inFieldInspectionFlag = aInFieldInspectionFlag;
    }

    /**
     * Access method for inspectionDate.
     *
     * @return the current value of inspectionDate
     */
    public Timestamp getInspectionDate() {
        return inspectionDate;
    }

    /**
     * Setter method for inspectionDate.
     *
     * @param aInspectionDate the new value for inspectionDate
     */
    public void setInspectionDate(Timestamp aInspectionDate) {
        inspectionDate = aInspectionDate;
    }

    /**
     * Access method for inspectorsDistrictUid.
     *
     * @return the current value of inspectorsDistrictUid
     */
    public Integer getInspectorsDistrictUid() {
        return inspectorsDistrictUid;
    }

    /**
     * Setter method for inspectorsDistrictUid.
     *
     * @param aInspectorsDistrictUid the new value for inspectorsDistrictUid
     */
    public void setInspectorsDistrictUid(Integer aInspectorsDistrictUid) {
        inspectorsDistrictUid = aInspectorsDistrictUid;
    }

    /**
     * Access method for observedOperatingFlag.
     *
     * @return the current value of observedOperatingFlag
     */
    public Character getObservedOperatingFlag() {
        return observedOperatingFlag;
    }

    /**
     * Setter method for observedOperatingFlag.
     *
     * @param aObservedOperatingFlag the new value for observedOperatingFlag
     */
    public void setObservedOperatingFlag(Character aObservedOperatingFlag) {
        observedOperatingFlag = aObservedOperatingFlag;
    }

    /**
     * Access method for observedPortableFlag.
     *
     * @return the current value of observedPortableFlag
     */
    public Character getObservedPortableFlag() {
        return observedPortableFlag;
    }

    /**
     * Setter method for observedPortableFlag.
     *
     * @param aObservedPortableFlag the new value for observedPortableFlag
     */
    public void setObservedPortableFlag(Character aObservedPortableFlag) {
        observedPortableFlag = aObservedPortableFlag;
    }

    /**
     * Access method for origAssignedDate.
     *
     * @return the current value of origAssignedDate
     */
    public Timestamp getOrigAssignedDate() {
        return origAssignedDate;
    }

    /**
     * Setter method for origAssignedDate.
     *
     * @param aOrigAssignedDate the new value for origAssignedDate
     */
    public void setOrigAssignedDate(Timestamp aOrigAssignedDate) {
        origAssignedDate = aOrigAssignedDate;
    }

    /**
     * Access method for placardAffixedFlag.
     *
     * @return the current value of placardAffixedFlag
     */
    public Character getPlacardAffixedFlag() {
        return placardAffixedFlag;
    }

    /**
     * Setter method for placardAffixedFlag.
     *
     * @param aPlacardAffixedFlag the new value for placardAffixedFlag
     */
    public void setPlacardAffixedFlag(Character aPlacardAffixedFlag) {
        placardAffixedFlag = aPlacardAffixedFlag;
    }

    /**
     * Access method for remarks.
     *
     * @return the current value of remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Setter method for remarks.
     *
     * @param aRemarks the new value for remarks
     */
    public void setRemarks(String aRemarks) {
        remarks = aRemarks;
    }

    /**
     * Access method for stickerAffixedFlag.
     *
     * @return the current value of stickerAffixedFlag
     */
    public Character getStickerAffixedFlag() {
        return stickerAffixedFlag;
    }

    /**
     * Setter method for stickerAffixedFlag.
     *
     * @param aStickerAffixedFlag the new value for stickerAffixedFlag
     */
    public void setStickerAffixedFlag(Character aStickerAffixedFlag) {
        stickerAffixedFlag = aStickerAffixedFlag;
    }

    /**
     * Access method for usingCarbCetBlastMatFlag.
     *
     * @return the current value of usingCarbCetBlastMatFlag
     */
    public Character getUsingCarbCetBlastMatFlag() {
        return usingCarbCetBlastMatFlag;
    }

    /**
     * Setter method for usingCarbCetBlastMatFlag.
     *
     * @param aUsingCarbCetBlastMatFlag the new value for usingCarbCetBlastMatFlag
     */
    public void setUsingCarbCetBlastMatFlag(Character aUsingCarbCetBlastMatFlag) {
        usingCarbCetBlastMatFlag = aUsingCarbCetBlastMatFlag;
    }

    /**
     * Access method for veeDoneFlag.
     *
     * @return the current value of veeDoneFlag
     */
    public Character getVeeDoneFlag() {
        return veeDoneFlag;
    }

    /**
     * Setter method for veeDoneFlag.
     *
     * @param aVeeDoneFlag the new value for veeDoneFlag
     */
    public void setVeeDoneFlag(Character aVeeDoneFlag) {
        veeDoneFlag = aVeeDoneFlag;
    }

    /**
     * Access method for inspectionCertifiedDate.
     *
     * @return the current value of inspectionCertifiedDate
     */
    public Timestamp getInspectionCertifiedDate() {
        return inspectionCertifiedDate;
    }

    /**
     * Setter method for inspectionCertifiedDate.
     *
     * @param aInspectionCertifiedDate the new value for inspectionCertifiedDate
     */
    public void setInspectionCertifiedDate(Timestamp aInspectionCertifiedDate) {
        inspectionCertifiedDate = aInspectionCertifiedDate;
    }

    /**
     * Access method for inspectionCertifiedFlag.
     *
     * @return the current value of inspectionCertifiedFlag
     */
    public Character getInspectionCertifiedFlag() {
        return inspectionCertifiedFlag;
    }

    /**
     * Setter method for inspectionCertifiedFlag.
     *
     * @param aInspectionCertifiedFlag the new value for inspectionCertifiedFlag
     */
    public void setInspectionCertifiedFlag(Character aInspectionCertifiedFlag) {
        inspectionCertifiedFlag = aInspectionCertifiedFlag;
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
     * Access method for legacyDateCommenced.
     *
     * @return the current value of legacyDateCommenced
     */
    public Timestamp getLegacyDateCommenced() {
        return legacyDateCommenced;
    }

    /**
     * Setter method for legacyDateCommenced.
     *
     * @param aLegacyDateCommenced the new value for legacyDateCommenced
     */
    public void setLegacyDateCommenced(Timestamp aLegacyDateCommenced) {
        legacyDateCommenced = aLegacyDateCommenced;
    }

    /**
     * Access method for legacyDateEntered.
     *
     * @return the current value of legacyDateEntered
     */
    public Timestamp getLegacyDateEntered() {
        return legacyDateEntered;
    }

    /**
     * Setter method for legacyDateEntered.
     *
     * @param aLegacyDateEntered the new value for legacyDateEntered
     */
    public void setLegacyDateEntered(Timestamp aLegacyDateEntered) {
        legacyDateEntered = aLegacyDateEntered;
    }

    /**
     * Access method for legacyDateRenewal.
     *
     * @return the current value of legacyDateRenewal
     */
    public Timestamp getLegacyDateRenewal() {
        return legacyDateRenewal;
    }

    /**
     * Setter method for legacyDateRenewal.
     *
     * @param aLegacyDateRenewal the new value for legacyDateRenewal
     */
    public void setLegacyDateRenewal(Timestamp aLegacyDateRenewal) {
        legacyDateRenewal = aLegacyDateRenewal;
    }

    /**
     * Access method for legacyDateRenewalStatus.
     *
     * @return the current value of legacyDateRenewalStatus
     */
    public Short getLegacyDateRenewalStatus() {
        return legacyDateRenewalStatus;
    }

    /**
     * Setter method for legacyDateRenewalStatus.
     *
     * @param aLegacyDateRenewalStatus the new value for legacyDateRenewalStatus
     */
    public void setLegacyDateRenewalStatus(Short aLegacyDateRenewalStatus) {
        legacyDateRenewalStatus = aLegacyDateRenewalStatus;
    }

    /**
     * Access method for legacyDaysOperating.
     *
     * @return the current value of legacyDaysOperating
     */
    public String getLegacyDaysOperating() {
        return legacyDaysOperating;
    }

    /**
     * Setter method for legacyDaysOperating.
     *
     * @param aLegacyDaysOperating the new value for legacyDaysOperating
     */
    public void setLegacyDaysOperating(String aLegacyDaysOperating) {
        legacyDaysOperating = aLegacyDaysOperating;
    }

    /**
     * Access method for legacyOpacity.
     *
     * @return the current value of legacyOpacity
     */
    public String getLegacyOpacity() {
        return legacyOpacity;
    }

    /**
     * Setter method for legacyOpacity.
     *
     * @param aLegacyOpacity the new value for legacyOpacity
     */
    public void setLegacyOpacity(String aLegacyOpacity) {
        legacyOpacity = aLegacyOpacity;
    }

    /**
     * Access method for legacyVeeRequired.
     *
     * @return the current value of legacyVeeRequired
     */
    public String getLegacyVeeRequired() {
        return legacyVeeRequired;
    }

    /**
     * Setter method for legacyVeeRequired.
     *
     * @param aLegacyVeeRequired the new value for legacyVeeRequired
     */
    public void setLegacyVeeRequired(String aLegacyVeeRequired) {
        legacyVeeRequired = aLegacyVeeRequired;
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
     * Access method for observedTseFlag.
     *
     * @return the current value of observedTseFlag
     */
    public Character getObservedTseFlag() {
        return observedTseFlag;
    }

    /**
     * Setter method for observedTseFlag.
     *
     * @param aObservedTseFlag the new value for observedTseFlag
     */
    public void setObservedTseFlag(Character aObservedTseFlag) {
        observedTseFlag = aObservedTseFlag;
    }

    /**
     * Access method for company.
     *
     * @return the current value of company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Setter method for company.
     *
     * @param aCompany the new value for company
     */
    public void setCompany(Company aCompany) {
        company = aCompany;
    }

    /**
     * Access method for perpDocuments.
     *
     * @return the current value of perpDocuments
     */
    public Set<PerpDocuments> getPerpDocuments() {
        return perpDocuments;
    }

    /**
     * Setter method for perpDocuments.
     *
     * @param aPerpDocuments the new value for perpDocuments
     */
    public void setPerpDocuments(Set<PerpDocuments> aPerpDocuments) {
        perpDocuments = aPerpDocuments;
    }

    /**
     * Access method for inspectionType.
     *
     * @return the current value of inspectionType
     */
    public InspectionType getInspectionType() {
        return inspectionType;
    }

    /**
     * Setter method for inspectionType.
     *
     * @param aInspectionType the new value for inspectionType
     */
    public void setInspectionType(InspectionType aInspectionType) {
        inspectionType = aInspectionType;
    }

    /**
     * Access method for inspRecordKeeping.
     *
     * @return the current value of inspRecordKeeping
     */
    public Set<InspRecordKeeping> getInspRecordKeeping() {
        return inspRecordKeeping;
    }

    /**
     * Setter method for inspRecordKeeping.
     *
     * @param aInspRecordKeeping the new value for inspRecordKeeping
     */
    public void setInspRecordKeeping(Set<InspRecordKeeping> aInspRecordKeeping) {
        inspRecordKeeping = aInspRecordKeeping;
    }

    /**
     * Access method for inspRegitemInfo.
     *
     * @return the current value of inspRegitemInfo
     */
    public Set<InspRegitemInfo> getInspRegitemInfo() {
        return inspRegitemInfo;
    }

    /**
     * Setter method for inspRegitemInfo.
     *
     * @param aInspRegitemInfo the new value for inspRegitemInfo
     */
    public void setInspRegitemInfo(Set<InspRegitemInfo> aInspRegitemInfo) {
        inspRegitemInfo = aInspRegitemInfo;
    }

    /**
     * Access method for inspViolations.
     *
     * @return the current value of inspViolations
     */
    public Set<InspViolations> getInspViolations() {
        return inspViolations;
    }

    /**
     * Setter method for inspViolations.
     *
     * @param aInspViolations the new value for inspViolations
     */
    public void setInspViolations(Set<InspViolations> aInspViolations) {
        inspViolations = aInspViolations;
    }

    /**
     * Access method for regitemReqAttachRel.
     *
     * @return the current value of regitemReqAttachRel
     */
    public Set<RegitemReqAttachRel> getRegitemReqAttachRel() {
        return regitemReqAttachRel;
    }

    /**
     * Setter method for regitemReqAttachRel.
     *
     * @param aRegitemReqAttachRel the new value for regitemReqAttachRel
     */
    public void setRegitemReqAttachRel(Set<RegitemReqAttachRel> aRegitemReqAttachRel) {
        regitemReqAttachRel = aRegitemReqAttachRel;
    }

    /**
     * Access method for inspectionSites.
     *
     * @return the current value of inspectionSites
     */
    public InspectionSites getInspectionSites() {
        return inspectionSites;
    }

    /**
     * Setter method for inspectionSites.
     *
     * @param aInspectionSites the new value for inspectionSites
     */
    public void setInspectionSites(InspectionSites aInspectionSites) {
        inspectionSites = aInspectionSites;
    }

    /**
     * Access method for inspectionStatus.
     *
     * @return the current value of inspectionStatus
     */
    public InspectionStatus getInspectionStatus() {
        return inspectionStatus;
    }

    /**
     * Setter method for inspectionStatus.
     *
     * @param aInspectionStatus the new value for inspectionStatus
     */
    public void setInspectionStatus(InspectionStatus aInspectionStatus) {
        inspectionStatus = aInspectionStatus;
    }

    /**
     * Access method for registrationItems.
     *
     * @return the current value of registrationItems
     */
    public RegistrationItems getRegistrationItems() {
        return registrationItems;
    }

    /**
     * Setter method for registrationItems.
     *
     * @param aRegistrationItems the new value for registrationItems
     */
    public void setRegistrationItems(RegistrationItems aRegistrationItems) {
        registrationItems = aRegistrationItems;
    }

    /**
     * Access method for users2.
     *
     * @return the current value of users2
     */
    public Users getUsers2() {
        return users2;
    }

    /**
     * Setter method for users2.
     *
     * @param aUsers2 the new value for users2
     */
    public void setUsers2(Users aUsers2) {
        users2 = aUsers2;
    }

    /**
     * Access method for users.
     *
     * @return the current value of users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Setter method for users.
     *
     * @param aUsers the new value for users
     */
    public void setUsers(Users aUsers) {
        users = aUsers;
    }

    /**
     * Compares the key for this instance with another Inspections.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Inspections and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Inspections)) {
            return false;
        }
        Inspections that = (Inspections) other;
        Object myInspectionUid = this.getInspectionUid();
        Object yourInspectionUid = that.getInspectionUid();
        if (myInspectionUid==null ? yourInspectionUid!=null : !myInspectionUid.equals(yourInspectionUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Inspections.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Inspections)) return false;
        return this.equalKeys(other) && ((Inspections)other).equalKeys(this);
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
        if (getInspectionUid() == null) {
            i = 0;
        } else {
            i = getInspectionUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[Inspections |");
        sb.append(" inspectionUid=").append(getInspectionUid());
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
        ret.put("inspectionUid", getInspectionUid());
        return ret;
    }

}
