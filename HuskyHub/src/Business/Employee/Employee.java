/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.UUID;

/**
 *
 * @author spkothari
 */
public class Employee {

    private String name;
    private UUID id;

    public Employee(String n) {
        name = n;
        id = UUID.randomUUID();
    }

    public Employee() {
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

    @Override
    public String toString() {
        return name;
    }
    
    
}
