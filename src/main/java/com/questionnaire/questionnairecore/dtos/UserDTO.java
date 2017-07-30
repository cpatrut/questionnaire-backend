package com.questionnaire.questionnairecore.dtos;

import java.util.Date;
import java.util.Set;

public class UserDTO {

    private String email;
    private Date creationDate;
    private String password;
    private String nickname;
    private String firstName;
    private String lastName;
    private Set<String> roles;
    private String phoneNumber;
    private boolean isAccountExpired;
    private boolean isAccountLocked;
    private boolean isCredentialsExpired;
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

        UserDTO userDTO = (UserDTO) o;

        if (isAccountExpired != userDTO.isAccountExpired) return false;
        if (isAccountLocked != userDTO.isAccountLocked) return false;
        if (isCredentialsExpired != userDTO.isCredentialsExpired) return false;
        if (isEnabled != userDTO.isEnabled) return false;
        if (email != null ? !email.equals(userDTO.email) : userDTO.email != null) return false;
        if (creationDate != null ? !creationDate.equals(userDTO.creationDate) : userDTO.creationDate != null)
            return false;
        if (password != null ? !password.equals(userDTO.password) : userDTO.password != null) return false;
        if (nickname != null ? !nickname.equals(userDTO.nickname) : userDTO.nickname != null) return false;
        if (firstName != null ? !firstName.equals(userDTO.firstName) : userDTO.firstName != null) return false;
        if (lastName != null ? !lastName.equals(userDTO.lastName) : userDTO.lastName != null) return false;
        if (roles != null ? !roles.equals(userDTO.roles) : userDTO.roles != null) return false;
        return phoneNumber != null ? phoneNumber.equals(userDTO.phoneNumber) : userDTO.phoneNumber == null;
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
