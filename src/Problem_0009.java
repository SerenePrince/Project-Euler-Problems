import java.time.Duration;
import java.time.Instant;

public class Problem_0009 {

	private static final int SUM = 1000;

	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		for (int i = 1; i < SUM; i++) {
			for (int j = i + 1; j < SUM; j++) {
				int k = SUM - i - j;
				if (i * i + j * j == k * k) {
					System.out.println(i * j * k);
					return;
				}
			}
		}
	}
}