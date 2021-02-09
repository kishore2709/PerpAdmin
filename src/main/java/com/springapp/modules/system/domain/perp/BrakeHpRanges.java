// Generated with g9.

package com.springapp.modules.system.domain.perp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@Entity(name="brake_hp_ranges")
public class BrakeHpRanges implements Serializable {

    /** Primary key. */
    protected static final String PK = "uid";

    @Id
    @Column(name="UID", unique=true, nullable=false, precision=10)
    private Integer uid;
    @Column(name="Display", nullable=false, length=45)
    private String display;
    @Column(name="Start_BHP", precision=10)
    private Integer startBhp;
    @Column(name="End_BHP", precision=10)
    private Integer endBhp;
    @Column(name="Start_KW", precision=10)
    private Integer startKw;
    @Column(name="End_KW", precision=10)
    private Integer endKw;
    @Column(name="Identifier", nullable=false, length=45)
    private String identifier;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Date createModifiedDate;
    @OneToMany(mappedBy="brakeHpRanges")
    private Set<RegitemDetails> regitemDetails;
    @OneToMany(mappedBy="brakeHpRanges")
    private Set<EngineTierLookup> engineTierLookup;

    /** Default constructor. */
    public BrakeHpRanges() {
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
     * Access method for display.
     *
     * @return the current value of display
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Setter method for display.
     *
     * @param aDisplay the new value for display
     */
    public void setDisplay(String aDisplay) {
        display = aDisplay;
    }

    /**
     * Access method for startBhp.
     *
     * @return the current value of startBhp
     */
    public Integer getStartBhp() {
        return startBhp;
    }

    /**
     * Setter method for startBhp.
     *
     * @param aStartBhp the new value for startBhp
     */
    public void setStartBhp(Integer aStartBhp) {
        startBhp = aStartBhp;
    }

    /**
     * Access method for endBhp.
     *
     * @return the current value of endBhp
     */
    public Integer getEndBhp() {
        return endBhp;
    }

    /**
     * Setter method for endBhp.
     *
     * @param aEndBhp the new value for endBhp
     */
    public void setEndBhp(Integer aEndBhp) {
        endBhp = aEndBhp;
    }

    /**
     * Access method for startKw.
     *
     * @return the current value of startKw
     */
    public Integer getStartKw() {
        return startKw;
    }

    /**
     * Setter method for startKw.
     *
     * @param aStartKw the new value for startKw
     */
    public void setStartKw(Integer aStartKw) {
        startKw = aStartKw;
    }

    /**
     * Access method for endKw.
     *
     * @return the current value of endKw
     */
    public Integer getEndKw() {
        return endKw;
    }

    /**
     * Setter method for endKw.
     *
     * @param aEndKw the new value for endKw
     */
    public void setEndKw(Integer aEndKw) {
        endKw = aEndKw;
    }

    /**
     * Access method for identifier.
     *
     * @return the current value of identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Setter method for identifier.
     *
     * @param aIdentifier the new value for identifier
     */
    public void setIdentifier(String aIdentifier) {
        identifier = aIdentifier;
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
     * Access method for regitemDetails.
     *
     * @return the current value of regitemDetails
     */
    public Set<RegitemDetails> getRegitemDetails() {
        return regitemDetails;
    }

    /**
     * Setter method for regitemDetails.
     *
     * @param aRegitemDetails the new value for regitemDetails
     */
    public void setRegitemDetails(Set<RegitemDetails> aRegitemDetails) {
        regitemDetails = aRegitemDetails;
    }

    /**
     * Access method for engineTierLookup.
     *
     * @return the current value of engineTierLookup
     */
    public Set<EngineTierLookup> getEngineTierLookup() {
        return engineTierLookup;
    }

    /**
     * Setter method for engineTierLookup.
     *
     * @param aEngineTierLookup the new value for engineTierLookup
     */
    public void setEngineTierLookup(Set<EngineTierLookup> aEngineTierLookup) {
        engineTierLookup = aEngineTierLookup;
    }

    /**
     * Compares the key for this instance with another BrakeHpRanges.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BrakeHpRanges and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BrakeHpRanges)) {
            return false;
        }
        BrakeHpRanges that = (BrakeHpRanges) other;
        Object myUid = this.getUid();
        Object yourUid = that.getUid();
        if (myUid==null ? yourUid!=null : !myUid.equals(yourUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BrakeHpRanges.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BrakeHpRanges)) return false;
        return this.equalKeys(other) && ((BrakeHpRanges)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[BrakeHpRanges |");
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
