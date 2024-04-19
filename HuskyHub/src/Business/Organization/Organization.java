/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.Student.StudentDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author spkothari
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private StudentDirectory studentDirectory;
    private UUID id;

    public enum OrganizationType {

        Admin("Admin Organization"),
        Diet("Diet Organization"),
        Doctor("Doctor Organization"),
        Trainer("Trainer Organization"),
        HousingInventory("Housing Inventory Organization"),
        HousingMaintenance("Housing Maintenance Organization"),
        OGS("OGS Organization"),
        FinancialAid("Financial Aid Organization"),
        ITSupport("IT Support Organization"),
        StoreManagement("Store Management Organization");

        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

    public Organization(OrganizationType type) {
        name = type.getValue();
        id = UUID.randomUUID();
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        studentDirectory = new StudentDirectory();
    }

    public abstract ArrayList<Role> getSupportedRoles();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public UUID getId() {
        return id;
    }
}
