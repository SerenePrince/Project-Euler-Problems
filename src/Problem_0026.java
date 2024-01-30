import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Problem_0026 {

	private static final int LIMIT = 1000;

	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		int maxNum = 0, maxLength = 0;
		for (int i = 1; i <= LIMIT; i++) {
			Map<Integer, Integer> map = new HashMap<>();
			int length;
			int state = 1;
			for (int j = 0;; j++) {
				if (map.containsKey(state)) {
					length = j - map.get(state);
					break;
				} else {
					map.put(state, j);
					state = state * 10 % i;
				}
			}
			if (length > maxLength) {
				maxNum = i;
				maxLength = length;
			}
		}
		System.out.println(maxNum);
	}
}