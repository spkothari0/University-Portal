package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;


public class StoreEnterprise extends Enterprise {
   
    public StoreEnterprise(String name){
        super(name,Enterprise.EnterpriseType.CollegeStore);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
