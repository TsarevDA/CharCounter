package ru.tsar.charcounter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import org.junit.jupiter.api.Test;

class FormatterTest {
	private String actual;
	private String expected;

	@Test
	void givenNullString_whenCharCount_thenthenIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> Main.format(null, null));
	}

	@Test
	void givenString_whenCharCount_thenNumberOfUniqueCharacters() {

		LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();
		charMap.put('h', 1);
		charMap.put('e', 1);
		charMap.put('l', 3);
		charMap.put('o', 2);
		charMap.put(' ', 1);
		charMap.put('w', 1);
		charMap.put('r', 1);
		charMap.put('d', 1);
		charMap.put('!', 1);

		actual = Main.format(charMap, "hello world!");
		expected = "hello world!" + System.lineSeparator() + "\"h\"" + " - " + "1" + System.lineSeparator() + "\"e\""
				+ " - " + "1" + System.lineSeparator() + "\"l\"" + " - " + "3" + System.lineSeparator() + "\"o\""
				+ " - " + "2" + System.lineSeparator() + "\" \"" + " - " + "1" + System.lineSeparator() + "\"w\""
				+ " - " + "1" + System.lineSeparator() + "\"r\"" + " - " + "1" + System.lineSeparator() + "\"d\""
				+ " - " + "1" + System.lineSeparator() + "\"!\"" + " - " + "1" + System.lineSeparator();
		assertEquals(expected, actual);
	}
}
