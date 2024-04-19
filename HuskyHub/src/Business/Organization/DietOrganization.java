/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.Role;

/**
 *
 * @author spkothari
 */
public class DietOrganization extends Organization{
    public DietOrganization(){
        super(Organization.OrganizationType.Diet);
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Business.Role.DietManagerRole());
        roles.add(new Business.Role.NutritionistRole());
        return roles;
    }
}
