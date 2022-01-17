import java.util.*;
public class Main {
	
	static char board[][];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		board = new char[N][M];
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < M; j++) {
				board[i][j] = s.charAt(j);
			}
		}
		int answer = 1000000;
		for (int i = 0; i < N-7; i++) {
			for (int j = 0; j < M-7; j++) {
				answer = Math.min(answer, brute_force(i,j));
			}
		}
		System.out.println(answer);
	}
	
	public static int brute_force(int x, int y) {
		int countB = 0; 
		int countW = 0; 
		for (int i = x; i < x+8; i++) {
			for (int j = y; j < y+8; j++) {
				if((i + j) % 2 == 0) {
					if(board[i][j] == 'B') countW++;
					else countB++;
				}else { 
					if(board[i][j] == 'W') countW++;
					else countB++;
				}
			}
		}
		return Math.min(countB,countW);
	}
}