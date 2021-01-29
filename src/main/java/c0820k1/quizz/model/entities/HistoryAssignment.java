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

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "exam_id",updatable = false,insertable = false)
    private Exam exam;



    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "user_id",updatable = false,insertable = false)
    private User user;



    private int point;

    private Timestamp startTime;

    public HistoryAssignment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getStartEnd() {
        return startEnd;
    }

    public void setStartEnd(Timestamp startEnd) {
        this.startEnd = startEnd;
    }

    private Timestamp startEnd;

    public HistoryAssignment(int id, Exam exam, User user, int point, Timestamp startTime, Timestamp startEnd) {
        this.id = id;
        this.exam = exam;
        this.user = user;
        this.point = point;
        this.startTime = startTime;
        this.startEnd = startEnd;
    }
}
