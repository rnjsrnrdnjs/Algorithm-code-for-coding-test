import java.util.*;
import java.io.*;

public class Main {

	static Queue<Point> times = new LinkedList<>();
	static Deque<Point> snakeDeque = new ArrayDeque<>();
	static int direction = 3;
	static int[][] board;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		board = new int[N][N];
		board[0][0] = -1;
		snakeDeque.offer(new Point(0, 0));

		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			board[a][b] = 1;
		}
		int L = Integer.parseInt(br.readLine());
		for (int i = 0; i < L; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			int c;
			if (s.equals("L"))
				c = 0;
			else
				c = 1;
			times.add(new Point(x, c));
		}

		int time = 0;
		int X = times.peek().x;
		int C = times.poll().y;

		while (true) {
			time++;
			int nx = snakeDeque.peekFirst().x + dx[direction];
			int ny = snakeDeque.peekFirst().y + dy[direction];
			if (nx < 0 || nx >= N || ny < 0 || ny >= N || board[nx][ny] == -1) {
				break;
			}
			if (board[nx][ny] == 1) {
				board[nx][ny] = -1;
				snakeDeque.offerFirst(new Point(nx, ny));
			} else {
				board[nx][ny] = -1;
				snakeDeque.offerFirst(new Point(nx, ny));
				board[snakeDeque.peekLast().x][snakeDeque.pollLast().y] = 0;
			}
			if (time == X) {
				if (C == 0) {
					direction = (direction + 1) % 4;
				} else {
					direction = (direction + 3) % 4;
				}
				if (!times.isEmpty()) {
					X = times.peek().x;
					C = times.poll().y;
				}
			}
		}
		System.out.println(time);
		br.close();
	}

}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}