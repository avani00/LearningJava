public class SwapperDemo {
	public static void main(String[] args) {
		Swapper s = new Swapper(4, 6);

		System.out.println("Value of x: " + s.getX());
		System.out.println("Value of y: " + s.getY());
		s.swap();
		System.out.println("Value of x: " + s.getX());
		System.out.println("Value of y: " + s.getY());
	}

	public static class Swapper {
		private int x;
		private int y;

		public Swapper(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public void swap() {
			int a = x;
			x = y;
			y = a;
		}
	}
}