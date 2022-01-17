import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N, M, answer = Integer.MAX_VALUE;
	static boolean[] choice_chicken;
	static List<int[]> house, chicken;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		house = new ArrayList<>();
		chicken = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int tmp = sc.nextInt();
				if (tmp == 1)
					house.add(new int[] { i, j });
				else if (tmp == 2)
					chicken.add(new int[] { i, j });
			}
		}
		choice_chicken = new boolean[chicken.size()];
		Brute_Force(-1, 0);

		System.out.println(answer);
	}

	static void Brute_Force(int idx, int cnt) {
		if (cnt == M) {
			int dist = 0;

			for (int[] h : house) {
				int tmp = Integer.MAX_VALUE;
				for (int i = 0; i < choice_chicken.length; i++) {
					if (choice_chicken[i])
						tmp = Math.min(tmp, Math.abs(h[0] - chicken.get(i)[0]) + Math.abs(h[1] - chicken.get(i)[1]));
				}
				dist += tmp;
			}
			answer = Math.min(answer, dist);
			return;
		}

		for (int i = idx + 1; i < choice_chicken.length; i++) {
			choice_chicken[i] = true;
			Brute_Force(i, cnt + 1);
			choice_chicken[i] = false;
		}
	}
}