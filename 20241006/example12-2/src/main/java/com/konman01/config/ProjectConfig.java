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
    public Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi 8");
        return vehicle;
    }


    @Bean
    public Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW X5");
        return vehicle;
    }



    @Bean
    public Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Mercedes");
        return vehicle;
    }

}
