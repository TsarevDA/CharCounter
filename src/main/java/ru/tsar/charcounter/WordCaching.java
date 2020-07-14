package ru.tsar.charcounter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCaching extends Decorator {

	public Map<String, Map<Character, Integer>> cache;

	protected WordCaching(CharCounter charCounter) {
		super(charCounter);
		cache = new HashMap<String, Map<Character, Integer>>();
	}
	
	@Override
	public LinkedHashMap<Character, Integer> countChars(String string) {
		if (string == null ) {
			throw new IllegalArgumentException("String or cash cant't be null");
		}
	
		cache.computeIfAbsent(string, value-> charCounter.countChars(string));
		return (LinkedHashMap<Character, Integer>) cache.get(string);
	}
	
}
