package griffith;

import java.net.CacheRequest;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Wordle {

	static double second = 0;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("  🆆🅴🅻🅲🅾🅼🅴 🆃🅾 \n 🆆🅾🆁🅻🅳🅻🆈 🅶🅰🅼🅴̺͆");
		String[] countryStrings = { "spain", "japan", "italy", "nepal", "india" };
		String[] animalStrings = { "shark", "tiger", "horse", "camel" };
		String[] colourStrings = { "brown", "black", "green", "white" };

		System.out.print("          MENU\n" + "_|---------------------------|_\n" + " |  For info type i          |\n"
				+ " |  For country type 1       |\n" + " |  For animal type 2        |\n"
				+ " |  For colour type 3        |\n" + " |  To quit the game type Q  |\n"
				+ " |  Resume type r            |\n" + "_|---------------------------|_\n");

		String chosenNum = scanner.next();

		switch (chosenNum) {
		case "1":
			playGame(randomChose(countryStrings), "Country");
			break;
		case "2":
			playGame(randomChose(animalStrings), "Animal");
			break;
		case "3":
			playGame(randomChose(colourStrings), "Colour");
			break;
		case "i":
			System.out.println(
					"this game return letters, every letter you guessed and returns '*' if the letter you guessed in the original word but different position. \n"
							+ "choose numbers what type of word would you like to guess. ENJOY... ");
			break;
			
		}
	}

	static void playGame(String randomWord, String wordType) {
		LocalTime time = LocalTime.now();
		int remainingAttempts = 5;
		String result = "";
		int countTrue = 0;
		String updatedResult = "";
		while (remainingAttempts > 0) {
			try {
				System.out.println("////  For quit 'q'  //\\\\  For restart 'r'  ////");
				System.out.print("Enter a word: ");
				String scanString = scanner.next().toLowerCase();
				if (scanString.equals("r")) {
					continue;
				}
				
				if (scanString.equals("q")) {
					System.out.println("you guessed " + countTrue + " letter");
					System.out.println("Game Over!!!");
					LocalTime timeEnd = LocalTime.now();
					Duration durationLocalTime = Duration.between(time, timeEnd);
					second = durationLocalTime.getSeconds();
					System.out.println("you played " + second + " second");
					return;
				}
				if (scanString.length() != 5) {
					throw new Exception("Word should be 5 characters long.");
				}
			
				if (scanString.equals(randomWord)) {
					System.out.println("Congratulations! You guessed the word: " + randomWord);
					return;
				}
				for (int i = 0; i < randomWord.length(); i++) {
					if (i < scanString.length() && scanString.charAt(i) == randomWord.charAt(i)) {
						updatedResult += scanString.charAt(i);
						countTrue++;
					} else if (randomWord.indexOf(scanString.charAt(i)) > -1) {
						updatedResult += "*";
					}	
					else {
						updatedResult += "_ ";
					}
				}
				result = updatedResult.trim();
				remainingAttempts--;
				System.out.println("Incorrect guess. Remaining attempts: " + remainingAttempts);
				System.out.println("Current progress: " + result);
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		System.out.println("Game over! The word was: " + randomWord);
		LocalTime timeEnd = LocalTime.now();
		Duration durationLocalTime = Duration.between(time, timeEnd);
		second = durationLocalTime.getSeconds();
		System.out.println("you played " + second + " second");
		System.out.println("you guessed " + countTrue + " letter");
	}

	static String randomChose(String[] array) {
		Random random = new Random();
		int randomIndex = random.nextInt(array.length);
		return array[randomIndex];
	}

}
