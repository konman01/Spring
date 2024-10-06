package com.konman01.main;

import com.konman01.beans.Person;
import com.konman01.beans.Vehicle;
import com.konman01.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example10 {

    public static void main(String[] args) {

       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

       Person  person = context.getBean(Person.class);
       Vehicle vehicle = context.getBean(Vehicle.class);

       System.out.println("Person name is:"+person.getName());
       System.out.println("Vehicle name is:"+vehicle.getName());
       System.out.println("Person owing the vehicle is:"+person.getVehicle());
       return;
    }
}
