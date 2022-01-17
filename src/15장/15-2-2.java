import java.util.*;
import java.io.*;

public class Main {
	
	static int[][] maze;
	static int n;
	static int m;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 }; //x방향배열-상하
    static int[] dy = { 0, 0, -1, 1 }; //y방향배열-좌우

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		maze = new int[n][m];
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				maze[i][j] = s.charAt(j) - '0';
			}
		}
		visited = new boolean[n][m];
		visited[0][0] = true;
		bfs(0, 0);
		System.out.println(maze[n-1][m-1]);
	}

	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		while(!q.isEmpty()) {
			int now[] = q.poll();
			int X = now[0];
			int Y = now[1];
			for(int i=0; i<4; i++) {
				int nX = X + dx[i];
				int nY = Y + dy[i];
				if(0<=nX && nX<n && 0<=nY && nY<m){
					if(maze[nX][nY]==1){
						maze[nX][nY]=maze[X][Y]+1;
		                q.add(new int[] {nX, nY});
					}
				}
			}
		}
	}
}