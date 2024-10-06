package com.konman01.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    final private Tyre tyre;

    final private Speaker speaker;

    public Vehicle(@Qualifier("micheline") Tyre tyre,@Qualifier("sony") Speaker speaker) {
        this.tyre = tyre;
        this.speaker = speaker;
        this.name = "Camry";
    }


    public Tyre getTyre() {
        return tyre;
    }

    public Speaker getSpeaker() {
        return speaker;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
