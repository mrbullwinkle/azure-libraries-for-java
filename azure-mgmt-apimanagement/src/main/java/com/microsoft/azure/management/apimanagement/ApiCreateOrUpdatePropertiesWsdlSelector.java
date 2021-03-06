/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Criteria to limit import of WSDL to a subset of the document.
 */
public class ApiCreateOrUpdatePropertiesWsdlSelector {
    /**
     * Name of service to import from WSDL.
     */
    @JsonProperty(value = "wsdlServiceName")
    private String wsdlServiceName;

    /**
     * Name of endpoint(port) to import from WSDL.
     */
    @JsonProperty(value = "wsdlEndpointName")
    private String wsdlEndpointName;

    /**
     * Get the wsdlServiceName value.
     *
     * @return the wsdlServiceName value
     */
    public String wsdlServiceName() {
        return this.wsdlServiceName;
    }

    /**
     * Set the wsdlServiceName value.
     *
     * @param wsdlServiceName the wsdlServiceName value to set
     * @return the ApiCreateOrUpdatePropertiesWsdlSelector object itself.
     */
    public ApiCreateOrUpdatePropertiesWsdlSelector withWsdlServiceName(String wsdlServiceName) {
        this.wsdlServiceName = wsdlServiceName;
        return this;
    }

    /**
     * Get the wsdlEndpointName value.
     *
     * @return the wsdlEndpointName value
     */
    public String wsdlEndpointName() {
        return this.wsdlEndpointName;
    }

    /**
     * Set the wsdlEndpointName value.
     *
     * @param wsdlEndpointName the wsdlEndpointName value to set
     * @return the ApiCreateOrUpdatePropertiesWsdlSelector object itself.
     */
    public ApiCreateOrUpdatePropertiesWsdlSelector withWsdlEndpointName(String wsdlEndpointName) {
        this.wsdlEndpointName = wsdlEndpointName;
        return this;
    }

}
