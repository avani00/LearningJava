public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date(7, 3, 2004);
		System.out.println("Date: " + date);
		System.out.println("Days since " + date.year + "'s Jan 1st: " + date.daysSinceJan1());
	}

	public static class Date {
		private int day;
		private int month;
		private int year;

		public Date(int d, int m, int y) {
			day = d;
			month = m;
			year = y;
		}

		public int daysSinceJan1() {
			int days = 0;
			int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for(int i = 1; i <= month; i++) {
				days += monthDays[i];
			}
			if(year%4 == 0) {
				days++;
			}
			return days;
		}

		public String toString() {
			return(month + "/" + day + "/" + year);
		}
	}
}