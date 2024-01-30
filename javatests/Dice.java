package com.platzi.javatests;

import java.util.Random;

public class Dice {

    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return new Random().nextInt(sides) + 1;
    }
}
