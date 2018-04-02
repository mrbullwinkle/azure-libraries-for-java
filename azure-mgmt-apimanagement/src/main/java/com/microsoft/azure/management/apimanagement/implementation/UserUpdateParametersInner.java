/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.implementation;

import com.microsoft.azure.management.apimanagement.UserState;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * User update parameters.
 */
@JsonFlatten
public class UserUpdateParametersInner {
    /**
     * Account state. Specifies whether the user is active or not. Blocked
     * users are unable to sign into the developer portal or call any APIs of
     * subscribed products. Default state is Active. Possible values include:
     * 'active', 'blocked', 'pending', 'deleted'.
     */
    @JsonProperty(value = "properties.state")
    private UserState state;

    /**
     * Optional note about a user set by the administrator.
     */
    @JsonProperty(value = "properties.note")
    private String note;

    /**
     * Collection of user identities.
     */
    @JsonProperty(value = "properties.identities", access = JsonProperty.Access.WRITE_ONLY)
    private List<UserIdentityContractInner> identities;

    /**
     * Email address. Must not be empty and must be unique within the service
     * instance.
     */
    @JsonProperty(value = "properties.email")
    private String email;

    /**
     * User Password.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * First name.
     */
    @JsonProperty(value = "properties.firstName")
    private String firstName;

    /**
     * Last name.
     */
    @JsonProperty(value = "properties.lastName")
    private String lastName;

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public UserState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the UserUpdateParametersInner object itself.
     */
    public UserUpdateParametersInner withState(UserState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the note value.
     *
     * @return the note value
     */
    public String note() {
        return this.note;
    }

    /**
     * Set the note value.
     *
     * @param note the note value to set
     * @return the UserUpdateParametersInner object itself.
     */
    public UserUpdateParametersInner withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Get the identities value.
     *
     * @return the identities value
     */
    public List<UserIdentityContractInner> identities() {
        return this.identities;
    }

    /**
     * Get the email value.
     *
     * @return the email value
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email value.
     *
     * @param email the email value to set
     * @return the UserUpdateParametersInner object itself.
     */
    public UserUpdateParametersInner withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     * @return the UserUpdateParametersInner object itself.
     */
    public UserUpdateParametersInner withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the firstName value.
     *
     * @return the firstName value
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set the firstName value.
     *
     * @param firstName the firstName value to set
     * @return the UserUpdateParametersInner object itself.
     */
    public UserUpdateParametersInner withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get the lastName value.
     *
     * @return the lastName value
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set the lastName value.
     *
     * @param lastName the lastName value to set
     * @return the UserUpdateParametersInner object itself.
     */
    public UserUpdateParametersInner withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

}