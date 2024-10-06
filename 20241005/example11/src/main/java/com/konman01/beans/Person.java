package com.konman01.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;

    @Autowired
    private Vehicle vehicle;

    public Person () {
        name = "Manjunath";
        System.out.println("Created Object of class Person");
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
