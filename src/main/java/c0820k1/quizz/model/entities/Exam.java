package c0820k1.quizz.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String examName;
    private String examCode;

    @ManyToMany(mappedBy = "examList")
    private List<Question> questionList;

    public Exam() {
    }

    public Exam(int id, String examName, String examCode, List<Question> questionList) {
        this.id = id;
        this.examName = examName;
        this.examCode = examCode;
        this.questionList = questionList;
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

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
