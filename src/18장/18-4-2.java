import java.util.*;
import java.io.*;

public class Main {
	public static void  main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		Stack<Character> st=new Stack<Character>();
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		int N=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			al.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(al);
		
		for(int i=0;i<al.size();i++) {
			sb.append(al.get(i)).append("\n");
		}
		System.out.println(sb);
		
	}
}