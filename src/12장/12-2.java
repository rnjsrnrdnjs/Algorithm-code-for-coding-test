import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int answer = Integer.MAX_VALUE; 
		String[] equtation = sc.nextLine().split("-");
		for (int i = 0; i < equtation.length; i++) {
			int temp = 0;
			String[] num = equtation[i].split("\\+");
			for (int j = 0; j < num.length; j++) {
				temp += Integer.parseInt(num[j]);
			}
			if (answer == Integer.MAX_VALUE) {
				answer = temp;
			} else {
				answer -= temp;
			}
		}
		System.out.println(answer);
	}
}