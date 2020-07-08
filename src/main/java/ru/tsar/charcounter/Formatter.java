package ru.tsar.charcounter;

import java.util.Map;

public class Formatter {

	public static String formattingResult(CharCountResult result) {
		if (result == null) {
			throw new IllegalArgumentException("String or cash cant't be null");
		}

		String resultString = result.getString() + System.lineSeparator();

		for (Map.Entry entry : result.getResult().entrySet()) {
			resultString = resultString + "\"" + entry.getKey() + "\"" + " - " + entry.getValue()
					+ System.lineSeparator();
		}

		return resultString;
	}

}
