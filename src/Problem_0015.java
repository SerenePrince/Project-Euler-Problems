import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Problem_0015 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		System.out.println(gridPaths(20, 20));
	}

	private static Map<String, Long> memo = new HashMap<>();

	private static long gridPaths(int row, int column) {
		String key = row + "," + column;
		if (memo.containsKey(key)) {
			return memo.get(key);
		}
		if (row == 0 || column == 0) {
			return 1;
		}
		memo.put(key, gridPaths(row - 1, column) + gridPaths(row, column - 1));
		return memo.get(key);
	}
}