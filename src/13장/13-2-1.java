import java.util.Scanner;

public class Main {
	static int[] cnt = new int[2];
	static int[][] colorPaper;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		colorPaper = new int[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
			colorPaper[i][j] = sc.nextInt();

		divideAndConquer(N, 0, 0);
		for (int n : cnt)
			System.out.println(n);
	}

	static void divideAndConquer(int n, int y, int x) {
		for (int i = y; i < y + n; i++) {
			for (int j = x; j < x + n; j++)
				if (colorPaper[i][j] != colorPaper[y][x]) {
					divideAndConquer(n / 2, y, x);
					divideAndConquer(n / 2, y + n / 2, x);
					divideAndConquer(n / 2, y, x + n / 2);
					divideAndConquer(n / 2, y + n / 2, x + n / 2);
					return;
				}
		}
		cnt[colorPaper[y][x]]++;
	}
}