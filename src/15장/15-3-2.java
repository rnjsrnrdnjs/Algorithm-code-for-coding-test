import java.util.*;
import java.io.*;

public class Main {
	static int N, S;
	static int[] arr;
	static int answer = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		dfs(0, 0);
		System.out.println(S == 0 ? answer - 1 : answer);
	}
	private static void dfs(int idx, int sum) {
		if (idx == N) {
			if (sum == S)
				answer++;
			return;
		}
		dfs(idx + 1, sum + arr[idx]);
		dfs(idx + 1, sum);
	}
}