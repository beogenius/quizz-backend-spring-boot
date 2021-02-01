package c0820k1.quizz.model.entities;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

    private int age;

    private String address;

    private String email;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "users_roles",
            joinColumns = {@JoinColumn(name="user_id")},
            inverseJoinColumns = {@JoinColumn(name="role_id")}
    )
    private Set<Role> roles;

    private String image;

    private LocalDate createAt;

    private LocalDate dob;

    @ManyToOne
    @JoinColumn( name="app_group_id", insertable = false, updatable = false)
    private AppGroup appGroup;

    private Integer app_group_id;

    @OneToMany(mappedBy = "user")
    private List<HistoryAssignment> historyAssignmentList;
}

