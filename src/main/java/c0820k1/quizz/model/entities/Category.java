package c0820k1.quizz.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Question> questionList;


    public Category() {
    }

    public Category(int id, String categoryName, List<Question> questionList) {
        this.id = id;
        this.categoryName = categoryName;
        this.questionList = questionList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
