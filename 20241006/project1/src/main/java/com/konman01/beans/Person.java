package com.konman01.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;

    final private Vehicle vehicle;

    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.name = "John Doe";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }
}
