/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Vpn device configuration script generation parameters.
 */
public class VpnDeviceScriptParametersInner {
    /**
     * The vendor for the vpn device.
     */
    @JsonProperty(value = "vendor")
    private String vendor;

    /**
     * The device family for the vpn device.
     */
    @JsonProperty(value = "deviceFamily")
    private String deviceFamily;

    /**
     * The firmware version for the vpn device.
     */
    @JsonProperty(value = "firmwareVersion")
    private String firmwareVersion;

    /**
     * Get the vendor value.
     *
     * @return the vendor value
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Set the vendor value.
     *
     * @param vendor the vendor value to set
     * @return the VpnDeviceScriptParametersInner object itself.
     */
    public VpnDeviceScriptParametersInner withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get the deviceFamily value.
     *
     * @return the deviceFamily value
     */
    public String deviceFamily() {
        return this.deviceFamily;
    }

    /**
     * Set the deviceFamily value.
     *
     * @param deviceFamily the deviceFamily value to set
     * @return the VpnDeviceScriptParametersInner object itself.
     */
    public VpnDeviceScriptParametersInner withDeviceFamily(String deviceFamily) {
        this.deviceFamily = deviceFamily;
        return this;
    }

    /**
     * Get the firmwareVersion value.
     *
     * @return the firmwareVersion value
     */
    public String firmwareVersion() {
        return this.firmwareVersion;
    }

    /**
     * Set the firmwareVersion value.
     *
     * @param firmwareVersion the firmwareVersion value to set
     * @return the VpnDeviceScriptParametersInner object itself.
     */
    public VpnDeviceScriptParametersInner withFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
        return this;
    }

}