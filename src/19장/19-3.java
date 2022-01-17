import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(":");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int GCD = gcd(Math.max(N, M), Math.min(N, M));
        System.out.println(N / GCD + ":" + M / GCD);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}