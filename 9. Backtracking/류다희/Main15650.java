package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15650 {

	public static int[] answer;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		answer = new int[M];

		track(1, N, M, 0);
		
		System.out.println(sb);
	}

	private static void track(int start, int N, int M, int depth) {
		
		// base
		if(depth == M) {
			for(int i : answer) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		// dfs
		for (int i = start; i <= N; i++) {
				answer[depth] = i;
				track(i+1,N,M,depth+1);
			}
		}

	}

