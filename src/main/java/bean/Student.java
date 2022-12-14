package bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String city;

    public Student(int studentId, String studentName, String city) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.city = city;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
