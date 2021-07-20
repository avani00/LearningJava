public class FillingArrays {
	public static void main(String[] args) {
		int[] array = new int[30];

		// A.
		for(int i = 1; i <= array.length; i++) {
			if(i%2 == 0) array[i-1] = i*-1;
			else array[i-1] = i;
		}

		for(int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();

		// B.
		int a = 1;
		for(int i = 0; i < array.length; i+=2) {
			array[i] = a;
			array[i+1] = a;
			a++;
		}

		for(int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();

		// C.
		for(int i = 1; i <= array.length; i++) {
			array[i-1] = (int)Math.pow(2, i);
		}

		for(int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();

		// D.
		int y = 1;
		int z = 1;
		for(int i = 0; i < array.length; i++) {
			array[i] = y;
			int x = y;
			y += z;
			z = x;
		}

		for(int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}