/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Personnal.Person;
import Personnal.PersonDirectory;
import Business.Business;
import Personnal.ManagerDirectory;
import Personnal.ManagerProfile;
import Personnal.StudentDirectory;
import Personnal.StudentProfile;

/**
 *
 * @author spkot
 */
public class ConfigureASystem {
    
    public static Business initialize() {
        Business business = new Business("Store");
        
        PersonDirectory persondirectory = business.getPersondirectory();
        Person p1 = persondirectory.newPerson("Manager");
        Person p2 = persondirectory.newPerson("Student");
        
        
        ManagerDirectory managerdirectory = business.getManagerdirectory();
        ManagerProfile storeMananger = managerdirectory.newManagerProfile(p1);
        
        StudentDirectory studentDirectory = business.getStudentdirectory();
        StudentProfile student1 = studentDirectory.newStudentProfile(p2);
        
        
        // Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUseraccountdirectory();
        UserAccount ua1 = uadirectory.newUserAccount(storeMananger, "sachit", "1234"); /// order products for one of the customers and performed by a sales person
        UserAccount ua3 = uadirectory.newUserAccount(student1, "sohan", "1234"); /// order products for one of the customers and performed by a sales person
    
        return business;
    }
}