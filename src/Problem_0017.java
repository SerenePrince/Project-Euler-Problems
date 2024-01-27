import java.time.Duration;
import java.time.Instant;

public class Problem_0017 {

	private static final int[] ONES = new int[] { -1, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8 };
	private static final int[] TENS = new int[] { -1, -1, 6, 6, 5, 5, 5, 7, 6, 6 };

	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		long sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += countLetters(i);
		}
		System.out.println(sum);
	}

	private static int countLetters(int num) {
		if (num >= 0 && num < 20) {
			return ONES[num];
		} else if (num >= 20 && num <= 90 && num % 10 == 0) {
			return TENS[num / 10];
		} else if (num > 20 && num < 100) {
			return TENS[num / 10] + ONES[num % 10];
		} else if (num >= 100 && num <= 900 && num % 100 == 0) {
			return ONES[num / 100] + 7;
		} else if (num > 100 && num < 1000) {
			return ONES[num / 100] + 10 + countLetters(num % 100);
		} else {
			return 11;
		}
	}
}