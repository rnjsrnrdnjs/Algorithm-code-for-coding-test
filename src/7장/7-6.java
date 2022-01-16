import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
 
        String input = br.readLine();
 
        char[] number = input.toCharArray();
        Deque<Character> answer = new ArrayDeque<>();
        for (int i = 0; i < number.length; i++) {
            while (K > 0 && !answer.isEmpty() && answer.getLast() < number[i]) {
                answer.removeLast();
                K--;
            }
            answer.addLast(number[i]);
        }
 
        StringBuilder ans = new StringBuilder();
        while (answer.size() > K) {
            ans.append(answer.removeFirst());
        }
 
        bw.write(ans.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
	}
}