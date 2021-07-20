public class AvgOf10 {
	public static void main(String[] args) {
		double[] array = {10.0, 23.4, 52.3, 63.7, 23.6, 18.3, 63.4, 92.4, 23.4, 92.6};

		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("The average is " + sum/(double)array.length);
	}
}