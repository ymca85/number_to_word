package main;

public class NumberToWordConverter {

	public String convertNumberToWord(int number) {

		NumberToWordMapper numberToWordMapper = new NumberToWordMapper();

		if (isNumberInHundreds(number)) {
			return numberToWordMapper.convertThreeDigitNumberToWord(number);
		} else if (isNumberGreaterThanNinteen(number)) {
			return numberToWordMapper.convertTwoDigitNumberToWord(number);
		}
		
		return numberToWordMapper.getTextForNumericValue(number);
	}

	private boolean isNumberGreaterThanNinteen(int number) {
		return number > DigitInWord.NINETEEN.numericValue;
	}

	private boolean isNumberInHundreds(int number) {
		return number / DigitInWord.HUNDRED.numericValue > 0;
	}

}