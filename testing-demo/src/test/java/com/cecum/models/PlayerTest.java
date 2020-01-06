package com.cecum.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * PlayerTest
 */
public class PlayerTest {

    @Test
    public void looses_when_dice_number_is_too_low() {
        final Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        final Player player = new Player(dice, 3);
        assertEquals(false, player.play());
    }

    @Test
    public void wins_when_dice_number_is_big() {
        final Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);
        final Player player = new Player(dice, 3);
        assertEquals(true, player.play());
    }
}