import java.util.*;

public class Hangman {
	public static void main(String[] args) {
		String[] words = {"hello", "beads", "glass", "laptop", "dilemma", "fitness", "sting", "string", "stroll", "grand", "refuse", "growth", "cheap", "double", "grief", "steep", "impress", "album", "gossip", "outlook", "sting"};

		String missed0 = " +---+\n     |\n     |\n     |\n======";
		String missed1 = " +---+\n O   |\n     |\n     |\n======";
		String missed2 = " +---+\n O   |\n |   |\n     |\n======";
		String missed3 = " +---+\n O   |\n/|\\  |\n     |\n======";
		String missed4 = " +---+\n O   |\n/|\\  |\n/ \\  |\n======";

		Scanner input = new Scanner(System.in);

		while(true) {

			String word = words[(int)(Math.random()*21) + 1];

			String guessWord = "";
			for(int i = 0; i < word.length(); i++) {
				guessWord += "_";
			}

			ArrayList<String> guesses = new ArrayList<String>();
			ArrayList<String> missedLetters = new ArrayList<String>();

			System.out.println("H A N G M A N");
			while(true) { 
				switch(missedLetters.size()) {
					case 0:
						System.out.println(missed0);
						break;
					case 1:
						System.out.println(missed1);
						break;
					case 2:
						System.out.println(missed2);
						break;
					case 3:
						System.out.println(missed3);
						break;
					case 4:
						System.out.println(missed4);
						break;
				}
				if(missedLetters.size() == 4) {
					System.out.println("Too many guesses. You lose. :(");
					System.out.println("The word was " + word);
					break;
				}
				System.out.print("Missed Letters: ");
				for(String letter : missedLetters) {
					System.out.print(letter + " ");
				}
				System.out.println();
				System.out.println(guessWord);
				System.out.print("Enter a letter: ");
				String letter = input.nextLine();
				if(letter.length() > 1) {
					System.out.println("Not Valid.");
					continue;
				}
				if(guesses.contains(letter)) {
					System.out.println("You already guessed that letter, enter a new one.");
					continue;
				}
				guesses.add(letter);
				int a = 0;
				for(int i = 0; i < word.length(); i++) {
					if(word.substring(i, i+1).equals(letter)) {
						guessWord = guessWord.substring(0, i) + letter + guessWord.substring(i + 1);
					} else {
						a++;
					}
				}
				if(a == word.length()) {
					missedLetters.add(letter);
				}
				if(guessWord.equals(word)) {
					System.out.println(guessWord);
					System.out.println("YOU WON!");
					break;
				}
			}
			System.out.print("Would you like to play again? (Enter yes or no): ");
			if(input.nextLine().equalsIgnoreCase("Yes")) {
				continue;
			} else {
				break;
			}
		}
	}
}