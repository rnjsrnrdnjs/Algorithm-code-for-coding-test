import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] count_sort = new int[N];
		for(int i = 0; i < N; i++){
			count_sort[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(count_sort);
		for(int i = 0; i < N; i++){
			sb.append(count_sort[i]).append('\n');
		}
		System.out.println(sb);
	}
}