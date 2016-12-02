package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.NumberToWordConverter;

public class NumberToWordConverterShould {

	@Test
	public void return_one_for_1() {
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		assertEquals("one", numberToWordConverter.convertNumberToWord(1));
	}

}
