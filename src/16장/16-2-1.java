import java.io.*;
import java.util.*;

public class Main {


	public static void main (String[] args)  throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String s=br.readLine();
		StringTokenizer sT=new StringTokenizer(s);
		int N=Integer.parseInt(sT.nextToken());
		int K=Integer.parseInt(sT.nextToken());
		
		int Nc=1;
		int Kc=K;
		for(int i=0;i<K;i++) {
			Nc=Nc*N;
			N--;
		}
		for(int i=0;i<K;i++) {
			Nc=Nc/Kc;
			Kc--;
		}
		
		System.out.println(Nc);
	}
}
