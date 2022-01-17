import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int q = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] map = new int[x];
        for(int i = 0; i < x; i++) {
            map[i] = i;
        }
        boolean[] has = new boolean[q+1];
        int mex = 0;
        for(int i = 0; i < q; i++) {
            int y = Integer.parseInt(br.readLine());
            if(map[y%x] < q) {
                has[map[y%x]] = true;
                while(has[mex]) {
                    mex++;
                }
                map[y%x] += x;
            }
            out.println(mex);
        }
        br.close();
        out.close();
	}
}