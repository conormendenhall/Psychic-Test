package com.conorm.psychic;

import java.util.Scanner;

public class PsyValidator {
	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		while (true) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				break;
			} else {
				System.out.println();
				System.out.println("Huh?\n" + "That doesn't even make sense.\n" + "Maybe I was wrong about you...");
				sc.next();
			}
		}
		return i;
	}

	public static int getGuess(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		while (true) {
			i = getInt(sc, prompt);
			if (i < min) {
				System.out.println();
				System.out.println("Come on!\n" + "Your guess must be greater than " + (min - 1) + ".");
			} else if (i > max) {
				System.out.println();
				System.out.println("... Are you serious?\n" + "I told you the number would be no more than " + max
						+ ".");
			} else
				return i;				
		}
	}
}
