package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2178 {

	static int[][] maze;
	static boolean[][] check;
	static int[] tempx = { 0, 1, 0, -1 };
	static int[] tempy = { 1, 0, -1, 0 };
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		maze = new int[N][M];
		check = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				maze[i][j] = Integer.valueOf(line.charAt(j) - '0');
				if (maze[i][j] == 0) {
					check[i][j] = true;
				}
			}
		}

		bfs(0, 0);
		System.out.println(maze[N-1][M-1]);

	}

	private static void bfs(int i, int j) {

		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { i, j });
		while (!q.isEmpty()) {
			int now[] = q.poll();
			check[i][j] = true;
			for (int k = 0; k < 4; k++) {
				int x = now[0] + tempx[k];
				int y = now[1] + tempy[k];

				if (x >= 0 && y >= 0 && x < N && y < M) {
					if(maze[x][y]!=0 && !check[x][y]) {
						check[x][y] = true;
						maze[x][y] = maze[now[0]][now[1]] +1;
						q.add(new int[] {x,y});
					}
				}
			}
		}

	}

}
