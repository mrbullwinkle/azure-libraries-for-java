/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class representing Diagnostic Metric information.
 */
public class DiagnosticMetricSet {
    /**
     * Name of the metric.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Metric's unit.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Start time of the period.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * End time of the period.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * Presented time grain. Supported grains at the moment are PT1M, PT1H,
     * P1D.
     */
    @JsonProperty(value = "timeGrain")
    private String timeGrain;

    /**
     * Collection of metric values for the selected period based on the
     * {Microsoft.Web.Hosting.Administration.DiagnosticMetricSet.TimeGrain}.
     */
    @JsonProperty(value = "values")
    private List<DiagnosticMetricSample> values;

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
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit value.
     *
     * @param unit the unit value to set
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the timeGrain value.
     *
     * @return the timeGrain value
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain value.
     *
     * @param timeGrain the timeGrain value to set
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the values value.
     *
     * @return the values value
     */
    public List<DiagnosticMetricSample> values() {
        return this.values;
    }

    /**
     * Set the values value.
     *
     * @param values the values value to set
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withValues(List<DiagnosticMetricSample> values) {
        this.values = values;
        return this;
    }

}
