package com.cecum.testing;

import static com.cecum.testing.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * PasswordUtilTest
 */
public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("12!ww#"));

    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd12345"));
    }

    @Test
    public void medium_when_has_letters_numbers_and_symblos() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd12345!"));
    }
}