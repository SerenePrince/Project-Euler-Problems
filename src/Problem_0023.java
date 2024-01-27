import java.time.Duration;
import java.time.Instant;

public class Problem_0023 {

	private static final int LIMIT = 28123;
	private static boolean[] isAbundant = new boolean[LIMIT + 1];

	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		for (int i = 1; i < isAbundant.length; i++) {
			isAbundant[i] = isAbundant(i);
		}
		int sum = 0;
		for (int i = 1; i <= LIMIT; i++) {
			if (!isSumOfAbundants(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	private static boolean isAbundant(int num) {
		if (num < 1) {
			return false;
		}
		int sum = 1;
		int limit = (int) Math.sqrt(num);
		for (int i = 2; i <= limit; i++) {
			if (num % i == 0) {
				sum += i + num / i;
			}
		}
		if (limit * limit == num) {
			sum -= limit;
		}
		return sum > num;
	}

	private static boolean isSumOfAbundants(int num) {
		for (int i = 0; i <= num; i++) {
			if (isAbundant[i] && isAbundant[num - i]) {
				return true;
			}
		}
		return false;
	}
}