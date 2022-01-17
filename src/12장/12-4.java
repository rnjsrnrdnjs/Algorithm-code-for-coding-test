import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		int s = Integer.parseInt(br.readLine());
		while (true) {
			boolean tof = false;
			for (int i = 0; i < n - 1; i++) {
				int idx = i;
				int cmp;
				for (int j = n - 1; j >= i + 1; j--) {
					if (arr.get(idx) < arr.get(j)) {
						if (j - i <= s) {
							idx = j;
							tof = true;
							cmp = j - i;
						}
					}
				}
				if (idx != i) {
					int tmp = arr.get(idx);
					arr.remove(idx);
					arr.add(i, tmp);
					s -= cmp;
					break;
				}
			}
			if (!tof)
				break;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr.get(i) + " ");
		}
		br.close();
	}
}