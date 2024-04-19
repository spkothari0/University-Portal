/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import java.util.ArrayList;
import java.util.UUID;

import Business.Employee.Employee;
import Business.Student.Student;

/**
 *
 * @author spkothari
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount createUserAccount(String username, String password) {
        UserAccount user = new UserAccount();
        user.setUsername(username);
        user.setPassword(password);
        userAccountList.add(user);
        return user;
    }

    public void deleteUserAccount(UserAccount user) {
        userAccountList.remove(user);
    }

    public UserAccount getUserByUsername(String username) {
        UserAccount user = null;
        user = userAccountList.stream()
                              .filter(account -> account.getUsername().equals(username))
                              .findFirst()
                              .orElse(null);

        return user;
    }

    public UserAccount getUserById(UUID id) {
        UserAccount user = null;
        user = userAccountList.stream()
                              .filter(account -> account.getEmployee().getId().equals(id) || account.getStudent().getId().equals(id))
                              .findFirst()
                              .orElse(null);

        return user;
    }

    public UserAccount getUserByEmployeeId(Employee e) {
        UserAccount user = null;
        user = userAccountList.stream()
                              .filter(account -> account.getEmployee().equals(e))
                              .findFirst()
                              .orElse(null);

        return user;
    }

    public UserAccount getUserByStudentId(Student s) {
        UserAccount user = null;
        user = userAccountList.stream()
                              .filter(account -> account.getStudent().equals(s))
                              .findFirst()
                              .orElse(null);

        return user;
    }

    public UserAccount authenticateUser(String username, String password) {
        UserAccount user = null;
        user = userAccountList.stream()
                              .filter(account -> account.getUsername().equals(username) && account.getPassword().equals(password))
                              .findFirst()
                              .orElse(null);

        return user;
    }
}
