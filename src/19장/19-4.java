import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String bomb = br.readLine();
		Stack<Character> left = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			left.push(s.charAt(i));
			if (left.size() >= bomb.length()) {
				boolean tof = true;
				for (int j = 0; j < bomb.length(); j++) {
					if (left.get(left.size() - bomb.length() + j) != bomb.charAt(j)) {
						tof = false;
						break;                                            
					}
				}
				if (tof) {
					for (int j = 0; j < bomb.length(); j++) {
						left.pop();
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(char ch : left) {
			sb.append(ch);
		}
		System.out.println(sb.length() > 0 ? sb.toString() : "FRULA");
	}
}