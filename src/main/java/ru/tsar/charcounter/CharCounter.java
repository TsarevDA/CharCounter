package ru.tsar.charcounter;

public class CharCounter {

	public CharCountResult count(String string, WordCash cash) {
		if (string == null || cash == null) {
			throw new IllegalArgumentException("String or cash cant't be null");
		}
		CharCountResult result = new CharCountResult(string);
		char[] chars = string.toCharArray();

		if (cash.containsString(string)) {
			return cash.getCash(string);
		}

		for (char letter : chars) {
			result.addResult(letter);
		}
		cash.addToCash(string, result);
		return result;
	}

}
