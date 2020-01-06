package com.cecum.models;

import java.util.Random;

public class Dice {

    private int sides;

    public Dice(int sides) {
        this.setSides(sides);
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return new Random().nextInt(sides) + 1;
    }
}
