package Business.Role;

import javax.swing.JPanel;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

public class ITSupportRole extends Role{
    @Override
    public void createWorkArea(JPanel userProcessContainer, UserAccount user, Enterprise enterprise, Organization organization, Business business, Network network){
        System.out.println("Admin role:Create work area");
    }
}
