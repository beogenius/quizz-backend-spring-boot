package c0820k1.quizz.model.entities;



import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class HistoryAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int point;

    private Timestamp startTime;
    private Timestamp endTime;

    @ManyToOne
    @JoinColumn(name = "exam_id",insertable = false,updatable = false)
    private Exam exam;

    private Integer exam_id;

    @ManyToOne
    @JoinColumn(name = "user_id",insertable = false,updatable = false)
    private User user;

    private Integer user_id;
}
