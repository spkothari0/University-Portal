/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import java.util.ArrayList;

/**
 *
 * @author spkot
 */
public class StudentRequestDirectory {

    ArrayList<StudentRequest> studentRequestList;

    public StudentRequestDirectory() {
        this.studentRequestList = new ArrayList<>();
    }

    public ArrayList<StudentRequest> getStudentRequestList() {
        return studentRequestList;
    }

    public StudentRequest createOrder() {
        StudentRequest req = new StudentRequest();
        studentRequestList.add(req);
        return req;
    }

    public boolean deleteOrder(StudentRequest req) {
        return studentRequestList.remove(req);
    }
}
