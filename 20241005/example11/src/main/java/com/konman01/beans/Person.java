package com.konman01.beans;

public class Person {

    private String name;
    private Vehicle vehicle;

    public Person () {
        System.out.println("Created Object of class Person");
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
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
