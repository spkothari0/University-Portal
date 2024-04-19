/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import javax.swing.JPanel;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author spkothari
 */
public class AdminRole extends Role{
    @Override
    public void createWorkArea(JPanel userProcessContainer, UserAccount user, Enterprise enterprise, Organization organization, Business business, Network network){
        System.out.println("Admin role:Create work area");
    }
}
