import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int count=0;
		int NC=666;
		for(int i=1;i<6660000;i++) {
			if(String.valueOf(i).contains("666")) {
				count++;
			}
			if(N==count) {
				System.out.println(i);
				break;
			}
		}
	}
}

