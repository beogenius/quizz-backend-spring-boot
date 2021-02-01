package c0820k1.quizz.model.entities;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String examName;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "exam_question",
            joinColumns = { @JoinColumn(name = "exam_id") },
            inverseJoinColumns = { @JoinColumn(name = "question_id") })
    private List<Question> questionList;

    @Transient
    private int[] questionIdList;


    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },mappedBy = "examList")
    private List<AppGroup> appGroupList;

    @Transient
    private int[] appGroupIdList;

    @OneToMany(mappedBy = "exam")
    private List<HistoryAssignment> historyAssignmentList;
}
