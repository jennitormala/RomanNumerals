import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void testRomanNumerals_Ito1() {
		RomanNumerals r = new RomanNumerals();
		int number = r.convertToInteger("I");
		assertEquals(1, number);
	}
	@Test
	public void testRomanNumerals_invalidInput_1() {
		RomanNumerals r = new RomanNumerals();
		int number = r.convertToInteger("1");
		assertEquals(0, number);
	}
	
	@Test
	public void testRomanNumerals_invalidInput_12() {
		RomanNumerals r = new RomanNumerals();
		int number = r.convertToInteger("12");
		assertEquals(0, number);
	}
	
	@Test
	public void testRomanNumerals_IVto4() {
		RomanNumerals r = new RomanNumerals();
		int number = r.convertToInteger("IV");
		assertEquals(4, number);
	}
	
	@Test
	public void testRomanNumerals_VIto6() {
		RomanNumerals r = new RomanNumerals();
		int number = r.convertToInteger("VI");
		assertEquals(6, number);
	}
	
	@Test
	public void testRomanNumerals_VV_duplicate() {
		RomanNumerals r = new RomanNumerals();
		int number = r.convertToInteger("VV");
		assertEquals(0, number);
	}
	
	@Test
	public void testRomanNumerals_V_repeated() {
		RomanNumerals r = new RomanNumerals();
		int number = r.convertToInteger("VVX");
		assertEquals(0, number);
	}
	
	@Test
	public void testRomanNumerals_L_repeated() {
		RomanNumerals r = new RomanNumerals();
		int number = r.convertToInteger("LVL");
		assertEquals(0, number);
	}
	
	@Test
	public void testRomanNumerals_X_repeated() {
		RomanNumerals r = new RomanNumerals();
		int number = r.convertToInteger("XIIII");
		assertEquals(0, number);
	}
	
	@Test
	public void testRomanNumerals_MMXIVto2014() {
		RomanNumerals r = new RomanNumerals();
		int number = r.convertToInteger("MMXIV");
		assertEquals(2014, number);
	}
}
