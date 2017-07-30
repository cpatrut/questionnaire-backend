package com.questionnaire.questionnairecore.repository;

import com.questionnaire.questionnairecore.models.QuestionnaireDetailedModel;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface QuestionnaireDetailedRepository extends CrudRepository<QuestionnaireDetailedModel,UUID> {
}
