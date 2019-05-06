// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="engine_reading_relation")
public class EngineReadingRelation implements Serializable {

    /** Primary key. */
    protected static final String PK = "erAudUid";

    @Id
    @Column(name="er_aud_uid", unique=true, nullable=false, precision=10)
    private Integer erAudUid;
    @Column(name="er_uid", nullable=false, precision=10)
    private Integer erUid;
    @Column(name="Serial_No", length=30)
    private String serialNo;

    /** Default constructor. */
    public EngineReadingRelation() {
        super();
    }

    /**
     * Access method for erAudUid.
     *
     * @return the current value of erAudUid
     */
    public Integer getErAudUid() {
        return erAudUid;
    }

    /**
     * Setter method for erAudUid.
     *
     * @param aErAudUid the new value for erAudUid
     */
    public void setErAudUid(Integer aErAudUid) {
        erAudUid = aErAudUid;
    }

    /**
     * Access method for erUid.
     *
     * @return the current value of erUid
     */
    public Integer getErUid() {
        return erUid;
    }

    /**
     * Setter method for erUid.
     *
     * @param aErUid the new value for erUid
     */
    public void setErUid(Integer aErUid) {
        erUid = aErUid;
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
     * Compares the key for this instance with another EngineReadingRelation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EngineReadingRelation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EngineReadingRelation)) {
            return false;
        }
        EngineReadingRelation that = (EngineReadingRelation) other;
        Object myErAudUid = this.getErAudUid();
        Object yourErAudUid = that.getErAudUid();
        if (myErAudUid==null ? yourErAudUid!=null : !myErAudUid.equals(yourErAudUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EngineReadingRelation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EngineReadingRelation)) return false;
        return this.equalKeys(other) && ((EngineReadingRelation)other).equalKeys(this);
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
        if (getErAudUid() == null) {
            i = 0;
        } else {
            i = getErAudUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[EngineReadingRelation |");
        sb.append(" erAudUid=").append(getErAudUid());
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
        ret.put("erAudUid", getErAudUid());
        return ret;
    }

}
