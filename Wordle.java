package griffith;

import java.awt.RenderingHints;
import java.lang.reflect.Array;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Wordle {

	// Variable to track the duration of the game in seconds
	static double second = 0;
	// Scanner object to read user input
	static Scanner scanner = new Scanner(System.in);
	// global variable for random
	static Random random = new Random();

	public static void main(String[] args) {
		// Display welcome message
		System.out.println("𝔀𝓮𝓵𝓬𝓸𝓶𝓮" + "\n        𝓽𝓸" + "\n           𝔀𝓸𝓻𝓭𝓵𝓮 ");

		// Define word categories
		String[] countryStrings = { "spain", "japan", "italy", "nepal", "india" };
		String[] animalStrings = { "shark", "tiger", "horse", "camel" };
		String[] colourStrings = { "brown", "black", "green", "white" };

		// Display menu
		System.out.print("          MENU\n" + "_|---------------------------|_\n" + " |  For info type i          |\n"
				+ " |  For country type 1       |\n" + " |  For animal type 2        |\n"
				+ " |  For colour type 3        |\n" + " |  To quit the game type Q  |\n"
				+ " |  Restart type r           |\n" + " |  To Hint type h           |\n"
				+ "_|---------------------------|_\n");

		// Get the user's choice
		String chosenNum = scanner.next();

		// Handle the user's choice using a switch statement
		switch (chosenNum) {
		case "1":
			// Play the game with country words
			playGame(randomChose(countryStrings), "Country");
			break;
		case "2":
			// Play the game with animal words
			playGame(randomChose(animalStrings), "Animal");
			break;
		case "3":
			// Play the game with color words
			playGame(randomChose(colourStrings), "Colour");
			break;
		case "i":
			// Display game instructions
			System.out.println("This game returns letters, every letter you guessed and returns '*' "
					+ "if the letter you guessed is in the original word but in a different position. \n"
					+ "Choose a category and guess the word. ENJOY...");
			break;
		}
	}

	// Method to play the game
	static void playGame(String randomWord, String wordType) {
		LocalTime time = LocalTime.now(); // Start time
		int remainingAttempts = 5; // Number of attempts allowed
		String result = ""; // Tracks the player's progress
		int countTrue = 0; // Tracks correct guesses
		String updatedResult = ""; // Tracks the updated progress

		for (int i = 0; i < randomWord.length(); i++) {
			System.out.print("_ ");
		}
		System.out.println();

		// Loop until the player runs out of attempts
		while (remainingAttempts > 0) {
			try {
				// Display game options
				System.out.println("////  For quit 'q'  //\\\\  For restart 'r'  ////");
				System.out.print("Enter a word: ");
				String scanString = scanner.next().toLowerCase(); // Get player's guess

				hint(randomWord, scanString);
				// Handle restart
				if (scanString.equals("r")) {
					continue;
				}

				// Handle quit
				if (scanString.equals("q")) {
					System.out.println("You guessed " + countTrue + " letter(s)");
					System.out.println("Game Over!!!");
					LocalTime timeEnd = LocalTime.now(); // End time
					Duration durationLocalTime = Duration.between(time, timeEnd); // find how long program run
					second += durationLocalTime.getSeconds(); // get the time as second
					System.out.println("You played " + second + " second(s)"); // show the tatol secound that user spend
					return; // exit if blok
				}

				// Ensure the guessed word has the correct length
				if (scanString.length() != 5) {
					throw new Exception("Word should be 5 characters long.");
				}

				// Check if the guess is correct
				if (scanString.equals(randomWord)) {
					System.out.println("Congratulations! You guessed the word: " + randomWord);
					return;
				}
				updatedResult = "";
				// Compare guessed word to the random word
				for (int i = 0; i < randomWord.length(); i++) {
					if (i < scanString.length() && scanString.charAt(i) == randomWord.charAt(i)) {
						updatedResult += scanString.charAt(i); // Correct letter in the correct position
						countTrue++;
					} else if (randomWord.indexOf(scanString.charAt(i)) > -1) {
						updatedResult += "*"; // Correct letter in the wrong position
					} else {
						updatedResult += "_ "; // Incorrect letter
					}
				}

				result = updatedResult.trim(); // make sure the end of result has no spaca
				remainingAttempts--; // reduce the attemption
				System.out.println("Incorrect guess. Remaining attempts: " + remainingAttempts); // show remaining
																									// attemption
				System.out.println("Current progress: " + result); // print end of result
			} catch (Exception e) { // if any Error occurs escape it and return a message
				System.out.println("Error: " + e.getMessage());
			}
		}

		// Display game over message
		System.out.println("Game over! The word was: " + randomWord);
		LocalTime timeEnd = LocalTime.now(); // End time
		Duration durationLocalTime = Duration.between(time, timeEnd); // find how long program run
		second += durationLocalTime.getSeconds(); // get the time as second
		System.out.println("You played " + second + " second(s)");
		System.out.println("You guessed " + countTrue + " letter(s)");
	}

	// Method to select a random word from an array
	static String randomChose(String[] array) {
		int randomIndex = random.nextInt(array.length);
		return array[randomIndex];
	}

	// Method to select random letter from the random world and display it.
	static void hint(String random_word, String userGuess) {
		if (userGuess.equals("h")) {
			int randIndex = random.nextInt(random_word.length());
			// select random index from random word.
			char update = random_word.charAt(randIndex);
			// record the letter found by converting intex to char.
			second += 10;
			// add 10 second for each hint.
			System.out.println("Hint: " + update + " (Time penalty: +10 seconds)");
		}
	}
}
