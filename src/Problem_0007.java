import java.time.Duration;
import java.time.Instant;

public class Problem_0007 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		long primeNum = 1;
		for (int i = 1; i <= 10001; i++) {
			primeNum = nextPrime(primeNum);
		}
		System.out.println(primeNum);
	}

	private static long nextPrime(long num) {
		num++;
		while (!isPrime(num)) {
			num++;
		}
		return num;
	}

	private static boolean isPrime(long num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
