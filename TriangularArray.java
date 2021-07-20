import java.util.*;

public class TriangularArray {
	public static void main(String[] args) {
		Object[] array = new Object[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = new int[i+1];
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < ((int[])array[i]).length; j++) {
				((int[])array[i])[j] = i+j;
			}
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < ((int[])array[i]).length; j++) {
				System.out.print(((int[])array[i])[j] + " ");
			}
			System.out.println();
		}
	}
}