import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

public class Problem_0025 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		int num = 2;
		BigInteger limit = BigInteger.TEN.pow(999);
		BigInteger fibMinus2 = BigInteger.ONE;
		BigInteger fibMinus1 = BigInteger.ONE;
		BigInteger fib = fibMinus1.add(fibMinus2);
		while (fib.compareTo(limit) < 0) {
			fibMinus2 = fibMinus1;
			fibMinus1 = fib;
			fib = fibMinus1.add(fibMinus2);
			num++;
		}
		System.out.println(num + 1);
	}
}