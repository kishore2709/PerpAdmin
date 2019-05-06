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

@Entity(name="perp_annual_report_items")
public class PerpAnnualReportItems implements Serializable {

    /** Primary key. */
    protected static final String PK = "uid";

    @Id
    @Column(name="UID", unique=true, nullable=false, precision=10)
    private Integer uid;
    @Column(name="Certificate_No", nullable=false, precision=10)
    private Integer certificateNo;
    @Column(name="Serial_No", length=30)
    private String serialNo;
    @Column(name="Sub_Type", length=100)
    private String subType;
    @Column(name="Status", length=45)
    private String status;
    @Column(name="Throughput_Rating_Units", length=45)
    private String throughputRatingUnits;
    @Column(name="Expiration_Date")
    private Timestamp expirationDate;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne
    @JoinColumn(name="District_UID")
    private DistrictCodes districtCodes;
    @ManyToOne(optional=false)
    @JoinColumn(name="Perp_Annual_Report_UID", nullable=false)
    private PerpAnnualReports perpAnnualReports;
    @OneToMany(mappedBy="perpAnnualReportItems")
    private Set<PerpAnnualReportItemDetails> perpAnnualReportItemDetails;
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItem_UID", nullable=false)
    private RegistrationItems registrationItems;

    /** Default constructor. */
    public PerpAnnualReportItems() {
        super();
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
     * Access method for subType.
     *
     * @return the current value of subType
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Setter method for subType.
     *
     * @param aSubType the new value for subType
     */
    public void setSubType(String aSubType) {
        subType = aSubType;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(String aStatus) {
        status = aStatus;
    }

    /**
     * Access method for throughputRatingUnits.
     *
     * @return the current value of throughputRatingUnits
     */
    public String getThroughputRatingUnits() {
        return throughputRatingUnits;
    }

    /**
     * Setter method for throughputRatingUnits.
     *
     * @param aThroughputRatingUnits the new value for throughputRatingUnits
     */
    public void setThroughputRatingUnits(String aThroughputRatingUnits) {
        throughputRatingUnits = aThroughputRatingUnits;
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
     * Access method for perpAnnualReports.
     *
     * @return the current value of perpAnnualReports
     */
    public PerpAnnualReports getPerpAnnualReports() {
        return perpAnnualReports;
    }

    /**
     * Setter method for perpAnnualReports.
     *
     * @param aPerpAnnualReports the new value for perpAnnualReports
     */
    public void setPerpAnnualReports(PerpAnnualReports aPerpAnnualReports) {
        perpAnnualReports = aPerpAnnualReports;
    }

    /**
     * Access method for perpAnnualReportItemDetails.
     *
     * @return the current value of perpAnnualReportItemDetails
     */
    public Set<PerpAnnualReportItemDetails> getPerpAnnualReportItemDetails() {
        return perpAnnualReportItemDetails;
    }

    /**
     * Setter method for perpAnnualReportItemDetails.
     *
     * @param aPerpAnnualReportItemDetails the new value for perpAnnualReportItemDetails
     */
    public void setPerpAnnualReportItemDetails(Set<PerpAnnualReportItemDetails> aPerpAnnualReportItemDetails) {
        perpAnnualReportItemDetails = aPerpAnnualReportItemDetails;
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
     * Compares the key for this instance with another PerpAnnualReportItems.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpAnnualReportItems and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpAnnualReportItems)) {
            return false;
        }
        PerpAnnualReportItems that = (PerpAnnualReportItems) other;
        Object myUid = this.getUid();
        Object yourUid = that.getUid();
        if (myUid==null ? yourUid!=null : !myUid.equals(yourUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpAnnualReportItems.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpAnnualReportItems)) return false;
        return this.equalKeys(other) && ((PerpAnnualReportItems)other).equalKeys(this);
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
        if (getUid() == null) {
            i = 0;
        } else {
            i = getUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[PerpAnnualReportItems |");
        sb.append(" uid=").append(getUid());
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
        ret.put("uid", getUid());
        return ret;
    }

}
