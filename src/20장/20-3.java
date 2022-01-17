import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer=0;
        int[] dp = new int[n+1];
        int[] arr = new int[n+1];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            dp[i]=1;
        }
        for(int i=0; i<n ; i++){
            for(int j=0 ; j<=i ; j++){
                if(arr[j]<arr[i] && dp[j]>=dp[i]){
                    dp[i]=dp[j]+1;
                }
            }
        }
        for(int i=0; i<n ; i++){
            if(dp[i]>answer)
			answer=dp[i];
        }
        System.out.println(answer);
	}
}