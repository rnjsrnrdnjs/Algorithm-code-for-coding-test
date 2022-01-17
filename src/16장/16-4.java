import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		StringBuilder sb = new StringBuilder();
		
		if(N==1 &&M==1) {
			
		}
		else if(N==1) {
			for(int i=N+1;i<=M;i++) {
				int count=0;
				for(int j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						count+=1;
						break;
					}
				}
				if(count==0) {
					sb.append(i+"\n");
				}
			}
			System.out.print(sb.toString());
			
		}
		else if(N!=1) {
			for(int i=N;i<=M;i++) {
				int count=0;
				for(int j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						count+=1;
						break;
					}
				}
				if(count==0) {
					sb.append(i+"\n");
				}
			}
			System.out.print(sb.toString());
		}
		scan.close();
	}
}