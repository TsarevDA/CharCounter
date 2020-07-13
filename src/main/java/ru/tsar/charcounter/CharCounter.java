package ru.tsar.charcounter;

import java.util.LinkedHashMap;

public interface CharCounter {
	public LinkedHashMap<Character, Integer> getResult(String string);
}
