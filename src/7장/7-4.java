import java.io.*;
import java.util.*;

public class Main {

	public static void main (String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		Stack st=new Stack();
		int N=sc.nextInt();
		for(int i=0;i<=N;i++) {
			String str=sc.nextLine();
			if(str.contains("push")) {
				st.push(str.substring(5));
			}
			else if(str.contains("pop")) {
				if(st.isEmpty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(st.pop());
				}
			}
			else if(str.contains("size")) {
				System.out.println(st.size());
			}
			else if(str.contains("empty")) {
				if(st.isEmpty()) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			else if(str.contains("top")) {
				if(st.isEmpty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(st.peek());
				}
			}
		}


	}
}