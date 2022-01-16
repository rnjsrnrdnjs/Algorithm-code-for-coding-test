import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String galho = sc.nextLine();
		Stack<Character> stack = new Stack<>();
		int answer = 0;

		for (int i = 0; i < galho.length(); i++) {
			if (galho.charAt(i) == '(') { 
				stack.push('(');
				continue;
			}
			if (galho.charAt(i) == ')') { 
				stack.pop(); 

				if (galho.charAt(i - 1) == '(') { 
					answer += stack.size(); 
				} else { 
					answer++; 
				}
			}
		}
		System.out.println(answer);
	}
}