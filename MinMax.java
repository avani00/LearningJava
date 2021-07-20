public class MinMax {
	public static void main(String[] args) {
		double[] array = {10.0, 23.4, 52.3, 63.7, 23.6, 18.3, 63.4, 92.4, 23.4, 92.6};

		double min = array[0];
		double max = array[0];

		for(double num : array) {
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
		}
		System.out.println("The minimum is " + min + ", and the maximum is " + max);
	}
}