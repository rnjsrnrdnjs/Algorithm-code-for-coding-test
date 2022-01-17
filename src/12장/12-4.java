import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		int s = Integer.parseInt(br.readLine());

		while (true) {
			boolean tof = false;
			for (int i = 0; i < n - 1; i++) {
				int idx = i;
				int cmp=0;
				for (int j = n - 1; j >= i + 1; j--) {
					if (arr.get(idx) < arr.get(j) ) {
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
		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			sb.append(i).append(' ');
		}
		System.out.println(sb);
		br.close();
	}
}