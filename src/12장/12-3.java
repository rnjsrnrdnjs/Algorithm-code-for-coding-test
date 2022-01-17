import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] meet = new int[N][2];
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			meet[i][0] = Integer.parseInt(st.nextToken());	
			meet[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(meet, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		int answer = 0;
		int endTime = 0;
		for(int i = 0; i < N; i++) {
			if(endTime <= meet[i][0]) {
				endTime = meet[i][1];
				answer++;
			}
		}
		System.out.println(answer);
		br.close();
	}
}