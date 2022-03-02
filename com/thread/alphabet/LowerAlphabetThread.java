package com.thread.alphabet;

public class LowerAlphabetThread implements Runnable {

	@Override
	public synchronized void run() {
		for(int i ='a'; i <='z'; i++) {
			System.out.print((char) i);
		}
	}

}