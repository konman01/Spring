package com.konman01.beans.impl;

import com.konman01.beans.Tyre;
import org.springframework.stereotype.Component;

@Component("bridgeStone")
public class BridgeStone implements Tyre {
    @Override
    public void rotate() {
        System.out.println("Rotating Bridge Stone");
    }
}
