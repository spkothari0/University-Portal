/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Store.Items;
import java.util.ArrayList;

/**
 *
 * @author spkot
 */
public class StationeryStoreWorkRequest extends WorkRequest{
    ArrayList<Items> stationeryRequestList;
    
    public StationeryStoreWorkRequest(){
        stationeryRequestList=new ArrayList<>();
    }

    public ArrayList<Items> getStationeryRequestList() {
        return stationeryRequestList;
    }

    public int getTotalBill() {
        int sum = 0;
        for (Items i : stationeryRequestList) {
            sum += i.getPrice() * i.getQuantity();
        }
        return sum;
    }
}
