package c0820k1.quizz.model.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String examName;

    @ManyToMany
    private List<User> users;

    private double soccer;

    private Timestamp startTime;

    private Timestamp endTime;

    @ManyToMany(mappedBy = "examList")
    private List<Question> questionList;

    @ManyToMany(mappedBy = "examList")
    private List<AppGroup> appGroupList;

    public Exam() {
    }

    public Exam(int id, String examName, List<User> users, double soccer, Timestamp startTime, Timestamp endTime, List<Question> questionList, List<AppGroup> appGroupList) {
        this.id = id;
        this.examName = examName;
        this.users = users;
        this.soccer = soccer;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public double getSoccer() {
        return soccer;
    }

    public void setSoccer(double soccer) {
        this.soccer = soccer;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }
}
