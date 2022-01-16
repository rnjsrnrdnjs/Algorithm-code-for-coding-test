import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        int A,B;
        A=scan.nextInt();
        B=scan.nextInt();
		System.out.println(sum(A,B));
		System.out.println(sub(A,B));
		System.out.println(mul(A,B));
		System.out.println(div(A,B));
		System.out.println(sur(A,B));
	}
	static int sum(int a,int b){
		return a+b;
	}
	static int sub(int a,int b){
		return a-b;
	}
	static int mul(int a,int b){
		return a*b;
	}
	static int div(int a,int b){
		return a/b;
	}
	static int sur(int a,int b){
		return a%b;
	}
	
}