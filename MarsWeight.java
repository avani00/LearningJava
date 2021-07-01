import java.util.Scanner;

class MarsWeight {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a weight.");
		int weight = input.nextInt();
		System.out.println("On Mars, the weight you entered would be " + (weight * 0.37));

	}

}