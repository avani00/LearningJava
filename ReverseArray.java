public class ReverseArray {
	public static void main(String[] args) {
		int[] array = {2, 5, 2, 5, 3, 23, 6, 3, 734, 2};

		for(int i = 0; i < array.length/2; i++) {
			int a = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = a;
		}
		for(int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}