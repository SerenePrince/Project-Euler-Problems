import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Problem_0027 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		boolean[] primes = generatePrimes(1000);
		int num = 0, a = 0, b = 0;
		for (int i = -999; i <= 999; i += 2) {
			for (int j = 2; j < primes.length; j++) {
				if (primes[j]) {
					int temp = consecutivePrimes(i, j, primes);
					if (temp > num) {
						num = temp;
						a = i;
						b = j;
					}
				}
			}
		}
		System.out.println(a * b);
	}

	private static boolean[] generatePrimes(int limit) {
		boolean[] isPrime = new boolean[limit + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i * i <= limit; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= limit; j += i) {
					isPrime[j] = false;
				}
			}
		}
		return isPrime;
	}

	private static boolean isPrime(int num, boolean[] primes) {
		if (num < 0 || num >= primes.length) {
			return false;
		}
		return primes[num];
	}

	private static int consecutivePrimes(int num1, int num2, boolean[] primes) {
		for (int i = 0;; i++) {
			int n = i * i + i * num1 + num2;
			if (n < 0 || !isPrime(n, primes)) {
				return i;
			}
		}
	}
}