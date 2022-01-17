import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		Scanner scan=new Scanner(System.in);

		int T=Integer.parseInt(br.readLine());
		String[] str2=new String[T];
		String str=br.readLine();
		int sum=0;
		
		for(int i=0;i<T;i++) {
			str2[i]=String.valueOf(str.charAt(i));
		}
		for(int i=0;i<T;i++) {
			sum+=Integer.parseInt(str2[i]);
			
		}
		System.out.println(sum);
		
	}
}