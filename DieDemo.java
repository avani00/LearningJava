public class DieDemo {
	public static void main(String[] args) {
		Die firstDie = new Die();
		Die secondDie = new Die();
		firstDie.roll();
		secondDie.roll();
		System.out.println(firstDie.getSideUp() + secondDie.getSideUp());
	}

	public static class Die {
		private int sideUp;

		public Die() {
			sideUp = (int)(Math.random()*6 + 1);
		}

		public int getSideUp() {
			return sideUp;
		}

		public void roll() {
			sideUp = (int)(Math.random()*6 + 1);
		}
	}
}