import java.time.Duration;
import java.time.Instant;

public class Problem_0010 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		boolean[] isPrime = sieveOfEratosthenes(2000000);
		long sum = 0;
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i]) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	private static boolean[] sieveOfEratosthenes(int num) {
		boolean[] isPrime = new boolean[num];
		for (int i = 2; i < num; i++) {
			isPrime[i] = true;
		}
		for (int i = 2; i * i < num; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j < num; j += i) {
					isPrime[j] = false;
				}
			}
		}
		return isPrime;
	}
}