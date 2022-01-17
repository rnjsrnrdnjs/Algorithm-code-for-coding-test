import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long N = sc.nextLong();
        long[] lanson = new long[K];
        long answer = 0;
        for (int i = 0; i < K; i++) {
            lanson[i] = sc.nextLong();
        }
        long low = 0; 	  
        long high = (long)2147483647;
        while (low <= high) {
            long mid = (low + high) / 2;
            long num = 0;
            for (int i = 0; i < K; i++) { 
                num += (lanson[i] / mid);
            }
            if (num >= N) { 
                low = mid + 1;
				answer=mid;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(answer);
	}
}