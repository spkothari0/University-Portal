package Business.Enterprise;

import java.util.ArrayList;

import Business.Enterprise.Enterprise.EnterpriseType;

public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public boolean removeEnterprise(Enterprise enterprise) {
        return enterpriseList.remove(enterprise);
    }

    public Enterprise createNewEnterprise(EnterpriseType enterpriseType) {
        Enterprise enterprise = null;
        String enterpriseTypeName = enterpriseType.name();

        try {
            Class<?> enterpriseClass = Class.forName("Business.Enterprise." + enterpriseTypeName + "Enterprise");
            enterprise = (Enterprise) enterpriseClass.getDeclaredConstructor(EnterpriseType.class)
                    .newInstance(enterpriseType);
            enterpriseList.add(enterprise);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return enterprise;
    }
}
