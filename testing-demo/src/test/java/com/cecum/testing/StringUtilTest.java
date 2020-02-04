package com.cecum.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * StringUtilTest
 */
public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        assertEquals("holahola", StringUtil.repeat("hola", 2));
    }

    @Test
    public void repeat_string_mutiples_time() {
        assertEquals("holahola", StringUtil.repeat("hola", 2));
    }

    @Test
    public void repeat_string_zero_times() {
        assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        assertEquals("", StringUtil.repeat("hola", -5));
    }

    @Test
    public void check_string_is_not_empty(){
        assertFalse(StringUtil.isEmpty("hola"));
    }

    @Test
    public void check_string_is_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void check_null_is_empty(){
        assertTrue(StringUtil.isEmpty(null));
    }
    @Test
    public void check_space_is_empty(){
        assertTrue(StringUtil.isEmpty(" "));
    }

}