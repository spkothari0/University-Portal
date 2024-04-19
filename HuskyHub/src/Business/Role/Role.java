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
public abstract class Role {

    public enum RoleType {
        AdminRole("Admin"),
        HealthAndFitnessManagerRole("Health and Fitness Manager"),
        NutritionistRole("Nutritionist"),
        GeneralPractitionerDocRole("General Practitioner Doctor"),
        PhysiotherapistRole("Physiotherapist"),
        WeightLossTrainerRole("Weight Loss Trainer"),
        FitnessTrainerRole("Fitness Trainer"),
        DormAndHousingManagerRole("Dorm and Housing Manager"),
        DeliveryProviderRole("Delivery Partner"),
        MaintenanceWorkerRole("Maintenance Service Worker"),
        OGSCoordinatorRole("OGS Coordinator"),
        FinancialAidRole("Financial Aid Officer"),
        ITSupportRole("IT Support Specialist"),
        StoreManagerRole("Store Manager"),
        StoreHelperRole("Store Helper");
        
        private String value;

        private RoleType(String n) {
            value = n;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract void createWorkArea(JPanel userProcessContainer, UserAccount user, Enterprise enterprise, Organization organization, Business business, Network network);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
