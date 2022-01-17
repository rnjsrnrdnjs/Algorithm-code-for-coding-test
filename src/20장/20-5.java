import java.util.*;
import java.io.*;

public class Main {
	static class Pair implements Comparable<Pair> {
		int x, y;
		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int compareTo(Pair p) {
			return y - p.y;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
 
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int[] dp = new int[N];
			for (int i = 0; i < N; i++) {
				dp[i] = sc.nextInt();
			}
			Pair[] a = new Pair[N];
			for (int i = 0; i < N; i++) {
				a[i] = new Pair(i, dp[i]);
			}
			Arrays.sort(a);
			int ans = N - 1;
			int cnt = 1;
			for (int i = 1; i < N; i++) {
				if (a[i - 1].x < a[i].x) {
					cnt++;
				} else {
					ans = Math.min(ans, N - cnt);
					cnt = 1;
				}
			}
			ans = Math.min(ans, N - cnt);
			sb.append(ans).append('\n');
		}
		System.out.print(sb);
	}
}