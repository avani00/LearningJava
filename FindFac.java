/*
   Use nested loops to find factors of numbers
   between 2 and 100.
*/
class FindFac {
	public static void main(String[] args) {
		int factors = 0;
		int i = 2;

		while(factors != 9) {
			factors = 0;
			System.out.print("Factors of " + i + ": ");
			for(int j = 2; j < i; j++) {
				if((i%j) == 0) {
					System.out.print(j + " ");
					factors++;
				}
			}
			System.out.println();
			i++;
		}
	}
}