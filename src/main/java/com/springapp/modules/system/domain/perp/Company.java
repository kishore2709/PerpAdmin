// Generated with g9.

package com.springapp.modules.system.domain.perp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name="company", indexes={@Index(name="company_OON_IX", columnList="OON", unique=true)})
public class Company implements Serializable {

    /** Primary key. */
    protected static final String PK = "companyUid";

    @Id
    @Column(name="Company_UID", unique=true, nullable=false, precision=10)
    private Integer companyUid;
    @Column(name="Company_Name", length=100)
    private String companyName;
    @Column(name="OON", unique=true, length=25)
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
    @Column(name="FleetCalc_Flag", length=1)
    private Character fleetCalcFlag;
    @Column(name="Confidential_Flag", length=1)
    private Character confidentialFlag;
    @Column(name="PEPS_Flag", nullable=false, length=1)
    private Character pepsFlag;
    @Column(name="Military_Flag", nullable=false, length=1)
    private Character militaryFlag;
    @Column(name="Rental_Co_Flag", nullable=false, length=1)
    private Character rentalCoFlag;
    @Column(name="Perp_Equip_Duration", precision=10)
    private Integer perpEquipDuration;
    @Column(name="MilitaryDistrict_UID", precision=10)
    private Integer militaryDistrictUid;
    @Column(name="AGSource_Flag", nullable=false, length=1)
    private Character agSourceFlag;
    @Column(name="Public_Flag", nullable=false, length=1)
    private Character publicFlag;
    @OneToMany(mappedBy="company2")
    private Set<CompanyRelations> companyRelations2;
    @OneToMany(mappedBy="company")
    private Set<Address> address;
    @OneToMany(mappedBy="company")
    private Set<AppTransactions> appTransactions;
    @OneToMany(mappedBy="company")
    private Set<CompanyAka> companyAka;
    @OneToMany(mappedBy="company")
    private Set<CompanyLicenses> companyLicenses;
    @OneToMany(mappedBy="company")
    private Set<CompanyPrograms> companyPrograms;
    @OneToMany(mappedBy="company")
    private Set<CompanyRelations> companyRelations;
    @OneToMany(mappedBy="company")
    private Set<Contact> contact;
    @OneToMany(mappedBy="company")
    private Set<FleetEmission> fleetEmission;
    @ManyToOne
    @JoinColumn(name="Fleetsize_Lookup_UID")
    private FleetsizeLookup fleetsizeLookup;
    @OneToMany(mappedBy="company")
    private Set<Inspections> inspections;
    @OneToMany(mappedBy="company")
    private Set<Invoices> invoices;
    @OneToMany(mappedBy="company")
    private Set<Ledger> ledger;
    @OneToMany(mappedBy="company")
    private Set<NoteComplaints> noteComplaints;
    @OneToMany(mappedBy="company")
    private Set<OperationalLimits> operationalLimits;
    @OneToMany(mappedBy="company")
    private Set<PerpAnnualReports> perpAnnualReports;
    @OneToMany(mappedBy="company")
    private Set<PerpApplications> perpApplications;
    @OneToMany(mappedBy="company")
    private Set<PerpDocuments> perpDocuments;
    @OneToMany(mappedBy="company")
    private Set<Phone> phone;
    @OneToMany(mappedBy="company")
    private Set<RegistrationItems> registrationItems;
    @OneToMany(mappedBy="company")
    private Set<Terminal> terminal;
    @OneToMany(mappedBy="company")
    private Set<Users> users;
    @OneToMany(mappedBy="company")
    private Set<Vehicle> vehicle;
    @ManyToOne
    @JoinColumn(name="DistrictCode_UID")
    private DistrictCodes districtCodes;

    /** Default constructor. */
    public Company() {
        super();
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
     * Access method for fleetCalcFlag.
     *
     * @return the current value of fleetCalcFlag
     */
    public Character getFleetCalcFlag() {
        return fleetCalcFlag;
    }

    /**
     * Setter method for fleetCalcFlag.
     *
     * @param aFleetCalcFlag the new value for fleetCalcFlag
     */
    public void setFleetCalcFlag(Character aFleetCalcFlag) {
        fleetCalcFlag = aFleetCalcFlag;
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
     * Access method for companyRelations2.
     *
     * @return the current value of companyRelations2
     */
    public Set<CompanyRelations> getCompanyRelations2() {
        return companyRelations2;
    }

    /**
     * Setter method for companyRelations2.
     *
     * @param aCompanyRelations2 the new value for companyRelations2
     */
    public void setCompanyRelations2(Set<CompanyRelations> aCompanyRelations2) {
        companyRelations2 = aCompanyRelations2;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public Set<Address> getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(Set<Address> aAddress) {
        address = aAddress;
    }

    /**
     * Access method for appTransactions.
     *
     * @return the current value of appTransactions
     */
    public Set<AppTransactions> getAppTransactions() {
        return appTransactions;
    }

    /**
     * Setter method for appTransactions.
     *
     * @param aAppTransactions the new value for appTransactions
     */
    public void setAppTransactions(Set<AppTransactions> aAppTransactions) {
        appTransactions = aAppTransactions;
    }

    /**
     * Access method for companyAka.
     *
     * @return the current value of companyAka
     */
    public Set<CompanyAka> getCompanyAka() {
        return companyAka;
    }

    /**
     * Setter method for companyAka.
     *
     * @param aCompanyAka the new value for companyAka
     */
    public void setCompanyAka(Set<CompanyAka> aCompanyAka) {
        companyAka = aCompanyAka;
    }

    /**
     * Access method for companyLicenses.
     *
     * @return the current value of companyLicenses
     */
    public Set<CompanyLicenses> getCompanyLicenses() {
        return companyLicenses;
    }

    /**
     * Setter method for companyLicenses.
     *
     * @param aCompanyLicenses the new value for companyLicenses
     */
    public void setCompanyLicenses(Set<CompanyLicenses> aCompanyLicenses) {
        companyLicenses = aCompanyLicenses;
    }

    /**
     * Access method for companyPrograms.
     *
     * @return the current value of companyPrograms
     */
    public Set<CompanyPrograms> getCompanyPrograms() {
        return companyPrograms;
    }

    /**
     * Setter method for companyPrograms.
     *
     * @param aCompanyPrograms the new value for companyPrograms
     */
    public void setCompanyPrograms(Set<CompanyPrograms> aCompanyPrograms) {
        companyPrograms = aCompanyPrograms;
    }

    /**
     * Access method for companyRelations.
     *
     * @return the current value of companyRelations
     */
    public Set<CompanyRelations> getCompanyRelations() {
        return companyRelations;
    }

    /**
     * Setter method for companyRelations.
     *
     * @param aCompanyRelations the new value for companyRelations
     */
    public void setCompanyRelations(Set<CompanyRelations> aCompanyRelations) {
        companyRelations = aCompanyRelations;
    }

    /**
     * Access method for contact.
     *
     * @return the current value of contact
     */
    public Set<Contact> getContact() {
        return contact;
    }

    /**
     * Setter method for contact.
     *
     * @param aContact the new value for contact
     */
    public void setContact(Set<Contact> aContact) {
        contact = aContact;
    }

    /**
     * Access method for fleetEmission.
     *
     * @return the current value of fleetEmission
     */
    public Set<FleetEmission> getFleetEmission() {
        return fleetEmission;
    }

    /**
     * Setter method for fleetEmission.
     *
     * @param aFleetEmission the new value for fleetEmission
     */
    public void setFleetEmission(Set<FleetEmission> aFleetEmission) {
        fleetEmission = aFleetEmission;
    }

    /**
     * Access method for fleetsizeLookup.
     *
     * @return the current value of fleetsizeLookup
     */
    public FleetsizeLookup getFleetsizeLookup() {
        return fleetsizeLookup;
    }

    /**
     * Setter method for fleetsizeLookup.
     *
     * @param aFleetsizeLookup the new value for fleetsizeLookup
     */
    public void setFleetsizeLookup(FleetsizeLookup aFleetsizeLookup) {
        fleetsizeLookup = aFleetsizeLookup;
    }

    /**
     * Access method for inspections.
     *
     * @return the current value of inspections
     */
    public Set<Inspections> getInspections() {
        return inspections;
    }

    /**
     * Setter method for inspections.
     *
     * @param aInspections the new value for inspections
     */
    public void setInspections(Set<Inspections> aInspections) {
        inspections = aInspections;
    }

    /**
     * Access method for invoices.
     *
     * @return the current value of invoices
     */
    public Set<Invoices> getInvoices() {
        return invoices;
    }

    /**
     * Setter method for invoices.
     *
     * @param aInvoices the new value for invoices
     */
    public void setInvoices(Set<Invoices> aInvoices) {
        invoices = aInvoices;
    }

    /**
     * Access method for ledger.
     *
     * @return the current value of ledger
     */
    public Set<Ledger> getLedger() {
        return ledger;
    }

    /**
     * Setter method for ledger.
     *
     * @param aLedger the new value for ledger
     */
    public void setLedger(Set<Ledger> aLedger) {
        ledger = aLedger;
    }

    /**
     * Access method for noteComplaints.
     *
     * @return the current value of noteComplaints
     */
    public Set<NoteComplaints> getNoteComplaints() {
        return noteComplaints;
    }

    /**
     * Setter method for noteComplaints.
     *
     * @param aNoteComplaints the new value for noteComplaints
     */
    public void setNoteComplaints(Set<NoteComplaints> aNoteComplaints) {
        noteComplaints = aNoteComplaints;
    }

    /**
     * Access method for operationalLimits.
     *
     * @return the current value of operationalLimits
     */
    public Set<OperationalLimits> getOperationalLimits() {
        return operationalLimits;
    }

    /**
     * Setter method for operationalLimits.
     *
     * @param aOperationalLimits the new value for operationalLimits
     */
    public void setOperationalLimits(Set<OperationalLimits> aOperationalLimits) {
        operationalLimits = aOperationalLimits;
    }

    /**
     * Access method for perpAnnualReports.
     *
     * @return the current value of perpAnnualReports
     */
    public Set<PerpAnnualReports> getPerpAnnualReports() {
        return perpAnnualReports;
    }

    /**
     * Setter method for perpAnnualReports.
     *
     * @param aPerpAnnualReports the new value for perpAnnualReports
     */
    public void setPerpAnnualReports(Set<PerpAnnualReports> aPerpAnnualReports) {
        perpAnnualReports = aPerpAnnualReports;
    }

    /**
     * Access method for perpApplications.
     *
     * @return the current value of perpApplications
     */
    public Set<PerpApplications> getPerpApplications() {
        return perpApplications;
    }

    /**
     * Setter method for perpApplications.
     *
     * @param aPerpApplications the new value for perpApplications
     */
    public void setPerpApplications(Set<PerpApplications> aPerpApplications) {
        perpApplications = aPerpApplications;
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
     * Access method for phone.
     *
     * @return the current value of phone
     */
    public Set<Phone> getPhone() {
        return phone;
    }

    /**
     * Setter method for phone.
     *
     * @param aPhone the new value for phone
     */
    public void setPhone(Set<Phone> aPhone) {
        phone = aPhone;
    }

    /**
     * Access method for registrationItems.
     *
     * @return the current value of registrationItems
     */
    public Set<RegistrationItems> getRegistrationItems() {
        return registrationItems;
    }

    /**
     * Setter method for registrationItems.
     *
     * @param aRegistrationItems the new value for registrationItems
     */
    public void setRegistrationItems(Set<RegistrationItems> aRegistrationItems) {
        registrationItems = aRegistrationItems;
    }

    /**
     * Access method for terminal.
     *
     * @return the current value of terminal
     */
    public Set<Terminal> getTerminal() {
        return terminal;
    }

    /**
     * Setter method for terminal.
     *
     * @param aTerminal the new value for terminal
     */
    public void setTerminal(Set<Terminal> aTerminal) {
        terminal = aTerminal;
    }

    /**
     * Access method for users.
     *
     * @return the current value of users
     */
    public Set<Users> getUsers() {
        return users;
    }

    /**
     * Setter method for users.
     *
     * @param aUsers the new value for users
     */
    public void setUsers(Set<Users> aUsers) {
        users = aUsers;
    }

    /**
     * Access method for vehicle.
     *
     * @return the current value of vehicle
     */
    public Set<Vehicle> getVehicle() {
        return vehicle;
    }

    /**
     * Setter method for vehicle.
     *
     * @param aVehicle the new value for vehicle
     */
    public void setVehicle(Set<Vehicle> aVehicle) {
        vehicle = aVehicle;
    }

    /**
     * Access method for districtCodes.
     *
     * @return the current value of districtCodes
     */
    public DistrictCodes getDistrictCodes() {
        return districtCodes;
    }

    /**
     * Setter method for districtCodes.
     *
     * @param aDistrictCodes the new value for districtCodes
     */
    public void setDistrictCodes(DistrictCodes aDistrictCodes) {
        districtCodes = aDistrictCodes;
    }

    /**
     * Compares the key for this instance with another Company.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Company and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Company)) {
            return false;
        }
        Company that = (Company) other;
        Object myCompanyUid = this.getCompanyUid();
        Object yourCompanyUid = that.getCompanyUid();
        if (myCompanyUid==null ? yourCompanyUid!=null : !myCompanyUid.equals(yourCompanyUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Company.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Company)) return false;
        return this.equalKeys(other) && ((Company)other).equalKeys(this);
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
        if (getCompanyUid() == null) {
            i = 0;
        } else {
            i = getCompanyUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[Company |");
        sb.append(" companyUid=").append(getCompanyUid());
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
        ret.put("companyUid", getCompanyUid());
        return ret;
    }

}
