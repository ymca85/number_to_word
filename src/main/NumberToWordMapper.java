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

	String convertNumberToWord(int number) {

		int digitAtTenPlace = number / DigitInWord.TEN.numericValue;
		number = number % DigitInWord.TEN.numericValue;

		if (number == 0) {
			return getTextForNumericValue(digitAtTenPlace * DigitInWord.TEN.numericValue);
		}

		return getTextForNumericValue(digitAtTenPlace * DigitInWord.TEN.numericValue) + " "
				+ getTextForNumericValue(number);
	}

	String getTextForNumericValue(int numericValue) {
		return getNumberToWord(numericValue).name();
	}

}