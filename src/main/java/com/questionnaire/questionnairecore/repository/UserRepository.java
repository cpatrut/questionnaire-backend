package com.questionnaire.questionnairecore.repository;

import com.questionnaire.questionnairecore.models.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel,String> {
}
