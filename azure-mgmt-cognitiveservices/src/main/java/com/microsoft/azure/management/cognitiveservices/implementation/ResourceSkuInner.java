/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.implementation;

import java.util.List;
import com.microsoft.azure.management.cognitiveservices.ResourceSkuRestrictions;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an available Cognitive Services SKU.
 */
public class ResourceSkuInner {
    /**
     * The type of resource the SKU applies to.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /**
     * The name of SKU.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Specifies the tier of Cognitive Services account.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /**
     * The Kind of resources that are supported in this SKU.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /**
     * The set of locations that the SKU is available.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> locations;

    /**
     * The restrictions because of which SKU cannot be used. This is empty if
     * there are no restrictions.
     */
    @JsonProperty(value = "restrictions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceSkuRestrictions> restrictions;

    /**
     * Get the resourceType value.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Get the kind value.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the locations value.
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get the restrictions value.
     *
     * @return the restrictions value
     */
    public List<ResourceSkuRestrictions> restrictions() {
        return this.restrictions;
    }

}