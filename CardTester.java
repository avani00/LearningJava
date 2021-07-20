public class CardTester {
	public static void main(String[] args) {
		Card card1 = new Card(6, 'H');
		Card card2 = new Card(6, 'S');
		Card card3 = new Card(6, 'C');
		Card card4 = new Card(4, 'H');
		Card card5 = new Card(4, 'S');

		System.out.println("Card 1 is of suit " + card1.getSuit() + " and has rank " + card1.getRank());
		System.out.println("Card 2 is of suit " + card2.getSuit() + " and has rank " + card2.getRank());
		System.out.println("Card 3 is of suit " + card3.getSuit() + " and has rank " + card3.getRank());
		System.out.println("Card 4 is of suit " + card4.getSuit() + " and has rank " + card4.getRank());
		System.out.println("Card 5 is of suit " + card5.getSuit() + " and has rank " + card5.getRank());
	}

	public static class Card {
		private int rank;
		private char suit;

		public Card(int r, char s) {
			rank = r;
			suit = s;
		}

		public char getSuit() {
			return suit;
		}

		public int getRank() {
			return rank;
		}
	}
}