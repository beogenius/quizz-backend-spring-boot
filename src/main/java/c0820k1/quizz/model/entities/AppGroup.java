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
public class AppGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String groupName;
    private String description;


    @OneToMany(mappedBy = "appGroup")
    private List<User> userList;

    @Transient
    private int[] userIdList;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "exam_group",
            joinColumns = { @JoinColumn(name = "group_id")},
            inverseJoinColumns = { @JoinColumn(name = "exam_id")})
    private List<Exam> examList;

    @Transient
    private int[] examIdList;
}

