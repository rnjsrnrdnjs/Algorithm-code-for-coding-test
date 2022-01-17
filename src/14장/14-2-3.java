import java.util.*;
import java.io.*;

public class Main {
	static int N, M, answer;
	static int[][] paper;
	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		paper = new int[N][M];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				paper[i][j] = sc.nextInt();
		boolean[][] visit = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				visit[i][j] = true;
				brute_force(i, j, 1, paper[i][j], visit);
				visit[i][j] = false;
				check(i, j);
			}
		}
		System.out.println(answer);

	}

	static void brute_force(int y, int x, int cnt, int sum, boolean[][] visit) {
		if (cnt >= 4) {
			answer = Math.max(answer, sum);
			return;
		}
		for (int k = 0; k < 4; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if (ny < 0 || nx < 0 || ny >= N || nx >= M || visit[ny][nx]) {
				continue;
			}
			visit[ny][nx] = true;
			brute_force(ny, nx, cnt + 1, sum + paper[ny][nx], visit);
			visit[ny][nx] = false;
		}
	}

	static void check(int y, int x) {
		if (y < N - 2 && x < M - 1)
			answer = Math.max(answer, paper[y][x] + paper[y + 1][x] + paper[y + 2][x] + paper[y + 1][x + 1]);
		if (y < N - 2 && x > 0)
			answer = Math.max(answer, paper[y][x] + paper[y + 1][x] + paper[y + 2][x] + paper[y + 1][x - 1]);
		if (y < N - 1 && x < M - 2)
			answer = Math.max(answer, paper[y][x] + paper[y][x + 1] + paper[y][x + 2] + paper[y + 1][x + 1]);
		if (y > 0 && x < M - 2)
			answer = Math.max(answer, paper[y][x] + paper[y][x + 1] + paper[y][x + 2] + paper[y - 1][x + 1]);
	}

}