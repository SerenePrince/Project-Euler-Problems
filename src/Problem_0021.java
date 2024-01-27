import java.time.Duration;
import java.time.Instant;

public class Problem_0021 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		long sum = 0;
		for (int i = 1; i < 10000; i++) {
			int j = sumOfDivisors(i);
			if (j > i && sumOfDivisors(j) == i) {
				sum += i + j;
			}
		}
		System.out.println(sum);
	}

	private static int sumOfDivisors(int num) {
		int sum = 1;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				sum += i;
				if (i != num / i) {
					sum += num / i;
				}
			}
		}
		return sum;
	}
}