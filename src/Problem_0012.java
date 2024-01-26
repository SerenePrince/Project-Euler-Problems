import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Problem_0012 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		int targetDivisors = 500;
		long num = 1;
		while (true) {
			long triangleNum = triangleNumber(num++);
			int divisors = countDivisors(triangleNum);
			if (divisors > targetDivisors) {
				System.out.println(triangleNum);
				break;
			}
		}
	}

	private static long triangleNumber(long num) {
		return (num * (num + 1)) / 2;
	}

	private static int countDivisors(long num) {
		Map<Long, Integer> primeFactors = primeFactorization(num);
		int divisors = 1;

		for (int exponent : primeFactors.values()) {
			divisors *= (exponent + 1);
		}
		return divisors;
	}

	private static Map<Long, Integer> primeFactorization(long num) {
		Map<Long, Integer> factors = new HashMap<>();
		long divisor = 2;
		while (num > 1) {
			int count = 0;
			while (num % divisor == 0) {
				num /= divisor;
				count++;
			}
			if (count > 0) {
				factors.put(divisor, count);
			}
			divisor++;
			if (divisor * divisor > num && num > 1) {
				factors.put(num, 1);
				break;
			}
		}
		return factors;
	}
}