package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1325 {
	static int N, M;
	static boolean visited[];
	static int answer[];
	static ArrayList<Integer> A[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new ArrayList[N + 1];
		answer = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			A[S].add(E);
		}

		for (int i = 1; i <= N; i++) {
			visited = new boolean[N + 1];
			BFS(i);
		}
		int max = 0;
		for (int i = 1; i <= N; i++) {
			max = Math.max(max, answer[i]);
		}
		for (int i = 1; i <= N; i++) {
			if (answer[i] == max) {
				bw.write(i+" ");
			}
		}
		bw.flush();
		bw.close();

	}

	private static void BFS(int idx) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(idx);
		visited[idx] = true;

		while (!queue.isEmpty()) {
			int now = queue.poll();
			for (int i : A[now]) {
				if (visited[i] == false) {
					answer[i]++;
					queue.add(i);
				}
			}
		}

	}

}
