import java.time.Duration;
import java.time.Instant;

public class Problem_0004 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		int maxPalindrome = -1;
		for (int i = 100; i < 1000; i++) {
			for (int j = i; j < 1000; j++) {
				int product = i * j;
				if (isPalindrome(product) && product > maxPalindrome) {
					maxPalindrome = product;
				}
			}
		}
		System.out.println(maxPalindrome);
	}

	private static boolean isPalindrome(int num) {
		String reverse = new StringBuilder(String.valueOf(num)).reverse().toString();
		return String.valueOf(num).equals(reverse);
	}
}