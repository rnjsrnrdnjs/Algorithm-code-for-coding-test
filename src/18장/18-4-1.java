import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int[] M=new int[N];
		
		for(int i=0;i<N;i++) {
			M[i]=scan.nextInt();
		}
		int temp=0;
		for(int i=0;i<N-1;i++) {
			for(int j=i;j<N;j++) {
				if(M[i]>M[j]) {
					temp=M[i];
					M[i]=M[j];
					M[j]=temp;
				}
			}
		}
		for(int i=0;i<N;i++) {
			System.out.println(M[i]);
		}
	}
}