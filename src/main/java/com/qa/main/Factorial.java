package com.qa.main;

public class Factorial {

	public static String reverse(double target) {

		for (int i = 1; target >= 1; i++) {
			target /= i;
			if (target == 1) {
				return i + "!";
			}
		}

		return "NONE";
	}

}
