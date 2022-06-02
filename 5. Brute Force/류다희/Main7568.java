package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7568 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] list = new int[N][2];
		int[] answer = new int[N];

		for (int i = 0; i < N; i++) {
			answer[i] = 1;
			StringTokenizer st = new StringTokenizer(br.readLine());
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());

		}
		for (int k = 0; k < N; k++) {
			for (int j = 0; j < N; j++) {
				if (list[k][0] < list[j][0] && list[k][1] < list[j][1]) {
					answer[k]++;
				}
			}
		}

		for (int m : answer) {
			System.out.print(m + " ");
		}

	}

}
