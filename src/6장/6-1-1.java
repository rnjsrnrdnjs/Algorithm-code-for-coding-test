import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			int s=sc.nextInt();
			
			max=Math.max(s, max);
			min=Math.min(s, min);
			
		}
		
		System.out.println(min+" "+max);
	}

}