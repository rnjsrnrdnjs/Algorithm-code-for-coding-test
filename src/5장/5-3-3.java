import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=1;i<=T ;i++) {
			for(int j=0; j<(T-i);j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=(i*2)-1;j++) {
				System.out.print("*");
			}
			

			System.out.println();
		}
	}
}