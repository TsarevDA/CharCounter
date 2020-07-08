package ru.tsar.charcounter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCash cash = new WordCash();
		CharCounter counter = new CharCounter();
		CharCountResult result = new CharCountResult();
		result = counter.count("hello world!", cash);
		System.out.println(Formatter.formattingResult(result));
		result = counter.count("hello world!", cash);
		System.out.println(Formatter.formattingResult(result));
	}

}
