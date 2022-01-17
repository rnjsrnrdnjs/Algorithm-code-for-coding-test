import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int[] cs=new int[1002];
		for(int i=0;i<n;i++){
			int tmp=Integer.parseInt(st.nextToken());
			cs[tmp]++;
		}
		while(true){
			boolean tof=false;
			for(int i=0;i<=1000;i++){
				if(cs[i]!=0){
					tof=true;
					if(cs[i+1]!=0){
						int k=-1;
						for(int j=i+2;j<=1000;j++){
							if(cs[j]!=0){
								k=j;
								break;
							}
						}
						if(k!=-1){
							while(cs[i]!=0){
								sb.append(i).append(" ");
								cs[i]--;
							}
							sb.append(k).append(" ");
							cs[k]--;
							break;
						}
						else{
							sb.append(i+1).append(" ");
							cs[i+1]--;
							break;
						}
					}
					else{
						while(cs[i]!=0){
							sb.append(i).append(" ");
							cs[i]--;
						}
						break;
					}
				}
			}
			if(!tof)break;
		}
		System.out.println(sb);
		br.close();
	}
}