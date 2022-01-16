import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        int A,B;
        A=scan.nextInt();
        B=scan.nextInt();
		sum(A,B);
		sub(A,B);
		mul(A,B);
		div(A,B);
		sur(A,B);
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