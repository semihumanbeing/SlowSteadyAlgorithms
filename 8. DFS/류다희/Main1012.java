package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1012 {
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static int N, M, amount;
	static int[][] field;
	static boolean[][] visited;
	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(st.nextToken());

		for (int i = 0; i < T; i++) {
			count = 0;
			st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			amount = Integer.parseInt(st.nextToken());

			field = new int[M][N];
			visited = new boolean[M][N];

			for (int j = 0; j < amount; j++) {
				st = new StringTokenizer(br.readLine()," ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				field[y][x] = 1;
				visited[y][x] = true;
			}

			for (int x = 0; x < N; x++) {
				for (int y = 0; y < M; y++) {
					if (visited[y][x] == true && field[y][x]==1) {
						dfs(y, x);
						count++;
					}

				}
				
			}

			sb.append(count).append("\n");
		}

		System.out.println(sb);
	}

	private static void dfs(int x, int y) {
		visited[x][y] = false;

		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];

			if (xx >= 0 && yy >= 0 && xx < M && yy < N) {
				if (visited[xx][yy] && field[xx][yy]==1) {
					dfs(xx, yy);
				}
			}
		}

	}

}
