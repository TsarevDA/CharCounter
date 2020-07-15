package ru.tsar.charcounter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharCounterTest {
	private Counter counter;

	@BeforeEach
	void setUp() {
		counter = new Counter();
	}

	@Test
	void givenNullString_whenCharCount_thenthenIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> counter.countChars(null));
	}

	@Test
	void givenString_whenCharCount_thenNumberOfUniqueCharacters() {
		Map<Character, Integer> actual = new LinkedHashMap<Character, Integer>();
		Map<Character, Integer> expected = new LinkedHashMap<Character, Integer>();

		actual = counter.countChars("hello world!");
		expected.put('h', 1);
		expected.put('e', 1);
		expected.put('l', 3);
		expected.put('o', 2);
		expected.put(' ', 1);
		expected.put('w', 1);
		expected.put('r', 1);
		expected.put('d', 1);
		expected.put('!', 1);
		assertEquals(expected, actual);
	}

}
