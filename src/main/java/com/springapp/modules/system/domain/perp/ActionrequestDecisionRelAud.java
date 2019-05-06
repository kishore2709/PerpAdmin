// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="actionrequest_decision_rel_aud")
public class ActionrequestDecisionRelAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "ardrAudUid";

    @Id
    @Column(name="ARDRAud_UID", unique=true, nullable=false, precision=10)
    private Integer ardrAudUid;
    @Column(name="RequestDecisionRel_UID", nullable=false, precision=10)
    private Integer requestDecisionRelUid;
    @Column(name="RequestAction_UID", nullable=false, precision=10)
    private Integer requestActionUid;
    @Column(name="DecisionAction_UID", nullable=false, precision=10)
    private Integer decisionActionUid;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public ActionrequestDecisionRelAud() {
        super();
    }

    /**
     * Access method for ardrAudUid.
     *
     * @return the current value of ardrAudUid
     */
    public Integer getArdrAudUid() {
        return ardrAudUid;
    }

    /**
     * Setter method for ardrAudUid.
     *
     * @param aArdrAudUid the new value for ardrAudUid
     */
    public void setArdrAudUid(Integer aArdrAudUid) {
        ardrAudUid = aArdrAudUid;
    }

    /**
     * Access method for requestDecisionRelUid.
     *
     * @return the current value of requestDecisionRelUid
     */
    public Integer getRequestDecisionRelUid() {
        return requestDecisionRelUid;
    }

    /**
     * Setter method for requestDecisionRelUid.
     *
     * @param aRequestDecisionRelUid the new value for requestDecisionRelUid
     */
    public void setRequestDecisionRelUid(Integer aRequestDecisionRelUid) {
        requestDecisionRelUid = aRequestDecisionRelUid;
    }

    /**
     * Access method for requestActionUid.
     *
     * @return the current value of requestActionUid
     */
    public Integer getRequestActionUid() {
        return requestActionUid;
    }

    /**
     * Setter method for requestActionUid.
     *
     * @param aRequestActionUid the new value for requestActionUid
     */
    public void setRequestActionUid(Integer aRequestActionUid) {
        requestActionUid = aRequestActionUid;
    }

    /**
     * Access method for decisionActionUid.
     *
     * @return the current value of decisionActionUid
     */
    public Integer getDecisionActionUid() {
        return decisionActionUid;
    }

    /**
     * Setter method for decisionActionUid.
     *
     * @param aDecisionActionUid the new value for decisionActionUid
     */
    public void setDecisionActionUid(Integer aDecisionActionUid) {
        decisionActionUid = aDecisionActionUid;
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
     * Compares the key for this instance with another ActionrequestDecisionRelAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ActionrequestDecisionRelAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ActionrequestDecisionRelAud)) {
            return false;
        }
        ActionrequestDecisionRelAud that = (ActionrequestDecisionRelAud) other;
        Object myArdrAudUid = this.getArdrAudUid();
        Object yourArdrAudUid = that.getArdrAudUid();
        if (myArdrAudUid==null ? yourArdrAudUid!=null : !myArdrAudUid.equals(yourArdrAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ActionrequestDecisionRelAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ActionrequestDecisionRelAud)) return false;
        return this.equalKeys(other) && ((ActionrequestDecisionRelAud)other).equalKeys(this);
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
        if (getArdrAudUid() == null) {
            i = 0;
        } else {
            i = getArdrAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[ActionrequestDecisionRelAud |");
        sb.append(" ardrAudUid=").append(getArdrAudUid());
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
        ret.put("ardrAudUid", getArdrAudUid());
        return ret;
    }

}
