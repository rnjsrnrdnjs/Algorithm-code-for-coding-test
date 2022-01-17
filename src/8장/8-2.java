import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Queue<String> queue = new LinkedList<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		String back = "";
		for (int i = 0; i < n; i++) {
			String[] command = bf.readLine().split(" ");
			if (command[0].equals("push")) {
				back = command[1];
				queue.add(command[1]);
			} else if (command[0].equals("pop")) {
				bw.write(queue.isEmpty() ? "-1" : queue.poll());
				bw.newLine();
			} else if (command[0].equals("size")) {
				bw.write(String.valueOf(queue.size()));
				bw.newLine();
			} else if (command[0].equals("empty")) {
				bw.write(queue.isEmpty() ? "1" : "0");
				bw.newLine();
			} else if (command[0].equals("front")) {
				bw.write(queue.isEmpty() ? "-1" : queue.peek());
				bw.newLine();
			} else if (command[0].equals("back")) {
				bw.write(queue.isEmpty() ? "-1" : back);
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();

	}
}