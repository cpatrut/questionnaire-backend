package com.questionnaire.questionnairecore.populators.impl;


import com.questionnaire.questionnairecore.dtos.QuestionnaireDetailedDTO;
import com.questionnaire.questionnairecore.dtos.types.AnswerDTOType;
import com.questionnaire.questionnairecore.dtos.types.QuestionDTOType;
import com.questionnaire.questionnairecore.models.QuestionnaireDetailedModel;
import com.questionnaire.questionnairecore.models.types.AnswerModelType;
import com.questionnaire.questionnairecore.models.types.QuestionModelType;
import com.questionnaire.questionnairecore.populators.QuestionnairePopulator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionnairePopulatorTest {

    private static final String GREAT_TITLE = "great title";
    private static final String GREAT_BODY = "great body";
    private static final String GREAT_POSSIBLE_ANSWER_1 = "great possible answer 1";
    private static final String GREAT_POSSIBLE_ANSWER_2 = "great possible answer 2";
    private static String TEST_AUTHOR = "test author";

    QuestionnairePopulator questionnairePopulator = new QuestionnairePopulatorImpl();

    QuestionnaireDetailedDTO questionnaireDetailedDTO;
    QuestionnaireDetailedModel questionnaireDetailedModel;

    @Before
    public void setUp() {
        questionnaireDetailedModel = createQuestionaireDetailModel();
        questionnaireDetailedDTO = createQuestionaireDetailedDTO();
    }


    @Test
    public void testConversionFromModelToDTO() {
        QuestionnaireDetailedDTO questionnaireDetailedDTO = questionnairePopulator.fromModelToDTO(questionnaireDetailedModel);

        Assert.assertEquals("author is different from expected", questionnaireDetailedDTO.getAuthor(), questionnaireDetailedModel.getAuthor());
        Assert.assertEquals("creation date different from expected", questionnaireDetailedDTO.getCreationDate(), questionnaireDetailedModel.getCreationDate());
        Assert.assertEquals("title different from expected", questionnaireDetailedDTO.getTitle(), questionnaireDetailedModel.getTitle());
        Assert.assertEquals("questionnaire id different from expected", questionnaireDetailedDTO.getQuestionnaireId(), questionnaireDetailedModel.getQuestionnaireId().toString());

        List<QuestionDTOType> questionDTOTypes = questionnaireDetailedDTO.getQuestionDTOTypeList();

        for (QuestionDTOType questionDTOType : questionDTOTypes) {
            Assert.assertEquals("question body different from expected", questionDTOType.getBody(), questionnaireDetailedModel.getQuestionModelTypeList().get(0).getBody());
            List<AnswerDTOType> answerDTOTypeList = questionDTOType.getAnswerDTOTypeList();

            for (int i = 0; i < answerDTOTypeList.size(); i++) {
                Assert.assertEquals("possible answer different from model to dto", answerDTOTypeList.get(i).getPossibleAnswer(), questionnaireDetailedModel.getQuestionModelTypeList().get(0).getAnswerModelTypeList().get(i).getPossibleAnswer());
                Assert.assertEquals("different correct attribute from model to dto", answerDTOTypeList.get(i).isCorrect(), questionnaireDetailedModel.getQuestionModelTypeList().get(0).getAnswerModelTypeList().get(i).isCorrect());

            }
        }

    }

    @Test
    public void testConversionFromDTOToModel() {
        QuestionnaireDetailedModel questionnaireDetailedModel = questionnairePopulator.fromDTOToModel(questionnaireDetailedDTO);

        Assert.assertEquals("author is different from expected", questionnaireDetailedModel.getAuthor(), questionnaireDetailedDTO.getAuthor());
        Assert.assertEquals("creation date different from expected", questionnaireDetailedModel.getCreationDate(), questionnaireDetailedDTO.getCreationDate());
        Assert.assertEquals("title different from expected", questionnaireDetailedModel.getTitle(), questionnaireDetailedDTO.getTitle());

        List<QuestionModelType> questionModelTypes = questionnaireDetailedModel.getQuestionModelTypeList();

        for (QuestionModelType questionModelType : questionModelTypes) {
            Assert.assertEquals("question body different from expected", questionModelType.getBody(), questionnaireDetailedDTO.getQuestionDTOTypeList().get(0).getBody());
            List<AnswerModelType> answerModelTypes = questionModelType.getAnswerModelTypeList();

            for (int i = 0; i < answerModelTypes.size(); i++) {
                Assert.assertEquals("possible answer different from model to dto", answerModelTypes.get(i).getPossibleAnswer(), questionnaireDetailedDTO.getQuestionDTOTypeList().get(0).getAnswerDTOTypeList().get(i).getPossibleAnswer());
                Assert.assertEquals("different correct attribute from model to dto", answerModelTypes.get(i).isCorrect(), questionnaireDetailedDTO.getQuestionDTOTypeList().get(0).getAnswerDTOTypeList().get(i).isCorrect());

            }
        }

    }



    private QuestionnaireDetailedModel createQuestionaireDetailModel() {
        questionnaireDetailedModel = new QuestionnaireDetailedModel();

        questionnaireDetailedModel.setCreationDate(new Date());
        questionnaireDetailedModel.setAuthor(TEST_AUTHOR);
        questionnaireDetailedModel.setTitle(GREAT_TITLE);

        QuestionModelType questionModelType = new QuestionModelType();
        questionModelType.setBody(GREAT_BODY);

        AnswerModelType answerModelType1 = new AnswerModelType();
        answerModelType1.setCorrect(false);
        answerModelType1.setPossibleAnswer(GREAT_POSSIBLE_ANSWER_1);

        AnswerModelType answerModelType2 = new AnswerModelType();
        answerModelType2.setCorrect(true);
        answerModelType2.setPossibleAnswer(GREAT_POSSIBLE_ANSWER_2);

        List<AnswerModelType> answerModelTypes = new ArrayList<>();
        answerModelTypes.add(answerModelType1);
        answerModelTypes.add(answerModelType2);

        questionModelType.setAnswerModelTypeList(answerModelTypes);

        List<QuestionModelType> questionModelTypes = new ArrayList<>();
        questionModelTypes.add(questionModelType);

        questionnaireDetailedModel.setQuestionModelTypeList(questionModelTypes);

        return questionnaireDetailedModel;
    }

    private QuestionnaireDetailedDTO createQuestionaireDetailedDTO() {
        questionnaireDetailedDTO = new QuestionnaireDetailedDTO();

        questionnaireDetailedDTO.setCreationDate(new Date());
        questionnaireDetailedDTO.setAuthor(TEST_AUTHOR);
        questionnaireDetailedDTO.setTitle(GREAT_TITLE);

        QuestionDTOType questionDTOType = new QuestionDTOType();
        questionDTOType.setBody(GREAT_BODY);

        AnswerDTOType answerDTOType1 = new AnswerDTOType();
        answerDTOType1.setCorrect(false);
        answerDTOType1.setPossibleAnswer(GREAT_POSSIBLE_ANSWER_1);

        AnswerDTOType answerDTOType2 = new AnswerDTOType();
        answerDTOType2.setCorrect(true);
        answerDTOType2.setPossibleAnswer(GREAT_POSSIBLE_ANSWER_2);

        List<AnswerDTOType> answerDTOTypes = new ArrayList<>();
        answerDTOTypes.add(answerDTOType1);
        answerDTOTypes.add(answerDTOType2);

        questionDTOType.setAnswerDTOTypeList(answerDTOTypes);

        List<QuestionDTOType> questionDTOTypes = new ArrayList<>();
        questionDTOTypes.add(questionDTOType);

        questionnaireDetailedDTO.setQuestionDTOTypeList(questionDTOTypes);

        return questionnaireDetailedDTO;
    }
}
