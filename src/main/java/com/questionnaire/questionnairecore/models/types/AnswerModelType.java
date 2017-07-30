package com.questionnaire.questionnairecore.models.types;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.UserDefinedType;

@UserDefinedType("answer")
public class Answer {

    @Column("possible_answer")
    private String possibleAnswer;

    @Column("correct")
    private boolean correct;

    public String getPossibleAnswer() {
        return possibleAnswer;
    }

    public void setPossibleAnswer(String possibleAnswer) {
        this.possibleAnswer = possibleAnswer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answer answer = (Answer) o;

        if (correct != answer.correct) return false;
        return possibleAnswer.equals(answer.possibleAnswer);
    }

    @Override
    public int hashCode() {
        int result = possibleAnswer.hashCode();
        result = 31 * result + (correct ? 1 : 0);
        return result;
    }
}
