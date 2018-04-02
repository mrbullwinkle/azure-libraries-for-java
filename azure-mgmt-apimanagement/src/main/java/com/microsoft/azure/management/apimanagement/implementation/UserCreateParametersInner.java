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
import com.microsoft.azure.management.apimanagement.Confirmation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * User create details.
 */
@JsonFlatten
public class UserCreateParametersInner {
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
    @JsonProperty(value = "properties.email", required = true)
    private String email;

    /**
     * First name.
     */
    @JsonProperty(value = "properties.firstName", required = true)
    private String firstName;

    /**
     * Last name.
     */
    @JsonProperty(value = "properties.lastName", required = true)
    private String lastName;

    /**
     * User Password. If no value is provided, a default password is generated.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * Determines the type of confirmation e-mail that will be sent to the
     * newly created user. Possible values include: 'signup', 'invite'.
     */
    @JsonProperty(value = "properties.confirmation")
    private Confirmation confirmation;

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
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withState(UserState state) {
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
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withNote(String note) {
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
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withEmail(String email) {
        this.email = email;
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
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withFirstName(String firstName) {
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
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withLastName(String lastName) {
        this.lastName = lastName;
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
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the confirmation value.
     *
     * @return the confirmation value
     */
    public Confirmation confirmation() {
        return this.confirmation;
    }

    /**
     * Set the confirmation value.
     *
     * @param confirmation the confirmation value to set
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withConfirmation(Confirmation confirmation) {
        this.confirmation = confirmation;
        return this;
    }

}