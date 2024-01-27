import java.time.Duration;
import java.time.Instant;

public class Problem_0024 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() {
		int[] digits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 1; i < 1000000; i++) {
			nextPermutation(digits);
		}
		String permutation = "";
		for (int i = 0; i < digits.length; i++) {
			permutation += digits[i];
		}
		System.out.println(permutation);
	}

	public static boolean nextPermutation(int[] array) {
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i]) {
			i--;
		}
		if (i <= 0) {
			return false;
		}
		int j = array.length - 1;
		while (array[j] <= array[i - 1]) {
			j--;
		}
		int temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return true;
	}
}