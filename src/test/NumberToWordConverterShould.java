package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.NumberToWordConverter;

public class NumberToWordConverterShould {

	@Test
	public void return_one_for_1() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("ONE", numberToWordConverter.convertNumberToWord(1));
	}
	
	@Test
	public void return_one_for_0() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("ZERO", numberToWordConverter.convertNumberToWord(0));
	}

}
