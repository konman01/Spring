package com.konman01.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private final Vehicle vehicle;
    @Autowired
    public Person(@Qualifier("vehicle2") Vehicle vehicle1) {
        this.vehicle = vehicle1;
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
