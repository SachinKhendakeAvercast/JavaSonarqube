package com.in.sonarqubedemo;

//import java.net.URL;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		for (;;) {
			
		}
		
		
	}

	public static void doSomethingWhichThrowsException() {
		try {
			throw new RuntimeException();
		} finally {
			for (int i = 0; i < 10; i++) {
				// ...
				int q = 0;
				if (q == i) {
					break; // ignored
				}
			}

		}

	}
}
