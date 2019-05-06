// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="run_oem_update_status")
public class RunOemUpdateStatus implements Serializable {
    @Id
    @Column(name="run_oem_update_status_flag", length=1)
    private String runOemUpdateStatusFlag;

    /** Default constructor. */
    public RunOemUpdateStatus() {
        super();
    }

    /**
     * Access method for runOemUpdateStatusFlag.
     *
     * @return the current value of runOemUpdateStatusFlag
     */
    public String getRunOemUpdateStatusFlag() {
        return runOemUpdateStatusFlag;
    }

    /**
     * Setter method for runOemUpdateStatusFlag.
     *
     * @param aRunOemUpdateStatusFlag the new value for runOemUpdateStatusFlag
     */
    public void setRunOemUpdateStatusFlag(String aRunOemUpdateStatusFlag) {
        runOemUpdateStatusFlag = aRunOemUpdateStatusFlag;
    }

}
