package com.example.demo.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String examName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "exam_question",
            joinColumns = { @JoinColumn(name = "exam_id") },
            inverseJoinColumns = { @JoinColumn(name = "question_id") })
    private Set<User> questionList = new HashSet<>();
}
