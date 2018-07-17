package ua.com.lev_neko.internshipspringboot.models;

import lombok.*;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"studentList","internship"})
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.REFRESH,
            mappedBy = "university"
    )
    private List<Student> studentList;
    @OneToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Internship internship;

    public void setInternship(Internship internship) {
        this.internship = internship;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

}
