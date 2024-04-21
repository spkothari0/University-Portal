/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author daminithorat
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;

        if (type.getValue().equals(Type.Nutrition.getValue())){
            organization = new NutritionistCatalog();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.WeightTraining.getValue())){
            organization = new WeightTrainingCatalog();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.FitnessTraining.getValue())){
            organization = new FitnessTrainerCatalog();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Physiotherapist.getValue())){
            organization = new PhysioCatalog();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.GeneralPractitioner.getValue())){
            organization = new DoctorCatalog();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.DormInventory.getValue())){
            organization = new InventoryCatalog();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryCatalog();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Service.getValue())){
            organization = new ServiceCatalog();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.ServiceWorker.getValue())){
            organization = new ServiceWorkerCatalog();
            organizationList.add(organization);
        }
      
        return organization;
    }
}