import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

public class Problem_0019 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		int startYear = 1901, endYear = 2000;
		int sundays = 0;
		for (int year = startYear; year <= endYear; year++) {
			for (int month = 1; month <= 12; month++) {
				LocalDate date = LocalDate.of(year, month, 1);
				if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
					sundays++;
				}
			}
		}
		System.out.println(sundays);
	}
}