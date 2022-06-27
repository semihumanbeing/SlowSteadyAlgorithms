package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15649 {

	public static int[] answer;
	public static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		answer = new int[M];
		visited = new boolean[N];

		track(N, M, 0);
		
		System.out.println(sb);
	}

	private static void track(int N, int M, int depth) {
		
		// base
		if(depth == M) {
			for(int i : answer) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		// dfs
		for (int i = 0; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				answer[depth] = i+1;
				track(N,M,depth+1);
				// 재귀에서 리턴하면 값을 초기화한다.
				visited[i] = false;
			}
		}

	}

}
