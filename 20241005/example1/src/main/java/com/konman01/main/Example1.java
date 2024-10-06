package com.konman01.main;

import com.konman01.beans.Vehicle;
import com.konman01.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {

        // Create the Vehicle Manually
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Audi 8");
        System.out.println("The Vehicle created manually:"+vehicle1.getName());

        // Create the Vehicle using Application Context
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Get the Beans created in ProjectConfig
        Vehicle vehicle2 = config.getBean(Vehicle.class);
        System.out.println("Vehicle from Application Context: "+vehicle2.getName());

        String contextString = config.getBean(String.class);
        System.out.println("String from Application Context: "+contextString);

        Integer contextInteger = config.getBean(Integer.class);
        System.out.println("Integer from Application Context: "+contextInteger);

        Boolean contextBoolean = config.getBean(Boolean.class);
        System.out.println("Boolean from Application Context: "+contextBoolean);
        return;
    }
}
