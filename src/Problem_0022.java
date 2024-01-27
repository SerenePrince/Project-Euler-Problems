import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Problem_0022 {
	public static void main(String[] args) throws IOException {
		Instant start = Instant.now();
		solve();
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

	private static void solve() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("0022_names.txt"));
		String line = br.readLine().replace("\"", "");
		String[] names = line.split(",");
		Arrays.sort(names);
		long score = 0;
		for (int i = 0; i < names.length; i++) {
			score += countLetters(names[i]) * (i + 1);
		}
		System.out.println(score);
		br.close();
	}

	private static int countLetters(String name) {
		int sum = 0;
		for (char c : name.toCharArray()) {
			sum += c - 'A' + 1;
		}
		return sum;
	}
}