package main;

public class NumberToWordConverter {

	public String convertNumberToWord(int number) {

		NumberToWordMapper numberToWordMapper = new NumberToWordMapper();

		if (isNumberInThousands(number)) {
			return numberToWordMapper.convertFourDigitNumberToWord(number);
		} else if (isNumberInHundreds(number)) {
			return numberToWordMapper.convertThreeDigitNumberToWord(number);
		} else if (isNumberInTens(number)) {
			return numberToWordMapper.convertTwoDigitNumberToWord(number);
		}

		return numberToWordMapper.getTextForNumericValue(number);
	}

	private boolean isNumberInThousands(int number) {
		return number / DigitInWord.THOUSAND.numericValue > 0;
	}

	private boolean isNumberInTens(int number) {
		return number / DigitInWord.TEN.numericValue > 0;
	}

	private boolean isNumberInHundreds(int number) {
		return number / DigitInWord.HUNDRED.numericValue > 0;
	}

}