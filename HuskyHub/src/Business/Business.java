/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Personnal.ManagerDirectory;
import Personnal.PersonDirectory;
import Personnal.StudentDirectory;

/**
 *
 * @author Yash Khavnekar
 */
public class Business {

    UserAccountDirectory useraccountdirectory;
    PersonDirectory persondirectory; //all people profiles regardless of the role
    ManagerDirectory managerdirectory;
    StudentDirectory studentdirectory;
    String name;

    public Business(String n) {
        name = n;
        useraccountdirectory = new UserAccountDirectory();
        persondirectory = new PersonDirectory();
        managerdirectory = new ManagerDirectory();
        studentdirectory = new StudentDirectory();
    }

    public UserAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }

    public void setUseraccountdirectory(UserAccountDirectory useraccountdirectory) {
        this.useraccountdirectory = useraccountdirectory;
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public void setPersondirectory(PersonDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }

    public ManagerDirectory getManagerdirectory() {
        return managerdirectory;
    }

    public void setManagerdirectory(ManagerDirectory managerdirectory) {
        this.managerdirectory = managerdirectory;
    }

    public StudentDirectory getStudentdirectory() {
        return studentdirectory;
    }

    public void setStudentdirectory(StudentDirectory studentdirectory) {
        this.studentdirectory = studentdirectory;
    }
    
    
    
    
    
    

   
    
    
    
}
