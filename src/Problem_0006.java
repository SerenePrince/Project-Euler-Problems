import java.time.Duration;
import java.time.Instant;

public class Problem_0006 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		long num = 100;
		System.out.println(squareOfSum(num) - sumOfSquares(num));
	}

	private static long sumOfSquares(long num) {
		long sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i * i;
		}
		return sum;
	}

	private static long squareOfSum(long num) {
		long sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum * sum;
	}
}
