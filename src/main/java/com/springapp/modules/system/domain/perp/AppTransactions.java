// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
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

@Entity(name="app_transactions")
public class AppTransactions implements Serializable {

    /** Primary key. */
    protected static final String PK = "appTransUid";

    @Id
    @Column(name="AppTrans_UID", unique=true, nullable=false, precision=10)
    private Integer appTransUid;
    @Column(name="App_Box_Number", precision=5)
    private Short appBoxNumber;
    @Column(name="Clock_Starts_Date")
    private Timestamp clockStartsDate;
    @Column(name="External_Flag", nullable=false, length=1)
    private Character externalFlag;
    @Column(name="OnBatch_Flag", nullable=false, length=1)
    private Character onBatchFlag;
    @Column(name="PrelimReviewed_Flag", nullable=false, length=1)
    private Character prelimReviewedFlag;
    @Column(name="Transaction_Amount", precision=10, scale=2)
    private BigDecimal transactionAmount;
    @Column(name="Close_Out_Date")
    private Timestamp closeOutDate;
    @Column(name="Request_Date")
    private Timestamp requestDate;
    @Column(name="Post_Mark_Date")
    private Timestamp postMarkDate;
    @Column(name="Transaction_Issuance_Date")
    private Date transactionIssuanceDate;
    @Column(name="Auto_Generate_Docs_Flag", nullable=false, length=1)
    private Character autoGenerateDocsFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="AppTransStatus_UID", nullable=false)
    private ApptransStatus apptransStatus;
    @OneToMany(mappedBy="appTransactions")
    private Set<AppTransAssociation> appTransAssociation;
    @OneToMany(mappedBy="appTransactions")
    private Set<ApptransRegRel> apptransRegRel;
    @OneToMany(mappedBy="appTransactions")
    private Set<Ledger> ledger;
    @OneToMany(mappedBy="appTransactions")
    private Set<NoteComplaints> noteComplaints;
    @OneToMany(mappedBy="appTransactions")
    private Set<PerpDocuments> perpDocuments;
    @ManyToOne(optional=false)
    @JoinColumn(name="AppTransType_UID", nullable=false)
    private ApptransTypes apptransTypes;
    @ManyToOne
    @JoinColumn(name="Company_UID")
    private Company company;
    @ManyToOne
    @JoinColumn(name="Consultant_Contact_UID")
    private Contact contact;

    /** Default constructor. */
    public AppTransactions() {
        super();
    }

    /**
     * Access method for appTransUid.
     *
     * @return the current value of appTransUid
     */
    public Integer getAppTransUid() {
        return appTransUid;
    }

    /**
     * Setter method for appTransUid.
     *
     * @param aAppTransUid the new value for appTransUid
     */
    public void setAppTransUid(Integer aAppTransUid) {
        appTransUid = aAppTransUid;
    }

    /**
     * Access method for appBoxNumber.
     *
     * @return the current value of appBoxNumber
     */
    public Short getAppBoxNumber() {
        return appBoxNumber;
    }

    /**
     * Setter method for appBoxNumber.
     *
     * @param aAppBoxNumber the new value for appBoxNumber
     */
    public void setAppBoxNumber(Short aAppBoxNumber) {
        appBoxNumber = aAppBoxNumber;
    }

    /**
     * Access method for clockStartsDate.
     *
     * @return the current value of clockStartsDate
     */
    public Timestamp getClockStartsDate() {
        return clockStartsDate;
    }

    /**
     * Setter method for clockStartsDate.
     *
     * @param aClockStartsDate the new value for clockStartsDate
     */
    public void setClockStartsDate(Timestamp aClockStartsDate) {
        clockStartsDate = aClockStartsDate;
    }

    /**
     * Access method for externalFlag.
     *
     * @return the current value of externalFlag
     */
    public Character getExternalFlag() {
        return externalFlag;
    }

    /**
     * Setter method for externalFlag.
     *
     * @param aExternalFlag the new value for externalFlag
     */
    public void setExternalFlag(Character aExternalFlag) {
        externalFlag = aExternalFlag;
    }

    /**
     * Access method for onBatchFlag.
     *
     * @return the current value of onBatchFlag
     */
    public Character getOnBatchFlag() {
        return onBatchFlag;
    }

    /**
     * Setter method for onBatchFlag.
     *
     * @param aOnBatchFlag the new value for onBatchFlag
     */
    public void setOnBatchFlag(Character aOnBatchFlag) {
        onBatchFlag = aOnBatchFlag;
    }

    /**
     * Access method for prelimReviewedFlag.
     *
     * @return the current value of prelimReviewedFlag
     */
    public Character getPrelimReviewedFlag() {
        return prelimReviewedFlag;
    }

    /**
     * Setter method for prelimReviewedFlag.
     *
     * @param aPrelimReviewedFlag the new value for prelimReviewedFlag
     */
    public void setPrelimReviewedFlag(Character aPrelimReviewedFlag) {
        prelimReviewedFlag = aPrelimReviewedFlag;
    }

    /**
     * Access method for transactionAmount.
     *
     * @return the current value of transactionAmount
     */
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Setter method for transactionAmount.
     *
     * @param aTransactionAmount the new value for transactionAmount
     */
    public void setTransactionAmount(BigDecimal aTransactionAmount) {
        transactionAmount = aTransactionAmount;
    }

    /**
     * Access method for closeOutDate.
     *
     * @return the current value of closeOutDate
     */
    public Timestamp getCloseOutDate() {
        return closeOutDate;
    }

    /**
     * Setter method for closeOutDate.
     *
     * @param aCloseOutDate the new value for closeOutDate
     */
    public void setCloseOutDate(Timestamp aCloseOutDate) {
        closeOutDate = aCloseOutDate;
    }

    /**
     * Access method for requestDate.
     *
     * @return the current value of requestDate
     */
    public Timestamp getRequestDate() {
        return requestDate;
    }

    /**
     * Setter method for requestDate.
     *
     * @param aRequestDate the new value for requestDate
     */
    public void setRequestDate(Timestamp aRequestDate) {
        requestDate = aRequestDate;
    }

    /**
     * Access method for postMarkDate.
     *
     * @return the current value of postMarkDate
     */
    public Timestamp getPostMarkDate() {
        return postMarkDate;
    }

    /**
     * Setter method for postMarkDate.
     *
     * @param aPostMarkDate the new value for postMarkDate
     */
    public void setPostMarkDate(Timestamp aPostMarkDate) {
        postMarkDate = aPostMarkDate;
    }

    /**
     * Access method for transactionIssuanceDate.
     *
     * @return the current value of transactionIssuanceDate
     */
    public Date getTransactionIssuanceDate() {
        return transactionIssuanceDate;
    }

    /**
     * Setter method for transactionIssuanceDate.
     *
     * @param aTransactionIssuanceDate the new value for transactionIssuanceDate
     */
    public void setTransactionIssuanceDate(Date aTransactionIssuanceDate) {
        transactionIssuanceDate = aTransactionIssuanceDate;
    }

    /**
     * Access method for autoGenerateDocsFlag.
     *
     * @return the current value of autoGenerateDocsFlag
     */
    public Character getAutoGenerateDocsFlag() {
        return autoGenerateDocsFlag;
    }

    /**
     * Setter method for autoGenerateDocsFlag.
     *
     * @param aAutoGenerateDocsFlag the new value for autoGenerateDocsFlag
     */
    public void setAutoGenerateDocsFlag(Character aAutoGenerateDocsFlag) {
        autoGenerateDocsFlag = aAutoGenerateDocsFlag;
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
     * Access method for apptransStatus.
     *
     * @return the current value of apptransStatus
     */
    public ApptransStatus getApptransStatus() {
        return apptransStatus;
    }

    /**
     * Setter method for apptransStatus.
     *
     * @param aApptransStatus the new value for apptransStatus
     */
    public void setApptransStatus(ApptransStatus aApptransStatus) {
        apptransStatus = aApptransStatus;
    }

    /**
     * Access method for appTransAssociation.
     *
     * @return the current value of appTransAssociation
     */
    public Set<AppTransAssociation> getAppTransAssociation() {
        return appTransAssociation;
    }

    /**
     * Setter method for appTransAssociation.
     *
     * @param aAppTransAssociation the new value for appTransAssociation
     */
    public void setAppTransAssociation(Set<AppTransAssociation> aAppTransAssociation) {
        appTransAssociation = aAppTransAssociation;
    }

    /**
     * Access method for apptransRegRel.
     *
     * @return the current value of apptransRegRel
     */
    public Set<ApptransRegRel> getApptransRegRel() {
        return apptransRegRel;
    }

    /**
     * Setter method for apptransRegRel.
     *
     * @param aApptransRegRel the new value for apptransRegRel
     */
    public void setApptransRegRel(Set<ApptransRegRel> aApptransRegRel) {
        apptransRegRel = aApptransRegRel;
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
     * Access method for apptransTypes.
     *
     * @return the current value of apptransTypes
     */
    public ApptransTypes getApptransTypes() {
        return apptransTypes;
    }

    /**
     * Setter method for apptransTypes.
     *
     * @param aApptransTypes the new value for apptransTypes
     */
    public void setApptransTypes(ApptransTypes aApptransTypes) {
        apptransTypes = aApptransTypes;
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
     * Access method for contact.
     *
     * @return the current value of contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Setter method for contact.
     *
     * @param aContact the new value for contact
     */
    public void setContact(Contact aContact) {
        contact = aContact;
    }

    /**
     * Compares the key for this instance with another AppTransactions.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AppTransactions and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AppTransactions)) {
            return false;
        }
        AppTransactions that = (AppTransactions) other;
        Object myAppTransUid = this.getAppTransUid();
        Object yourAppTransUid = that.getAppTransUid();
        if (myAppTransUid==null ? yourAppTransUid!=null : !myAppTransUid.equals(yourAppTransUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AppTransactions.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AppTransactions)) return false;
        return this.equalKeys(other) && ((AppTransactions)other).equalKeys(this);
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
        if (getAppTransUid() == null) {
            i = 0;
        } else {
            i = getAppTransUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[AppTransactions |");
        sb.append(" appTransUid=").append(getAppTransUid());
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
        ret.put("appTransUid", getAppTransUid());
        return ret;
    }

}
