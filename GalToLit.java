import java.util.Scanner;

class GalToLit {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a gallon amount.");
		int gallons = input.nextInt();
		System.out.println("Liters: " + (gallons * 3.785));

	}

}