import java.time.Duration;
import java.time.Instant;

public class Problem_0005 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		int result = 1;
		for (int i = 2; i <= 20; i++) {
			result = lcm(result, i);
		}
		System.out.println(result);
	}

	private static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	private static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}
}
