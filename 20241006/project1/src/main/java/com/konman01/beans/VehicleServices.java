package com.konman01.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {


    final private Tyre tyre;

    final private Speaker speaker;

    public VehicleServices(@Qualifier("micheline") Tyre tyre, @Qualifier("sony") Speaker speaker) {
        this.tyre = tyre;
        this.speaker = speaker;
    }


    public Tyre getTyre() {
        return tyre;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

}
