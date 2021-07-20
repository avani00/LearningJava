public class USMoneyDemo {
	public static void main(String[] args) {
		USMoney person1 = new USMoney(5, 84);
		USMoney person2 = new USMoney(5, 299);

		System.out.println("Person 1 has " + person1.getDollars() + " dollars and " + person1.getCents() + " cents.");
		System.out.println("Person 2 has " + person2.getDollars() + " dollars and " + person2.getCents() + " cents.");
		USMoney total = person1.plus(person2);
		System.out.println("In total they have " + total.getDollars() + " dollars and " + total.getCents() + " cents.");
	}

	public static class USMoney {
		private int dollars;
		private int cents;

		public USMoney(int d, int c) {
			dollars = d;
			while(c > 99) {
				c -= 100;
				dollars++;
			}
			cents = c;
		}

		public int getDollars() {
			return dollars;
		}

		public int getCents() {
			return cents;
		}

		public USMoney plus(USMoney u) {
			return(new USMoney(this.getDollars() + u.getDollars(), this.getCents() + u.getCents()));
		}
	}
}