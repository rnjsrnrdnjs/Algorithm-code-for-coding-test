import java.util.*;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int[] human = new int[5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				human[i] += sc.nextInt();
			}
		}
		int win = 0;
		for(int i=1; i<5; i++) {
			if(human[win] < human[i])
				win = i;
		}
		System.out.printf("%d %d", win+1, human[win]);
	}
}