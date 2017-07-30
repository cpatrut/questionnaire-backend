package com.questionnaire.questionnairecore.controllers;


import com.questionnaire.questionnairecore.models.QuestionnaireDetailedModel;
import com.questionnaire.questionnairecore.models.UserModel;
import com.questionnaire.questionnairecore.models.types.AnswerModelType;
import com.questionnaire.questionnairecore.models.types.QuestionModelType;
import com.questionnaire.questionnairecore.repository.QuestionnaireDetailedRepository;
import com.questionnaire.questionnairecore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class Homepage {

    @Autowired
    UserRepository userRepository;

    @Autowired
    QuestionnaireDetailedRepository questionnaireDetailedRepository;

    @RequestMapping("/")
    public String showHome(){
        UserModel userModel =new UserModel();
        userModel.setEmail("cpatrut@boutlook.com");
        userModel.setCreationDate(new Date());
        userRepository.save(userModel);

        AnswerModelType answerModelType = new AnswerModelType();
        answerModelType.setCorrect(true);
        answerModelType.setPossibleAnswer("great answer");

        List<AnswerModelType> answerModelTypes =  new ArrayList<>();
        answerModelTypes.add(answerModelType);

        QuestionModelType questionModelType =new QuestionModelType();
        questionModelType.setBody("great body?");
        questionModelType.setAnswerModelTypeList(answerModelTypes);

        List<QuestionModelType> questionModelTypes = new ArrayList<>();
        questionModelTypes.add(questionModelType);

        QuestionnaireDetailedModel questionnaireDetailedModel=new QuestionnaireDetailedModel();
        questionnaireDetailedModel.setQuestionModelTypeList(questionModelTypes);
        questionnaireDetailedModel.setCreationDate(new Date());
        questionnaireDetailedRepository.save(questionnaireDetailedModel);


        return "home";
    }
}
