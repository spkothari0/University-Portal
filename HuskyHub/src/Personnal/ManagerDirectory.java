/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnal;

import Personnal.ManagerProfile;
import Personnal.Person;
import java.util.ArrayList;

/**
 *
 * @author spkot
 */
public class ManagerDirectory {

    ArrayList<ManagerProfile> managerList;

    public ManagerDirectory() {
        managerList = new ArrayList<>();
    }

    public ManagerProfile newManagerProfile(Person p) {
        ManagerProfile f = new ManagerProfile(p);
        managerList.add(f);
        return f;
    }

    public ManagerProfile findManagerProfile(String id) {
        for (ManagerProfile f : managerList) {
            if (f.isMatch(id)) {
                return f;
            }
        }
        return null;
    }
    
    public ArrayList<ManagerProfile> getmanagerList(){
        return managerList;
    }
}
