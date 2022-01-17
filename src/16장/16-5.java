import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			System.out.println(Lcm(a, b));
		}
	}

	private static long Lcm(long a, long b) {
		return (a*b)/GCD(a,b);
	}

	private static long GCD(long a, long b) {
		if (b % a == 0)  return a;
		else return GCD(b%a,a);
	}

}