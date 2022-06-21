package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1260 {

	static int N, M, start;
	static ArrayList<Integer>[] A;
	static boolean visited[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());

		A = new ArrayList[N + 1];

		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());

			A[s].add(e);
			A[e].add(s);
		}

		for (int i = 1; i <= N; i++) {
			Collections.sort(A[i]);
		}
		visited = new boolean[N + 1];
		DFS(start);
		System.out.println();
		visited = new boolean[N + 1];
		BFS(start);
		System.out.println();

	}

	private static void BFS(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		
		while (!q.isEmpty()) {
			int now = q.poll();
			System.out.print(now + " ");
			for (int i : A[now]) {
				if (!visited[i]) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}

	private static void DFS(int start) {
		System.out.print(start+" ");
		visited[start]= true;
		
		for(int i:A[start]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}

}
