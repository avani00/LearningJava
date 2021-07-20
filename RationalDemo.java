public class RationalDemo {
	public static void main(String[] args) {
		Rational fraction = new Rational(21, 18);
		Rational fraction2 = new Rational(12, 64);
		fraction.printRational();
		fraction.negate();
		fraction.printRational();
		fraction.invert();
		fraction.printRational();
		System.out.println(fraction.toDouble());
		Rational reduced = fraction.reduce();
		reduced.printRational();
		Rational added = fraction.add(fraction2);
		added.printRational();
	}

	public static class Rational {
		private int numerator;
		private int denominator;

		public Rational(int n, int d) {
			numerator = n;
			denominator = d;
		}

		public int getNumerator() {
			return numerator;
		}

		public int getDenominator() {
			return denominator;
		}

		public void printRational() {
			System.out.println(numerator + "/" + denominator);
		}

		public void negate() {
			numerator = -numerator;
		}

		public void invert() {
			int a = numerator;
			numerator = denominator;
			denominator = a;
		}

		public double toDouble() {
			return((double)numerator / denominator);
		}

		public Rational reduce() {
			int n = numerator;
			int d = denominator;
			int r;
			int gcd;
			while(n != 0 && d != 0) {
				r = n%d;
				n = d;
				d = r;
			}
			if(n == 0) gcd = d;
			else gcd = n;
			return(new Rational(numerator/gcd, denominator/gcd));
		}

		public Rational add(Rational r) {
			Rational added = new Rational((this.getNumerator()*r.getDenominator() + this.getDenominator()*r.getNumerator()), this.getDenominator()*r.getDenominator());
			return(added.reduce());
		}
	}
}