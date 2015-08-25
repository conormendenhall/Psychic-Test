package com.conorm.psychic;

import java.util.Scanner;

public class PsychicTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("I sense that you possess great psychic power.\n" + "I'm thinking of a number.\n"
				+ "Open your mind's eye and tell me what it is.");
		System.out.println();
		String choice;
		do {
			int randomNumber = (int) ((Math.random() * 100) + 1);
			int guess = PsyValidator.getGuess(sc, "(Enter a number between 1 and 100): ", 1, 100);
			int numberOfGuesses = 1;
			while (guess != randomNumber) {
				if ((guess - 10) > randomNumber) {
					System.out.println("\nThat's way too high!");
				} else if (guess + 10 < randomNumber) {
					System.out.println("\nThat's way too low!");
				} else if (guess > randomNumber) {
					System.out.println("\nThat's too high, but you're getting close!");
				} else {
					System.out.println("\nThat's too low, but you're getting close!");
				}
				System.out.print("Focus harder and guess again.\n");
				numberOfGuesses++;
				guess = PsyValidator.getGuess(sc, "(Enter a number between 1 and 100): ", 1, 100);
			}
			System.out.println("\nCorrect!\n" + "You guessed it in " + numberOfGuesses + " tries.\n");
			if (numberOfGuesses == 1) {
				System.out.println("By the beard of Balthazar! You're an extremely powerful psychic."
						+ "Please don't crush my puny psyche.\n");
			} else if (numberOfGuesses < 3) {
				System.out.println("Egad!\n"
						+ "I'd like to invite you to meet with the Exalted Order of Telepaths.\n"
						+ "We gather on the second Tuesday of every month at Lafayette Coney Island\n"
						+ "... but you already knew that, didn't you?");
			} else if (numberOfGuesses < 4) {
				System.out.println("The force is strong with this one! *Psychic High-Five*\n");
			} else if (numberOfGuesses < 5) {
				System.out.println("You certainly have psychic talent.\n"
						+ "Under my tutelage, you could learn to cheat at poker.");
			} else if (numberOfGuesses < 6) {
				System.out.println("Perhaps you are a telepath after all.\n"
						+ "Remember, your mind is like a muscle. If you don't use it, you lose it!");
			} else if (numberOfGuesses < 7) {
				System.out.println("This proves nothing.\n"
						+ "You could've gotten lucky.\n");
			} else if (numberOfGuesses < 10) {
				System.out.println("Not bad, but nothing impressive.\n"
						+ "You must focus to tap into your potential.\n");
			} else
				System.out.println("You clearly have no psychic power whatsoever.\n"
						+ "If you could read my thoughts, you would sense profound disappontment.\n");
			while (true) {
				System.out.print("Do you want to try again? (y/n): ");
				choice = sc.next();
				if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) {
					break;
				}
				System.out.println("\nHuh?");
			}
		} while (choice.equalsIgnoreCase("y"));
		sc.close();
	}
}
