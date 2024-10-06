package com.konman01.beans.impl;

import com.konman01.beans.Speaker;
import org.springframework.stereotype.Component;

@Component("sony")
public class Sony implements Speaker {
    @Override
    public void makeSound() {
        System.out.println("Making Sound from Sony Speaker");
    }
}
