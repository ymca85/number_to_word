package main;

public class NumberToWordConverter {

	public String convertNumberToWord(int number) {

		DigitToWordMapper digitToWordMapper = new DigitToWordMapper();

		if (number > DigitInWord.TWENTY.numericValue) {

			int digitAtTens = number / DigitInWord.TEN.numericValue;
			int digitAtUnit = number % DigitInWord.TEN.numericValue;

			return digitToWordMapper.getWordFromDigit(digitAtTens * DigitInWord.TEN.numericValue).name() + " "
					+ digitToWordMapper.getWordFromDigit(digitAtUnit).name();
		}

		return digitToWordMapper.getWordFromDigit(number).name();
	}
}
