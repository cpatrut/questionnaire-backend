package com.questionnaire.questionnairecore.models;

import com.questionnaire.questionnairecore.models.types.QuestionModelType;
import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Table("questionnaires_detailed")
public class QuestionnaireDetailedModel {

    @PrimaryKeyColumn(name="questionnaire_id",ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    private UUID  questionnaireId = UUID.randomUUID();

    @PrimaryKeyColumn(name="creation_date",ordinal = 1,type = PrimaryKeyType.CLUSTERED)
    private Date creationDate;

    @Column("author")
    private String author;

    @Column("title")
    private String title;


    @Column("questions")
    private List<QuestionModelType> questionModelTypeList;

    public UUID getQuestionnaireId() {
        return questionnaireId;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<QuestionModelType> getQuestionModelTypeList() {
        return questionModelTypeList;
    }

    public void setQuestionModelTypeList(List<QuestionModelType> questionModelTypeList) {
        this.questionModelTypeList = questionModelTypeList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionnaireDetailedModel that = (QuestionnaireDetailedModel) o;

        if (questionnaireId != null ? !questionnaireId.equals(that.questionnaireId) : that.questionnaireId != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return questionModelTypeList != null ? questionModelTypeList.equals(that.questionModelTypeList) : that.questionModelTypeList == null;
    }

    @Override
    public int hashCode() {
        int result = questionnaireId != null ? questionnaireId.hashCode() : 0;
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (questionModelTypeList != null ? questionModelTypeList.hashCode() : 0);
        return result;
    }
}
