package com.questionnaire.questionnairecore.populators;

import com.questionnaire.questionnairecore.dtos.UserDTO;
import com.questionnaire.questionnairecore.models.UserModel;

public interface UserPopulator {

    UserDTO fromModelToDTO(UserModel userModel);

    UserModel fromDTOToModel(UserDTO userDTO);
}
