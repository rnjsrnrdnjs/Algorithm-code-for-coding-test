import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			HashMap<String, Integer> map = new HashMap<>();
			int n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				String b = br.readLine().split(" ")[1];
				if (map.containsKey(b)) {
					map.put(b, map.get(b) + 1);
				} else {
					map.put(b, 1);
				}
			}
			int answer = 1;
			for (int y : map.values()) {
				answer *= y + 1;
			}
			System.out.println(answer - 1);
		}
	}
}