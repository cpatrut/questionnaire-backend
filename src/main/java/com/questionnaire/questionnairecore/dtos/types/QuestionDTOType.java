package com.questionnaire.questionnairecore.dtos.types;

import java.util.List;

public class QuestionDTOType {
    private String body;
    private List<AnswerDTOType> answerDTOTypeList;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<AnswerDTOType> getAnswerDTOTypeList() {
        return answerDTOTypeList;
    }

    public void setAnswerDTOTypeList(List<AnswerDTOType> answerDTOTypeList) {
        this.answerDTOTypeList = answerDTOTypeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionDTOType that = (QuestionDTOType) o;

        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        return answerDTOTypeList != null ? answerDTOTypeList.equals(that.answerDTOTypeList) : that.answerDTOTypeList == null;
    }

    @Override
    public int hashCode() {
        int result = body != null ? body.hashCode() : 0;
        result = 31 * result + (answerDTOTypeList != null ? answerDTOTypeList.hashCode() : 0);
        return result;
    }
}
