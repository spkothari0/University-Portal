/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnal;

import Personnal.Person;
import Personnal.Profile;



/**
 *
 * @author spkot
 */
import Business.Role;
public class ManagerProfile extends Profile{
    
    public ManagerProfile(Person p){
        super(p);
    }
    
    @Override
    public String getRole() {
        return Role.Manager.toString();
    }
    
    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }
}
