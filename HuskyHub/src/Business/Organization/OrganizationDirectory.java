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

    public Organization createOrganization(Type type) {
        Organization organization = null;

        if (type.getValue().equals(Type.Nutrition.getValue())) {
            organization = new NutritionOrganization();
        } else if (type.getValue().equals(Type.WeightTraining.getValue())) {
            organization = new WeightTrainingOrganization();
        } else if (type.getValue().equals(Type.FitnessTraining.getValue())) {
            organization = new FitnessTrainingOrganization();
        } else if (type.getValue().equals(Type.Physiotherapist.getValue())) {
            organization = new PhysioOrganization();
        } else if (type.getValue().equals(Type.GeneralPractitioner.getValue())) {
            organization = new GenPracOrganization();
        } else if (type.getValue().equals(Type.DormInventory.getValue())) {
            organization = new InventoryOrganization();
        } else if (type.getValue().equals(Type.Delivery.getValue())) {
            organization = new DeliveryOrganization();
        } else if (type.getValue().equals(Type.Service.getValue())) {
            organization = new ServiceOrganization();
        } else if (type.getValue().equals(Type.ServiceWorker.getValue())) {
            organization = new ServiceWorkerOrganization();
        } else if (type.getValue().equals(Type.FoodStore.getValue())) {
            organization = new FoodStoreOrganization();
        } else if (type.getValue().equals(Type.StationaryStore.getValue())) {
            organization = new StationeryStoreOrganization();
        }
        organizationList.add(organization);
        return organization;
    }
}
