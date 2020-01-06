package com.cecum.models;

/**
 * Player
 */
public class Player {

    private Dice dice;
    private int minNumberToWin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    public boolean play(){
        final int diceNumer = dice.roll();
        return diceNumer > minNumberToWin;
    }
}