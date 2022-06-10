package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2606 {
	static int amount, nodes;
	static boolean visited[];
	static ArrayList<Integer> A[];
	static int count = 0;
	static int[] answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		amount = Integer.parseInt(br.readLine());
		nodes = Integer.parseInt(br.readLine());

		answer = new int[amount + 1];
		A = new ArrayList[amount + 1];
		for (int i = 1; i <= amount; i++) {
			A[i] = new ArrayList<>();
		} // ArrayList 초기화

		for (int i = 0; i < nodes; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		} // 배열에 값 저장

		visited = new boolean[amount + 1];
		bfs(1);
		// bfs 돌리기
		System.out.println(count);
	}

	private static void bfs(int idx) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(idx);
		visited[idx] = true;
		
		while (!queue.isEmpty()) {
			int now = queue.poll();
			for (int i : A[now]) {
				if (visited[i] == false) {
					visited[i] = true;
					count++;
					queue.add(i);
				}

			}
			
		}

	}

}
