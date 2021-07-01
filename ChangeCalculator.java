import java.util.Scanner;

class ChangeCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a dollar amount.");
		double amount = input.nextDouble();
		double amount1 = amount;
		int quarters = (int)(amount/0.25);
		amount -= 0.25*quarters;
		int dimes = (int)(amount/0.10);
		amount -= 0.10*dimes;
		int nickels = (int)(amount/0.05);
		amount -= 0.05*nickels;
		int pennies = (int)(amount/0.01);
		System.out.println("Starting Amount: $" + amount1 + "; Quarters: " + quarters + "; Dimes: " + dimes + "; Nickels: " + nickels + "; Pennies: " + pennies);

	}

}