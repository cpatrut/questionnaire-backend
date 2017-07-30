package com.questionnaire.questionnairecore.models;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

import java.util.Date;
import java.util.Set;

@Table("users_by_email")
public class UserModel {

    @PrimaryKeyColumn(name="email",ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    private String email;

    @PrimaryKeyColumn(name="creation_date",ordinal = 1,type = PrimaryKeyType.CLUSTERED)
    private Date creationDate;

    @Column(value = "password")
    private String password;

    @Column(value="nickname")
    private String nickname;

    @Column(value = "first_name")
    private String firstName;

    @Column(value = "last_name")
    private String lastName;

    @Column(value = "roles")
    private Set<String> roles;

    @Column(value = "phone_number")
    private String phoneNumber;

    @Column(value = "is_account_expired")
    private boolean isAccountExpired;

    @Column(value = "is_accont_locked")
    private boolean isAccountLocked;

    @Column(value = "is_credentials_expired")
    private boolean isCredentialsExpired;

    @Column(value = "is_enabled")
    private boolean isEnabled;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isAccountExpired() {
        return isAccountExpired;
    }

    public void setAccountExpired(boolean accountExpired) {
        isAccountExpired = accountExpired;
    }

    public boolean isAccountLocked() {
        return isAccountLocked;
    }

    public void setAccountLocked(boolean accountLocked) {
        isAccountLocked = accountLocked;
    }

    public boolean isCredentialsExpired() {
        return isCredentialsExpired;
    }

    public void setCredentialsExpired(boolean credentialsExpired) {
        isCredentialsExpired = credentialsExpired;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserModel userModel = (UserModel) o;

        if (isAccountExpired != userModel.isAccountExpired) return false;
        if (isAccountLocked != userModel.isAccountLocked) return false;
        if (isCredentialsExpired != userModel.isCredentialsExpired) return false;
        if (isEnabled != userModel.isEnabled) return false;
        if (email != null ? !email.equals(userModel.email) : userModel.email != null) return false;
        if (creationDate != null ? !creationDate.equals(userModel.creationDate) : userModel.creationDate != null)
            return false;
        if (password != null ? !password.equals(userModel.password) : userModel.password != null) return false;
        if (nickname != null ? !nickname.equals(userModel.nickname) : userModel.nickname != null) return false;
        if (firstName != null ? !firstName.equals(userModel.firstName) : userModel.firstName != null) return false;
        if (lastName != null ? !lastName.equals(userModel.lastName) : userModel.lastName != null) return false;
        if (roles != null ? !roles.equals(userModel.roles) : userModel.roles != null) return false;
        return phoneNumber != null ? phoneNumber.equals(userModel.phoneNumber) : userModel.phoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (isAccountExpired ? 1 : 0);
        result = 31 * result + (isAccountLocked ? 1 : 0);
        result = 31 * result + (isCredentialsExpired ? 1 : 0);
        result = 31 * result + (isEnabled ? 1 : 0);
        return result;
    }
}
