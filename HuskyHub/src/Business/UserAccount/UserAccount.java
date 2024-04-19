/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.Student.Student;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author spkothari
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;
    private Student student;
    private Role role;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public boolean assignWork(WorkRequest req) {
        req.setStatus("Assigned");
        return workQueue.getWorkRequests().add(req);
    }

    public void completeWork(WorkRequest request) {
        request.setStatus("Completed");
    }

    public boolean isAvailableforWork() {
        return workQueue.getWorkRequests().stream()
                .filter(r -> r.getStatus().equals("Assigned")).findAny().isEmpty() && employee != null;
    }

    @Override
    public String toString() {
        return username;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UserAccount) {
            UserAccount user = (UserAccount) obj;
            return user.getUsername().equals(username);
        }
        return false;
    }

}
