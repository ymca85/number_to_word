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
	
	@Test
	public void return_ONE_HUNDRED_for_100() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("ONE HUNDRED", numberToWordConverter.convertNumberToWord(100));
	}
	
	@Test
	public void return_ONE_HUNDRED_AND_ONE_for_101() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("ONE HUNDRED AND ONE", numberToWordConverter.convertNumberToWord(101));
	}
	
	@Test
	public void return_ONE_HUNDRED_AND_ELEVEN_for_111() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("ONE HUNDRED AND ELEVEN", numberToWordConverter.convertNumberToWord(111));
	}
	
	@Test
	public void return_NINE_HUNDRED_AND_NINTY_NINE_for_999() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("NINE HUNDRED AND NINTY NINE", numberToWordConverter.convertNumberToWord(999));
	}
	
	@Test
	public void return_ONE_THOUSAND_for_1000() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("ONE THOUSAND", numberToWordConverter.convertNumberToWord(1000));
	}
	
	@Test
	public void return_ONE_THOUSAND_ONE_for_1001() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("ONE THOUSAND ONE", numberToWordConverter.convertNumberToWord(1001));
	}
	
	@Test
	public void return_ONE_THOUSAND_TWO_HUNDRED_AND_THIRTY_FOUR_for_1234() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("ONE THOUSAND TWO HUNDRED AND THIRTY FOUR", numberToWordConverter.convertNumberToWord(1234));
	}
	
	@Test
	public void return_NINE_THOUSAND_NINE_HUNDRED_AND_NINTY_NINE_for_9999() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("NINE THOUSAND NINE HUNDRED AND NINTY NINE", numberToWordConverter.convertNumberToWord(9999));
	}
	
	@Test
	public void return_NINE_THOUSAND_NINE_HUNDRED_for_9900() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("NINE THOUSAND NINE HUNDRED", numberToWordConverter.convertNumberToWord(9900));
	}
	
	@Test
	public void return_NINE_THOUSAND_NINE_HUNDRED_AND_NINTYfor_9990() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("NINE THOUSAND NINE HUNDRED AND NINTY", numberToWordConverter.convertNumberToWord(9990));
	}
	

}