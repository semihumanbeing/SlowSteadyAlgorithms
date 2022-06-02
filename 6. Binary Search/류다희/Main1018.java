package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1018 {
	public static int min = 64;
	public static boolean[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		int N = Integer.valueOf(NM[0]);
		int M = Integer.valueOf(NM[1]);

		arr = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			
			for (int j = 0; j < M; j++) {
				if (temp.charAt(j) == 'W') {
					arr[i][j] = false;
				} else {
					arr[i][j] = true;
				}
			}
		}
		// ÀÔ·Â³¡

		int r = N - 7;
		int c = M - 7;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				find(i, j);
			}
		}
		System.out.println(min);

	}

	private static void find(int r, int c) {
		int endR = r + 8;
		int endC = c + 8;
		int count = 0;

		boolean F = arr[r][c];
		for (int i = r; i < endR; i++) {
			for (int j = c; j < endC; j++) {
				if (arr[i][j] != F) {
					count++;
				}
				F = !F;
			}
			F = !F;
		}
		count = Math.min(count, 64 - count);
		
		min = Math.min(min, count);
	}

}
