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

@Entity(name="regtypes_sectitles_rel")
public class RegtypesSectitlesRel implements Serializable {

    /** Primary key. */
    protected static final String PK = "rtstRelUid";

    @Id
    @Column(name="RTSTRel_UID", unique=true, nullable=false, precision=10)
    private Integer rtstRelUid;
    @Column(name="Section_Sort", precision=10)
    private Integer sectionSort;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="OpConSecTitle_UID", nullable=false)
    private OpconSectionTitles opconSectionTitles;
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItemType_UID", nullable=false)
    private RegitemTypes regitemTypes;
    @OneToMany(mappedBy="regtypesSectitlesRel")
    private Set<OpconAssociation> opconAssociation;

    /** Default constructor. */
    public RegtypesSectitlesRel() {
        super();
    }

    /**
     * Access method for rtstRelUid.
     *
     * @return the current value of rtstRelUid
     */
    public Integer getRtstRelUid() {
        return rtstRelUid;
    }

    /**
     * Setter method for rtstRelUid.
     *
     * @param aRtstRelUid the new value for rtstRelUid
     */
    public void setRtstRelUid(Integer aRtstRelUid) {
        rtstRelUid = aRtstRelUid;
    }

    /**
     * Access method for sectionSort.
     *
     * @return the current value of sectionSort
     */
    public Integer getSectionSort() {
        return sectionSort;
    }

    /**
     * Setter method for sectionSort.
     *
     * @param aSectionSort the new value for sectionSort
     */
    public void setSectionSort(Integer aSectionSort) {
        sectionSort = aSectionSort;
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
     * Access method for opconSectionTitles.
     *
     * @return the current value of opconSectionTitles
     */
    public OpconSectionTitles getOpconSectionTitles() {
        return opconSectionTitles;
    }

    /**
     * Setter method for opconSectionTitles.
     *
     * @param aOpconSectionTitles the new value for opconSectionTitles
     */
    public void setOpconSectionTitles(OpconSectionTitles aOpconSectionTitles) {
        opconSectionTitles = aOpconSectionTitles;
    }

    /**
     * Access method for regitemTypes.
     *
     * @return the current value of regitemTypes
     */
    public RegitemTypes getRegitemTypes() {
        return regitemTypes;
    }

    /**
     * Setter method for regitemTypes.
     *
     * @param aRegitemTypes the new value for regitemTypes
     */
    public void setRegitemTypes(RegitemTypes aRegitemTypes) {
        regitemTypes = aRegitemTypes;
    }

    /**
     * Access method for opconAssociation.
     *
     * @return the current value of opconAssociation
     */
    public Set<OpconAssociation> getOpconAssociation() {
        return opconAssociation;
    }

    /**
     * Setter method for opconAssociation.
     *
     * @param aOpconAssociation the new value for opconAssociation
     */
    public void setOpconAssociation(Set<OpconAssociation> aOpconAssociation) {
        opconAssociation = aOpconAssociation;
    }

    /**
     * Compares the key for this instance with another RegtypesSectitlesRel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RegtypesSectitlesRel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RegtypesSectitlesRel)) {
            return false;
        }
        RegtypesSectitlesRel that = (RegtypesSectitlesRel) other;
        Object myRtstRelUid = this.getRtstRelUid();
        Object yourRtstRelUid = that.getRtstRelUid();
        if (myRtstRelUid==null ? yourRtstRelUid!=null : !myRtstRelUid.equals(yourRtstRelUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RegtypesSectitlesRel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RegtypesSectitlesRel)) return false;
        return this.equalKeys(other) && ((RegtypesSectitlesRel)other).equalKeys(this);
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
        if (getRtstRelUid() == null) {
            i = 0;
        } else {
            i = getRtstRelUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[RegtypesSectitlesRel |");
        sb.append(" rtstRelUid=").append(getRtstRelUid());
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
        ret.put("rtstRelUid", getRtstRelUid());
        return ret;
    }

}
