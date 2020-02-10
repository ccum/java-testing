package com.cecum.discounts;

import java.util.ArrayList;
import java.util.List;

/**
 * PriceCalcuator
 */
public class PriceCalculator {


    private List<Double> prices = new ArrayList<>();
    private double discount;

	public double getTotal() {
       double result = 0;
       for (Double item : prices) {
            result +=item;
       }
       return result * ((100 - discount)/100);
	}

	public void addPrice(double d) {
        prices.add(d);
	}

    public void setDiscount(double discount) {
        this.discount = discount;
	}

    
}