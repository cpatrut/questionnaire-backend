package com.questionnaire.questionnairecore;

import com.questionnaire.questionnairecore.models.UserModel;
import com.questionnaire.questionnairecore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuestionnaireCoreApplication {


	public static void main(String[] args) {
		SpringApplication.run(QuestionnaireCoreApplication.class, args);
	}
}
