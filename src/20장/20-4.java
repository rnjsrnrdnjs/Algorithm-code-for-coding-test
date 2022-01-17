import java.util.*;
import java.io.*;

public class Main {
	private static int m,n;
    private static int[][] map;
    private static int[][] dp;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[m+1][n+1];
        dp = new int[m+1][n+1];
        for (int i=1; i<=m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        System.out.println(dp_bruteForce(1,1));
    }
    private static int dp_bruteForce(int x, int y) {
        if (x == m && y == n) 
            return 1;
        if (dp[x][y] != -1) 
            return dp[x][y];
        else {
            dp[x][y] = 0;
            for (int i=0; i<dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 1 || ny < 1 || nx > m || ny > n) continue;
                if (map[x][y] > map[nx][ny]) {
                    dp[x][y] += dp_bruteForce(nx, ny);
                }
            }
        }
        return dp[x][y];
    }
}