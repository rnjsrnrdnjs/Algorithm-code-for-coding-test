import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);	
		int n= sc.nextInt();
		String member[][]=new String[n][2]; // 나이, 이름
		for(int i=0;i<member.length;i++) {
			for(int j=0;j<2;j++) {
				member[i][j] = sc.next();			
			}
		}
		Arrays.sort(member,new Comparator<String[]>() { // 0:나이 , 1:이름
			@Override
			public int compare(String[] o1,String[] o2) {
					return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}		
		});
		for(int i=0;i<member.length;i++) {
				System.out.println(member[i][0]+" "+member[i][1]);
		}
	}
}