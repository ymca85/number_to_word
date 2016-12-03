package main;

import java.util.HashMap;

public class NumberToWordMapper {

	private HashMap<Integer, DigitInWord> digitAndWordMap = new HashMap<>();

	public NumberToWordMapper() {
		for (DigitInWord digitInWord : DigitInWord.values()) {
			digitAndWordMap.put(digitInWord.numericValue, digitInWord);
		}
	}

	public DigitInWord getNumberToWord(int digit) {
		return digitAndWordMap.getOrDefault(digit, DigitInWord.UNKNOWN);
	}

	String getTextForNumericValue(int numericValue) {
		return getNumberToWord(numericValue).name();
	}

	String convertTwoDigitNumberToWord(int number) {

		if (number < DigitInWord.NINETEEN.numericValue) {
			return getTextForNumericValue(number);
		}

		int digitAtTenPlace = number / DigitInWord.TEN.numericValue;
		number = number % DigitInWord.TEN.numericValue;

		if (number == 0) {
			return getTextForNumericValue(digitAtTenPlace * DigitInWord.TEN.numericValue);
		}

		return getTextForNumericValue(digitAtTenPlace * DigitInWord.TEN.numericValue) + " "
				+ getTextForNumericValue(number);
	}

	String convertThreeDigitNumberToWord(int number) {

		if (number < DigitInWord.HUNDRED.numericValue) {
			return convertTwoDigitNumberToWord(number);
		}

		int digitAtHundredPlace = number / DigitInWord.HUNDRED.numericValue;
		number = number % DigitInWord.HUNDRED.numericValue;

		if (number == 0) {
			return getTextForNumericValue(digitAtHundredPlace) + " " + DigitInWord.HUNDRED.name();
		}
		return getTextForNumericValue(digitAtHundredPlace) + " " + DigitInWord.HUNDRED.name() + " AND "
				+ convertTwoDigitNumberToWord(number);
	}

	String convertFourDigitNumberToWord(int number) {

		int digitAtThousandPlace = number / DigitInWord.THOUSAND.numericValue;
		number = number % DigitInWord.THOUSAND.numericValue;

		if (number == 0) {
			return getTextForNumericValue(digitAtThousandPlace) + " " + DigitInWord.THOUSAND.name();
		}
		return getTextForNumericValue(digitAtThousandPlace) + " " + DigitInWord.THOUSAND.name() + " "
				+ convertThreeDigitNumberToWord(number);
	}

}