package main;

import java.util.HashMap;

public class DigitToWordMapper {

	private HashMap<Integer, DigitInWord> digitAndWordMap = new HashMap<>();
	
	public DigitToWordMapper() {
		for(DigitInWord digitInWord : DigitInWord.values()) {
			digitAndWordMap.put(digitInWord.numericValue, digitInWord);
		}
	}
	
	public DigitInWord getWordFromDigit(int digit) {
		return digitAndWordMap.getOrDefault(digit, DigitInWord.UNKNOWN);
	}
}
