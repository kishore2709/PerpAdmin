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
import javax.persistence.OneToMany;

@Entity(name="app_regitem_actions")
public class AppRegitemActions implements Serializable {

    /** Primary key. */
    protected static final String PK = "uid";

    @Id
    @Column(name="UID", unique=true, nullable=false, precision=10)
    private Integer uid;
    @Column(name="Name", nullable=false, length=45)
    private String name;
    @Column(name="Display", nullable=false, length=45)
    private String display;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Identifier", nullable=false, length=45)
    private String identifier;
    @Column(name="Request_Flag", nullable=false, length=1)
    private Character requestFlag;
    @Column(name="ARBOnly_Flag", nullable=false, length=1)
    private Character arbOnlyFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="appRegitemActions")
    private Set<DocTemplateActionRelation> docTemplateActionRelation;
    @OneToMany(mappedBy="appRegitemActions")
    private Set<PerpdocumentActions> perpdocumentActions;
    @OneToMany(mappedBy="appRegitemActions")
    private Set<PerpFeeActionRel> perpFeeActionRel;
    @OneToMany(mappedBy="appRegitemActions2")
    private Set<ApptransRegRel> apptransRegRel2;
    @OneToMany(mappedBy="appRegitemActions")
    private Set<ApptransRegRel> apptransRegRel;
    @OneToMany(mappedBy="appRegitemActions2")
    private Set<ActionrequestDecisionRel> actionrequestDecisionRel2;
    @OneToMany(mappedBy="appRegitemActions")
    private Set<ActionrequestDecisionRel> actionrequestDecisionRel;

    /** Default constructor. */
    public AppRegitemActions() {
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
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
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
     * Access method for requestFlag.
     *
     * @return the current value of requestFlag
     */
    public Character getRequestFlag() {
        return requestFlag;
    }

    /**
     * Setter method for requestFlag.
     *
     * @param aRequestFlag the new value for requestFlag
     */
    public void setRequestFlag(Character aRequestFlag) {
        requestFlag = aRequestFlag;
    }

    /**
     * Access method for arbOnlyFlag.
     *
     * @return the current value of arbOnlyFlag
     */
    public Character getArbOnlyFlag() {
        return arbOnlyFlag;
    }

    /**
     * Setter method for arbOnlyFlag.
     *
     * @param aArbOnlyFlag the new value for arbOnlyFlag
     */
    public void setArbOnlyFlag(Character aArbOnlyFlag) {
        arbOnlyFlag = aArbOnlyFlag;
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
     * Access method for docTemplateActionRelation.
     *
     * @return the current value of docTemplateActionRelation
     */
    public Set<DocTemplateActionRelation> getDocTemplateActionRelation() {
        return docTemplateActionRelation;
    }

    /**
     * Setter method for docTemplateActionRelation.
     *
     * @param aDocTemplateActionRelation the new value for docTemplateActionRelation
     */
    public void setDocTemplateActionRelation(Set<DocTemplateActionRelation> aDocTemplateActionRelation) {
        docTemplateActionRelation = aDocTemplateActionRelation;
    }

    /**
     * Access method for perpdocumentActions.
     *
     * @return the current value of perpdocumentActions
     */
    public Set<PerpdocumentActions> getPerpdocumentActions() {
        return perpdocumentActions;
    }

    /**
     * Setter method for perpdocumentActions.
     *
     * @param aPerpdocumentActions the new value for perpdocumentActions
     */
    public void setPerpdocumentActions(Set<PerpdocumentActions> aPerpdocumentActions) {
        perpdocumentActions = aPerpdocumentActions;
    }

    /**
     * Access method for perpFeeActionRel.
     *
     * @return the current value of perpFeeActionRel
     */
    public Set<PerpFeeActionRel> getPerpFeeActionRel() {
        return perpFeeActionRel;
    }

    /**
     * Setter method for perpFeeActionRel.
     *
     * @param aPerpFeeActionRel the new value for perpFeeActionRel
     */
    public void setPerpFeeActionRel(Set<PerpFeeActionRel> aPerpFeeActionRel) {
        perpFeeActionRel = aPerpFeeActionRel;
    }

    /**
     * Access method for apptransRegRel2.
     *
     * @return the current value of apptransRegRel2
     */
    public Set<ApptransRegRel> getApptransRegRel2() {
        return apptransRegRel2;
    }

    /**
     * Setter method for apptransRegRel2.
     *
     * @param aApptransRegRel2 the new value for apptransRegRel2
     */
    public void setApptransRegRel2(Set<ApptransRegRel> aApptransRegRel2) {
        apptransRegRel2 = aApptransRegRel2;
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
     * Access method for actionrequestDecisionRel2.
     *
     * @return the current value of actionrequestDecisionRel2
     */
    public Set<ActionrequestDecisionRel> getActionrequestDecisionRel2() {
        return actionrequestDecisionRel2;
    }

    /**
     * Setter method for actionrequestDecisionRel2.
     *
     * @param aActionrequestDecisionRel2 the new value for actionrequestDecisionRel2
     */
    public void setActionrequestDecisionRel2(Set<ActionrequestDecisionRel> aActionrequestDecisionRel2) {
        actionrequestDecisionRel2 = aActionrequestDecisionRel2;
    }

    /**
     * Access method for actionrequestDecisionRel.
     *
     * @return the current value of actionrequestDecisionRel
     */
    public Set<ActionrequestDecisionRel> getActionrequestDecisionRel() {
        return actionrequestDecisionRel;
    }

    /**
     * Setter method for actionrequestDecisionRel.
     *
     * @param aActionrequestDecisionRel the new value for actionrequestDecisionRel
     */
    public void setActionrequestDecisionRel(Set<ActionrequestDecisionRel> aActionrequestDecisionRel) {
        actionrequestDecisionRel = aActionrequestDecisionRel;
    }

    /**
     * Compares the key for this instance with another AppRegitemActions.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AppRegitemActions and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AppRegitemActions)) {
            return false;
        }
        AppRegitemActions that = (AppRegitemActions) other;
        Object myUid = this.getUid();
        Object yourUid = that.getUid();
        if (myUid==null ? yourUid!=null : !myUid.equals(yourUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AppRegitemActions.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AppRegitemActions)) return false;
        return this.equalKeys(other) && ((AppRegitemActions)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[AppRegitemActions |");
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
