import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main{
    static int N, M;
    static int[][] lab;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static int[][] visit;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        lab = new int[N][M];
        visit = new int[N][M];
        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                lab[i][j] = Integer.parseInt(input[j]);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (lab[i][j] == 0) {
                    copy();
                    visit[i][j] = 1;
                    back_Traking(1);
                    visit[i][j] = 0;
                }
            }
        }
        System.out.println(answer);
    }

    static void copy() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visit[i][j] = lab[i][j];
            }
        }
    }
    static void back_Traking(int select) {
        if (select == 3) {
            bfs();
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(visit[i][j] == 0) {
                    visit[i][j] = 1;
                    back_Traking(select+1);
                    visit[i][j] = 0;
                }
            }
        }
    }
    static void bfs() {
        Queue<Integer> queueX = new LinkedList<>();
        Queue<Integer> queueY = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visit[i][j] == 2) {
                    queueX.offer(j);
                    queueY.offer(i);
                }
            }
        }

        int[][] visit2 = new int[N][M];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                visit2[i][j] = visit[i][j];
            }
        }
        while (!queueX.isEmpty()) {
            int tempX = queueX.poll();
            int tempY = queueY.poll();
            for (int i = 0; i < 4; i++) {
                int destX = tempX + dir[i][1];
                int destY = tempY + dir[i][0];
                if (destX < 0 || destX >= M || destY < 0 || destY >= N) continue;
                if (visit2[destY][destX] != 0) continue;
                visit2[destY][destX] = 2;
                queueX.offer(destX);
                queueY.offer(destY);
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visit2[i][j] == 0) count++;
            }
        }
        if (count > answer) answer = count;
    }
}