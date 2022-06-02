package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1920_2 {
	static int[] nArr;
	static int[] mArr;
	static int N;
	static int M;
	static int mid;
	static StringBuilder sb = new StringBuilder();

	private static void search(int start, int end, int target) {
		for (int i = 0; i < N; i++) {
			if (target == nArr[i]) {
				sb.append(1).append("\n");
				return;
			} 
		}
		do {
			mid = (start + end) / 2;
			if (mid > target) {
				start = mid;
			} else if (mid < target) {
				mid = start;
			}
		} while (mid == target);
		sb.append(0).append("\n");
		return;

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// N 배열담기
		N = Integer.parseInt(br.readLine());
		String[] nStr = br.readLine().split(" ");
		nArr = Arrays.stream(nStr).mapToInt(Integer::parseInt).toArray();
		// M 배열담기
		M = Integer.parseInt(br.readLine());
		nStr = br.readLine().split(" ");
		mArr = Arrays.stream(nStr).mapToInt(Integer::parseInt).toArray();

		Arrays.sort(nArr);

		for (int i = 0; i < M; i++) {
			search(0, N, mArr[i]);
		}
		System.out.println(sb);

	}

}
