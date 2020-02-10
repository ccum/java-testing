package com.cecum.discounts;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
/**
 * PriceCalcuatorShould
 */
public class PriceCalculatorShould {

    @Test
    public void total_zero_when_there_are_prices() {
        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), is(0.0));
    }
    
    @Test
    public void total_is_the_sum_of_prices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.5);
        calculator.addPrice(40.5);
        assertThat(calculator.getTotal(), is(51.0));
    }

    @Test
    public void apply_discount_to_prices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(20.5);
        calculator.addPrice(39.5);
        calculator.setDiscount(25);
        assertThat(calculator.getTotal(), is(45.0));
    }       
}