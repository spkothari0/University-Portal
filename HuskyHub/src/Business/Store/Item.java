/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Store;

import java.util.*;

/**
 *
 * @author spkot
 */
public class Item {

    private String name;
    private UUID id;
    private double price;
    private int amount;

    public Item() {
        id = UUID.randomUUID();
    }

    public Item(String n, double p, int amt) {
        name = n;
        price = p;
        amount = amt;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int a) {
        this.amount = a;
    }

    public boolean isAvailable() {
        return amount > 0;
    }
    
    public int itemBought(){
        return --amount;
    }
    
    public int itemAdded(){
        return ++amount;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
