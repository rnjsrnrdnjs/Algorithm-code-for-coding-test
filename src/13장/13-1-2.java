import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder oput = new StringBuilder();
        int N = Integer.valueOf(br.readLine());
        int count = (int) (Math.pow(2, N) - 1);
        System.out.println(count);
        Reculsive(N, 1, 2, 3, oput);
        System.out.println(oput);

    }

    static void Reculsive(int N, int start, int from, int end, StringBuilder oput) {
        if (N == 0) {
        } else {
            Reculsive(N - 1, start, end, from, oput);
            oput.append(start + " " + end + '\n');
            Reculsive(N - 1, from, start, end, oput);

        }

    }
}
