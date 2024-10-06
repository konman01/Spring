package com.konman01.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class Vehicle {

    private String name;

    public Vehicle () {
        System.out.println("Created Object of class Vehicle");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public void printHello(){
        System.out.println("Hello from vehicle " + name);
    }

    @Override
    public String toString() {
        return "Vehicle [name=" + name + "]";
    }
}
