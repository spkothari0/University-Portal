/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import Business.Role.AdminRole;

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
        return business;
    }
}