package com.cecum.testing;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
/**
 * FizzBuzzShould
 */
public class FizzBuzzShould {

    @Test
    public void when_the_number_is_divible_by_3_return_fizz() {
        assertThat(FizzBuzz.fizzBuzz(6), is("Fizz"));
    }
    @Test
    public void when_the_number_is_divible_by_5_return_buzz() {
        assertThat(FizzBuzz.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void when_the_number_is_divible_by_3_and_by_5_return_fizzbuzz() {
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
    }

    @Test
    public void when_the_number_is_not_divible_by_3_and_by_5_return_the_number() {
        assertThat(FizzBuzz.fizzBuzz(2), is("2"));
    }

}