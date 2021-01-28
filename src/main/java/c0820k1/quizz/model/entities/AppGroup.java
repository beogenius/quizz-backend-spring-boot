package c0820k1.quizz.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class AppGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String groupName;
    private String description;

    @JsonBackReference
    @OneToMany(mappedBy = "appGroup")
    private List<User> userList;

    @JsonManagedReference
    @ManyToMany
    @JoinTable(
            name = "app_group_exam",
            joinColumns = {@JoinColumn(name="app_group_id")},
            inverseJoinColumns = {@JoinColumn(name="exam_id")}
    )
    private List<Exam> examList;

    public AppGroup() {

    }

    public AppGroup(int id, String groupName, String description, List<User> userList, List<Exam> examList) {
        this.id = id;
        this.groupName = groupName;
        this.description = description;
        this.userList = userList;
        this.examList = examList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Exam> getExamList() {
        return examList;
    }

    public void setExamList(List<Exam> examList) {
        this.examList = examList;
    }
}
