/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Origin to be added when creating a CDN endpoint.
 */
@JsonFlatten
public class DeepCreatedOrigin {
    /**
     * Origin name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The address of the origin. It can be a domain names, IPv4 address, or
     * IPv6 address.
     */
    @JsonProperty(value = "properties.hostName", required = true)
    private String hostName;

    /**
     * The value of the HTTP port. Must be between 1 and 65535.
     */
    @JsonProperty(value = "properties.httpPort")
    private Integer httpPort;

    /**
     * The value of the HTTPS port. Must be between 1 and 65535.
     */
    @JsonProperty(value = "properties.httpsPort")
    private Integer httpsPort;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the DeepCreatedOrigin object itself.
     */
    public DeepCreatedOrigin withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the hostName value.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Set the hostName value.
     *
     * @param hostName the hostName value to set
     * @return the DeepCreatedOrigin object itself.
     */
    public DeepCreatedOrigin withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get the httpPort value.
     *
     * @return the httpPort value
     */
    public Integer httpPort() {
        return this.httpPort;
    }

    /**
     * Set the httpPort value.
     *
     * @param httpPort the httpPort value to set
     * @return the DeepCreatedOrigin object itself.
     */
    public DeepCreatedOrigin withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * Get the httpsPort value.
     *
     * @return the httpsPort value
     */
    public Integer httpsPort() {
        return this.httpsPort;
    }

    /**
     * Set the httpsPort value.
     *
     * @param httpsPort the httpsPort value to set
     * @return the DeepCreatedOrigin object itself.
     */
    public DeepCreatedOrigin withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

}
