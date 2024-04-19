/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import Business.Role.AdminRole;
import Business.Role.HealthAndFitnessManagerRole;

/**
 *
 * @author spkot
 */
public class ConfigureASystem {
    public static Business configure(){
        Business business = Business.getInstance();
        
        Employee e= business.getEmployeeDirectory().createNewEmployee("Admin");
        
        UserAccount user=business.getUserAccountDirectory().createUserAccount("admin", "admin");
        user.setEmployee(e);
        user.setRole(new AdminRole());
        
        Employee e1 = business.getEmployeeDirectory().createNewEmployee("Health and Fitness Manager");
        
        UserAccount user1 = business.getUserAccountDirectory().createUserAccount("Health and Fitness Manager", "admin");
        user.setEmployee(e1);
        user.setRole(new HealthAndFitnessManagerRole());
        
        
        return business;
    }
}