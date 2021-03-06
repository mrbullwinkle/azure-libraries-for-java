/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the disk to detach.
 */
public class DetachDiskProperties {
    /**
     * The resource ID of the Lab VM to which the disk is attached.
     */
    @JsonProperty(value = "leasedByLabVmId")
    private String leasedByLabVmId;

    /**
     * Get the leasedByLabVmId value.
     *
     * @return the leasedByLabVmId value
     */
    public String leasedByLabVmId() {
        return this.leasedByLabVmId;
    }

    /**
     * Set the leasedByLabVmId value.
     *
     * @param leasedByLabVmId the leasedByLabVmId value to set
     * @return the DetachDiskProperties object itself.
     */
    public DetachDiskProperties withLeasedByLabVmId(String leasedByLabVmId) {
        this.leasedByLabVmId = leasedByLabVmId;
        return this;
    }

}
