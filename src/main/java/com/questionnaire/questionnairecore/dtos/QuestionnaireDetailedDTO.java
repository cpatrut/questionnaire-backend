package com.questionnaire.questionnairecore.dtos;

import com.questionnaire.questionnairecore.dtos.types.QuestionDTOType;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

public class QuestionnaireDetailedDTO {

    private String questionnaireId;

    @NotNull
    private Date creationDate;

    @NotNull
    @Size(min=5,max=100)
    private String title;

    @NotNull
    private List<QuestionDTOType> questionDTOTypeList;

    @NotNull
    @Size(min = 5, max=100)
    private String author;

    public String getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(String questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<QuestionDTOType> getQuestionDTOTypeList() {
        return questionDTOTypeList;
    }

    public void setQuestionDTOTypeList(List<QuestionDTOType> questionDTOTypeList) {
        this.questionDTOTypeList = questionDTOTypeList;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionnaireDetailedDTO that = (QuestionnaireDetailedDTO) o;

        if (questionnaireId != null ? !questionnaireId.equals(that.questionnaireId) : that.questionnaireId != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (questionDTOTypeList != null ? !questionDTOTypeList.equals(that.questionDTOTypeList) : that.questionDTOTypeList != null)
            return false;
        return author != null ? author.equals(that.author) : that.author == null;
    }

    @Override
    public int hashCode() {
        int result = questionnaireId != null ? questionnaireId.hashCode() : 0;
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (questionDTOTypeList != null ? questionDTOTypeList.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
