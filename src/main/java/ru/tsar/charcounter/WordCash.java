package ru.tsar.charcounter;

import java.util.HashMap;
import java.util.Map;

public class WordCash {

	public Map<String, CharCountResult> cash;

	public WordCash() {
		cash = new HashMap<String, CharCountResult>();
	}

	public void addToCash(String word, CharCountResult result) {
		cash.put(word, result);
	}

	public CharCountResult getCash(String word) {
		return cash.get(word);
	}

	public boolean containsString(String string) {
		return cash.containsKey(string);
	}

}
