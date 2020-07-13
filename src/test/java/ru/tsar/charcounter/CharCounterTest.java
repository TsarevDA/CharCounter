package ru.tsar.charcounter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharCounterTest {
	private Counter counter;
	private LinkedHashMap<Character, Integer> actual;
	private LinkedHashMap<Character, Integer> expected;

	@BeforeEach
	void setUp() {
		counter = new Counter();
		actual = new LinkedHashMap<Character, Integer>();
		expected = new LinkedHashMap<Character, Integer>();

	}

	@Test
	void givenNullString_whenCharCount_thenthenIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> counter.getResult(null));
	}

	@Test
	void givenString_whenCharCount_thenNumberOfUniqueCharacters() {

		actual = counter.getResult("hello world!");
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

	@Test
	void givenStringAndCash_whenCharCount_thenNumberOfUniqueCharacters() {
		WordCaching cash = new WordCaching(counter);

		actual = cash.getResult("hello world!");
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
