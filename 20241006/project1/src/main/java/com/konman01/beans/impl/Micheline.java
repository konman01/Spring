package com.konman01.beans.impl;

import com.konman01.beans.Tyre;
import org.springframework.stereotype.Component;

@Component("micheline")
public class Micheline implements Tyre {

    @Override
    public void rotate() {
        System.out.println("Rotating Micheline Tyre");
    }
}
