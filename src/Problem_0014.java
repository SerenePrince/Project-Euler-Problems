import java.time.Duration;
import java.time.Instant;

public class Problem_0014 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		long sequence = 0;
		long index = -1;
		for (long i = 1; i < 1000000; i++) {
			long currentSequence = collatzSequence(i);
			if (currentSequence > sequence) {
				sequence = currentSequence;
				index = i;
			}
		}
		System.out.println(index);
	}

	private static long[] memo = new long[1000000];

	private static long collatzSequence(long num) {
		if (num < memo.length && memo[(int) num] != 0) {
			return memo[(int) num];
		}
		long sequence = 1;
		if (num != 1) {
			if (num % 2 == 0) {
				sequence += collatzSequence(num / 2);
			} else {
				sequence += collatzSequence(num * 3 + 1);
			}
		}
		if (num < memo.length) {
			memo[(int) num] = sequence;
		}
		return sequence;
	}
}