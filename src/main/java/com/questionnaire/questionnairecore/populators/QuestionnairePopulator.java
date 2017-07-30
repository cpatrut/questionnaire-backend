package com.questionnaire.questionnairecore.populators;

import com.questionnaire.questionnairecore.dtos.QuestionnaireDetailedDTO;
import com.questionnaire.questionnairecore.models.QuestionnaireDetailedModel;

public interface QuestionnairePopulator {

    QuestionnaireDetailedDTO fromModelToDTO(QuestionnaireDetailedModel questionnaireDetailedModel);

    QuestionnaireDetailedModel fromDTOToModel(QuestionnaireDetailedDTO questionnaireDetailedDTO);
}
