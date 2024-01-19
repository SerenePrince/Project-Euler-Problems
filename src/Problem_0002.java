import java.time.Duration;
import java.time.Instant;

public class Problem_0002 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		int sum = 0;
		int x = 1, y = 2;
		while (x <= 4000000) {
			if (x % 2 == 0) {
				sum += x;
			}
			int temp = x + y;
			x = y;
			y = temp;
		}
		System.out.println(sum);
	}
}