import java.util.*;
import java.io.*;

public class Main {
	public static int[] answer;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();	// 정적타입으로 해주어야한다.
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		answer = new int[M];
		visit = new boolean[N];
		backTraking(N, M, 0);
		System.out.println(sb);
	}
	public static void backTraking(int N, int M, int depth) {
		if (depth == M) {
			for (int val : answer) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				answer[depth] = i + 1;
				backTraking(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}
}