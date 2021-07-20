import java.util.*;

class GuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		int userGuess;
		int guesses;
		int score = 0;
		while(true) {
			guesses = 0;
			i = (int)(Math.random()*(100) + 1);
			while(true) {
				System.out.print("Enter your guess: ");
				userGuess = input.nextInt();
				guesses++;
				if(userGuess == i) {
					System.out.println("Correct!");
					break;
				} else if(userGuess > i) {
					System.out.println("Incorrect. Your number is too big, try again.");
				} else {
					System.out.println("Incorrect. Your number is too small, try again.");
				}
			}
			input.nextLine();
			System.out.println("You took " + guesses + " guesses to get the number.");
			if(guesses <= 10) {
				score += 5;
				System.out.println("Congratulations, you get 5 points.");
			} else {
				score -= 5;
				System.out.println("Oh no, you lost 5 points.");
			}
			System.out.println("Current Score: " + score);
			System.out.print("Do you want to play again? (Enter 'Y' for yes and 'N' for no): ");
			if(input.nextLine().toUpperCase().equals("N")) {
				break;
			}
		}
	}
}