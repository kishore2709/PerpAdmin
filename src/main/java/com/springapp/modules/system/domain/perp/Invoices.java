// Generated with g9.

package com.springapp.modules.system.domain.perp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@Entity(name="invoices")
public class Invoices implements Serializable {

    /** Primary key. */
    protected static final String PK = "invoiceUid";

    @Id
    @Column(name="Invoice_UID", unique=true, nullable=false, precision=10)
    private Integer invoiceUid;
    @Column(name="Active_Flag", nullable=false, length=1)
    private Character activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_UID", nullable=false)
    private Company company;
    @OneToMany(mappedBy="invoices")
    private Set<Ledger> ledger;

    /** Default constructor. */
    public Invoices() {
        super();
    }

    /**
     * Access method for invoiceUid.
     *
     * @return the current value of invoiceUid
     */
    public Integer getInvoiceUid() {
        return invoiceUid;
    }

    /**
     * Setter method for invoiceUid.
     *
     * @param aInvoiceUid the new value for invoiceUid
     */
    public void setInvoiceUid(Integer aInvoiceUid) {
        invoiceUid = aInvoiceUid;
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
     * Compares the key for this instance with another Invoices.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Invoices and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Invoices)) {
            return false;
        }
        Invoices that = (Invoices) other;
        Object myInvoiceUid = this.getInvoiceUid();
        Object yourInvoiceUid = that.getInvoiceUid();
        if (myInvoiceUid==null ? yourInvoiceUid!=null : !myInvoiceUid.equals(yourInvoiceUid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Invoices.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Invoices)) return false;
        return this.equalKeys(other) && ((Invoices)other).equalKeys(this);
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
        if (getInvoiceUid() == null) {
            i = 0;
        } else {
            i = getInvoiceUid().hashCode();
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
        StringBuffer sb = new StringBuffer("[Invoices |");
        sb.append(" invoiceUid=").append(getInvoiceUid());
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
        ret.put("invoiceUid", getInvoiceUid());
        return ret;
    }

}
