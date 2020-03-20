package com.cecum.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsShould {
	
	@Test
	public void I_Symbol() {
		
		assertEquals("I", RomanNumerals.arabicToRoman(1));
	}
	
	@Test
	public void II_Symbol() {
		
		assertEquals("II", RomanNumerals.arabicToRoman(2));
	}
	
	@Test
	public void III_Symbol() {
		assertEquals("III", RomanNumerals.arabicToRoman(3));
	}
	@Test
	public void IV_Symbol() {
		assertEquals("IV", RomanNumerals.arabicToRoman(4));
	}
	
	@Test
	public void V_Symbol() {
		assertEquals("V", RomanNumerals.arabicToRoman(5));
	}
	
	@Test
	public void VI_Symbol() {
		assertEquals("VI", RomanNumerals.arabicToRoman(6));
	}
	@Test
	public void VII_Symbol() {
		assertEquals("VII", RomanNumerals.arabicToRoman(7));
	}
	
	@Test
	public void X_Symbol() {
		assertEquals("X", RomanNumerals.arabicToRoman(10));
	}
	@Test
	public void XI_Symbol() {
		assertEquals("XI", RomanNumerals.arabicToRoman(11));
	}
	@Test
	public void XIV_Symbol() {
		assertEquals("XIV", RomanNumerals.arabicToRoman(14));
	}
	@Test
	public void XV_Symbol() {
		assertEquals("XV", RomanNumerals.arabicToRoman(15));
	}
	@Test
	public void XVI_Symbol() {
		assertEquals("XVI", RomanNumerals.arabicToRoman(16));
	}
	@Test
	public void XIX_Symbol() {
		assertEquals("XIX", RomanNumerals.arabicToRoman(19));
	}
	@Test
	public void XLIX_Symbol() {
		assertEquals("XLIX", RomanNumerals.arabicToRoman(49));
	}
	@Test
	public void L_Symbol() {
		assertEquals("L", RomanNumerals.arabicToRoman(50));
	}
	@Test
	public void LI_Symbol() {
		assertEquals("LI", RomanNumerals.arabicToRoman(51));
	}
	@Test
	public void LX_Symbol() {
		assertEquals("LX", RomanNumerals.arabicToRoman(60));
	}
	@Test
	public void LXXX_Symbol() {
		assertEquals("LXXX", RomanNumerals.arabicToRoman(80));
	}
	@Test
	public void LXXXI_Symbol() {
		assertEquals("LXXXI", RomanNumerals.arabicToRoman(81));
	}
	@Test
	public void LXXXVI_Symbol() {
		assertEquals("LXXXVI", RomanNumerals.arabicToRoman(86));
	}
	@Test
	public void CXXVI_Symbol() {
		assertEquals("CXXVI", RomanNumerals.arabicToRoman(126));
	}
	
	@Test
	public void MMDVII_Symbol() {
		assertEquals("MMDVII", RomanNumerals.arabicToRoman(2507));
	}
	
	
}
