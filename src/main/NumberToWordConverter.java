package main;

public class NumberToWordConverter {

	public String convertNumberToWord(int number) {

		NumberToWordMapper numberToWordMapper = new NumberToWordMapper();

		if (number > DigitInWord.TWENTY.numericValue) {
			return numberToWordMapper.convertNumberToWord(number);
		}

		return numberToWordMapper.getWordFromDigit(number).name();
	}
}
