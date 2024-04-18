/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnal;

import Personnal.Person;
import Personnal.Profile;
import Business.Role;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile extends Profile {


    public StudentProfile(Person p) {
        super(p);

        
    }

    @Override
    public String getRole() {
        return Role.Student.toString();
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

}
