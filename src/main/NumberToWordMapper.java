package main;

import java.util.HashMap;

public class NumberToWordMapper {

	private HashMap<Integer, DigitInWord> digitAndWordMap = new HashMap<>();

	public NumberToWordMapper() {
		for (DigitInWord digitInWord : DigitInWord.values()) {
			digitAndWordMap.put(digitInWord.numericValue, digitInWord);
		}
	}

	public DigitInWord getWordFromDigit(int digit) {
		return digitAndWordMap.getOrDefault(digit, DigitInWord.UNKNOWN);
	}

	String convertNumberToWord(int number) {

		int digitAtTens = number / DigitInWord.TEN.numericValue;
		int digitAtUnit = number % DigitInWord.TEN.numericValue;

		if (digitAtUnit == 0) {
			return getWordFromDigit(digitAtTens * DigitInWord.TEN.numericValue).name();
		}

		return getWordFromDigit(digitAtTens * DigitInWord.TEN.numericValue).name() + " "
				+ getWordFromDigit(digitAtUnit).name();
	}

}
