import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] glass = new int[N + 1];
		int[] dp = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			glass[i] = in.nextInt();
		}
		dp[1] = glass[1];
		if (N > 1) {
			dp[2] = glass[1] + glass[2];
		}
		for (int i = 3; i <= N; i++) {
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + glass[i], dp[i - 3] + glass[i - 1] + glass[i]));
		}
		System.out.println(dp[N]);
	}
}