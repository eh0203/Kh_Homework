package com.thread.alphabet;

public class AlphabetTest {

	public static void main(String[] args) {
		Thread cap = new Thread(new UpperAlphabetThread(), "대문자");
		Thread low = new Thread(new LowerAlphabetThread(), "소문자");
		
		cap.start();
		low.start();
	}

}