import java.util.*;
import java.io.*;

public class Main {
	public static int maxAns = Integer.MIN_VALUE;	// 최댓값 
	public static int minAns = Integer.MAX_VALUE;	// 최솟값 
	public static int[] operator = new int[4];	// 연산자 개수 
	public static int[] numArr;					// 숫자 
	public static int N;						// 숫자 개수 
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		numArr = new int[N];
		for (int i = 0; i < N; i++) {
			numArr[i] = sc.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			operator[i] = sc.nextInt();
		}
		back_Traking(numArr[0], 1);
		System.out.println(maxAns);
		System.out.println(minAns);
	}
 
	public static void back_Traking(int num, int idx) {
		if (idx == N) {
			maxAns = Math.max(maxAns, num);
			minAns = Math.min(minAns, num);
			return;
		}
		for (int i = 0; i < 4; i++) {
			if (operator[i] > 0) {
				operator[i]--;
				if(i==0)back_Traking(num + numArr[idx], idx + 1);
				else if(i==1)back_Traking(num - numArr[idx], idx + 1);
				else if(i==2)back_Traking(num * numArr[idx], idx + 1);
				else if(i==3)back_Traking(num / numArr[idx], idx + 1);
				operator[i]++;
			}
		}
	}
}