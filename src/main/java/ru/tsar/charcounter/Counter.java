package ru.tsar.charcounter;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Counter implements CharCounter {
	
	@Override
	public LinkedHashMap<Character, Integer> getResult(String string) {
		if (string == null ) {
			throw new IllegalArgumentException("String or cash cant't be null");
		}
		
		List<Character> chars = string.chars().mapToObj(e->(char)e).collect(Collectors.toList());	
		LinkedHashMap<Character, Integer> result = chars.stream().collect(LinkedHashMap::new, (resultMap, letter) -> {
            if(resultMap.containsKey(letter))
                resultMap.put(letter, resultMap.get(letter) + 1);
            else
                resultMap.put(letter, 1);
        }, LinkedHashMap::putAll);
		return result;
	}
}

 abstract class Decorator implements CharCounter{
	 final CharCounter charCounter;
	 protected Decorator (CharCounter charCounter) {
		 this.charCounter = charCounter;
	 }
}
