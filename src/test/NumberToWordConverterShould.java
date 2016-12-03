package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.NumberToWordConverter;

public class NumberToWordConverterShould {

	@Test
	public void return_ZERO_for_0() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("ZERO", numberToWordConverter.convertNumberToWord(0));
	}

	@Test
	public void return_ONE_for_1() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("ONE", numberToWordConverter.convertNumberToWord(1));
	}

	@Test
	public void return_TWO_for_2() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("TWO", numberToWordConverter.convertNumberToWord(2));
	}

	@Test
	public void return_TWENTY_for_20() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("TWENTY ONE", numberToWordConverter.convertNumberToWord(21));
	}

	@Test
	public void return_TWENTY_ONE_for_21() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("TWENTY ONE", numberToWordConverter.convertNumberToWord(21));
	}

	@Test
	public void return_TWENTY_TWO_for_22() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("TWENTY TWO", numberToWordConverter.convertNumberToWord(22));
	}

	@Test
	public void return_TWENTY_NINE_for_29() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("TWENTY NINE", numberToWordConverter.convertNumberToWord(29));
	}
	
	@Test
	public void return_THIRTY_for_30() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("THIRTY", numberToWordConverter.convertNumberToWord(30));
	}
	
	@Test
	public void return_THIRTY_ONE_for_31() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("THIRTY ONE", numberToWordConverter.convertNumberToWord(31));
	}
	
	@Test
	public void return_THIRTY_ONE_for_39() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("THIRTY NINE", numberToWordConverter.convertNumberToWord(39));
	}
	
	@Test
	public void return_NINTY_for_90() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("NINTY", numberToWordConverter.convertNumberToWord(90));
	}
	
	@Test
	public void return_NINTY_NINE_for_99() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("NINTY NINE", numberToWordConverter.convertNumberToWord(99));
	}

}
