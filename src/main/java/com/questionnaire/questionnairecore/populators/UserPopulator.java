package com.questionnaire.questionnairecore.populators;

import com.questionnaire.questionnairecore.dtos.UserDTO;
import com.questionnaire.questionnairecore.models.UserModel;

public interface UserPupulator {

    UserDTO fromModelToDTO(UserModel userModel);

    UserModel fromDTOToModel(UserDTO userDTO);
}
