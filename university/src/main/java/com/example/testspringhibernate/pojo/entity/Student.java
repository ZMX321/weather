package com.example.testspringhibernate.pojo.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "is_active")
    private String isActive;

    @Column(name = "is_delete")
    private String isDelete;

    @OneToMany(mappedBy = "stu", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Student_Teacher> student_teacherList;


    public List<Student_Teacher> getStudent_teacherList() {
        return student_teacherList;
    }

    public void setStudent_teacherList(List<Student_Teacher> student_teacherList) {
        this.student_teacherList = student_teacherList;
    }





    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isActive='" + isActive + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }


}
