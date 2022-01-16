import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n;		
	
		n=scan.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=1;k<n-i;k++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i+1;j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
}
