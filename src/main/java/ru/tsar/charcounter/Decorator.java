package ru.tsar.charcounter;

abstract class Decorator implements CharCounter {
	final CharCounter charCounter;

	protected Decorator(CharCounter charCounter) {
		this.charCounter = charCounter;
	}
}
