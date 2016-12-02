package main;

public class NumberToWordConverter {

	public String convertNumberToWord(int number) {
		if (number == 1) {
			return DigitInWord.ONE.name();
		}
		return DigitInWord.UNKNOWN.name();

	}

}
