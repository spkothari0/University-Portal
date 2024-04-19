/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;

/**
 *
 * @author spkothari
 */
public class Enterprise {
    private String name;
    private OrganizationDirectory organizationDirectory;

    public enum EnterpriseType {
        HealthAndFitness("Health and Fitness"),
        DormAndHousing("Dorm and Housing"),
        AdminServices("Admin Services"),
        ITServices("IT Services"),
        Store("Store");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Enterprise(EnterpriseType type) {
        this.name = type.getValue();
        organizationDirectory = new OrganizationDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
}
