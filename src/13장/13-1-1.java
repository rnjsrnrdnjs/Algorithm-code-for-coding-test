import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int fac=1;
		for(int i=1;i<=N;i++) {
			fac=fac*i;
		}
		System.out.println(fac);
	}
}