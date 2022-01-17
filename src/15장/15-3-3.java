import java.util.*;
import java.io.*;

public class Main {
	public static int[][] vertex;
	public static boolean[] visit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		vertex = new int[n+1][n+1];
		for(int i=1;i<=m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			vertex[a][b] = 1;
			vertex[b][a] = 1;
		}
		visit = new boolean[n+1];
		dfs(v); 
		System.out.println();
		visit = new boolean[n+1];
		bfs(v); 

		
	}
	public static void dfs(int v) {
		visit[v] = true;
		System.out.print(v+ " ");
		if(v == vertex.length) {
			return;
		}
		for(int a=1;a<vertex.length;a++) {
			if(vertex[v][a] == 1 && visit[a] == false) {
				dfs(a);
			}
		}
			
	}
	public static void bfs(int v) {
		Queue<Integer> que = new LinkedList<Integer>(); 
		que.add(v);
		visit[v] = true;
 		System.out.print(v+ " ");
		while(!que.isEmpty()) {
			int temp = que.peek();
			que.poll();
			for(int i=1; i<vertex.length;i++) {
				if(vertex[temp][i] ==1 && visit[i] == false) {
					que.add(i);
					visit[i] = true;
					System.out.print(i+ " ");
				}
			}
		}
	}
}