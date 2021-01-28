package c0820k1.quizz.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String content;

    @OneToMany(mappedBy = "question")
    private List<Answer> answerList;

    @ManyToOne
    @JoinColumn(name="category_id", insertable = false, updatable = false)
    private Category category;

    @Transient
    private int category_id;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "exam_question",
            joinColumns = @JoinColumn(name = "question_id"),
            inverseJoinColumns = @JoinColumn(name = "exam_id")
    )
    private List<Exam> examList;



}
