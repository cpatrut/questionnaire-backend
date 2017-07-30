package com.questionnaire.questionnairecore.models.types;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.UserDefinedType;

import java.util.List;

@UserDefinedType("question")
public class Question {

    @Column("body")
    private String body;

    @Column("Answers")
    private List<Answer> answerList;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question = (Question) o;

        if (body != null ? !body.equals(question.body) : question.body != null) return false;
        return answerList != null ? answerList.equals(question.answerList) : question.answerList == null;
    }

    @Override
    public int hashCode() {
        int result = body != null ? body.hashCode() : 0;
        result = 31 * result + (answerList != null ? answerList.hashCode() : 0);
        return result;
    }
}
