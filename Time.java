//5
package assignment3;

public class Time {
	
		private int hour;
		private int minute;
		private int second;

		public Time() {
			this(0, 0, 0);
		}

		public Time(int hour, int minute, int second) {
			if (isValidTime(hour, minute, second)) {
				this.hour = hour;
				this.minute = minute;
				this.second = second;
			} else {
				throw new IllegalArgumentException("Invalid time format");
			}
		}

		private boolean isValidTime(int hour, int minute, int second) {
			return hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60;
		}

		public void display() {
			System.out.printf("Time: %02d:%02d:%02d%n", hour, minute, second);
		}

		public static void main(String[] args) {
			Time t1 = new Time(12, 30, 45);
			t1.display();

			Time t2 = Time.fromString("09:15:20");
			t2.display();

		}

		public static Time fromString(String timeStr) {
			String[] parts = timeStr.split(":");
			int hour = Integer.parseInt(parts[0]);
			int minute = Integer.parseInt(parts[1]);
			int second = Integer.parseInt(parts[2]);
			return new Time(hour, minute, second);
		}


}
