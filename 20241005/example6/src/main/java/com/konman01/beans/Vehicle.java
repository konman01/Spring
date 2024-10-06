package com.konman01.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init(){
        this.name = "Camry XSE";
    }

    @PreDestroy
    public void destry(){
        System.out.println("Destroying the bean");
    }
    

    public void printHello(){
        System.out.println("Hello from vehicle component");
    }
}
