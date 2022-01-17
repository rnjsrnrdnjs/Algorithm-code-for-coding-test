import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int ans=0;
		int[] ca=new int[1002];
		int[] cb=new int[1002];
		for(int i=0;i<n;i++){
			int tmp=Integer.parseInt(st.nextToken());
			ca[tmp]++;
		}
		for(int i=0;i<n;i++){
			int tmp=Integer.parseInt(st2.nextToken());
			cb[tmp]++;
		}
		for(int i=1;i<=1000;i++){
			while(ca[i]!=0){
				boolean tof=false;
				for(int j=i-1;j>=1;j--){
					if(cb[j]!=0){
						tof=true;
						ans+=2;
						ca[i]--;
						cb[j]--;
						break;
					}
				}
				if(!tof)break;
			}
		}
		for(int i=1;i<=1000;i++){
			while(ca[i]!=0 && cb[i]!=0){
				ans++;
				ca[i]--;cb[i]--;
			}
		}
		System.out.println(ans);
	}
}