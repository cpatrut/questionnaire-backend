package com.questionnaire.questionnairecore.models.types;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.UserDefinedType;

import java.util.List;

@UserDefinedType("question")
public class QuestionModelType {

    @Column("body")
    private String body;

    @Column("Answers")
    private List<AnswerModelType> answerModelTypeList;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<AnswerModelType> getAnswerModelTypeList() {
        return answerModelTypeList;
    }

    public void setAnswerModelTypeList(List<AnswerModelType> answerModelTypeList) {
        this.answerModelTypeList = answerModelTypeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionModelType questionModelType = (QuestionModelType) o;

        if (body != null ? !body.equals(questionModelType.body) : questionModelType.body != null) return false;
        return answerModelTypeList != null ? answerModelTypeList.equals(questionModelType.answerModelTypeList) : questionModelType.answerModelTypeList == null;
    }

    @Override
    public int hashCode() {
        int result = body != null ? body.hashCode() : 0;
        result = 31 * result + (answerModelTypeList != null ? answerModelTypeList.hashCode() : 0);
        return result;
    }
}
