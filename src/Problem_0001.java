import java.time.Duration;
import java.time.Instant;

public class Problem_0001 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		long sum = 0;
		for (int i = 1; i < 1000; i++) {
			sum += i % 3 == 0 || i % 5 == 0 ? i : 0;
		}
		System.out.println(sum);
	}
}