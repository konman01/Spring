package com.konman01.config;

import com.konman01.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean("camryXSE")
    public Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Camry XSE");
        return vehicle;
    }

    @Bean("hondaCivic")
    public Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda Civic");
        return vehicle;
    }

    @Bean("toyotaCamry")
    public Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota Camry");
        return vehicle;
    }



}
