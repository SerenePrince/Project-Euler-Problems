import java.time.Duration;
import java.time.Instant;

public class Problem_0003 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		long maxPrime = 1;
		long num = 600851475143L;
		for (long i = 2; i * i <= num; i++) {
			while (num % i == 0) {
				maxPrime = i;
				num /= i;
			}
		}
		if (num > 1) {
			maxPrime = num;
		}
		System.out.println(maxPrime);
	}
}
