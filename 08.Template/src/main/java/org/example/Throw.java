package org.example;

import java.util.Random;

public class Throw {

    static final Random random = new Random();
    static final double hit = 0.30;

    public boolean throwDart() {
        return random.nextDouble() < hit;
    }

}
