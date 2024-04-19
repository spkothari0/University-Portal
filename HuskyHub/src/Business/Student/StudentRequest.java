/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import java.util.UUID;

/**
 *
 * @author spkot
 */
public class StudentRequest {

    private UUID id;
    private String status;
    private Student student;
    private String requestMessage;
    private Enterprise relatedEnterprise;
    private Organization relatedOrganization;
    private String studentFeedback;

    public StudentRequest() {
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    public Enterprise getRelatedEnterprise() {
        return relatedEnterprise;
    }

    public void setRelatedEnterprise(Enterprise relatedEnterprise) {
        this.relatedEnterprise = relatedEnterprise;
    }

    public Organization getRelatedOrganization() {
        return relatedOrganization;
    }

    public void setRelatedOrganization(Organization relatedOrganization) {
        this.relatedOrganization = relatedOrganization;
    }

    public String getStudentFeedback() {
        return studentFeedback;
    }

    public void setStudentFeedback(String studentFeedback) {
        this.studentFeedback = studentFeedback;
    }

}
