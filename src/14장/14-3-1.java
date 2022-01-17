import java.util.*;
import java.io.*;

public class Main {
	public static int[] answer;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		answer = new int[M];
		backTraking(0);
		System.out.print(sb);
 
	}
 
	public static void backTraking(int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(answer[i] + " ");
			}
			sb.append('\n');
			return;
		}
		for (int i = 1; i <= N; i++) {
			answer[depth] = i;
			backTraking(depth + 1);
		}
	}
}