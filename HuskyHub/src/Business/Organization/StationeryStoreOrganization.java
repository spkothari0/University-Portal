/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.*;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Yash Khavnekar
 */


public class StationeryStoreOrganization extends Organization{

    public StationeryStoreOrganization() {
        super(Organization.Type.StationaryStore.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StationeryStoreManagerRole());
        return roles;
    }
     
   
    
    
}
