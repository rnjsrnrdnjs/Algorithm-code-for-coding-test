import java.util.*;
 
public class Main {    
 
    static int[] dx = { 1, 0, -1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static int n, m;
    static int[][] Map;
    static boolean[][][] visit;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        Map = new int[n][m];
        for (int i = 0; i < n ; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                Map[i][j] = Integer.valueOf(str.charAt(j)) - '0';
            }
        }
        visit = new boolean[n][m][2];
        System.out.println(bfs(0, 0));
    }
 
    private static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y, 1, 0));
        visit[x][y][0] = true; 
        visit[x][y][1] = true; 
        while (!q.isEmpty()) {
            Node current = q.poll();
            if (current.x == n - 1 && current.y == m - 1) return current.count;
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if(Map[nx][ny] == 0) { 
                        if (visit[nx][ny][current.wall] == false) { //현재까지 온 방법(벽을 부쉈는지 아닌지)으로 방문한 적이 없다면 방문한다.
                            q.add(new Node(nx, ny, current.count + 1, current.wall));
                            visit[nx][ny][current.wall] = true;
                        }
                    }    
                    else if (Map[nx][ny] == 1) {
                        if (current.wall == 0 && visit[nx][ny][1] == false) { //현재까지 벽을 부순적이 없고, 벽을 부숴서 방문한 적이 없다면 방문한다.
                            q.add(new Node(nx, ny, current.count + 1, 1));
                            visit[nx][ny][1] = true;
                        }
                    }
                }
            }
        }
 
        return -1;
    }
 
    private static class Node {
        private int x;
        private int y;
        private int count;
        private int wall;
 
        public Node(int x, int y, int count, int wall) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.wall = wall;
        }
    }
}
