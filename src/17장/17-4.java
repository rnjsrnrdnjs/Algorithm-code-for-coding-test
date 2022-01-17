import java.util.*;
import java.io.*;

public class Main {
	static int N,H,up[], down[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		H=Integer.parseInt(st.nextToken());
		up=new int[N/2];
		down=new int[N/2];
		int upIdx=0;
		int downIdx=0;
		int mx=Integer.MAX_VALUE;
		int ans=1;
		for(int i=0; i<N; i++) {
			int num=Integer.parseInt(br.readLine());
			if(i%2==0) down[downIdx++]=num;
			else up[upIdx++]=num;
		}
		Arrays.sort(up);
		Arrays.sort(down);
		for(int i=1; i<=H; i++) { 
			int idxd=binarySearch(0,N/2-1 , i, down); 
			int idxu=binarySearch(0,N/2-1 , H-i+1, up); 
			if(mx>idxd+idxu) {
				mx=idxd+idxu;
				ans=1;
			}
			else if(mx==idxd+idxu) {
				ans++;
			}
		}
		System.out.print(mx+" "+ans);
	}
	private static int binarySearch(int left, int right, int height, int[] arr) {
		int min=Integer.MAX_VALUE;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid]>=height) { 
				min=Math.min(min, mid);
				right=mid-1; 
			}
			else left=mid+1;
		}
		return min==Integer.MAX_VALUE? 0 : (N/2)-min;
	}
}