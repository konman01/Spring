package com.konman01.config;

import com.konman01.beans.Person;
import com.konman01.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.konman01.beans")
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Camry XSE");
        return vehicle;
    }

    @Bean
    public Person person(Vehicle vehicle){
        Person person = new Person();
        person.setName("John");
        person.setVehicle(vehicle);
        return person;
    }

}
