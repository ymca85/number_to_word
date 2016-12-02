package main;

public class NumberToWordConverter {

	public String convertNumberToWord(int number) {

		DigitToWordMapper digitToWordMapper = new DigitToWordMapper();

		return digitToWordMapper.getWordFromDigit(number).name();
	}
}
