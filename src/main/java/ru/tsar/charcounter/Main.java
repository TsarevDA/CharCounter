package ru.tsar.charcounter;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter();
		WordCaching cash = new WordCaching(counter);

		Map<Character, Integer> result = new LinkedHashMap<Character, Integer>();
		result = cash.countChars("hello world!");
		System.out.println(format(result, "hello world!"));
		result = cash.countChars("hello world!");
		System.out.println(format(result, "hello world!"));
	}

	public static String format(Map<Character, Integer> result, String string) {
		if (result == null) {
			throw new IllegalArgumentException("String or cash cant't be null");
		}

		String resultString = string + System.lineSeparator();

		for (Map.Entry entry : result.entrySet()) {
			resultString = resultString + "\"" + entry.getKey() + "\"" + " - " + entry.getValue()
					+ System.lineSeparator();
		}
		return resultString;
	}
}
