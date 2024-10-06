package com.konman01;

import com.konman01.beans.Person;
import com.konman01.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person Name: " + person.getName());
        System.out.println("Vehicle Name: " + person.getVehicle().getName());
        person.getVehicle().getVehicleServices().getTyre().rotate();
        person.getVehicle().getVehicleServices().getSpeaker().makeSound();

        context.close();
    }
}