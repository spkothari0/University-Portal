/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author shreyas
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<>();
    }
    
    public void removeEnterprise(Enterprise e){
        enterpriseList.remove(e);
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(null != type)
            switch (type) {
            case NourishmentEnterprise:
                enterprise=new NourishmentEnterprise(name);
                break;
            case GymHelperEnterprise:
                enterprise=new GymHelperEnterprise(name);
                break;
            case HealthConsultantEnterprise:
                enterprise=new HealthConsultantEnterprise(name);
                break;
            case UniversityHousingEnterprise:
                enterprise=new UniversityHousingEnterprise(name);
                break;
            case HousingRepairEnterprise:
                enterprise=new HousingRepairEnterprise(name);
                break;
            case CollegeStoreEnterprise:
                enterprise=new CollegeStoreEnterprise(name);
                break;
            default:
                break;
        }
        
        enterpriseList.add(enterprise);
        return enterprise;
    }
}
