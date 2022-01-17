import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] prefix_sum =  new long[n];
		for(int i=0;i<n;i++) {
			prefix_sum[i] = sc.nextLong();
		}
		int answer=0;
		HashMap<Long,Long> map = new HashMap<Long,Long>();
		map.put((long)0, (long)1);
		for(int i=0;i<n;i++) {
			if(i!=0)prefix_sum[i]+=prefix_sum[i-1];
			if(map.containsKey(prefix_sum[i])) {
				answer++;
				map.clear();
				map.put(prefix_sum[i-1], (long)1);
			}
			map.put(prefix_sum[i], (long)1);
		}
		System.out.println(answer);
		sc.close();
	}
}