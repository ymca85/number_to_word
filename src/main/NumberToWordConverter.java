package main;

public class NumberToWordConverter {

	public String convertNumberToWord(int number) {

		NumberToWordMapper numberToWordMapper = new NumberToWordMapper();

		if (number >= 100) {

			int digitAtHundredPlace = number / DigitInWord.HUNDRED.numericValue;
			int numberAtTens = number % DigitInWord.HUNDRED.numericValue;

			if (numberAtTens == 0) {
				return numberToWordMapper.getWordFromDigit(digitAtHundredPlace).name() + " "
						+ DigitInWord.HUNDRED.name();
			}

		} else if (number > DigitInWord.TWENTY.numericValue) {
			return numberToWordMapper.convertNumberToWord(number);
		}

		return numberToWordMapper.getWordFromDigit(number).name();
	}
}
