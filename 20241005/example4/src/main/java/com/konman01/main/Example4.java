package com.konman01.main;

import com.konman01.beans.Vehicle;
import com.konman01.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    public static void main(String[] args) {

        // Create the Vehicle Manually
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Audi 8");
        System.out.println("The Vehicle created manually:"+vehicle1.getName());

        // Create the Vehicle using Application Context
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Get the Beans created in ProjectConfig
        Vehicle camryXSE = config.getBean(Vehicle.class);
        System.out.println("camryXSE from Application Context: "+camryXSE.getName());

        return;
    }
}
