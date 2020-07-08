package ru.tsar.charcounter;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountResult {

	public Map<Character, Integer> charMap;
	public String string;

	public CharCountResult(String string) {
		charMap = new LinkedHashMap<Character, Integer>();
		this.string = string;
	}

	public CharCountResult() {
		charMap = new LinkedHashMap<Character, Integer>();
		this.string = "";
	}

	public void addResult(Character letter) {
		if (charMap.containsKey(letter)) {
			int k = charMap.get(letter);
			charMap.put(letter, k + 1);
		} else {
			charMap.put(letter, 1);
		}
	}

	public void addString(String string) {
		this.string = string;
	}

	public void setResult(Map<Character, Integer> charMap, String string) {
		this.charMap = charMap;
		this.string = string;
	}

	public Map<Character, Integer> getResult() {
		return charMap;
	}

	public String getString() {
		return string;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((charMap == null) ? 0 : charMap.hashCode());
		result = prime * result + ((string == null) ? 0 : string.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CharCountResult other = (CharCountResult) obj;
		if (charMap == null) {
			if (other.charMap != null)
				return false;
		} else if (!charMap.equals(other.charMap))
			return false;
		if (string == null) {
			if (other.string != null)
				return false;
		} else if (!string.equals(other.string))
			return false;
		return true;
	}

}
