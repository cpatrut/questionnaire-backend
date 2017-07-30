package com.questionnaire.questionnairecore.populators.impl;

import com.questionnaire.questionnairecore.dtos.QuestionnaireDetailedDTO;
import com.questionnaire.questionnairecore.dtos.types.AnswerDTOType;
import com.questionnaire.questionnairecore.dtos.types.QuestionDTOType;
import com.questionnaire.questionnairecore.models.QuestionnaireDetailedModel;
import com.questionnaire.questionnairecore.models.types.AnswerModelType;
import com.questionnaire.questionnairecore.models.types.QuestionModelType;
import com.questionnaire.questionnairecore.populators.QuestionnairePopulator;

import java.util.ArrayList;
import java.util.List;

public class QuestionnairePopulatorImpl implements QuestionnairePopulator{

    @Override
    public QuestionnaireDetailedDTO fromModelToDTO(QuestionnaireDetailedModel questionnaireDetailedModel) {
        QuestionnaireDetailedDTO questionnaireDetailedDTO = new QuestionnaireDetailedDTO();

        // translating questionnaire general fields from model to dto
        questionnaireDetailedDTO.setCreationDate(questionnaireDetailedModel.getCreationDate());
        questionnaireDetailedDTO.setAuthor(questionnaireDetailedModel.getAuthor());
        questionnaireDetailedDTO.setTitle(questionnaireDetailedModel.getTitle());
        questionnaireDetailedDTO.setQuestionnaireId(questionnaireDetailedModel.getQuestionnaireId().toString());


        //preparing to translate entire list of questions from model to dto
        List<QuestionModelType> questionModelTypes = questionnaireDetailedModel.getQuestionModelTypeList();
        List<QuestionDTOType> questionDTOTypes =  new ArrayList<>();


        for(QuestionModelType questionModelType : questionModelTypes ) {

            QuestionDTOType questionDTOType = new QuestionDTOType();
            questionDTOType.setBody(questionModelType.getBody());

            //translating each possible answer from model to dto
            List<AnswerModelType> answerModelTypes = questionModelType.getAnswerModelTypeList();
            List<AnswerDTOType> answerDTOTypes = new ArrayList<>();
            for(AnswerModelType answerModelType:answerModelTypes){
                AnswerDTOType answerDTOType = new AnswerDTOType();
                answerDTOType.setPossibleAnswer(answerModelType.getPossibleAnswer());
                answerDTOType.setCorrect(answerModelType.isCorrect());
                answerDTOTypes.add(answerDTOType);
            }
            questionDTOType.setAnswerDTOTypeList(answerDTOTypes);

            questionDTOTypes.add(questionDTOType);
        }
        questionnaireDetailedDTO.setQuestionDTOTypeList(questionDTOTypes);

        return questionnaireDetailedDTO;
    }

    @Override
    public QuestionnaireDetailedModel fromDTOToModel(QuestionnaireDetailedDTO questionnaireDetailedDTO) {
        QuestionnaireDetailedModel questionnaireDetailedModel = new QuestionnaireDetailedModel();

        // translating questionnaire general fields from dto to model
        questionnaireDetailedModel.setCreationDate(questionnaireDetailedDTO.getCreationDate());
        questionnaireDetailedModel.setAuthor(questionnaireDetailedDTO.getAuthor());
        questionnaireDetailedModel.setTitle(questionnaireDetailedDTO.getTitle());

        //preparing to translate entire list of questions from model to dto
        List<QuestionDTOType> questionDTOTypes = questionnaireDetailedDTO.getQuestionDTOTypeList();
        List<QuestionModelType> questionModelTypes =  new ArrayList<>();


        for(QuestionDTOType questionDTOType : questionDTOTypes ) {

            QuestionModelType questionModelType = new QuestionModelType();
            questionModelType.setBody(questionDTOType.getBody());

            //translating each possible answer from model to dto
            List<AnswerDTOType> answerDTOTypes = questionDTOType.getAnswerDTOTypeList();
            List<AnswerModelType> answerModelTypes = new ArrayList<>();

            for(AnswerDTOType answerDTOType:answerDTOTypes){
                AnswerModelType answerModelType = new AnswerModelType();
                answerModelType.setPossibleAnswer(answerDTOType.getPossibleAnswer());
                answerModelType.setCorrect(answerDTOType.isCorrect());
                answerModelTypes.add(answerModelType);
            }
            questionModelType.setAnswerModelTypeList(answerModelTypes);

            questionModelTypes.add(questionModelType);
        }
        questionnaireDetailedModel.setQuestionModelTypeList(questionModelTypes);
        return questionnaireDetailedModel;
    }
}
