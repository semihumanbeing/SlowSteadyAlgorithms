package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main11724 {

	static int n, m;
	static ArrayList<Integer>[] A;
	static boolean visited[];
	static int count = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		A = new ArrayList[n + 1];
		visited = new boolean[n + 1];

		for (int i = 1; i < n+1; i++) {
			A[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);

		}

		for (int i = 1; i < n+1; i++) {
			if (!visited[i]) {
				count++;
				dfs(i);
			}
		}
		
		System.out.println(count);

	}

	private static void dfs(int i) {
		if(visited[i]) {
			return;
		}
		visited[i] = true;
		for(int k : A[i]) {
			if(visited[k]==false) {
				dfs(k);
			}
		}
	}

}
