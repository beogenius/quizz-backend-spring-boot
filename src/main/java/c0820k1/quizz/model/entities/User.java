package c0820k1.quizz.model.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

    private int age;

    private String address;

    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
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


    @Transient
    private int appGroup_id;

    public User() {
    }

    public User(int id, String username, String password, int age,
                String address, String email, Set<Role> roles, String image,
                LocalDate createAt, LocalDate dob, AppGroup appGroup, int appGroup_id) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.address = address;
        this.email = email;
        this.roles = roles;
        this.image = image;
        this.createAt = createAt;
        this.dob = dob;
        this.appGroup = appGroup;
        this.appGroup_id = appGroup_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public AppGroup getAppGroup() {
        return appGroup;
    }

    public void setAppGroup(AppGroup appGroup) {
        this.appGroup = appGroup;
    }

    public int getAppGroup_id() {
        return appGroup_id;
    }

    public void setAppGroup_id(int appGroup_id) {
        this.appGroup_id = appGroup_id;
    }
}
