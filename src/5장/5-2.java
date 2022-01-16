import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		Scanner scan=new Scanner(System.in);
		
		int A=scan.nextInt();
		int B=scan.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}
		else if(A<B) {
			System.out.println("<");			
		}
		else {
			System.out.println("==");
		}
		
	}
}
