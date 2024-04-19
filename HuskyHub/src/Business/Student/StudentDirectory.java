package Business.Student;

import java.util.ArrayList;

public class StudentDirectory {
    private ArrayList<Student> studentList;

    public StudentDirectory() {
        studentList = new ArrayList();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public Student createNewStudent(String name) {
        Student student=null;
        student = name == null ? new Student() : new Student(name);
        student.setName(name);
        studentList.add(student);
        return student;
    }
}
