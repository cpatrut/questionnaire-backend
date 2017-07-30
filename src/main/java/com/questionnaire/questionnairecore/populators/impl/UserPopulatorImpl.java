package com.questionnaire.questionnairecore.populators.impl;

import com.questionnaire.questionnairecore.dtos.UserDTO;
import com.questionnaire.questionnairecore.models.UserModel;
import com.questionnaire.questionnairecore.populators.UserPopulator;

public class UserPopulatorImpl implements UserPopulator {
    @Override
    public UserDTO fromModelToDTO(UserModel userModel) {
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(userModel.getEmail());
        userDTO.setPassword(userModel.getPassword());
        userDTO.setNickname(userModel.getNickname());
        userDTO.setFirstName(userModel.getFirstName());
        userDTO.setLastName(userModel.getLastName());
        userDTO.setCreationDate(userModel.getCreationDate());
        userDTO.setPhoneNumber(userModel.getPhoneNumber());
        userDTO.setRoles(userModel.getRoles());
        userDTO.setAccountExpired(userModel.isAccountExpired());
        userDTO.setAccountLocked(userModel.isAccountLocked());
        userDTO.setCredentialsExpired(userModel.isCredentialsExpired());
        userDTO.setEnabled(userModel.isEnabled());
        return userDTO;
    }

    @Override
    public UserModel fromDTOToModel(UserDTO userDTO) {
        UserModel userModel = new UserModel();
        userModel.setEmail(userDTO.getEmail());
        userModel.setPassword(userDTO.getPassword());
        userModel.setNickname(userDTO.getNickname());
        userModel.setFirstName(userDTO.getFirstName());
        userModel.setLastName(userDTO.getLastName());
        userModel.setCreationDate(userDTO.getCreationDate());
        userModel.setPhoneNumber(userDTO.getPhoneNumber());
        userModel.setRoles(userDTO.getRoles());
        userModel.setAccountExpired(userDTO.isAccountExpired());
        userModel.setAccountLocked(userDTO.isAccountLocked());
        userModel.setCredentialsExpired(userDTO.isCredentialsExpired());
        userModel.setEnabled(userDTO.isEnabled());
        return userModel;    }
}
