package com.questionnaire.questionnairecore.dtos.types;

public class AnswerDTOType {
    private String possibleAnswer;
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

        AnswerDTOType answerDTOType = (AnswerDTOType) o;

        if (correct != answerDTOType.correct) return false;
        return possibleAnswer != null ? possibleAnswer.equals(answerDTOType.possibleAnswer) : answerDTOType.possibleAnswer == null;
    }

    @Override
    public int hashCode() {
        int result = possibleAnswer != null ? possibleAnswer.hashCode() : 0;
        result = 31 * result + (correct ? 1 : 0);
        return result;
    }
}
