package c0820k1.quizz.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String examName;

    @JsonBackReference
    @ManyToMany(mappedBy = "examList")
    private List<Question> questionList;

    @ManyToMany(mappedBy = "examList")
    private List<AppGroup> appGroupList;

    public Exam() {
    }

    public Exam(int id, String examName, List<Question> questionList, List<AppGroup> appGroupList) {
        this.id = id;
        this.examName = examName;
        this.questionList = questionList;
        this.appGroupList = appGroupList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public List<AppGroup> getAppGroupList() {
        return appGroupList;
    }

    public void setAppGroupList(List<AppGroup> appGroupList) {
        this.appGroupList = appGroupList;
    }
}
