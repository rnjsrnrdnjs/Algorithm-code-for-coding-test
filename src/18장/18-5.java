import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] weight = new int[n];
        for (int i=0; i<n; i++) {
            weight[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(weight);
        int answer = 1;
        for (int i=0; i<n; i++) {
            if (answer  < weight[i]) 
                break;
            answer += weight[i];
        }
        System.out.println(answer);
	}
}