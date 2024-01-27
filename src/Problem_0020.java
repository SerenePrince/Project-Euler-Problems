import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

public class Problem_0020 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		BigInteger factorial = BigInteger.valueOf(100);
		for (int i = 99; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		String num = factorial.toString();
		long sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += Character.getNumericValue(num.charAt(i));
		}
		System.out.println(sum);
	}
}
