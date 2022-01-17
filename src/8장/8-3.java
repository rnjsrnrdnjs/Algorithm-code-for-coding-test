import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			queue.offer(i);
		}
		while(queue.size() > 1) {
			queue.poll();	
			queue.offer(queue.poll());
		}
		
		System.out.println(queue.poll());
	}
}