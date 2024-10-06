package com.konman01.main;

import com.konman01.beans.Vehicle;
import com.konman01.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Random;


public class Example7 {

    public static void main(String[] args) {

       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
       Random random = new Random();
       int value = random.nextInt(10);

       System.out.println("Random number is:"+value);
       if(value % 2 == 0) {
           context.registerBean("camry", Vehicle.class, ()->{
               Vehicle vehicle = new Vehicle();
               vehicle.setName("Camry XSE");
               return vehicle;
           });
       }else {
           System.out.println("Entered into else block");
           context.registerBean("audi", Vehicle.class, ()->{
               Vehicle vehicle = new Vehicle();
               vehicle.setName("audi");
               return vehicle;
           });
       }

       Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle bean created is:"+vehicle.getName());


        return;
    }
}
