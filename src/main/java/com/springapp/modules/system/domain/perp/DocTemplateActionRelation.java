// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="doc_template_action_relation")
public class DocTemplateActionRelation implements Serializable {

    /** Primary key. */
    protected static final String PK = "DocTemplateActionRelationPrimary";

    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Date createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="DecisionAction_UID", nullable=false)
    private AppRegitemActions appRegitemActions;
    @Id
    @ManyToOne(optional=false)
    @JoinColumn(name="DocTemplate_UID", nullable=false)
    private DocTemplateLookup docTemplateLookup;

    /** Default constructor. */
    public DocTemplateActionRelation() {
        super();
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
     * Access method for appRegitemActions.
     *
     * @return the current value of appRegitemActions
     */
    public AppRegitemActions getAppRegitemActions() {
        return appRegitemActions;
    }

    /**
     * Setter method for appRegitemActions.
     *
     * @param aAppRegitemActions the new value for appRegitemActions
     */
    public void setAppRegitemActions(AppRegitemActions aAppRegitemActions) {
        appRegitemActions = aAppRegitemActions;
    }

    /**
     * Access method for docTemplateLookup.
     *
     * @return the current value of docTemplateLookup
     */
    public DocTemplateLookup getDocTemplateLookup() {
        return docTemplateLookup;
    }

    /**
     * Setter method for docTemplateLookup.
     *
     * @param aDocTemplateLookup the new value for docTemplateLookup
     */
    public void setDocTemplateLookup(DocTemplateLookup aDocTemplateLookup) {
        docTemplateLookup = aDocTemplateLookup;
    }

    /** Temporary value holder for group key fragment appRegitemActionsUid */
    private transient Integer tempAppRegitemActionsUid;

    /**
     * Gets the key fragment uid for member appRegitemActions.
     * If this.appRegitemActions is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setAppRegitemActionsUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see AppRegitemActions
     */
    public Integer getAppRegitemActionsUid() {
        return (getAppRegitemActions() == null ? tempAppRegitemActionsUid : getAppRegitemActions().getUid());
    }

    /**
     * Sets the key fragment uid from member appRegitemActions.
     * If this.appRegitemActions is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getAppRegitemActionsUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aUid New value for the key fragment
     * @see AppRegitemActions
     */
    public void setAppRegitemActionsUid(Integer aUid) {
        if (getAppRegitemActions() == null) {
            tempAppRegitemActionsUid = aUid;
        } else {
            getAppRegitemActions().setUid(aUid);
        }
    }

    /** Temporary value holder for group key fragment docTemplateLookupDocTemplateUid */
    private transient Integer tempDocTemplateLookupDocTemplateUid;

    /**
     * Gets the key fragment docTemplateUid for member docTemplateLookup.
     * If this.docTemplateLookup is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setDocTemplateLookupDocTemplateUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see DocTemplateLookup
     */
    public Integer getDocTemplateLookupDocTemplateUid() {
        return (getDocTemplateLookup() == null ? tempDocTemplateLookupDocTemplateUid : getDocTemplateLookup().getDocTemplateUid());
    }

    /**
     * Sets the key fragment docTemplateUid from member docTemplateLookup.
     * If this.docTemplateLookup is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getDocTemplateLookupDocTemplateUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aDocTemplateUid New value for the key fragment
     * @see DocTemplateLookup
     */
    public void setDocTemplateLookupDocTemplateUid(Integer aDocTemplateUid) {
        if (getDocTemplateLookup() == null) {
            tempDocTemplateLookupDocTemplateUid = aDocTemplateUid;
        } else {
            getDocTemplateLookup().setDocTemplateUid(aDocTemplateUid);
        }
    }

    /**
     * Compares the key for this instance with another DocTemplateActionRelation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class DocTemplateActionRelation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DocTemplateActionRelation)) {
            return false;
        }
        DocTemplateActionRelation that = (DocTemplateActionRelation) other;
        Object myAppRegitemActionsUid = this.getAppRegitemActionsUid();
        Object yourAppRegitemActionsUid = that.getAppRegitemActionsUid();
        if (myAppRegitemActionsUid==null ? yourAppRegitemActionsUid!=null : !myAppRegitemActionsUid.equals(yourAppRegitemActionsUid)) {
            return false;
        }
        Object myDocTemplateLookupDocTemplateUid = this.getDocTemplateLookupDocTemplateUid();
        Object yourDocTemplateLookupDocTemplateUid = that.getDocTemplateLookupDocTemplateUid();
        if (myDocTemplateLookupDocTemplateUid==null ? yourDocTemplateLookupDocTemplateUid!=null : !myDocTemplateLookupDocTemplateUid.equals(yourDocTemplateLookupDocTemplateUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another DocTemplateActionRelation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DocTemplateActionRelation)) return false;
        return this.equalKeys(other) && ((DocTemplateActionRelation)other).equalKeys(this);
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
        if (getAppRegitemActionsUid() == null) {
            i = 0;
        } else {
            i = getAppRegitemActionsUid().hashCode();
        }
        result = 37*result + i;
        if (getDocTemplateLookupDocTemplateUid() == null) {
            i = 0;
        } else {
            i = getDocTemplateLookupDocTemplateUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[DocTemplateActionRelation |");
        sb.append(" appRegitemActionsUid=").append(getAppRegitemActionsUid());
        sb.append(" docTemplateLookupDocTemplateUid=").append(getDocTemplateLookupDocTemplateUid());
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
        ret.put("appRegitemActionsUid", getAppRegitemActionsUid());
        ret.put("docTemplateLookupDocTemplateUid", getDocTemplateLookupDocTemplateUid());
        return ret;
    }

}
