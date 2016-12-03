package main;

public class NumberToWordConverter {

	public String convertNumberToWord(int number) {

		NumberToWordMapper numberToWordMapper = new NumberToWordMapper();

		if (isThreeDigitNumber(number)) {

			int digitAtHundredPlace = number / DigitInWord.HUNDRED.numericValue;
			number = number % DigitInWord.HUNDRED.numericValue;

			if (number == 0) {
				return numberToWordMapper.getTextForNumericValue(digitAtHundredPlace) + " "
						+ DigitInWord.HUNDRED.name();
			}
		} else if (isTwoDigitNumber(number)) {
			return numberToWordMapper.convertNumberToWord(number);
		}

		return numberToWordMapper.getTextForNumericValue(number);
	}

	private boolean isTwoDigitNumber(int number) {
		return number / DigitInWord.TEN.numericValue > 0;
	}

	private boolean isThreeDigitNumber(int number) {
		return number / DigitInWord.HUNDRED.numericValue > 0;
	}

}