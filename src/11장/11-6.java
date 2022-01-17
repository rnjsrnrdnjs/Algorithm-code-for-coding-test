import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Long> card = new PriorityQueue<Long>();
		for (int i=0; i<n; i++) 
			card.add(sc.nextLong());
		long answer = 0;
		while (card.size() > 1) {
			long first = card.poll();
			long second = card.poll();
			answer += first + second;
			card.add(first + second); 
		}
		System.out.println(answer);
	}
}