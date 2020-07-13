package ru.tsar.charcounter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCaching extends Decorator {

	public Map<String, LinkedHashMap<Character, Integer>> cach;

	protected WordCaching(CharCounter charCounter) {
		super(charCounter);
		cach = new HashMap<String, LinkedHashMap<Character, Integer>>();
	}

	@Override
	public LinkedHashMap<Character, Integer> getResult(String string) {
		if (cach.containsKey(string)) {
			return cach.get(string);
		} else {
			Counter counter = new Counter();
			LinkedHashMap<Character, Integer> result = new LinkedHashMap<Character, Integer>();
			result = counter.getResult(string);
			cach.put(string, result);
			return result;
		}
	}
}
