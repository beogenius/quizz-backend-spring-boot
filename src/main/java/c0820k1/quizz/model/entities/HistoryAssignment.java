package c0820k1.quizz.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table
public class HistoryAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "exam_id",updatable = false,insertable = false)
    private Exam exam;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id",updatable = false,insertable = false)
    private User user;

    private int point;

    private Timestamp startTime;


    private Timestamp startEnd;


}
