/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.EmployeeDirectory;
import java.util.ArrayList;

import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Student.StudentDirectory;
import Business.Student.StudentRequestDirectory;
import Business.UserAccount.UserAccountDirectory;
/**
 *
 * @author spkothari
 */
public class Business {
    private static Business business;
    private ArrayList<Network> networklList;
    private StudentRequestDirectory studentRequestDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private StudentDirectory studentDirectory;

    public Business() {
        networklList = new ArrayList<>();
        studentRequestDirectory = new StudentRequestDirectory();
        enterpriseDirectory = new EnterpriseDirectory();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        studentDirectory = new StudentDirectory();
    }

    public static Business getInstance(){
        if(business == null){
            business = new Business();
        }
        return business;
    }

    public ArrayList<Network> getNetworklList() {
        return networklList;
    }

    public StudentRequestDirectory getStudentRequestDirectory() {
        return studentRequestDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }
}
