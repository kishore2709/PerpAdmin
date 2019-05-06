// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="operating_conditions")
public class OperatingConditions implements Serializable {

    @Id
    @Column(name="order_id", nullable=false, precision=10)
    private Integer orderId;
    @Column(name="OpCon_UID", nullable=false, precision=10)
    private Integer opConUid;
    @Column(name="Operating_Condition")
    private String operatingCondition;
    @Column(name="Number_Of_Lines", precision=10)
    private Integer numberOfLines;
    @Column(name="OpCon_Comment", length=512)
    private String opConComment;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="operatingConditions")
    private Set<OpcontempOpconRel> opcontempOpconRel;
    @OneToMany(mappedBy="operatingConditions")
    private Set<OpconinputLookup> opconinputLookup;
    @OneToMany(mappedBy="operatingConditions")
    private Set<OpconRegitemRelation> opconRegitemRelation;

    /** Default constructor. */
    public OperatingConditions() {
        super();
    }

    /**
     * Access method for orderId.
     *
     * @return the current value of orderId
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * Setter method for orderId.
     *
     * @param aOrderId the new value for orderId
     */
    public void setOrderId(Integer aOrderId) {
        orderId = aOrderId;
    }

    /**
     * Access method for opConUid.
     *
     * @return the current value of opConUid
     */
    public Integer getOpConUid() {
        return opConUid;
    }

    /**
     * Setter method for opConUid.
     *
     * @param aOpConUid the new value for opConUid
     */
    public void setOpConUid(Integer aOpConUid) {
        opConUid = aOpConUid;
    }

    /**
     * Access method for operatingCondition.
     *
     * @return the current value of operatingCondition
     */
    public String getOperatingCondition() {
        return operatingCondition;
    }

    /**
     * Setter method for operatingCondition.
     *
     * @param aOperatingCondition the new value for operatingCondition
     */
    public void setOperatingCondition(String aOperatingCondition) {
        operatingCondition = aOperatingCondition;
    }

    /**
     * Access method for numberOfLines.
     *
     * @return the current value of numberOfLines
     */
    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    /**
     * Setter method for numberOfLines.
     *
     * @param aNumberOfLines the new value for numberOfLines
     */
    public void setNumberOfLines(Integer aNumberOfLines) {
        numberOfLines = aNumberOfLines;
    }

    /**
     * Access method for opConComment.
     *
     * @return the current value of opConComment
     */
    public String getOpConComment() {
        return opConComment;
    }

    /**
     * Setter method for opConComment.
     *
     * @param aOpConComment the new value for opConComment
     */
    public void setOpConComment(String aOpConComment) {
        opConComment = aOpConComment;
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
     * Access method for opcontempOpconRel.
     *
     * @return the current value of opcontempOpconRel
     */
    public Set<OpcontempOpconRel> getOpcontempOpconRel() {
        return opcontempOpconRel;
    }

    /**
     * Setter method for opcontempOpconRel.
     *
     * @param aOpcontempOpconRel the new value for opcontempOpconRel
     */
    public void setOpcontempOpconRel(Set<OpcontempOpconRel> aOpcontempOpconRel) {
        opcontempOpconRel = aOpcontempOpconRel;
    }

    /**
     * Access method for opconinputLookup.
     *
     * @return the current value of opconinputLookup
     */
    public Set<OpconinputLookup> getOpconinputLookup() {
        return opconinputLookup;
    }

    /**
     * Setter method for opconinputLookup.
     *
     * @param aOpconinputLookup the new value for opconinputLookup
     */
    public void setOpconinputLookup(Set<OpconinputLookup> aOpconinputLookup) {
        opconinputLookup = aOpconinputLookup;
    }

    /**
     * Access method for opconRegitemRelation.
     *
     * @return the current value of opconRegitemRelation
     */
    public Set<OpconRegitemRelation> getOpconRegitemRelation() {
        return opconRegitemRelation;
    }

    /**
     * Setter method for opconRegitemRelation.
     *
     * @param aOpconRegitemRelation the new value for opconRegitemRelation
     */
    public void setOpconRegitemRelation(Set<OpconRegitemRelation> aOpconRegitemRelation) {
        opconRegitemRelation = aOpconRegitemRelation;
    }

}
