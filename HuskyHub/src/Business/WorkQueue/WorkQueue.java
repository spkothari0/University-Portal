/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author spkothari
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequests;

    public WorkQueue() {
        workRequests = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequests() {
        return workRequests;
    }

    public void setWorkRequests(ArrayList<WorkRequest> workRequests) {
        this.workRequests = workRequests;
    }
    
    public void requestCompleted(WorkRequest req){
        req.setStatus("Completed");
    }
}
