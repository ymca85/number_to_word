package main;

public enum DigitInWord {
	ZERO (0),
	ONE (1),
	TWO(2),
	UNKNOWN (-999);

	int numericValue;
	
	private DigitInWord(int numericValue) {
		this.numericValue = numericValue;
	}
	
}
