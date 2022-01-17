import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
    static int N;
    static int[][] tb;
    static int ans;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        tb = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                tb[i][j] = Integer.parseInt(st.nextToken());
            }
        }
 
        ans = 0;
        recursive(1, 2, 0);
 
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void recursive(int x, int y, int shape) {
        if (x == N && y == N) { 
            ans++;
            return;
        }
		if(shape==0){
            if (y + 1 <= N && tb[x][y + 1] == 0) { 
                recursive(x, y + 1, 0);
            }
		}
		else if(shape==1){
            if (x + 1 <= N && tb[x + 1][y] == 0) { 
                recursive(x + 1, y, 1);
            }
		}else if(shape==2){
            if (y + 1 <= N && tb[x][y + 1] == 0) { 
                recursive(x, y + 1, 0);
            }
            if (x + 1 <= N && tb[x + 1][y] == 0) { 
                recursive(x + 1, y, 1);
            }
		}
        if (y + 1 <= N && x + 1 <= N && tb[x][y + 1] == 0 && tb[x + 1][y] == 0 && tb[x + 1][y + 1] == 0) {
            recursive(x + 1, y + 1, 2);
        }
    }
 
}
