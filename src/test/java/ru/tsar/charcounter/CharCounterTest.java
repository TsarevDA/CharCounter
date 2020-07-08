package ru.tsar.charcounter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharCounterTest {
	private CharCounter counter;
	private CharCountResult actual;
	private CharCountResult expected;
	private WordCash cash;

	@BeforeEach
	void setUp() {
		counter = new CharCounter();
		actual = new CharCountResult();
		expected = new CharCountResult();
		cash = new WordCash();
	}

	@Test
	void givenNullString_whenCharCount_thenthenIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> counter.count(null, cash));
	}

	@Test
	void givenNullCash_whenCharCount_thenthenIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> counter.count("hello", null));
	}

	@Test
	void givenString_whenCharCount_thenNumberOfUniqueCharacters() {

		actual = counter.count("hello world!", cash);
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		charMap.put('h', 1);
		charMap.put('e', 1);
		charMap.put('l', 3);
		charMap.put('o', 2);
		charMap.put(' ', 1);
		charMap.put('w', 1);
		charMap.put('r', 1);
		charMap.put('d', 1);
		charMap.put('!', 1);
		expected.setResult(charMap, "hello world!");
		assertEquals(expected, actual);
	}

	@Test
	void givenStringAndCash_whenCharCount_thenNumberOfUniqueCharacters() {

		Map<Character, Integer> charMap = new LinkedHashMap<>();
		charMap.put('h', 1);
		charMap.put('e', 1);
		charMap.put('l', 3);
		charMap.put('o', 2);
		charMap.put(' ', 1);
		charMap.put('w', 1);
		charMap.put('r', 1);
		charMap.put('d', 1);
		charMap.put('!', 1);
		expected.setResult(charMap, "hello world!");
		cash.addToCash("hello world!", expected);
		actual = counter.count("hello world!", cash);
		assertEquals(expected, actual);
	}

}
