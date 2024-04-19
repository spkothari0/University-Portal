/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Store;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author spkot
 */
public class Store {

    private String name;
    private UUID id;
    private ArrayList<Item> availableItems;

    public Store() {
        availableItems = new ArrayList<>();
        id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ArrayList<Item> getAvailableItems() {
        return availableItems;
    }
    
    public Item createNewItem(){
        Item i=new Item();
        availableItems.add(i);
        return i;
    }
    
    public void buyItem(Item i){
        i.itemBought();
    }
    
    public boolean isItemAvailable(Item i){
        return i.isAvailable();
    }

    @Override
    public String toString() {
        return name;
    }
}
