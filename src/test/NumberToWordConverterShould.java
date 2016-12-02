package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.NumberToWordConverter;

public class NumberToWordConverterShould {

	@Test
	public void return_ONE_for_1() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("ONE", numberToWordConverter.convertNumberToWord(1));
	}
	
	@Test
	public void return_ZERO_for_0() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("ZERO", numberToWordConverter.convertNumberToWord(0));
	}
	
	@Test
	public void return_NINE_for_2() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("TWO", numberToWordConverter.convertNumberToWord(2));
	}
	
	@Test
	public void return_NINE_for_21() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("TWENTY ONE", numberToWordConverter.convertNumberToWord(21));
	}

}
