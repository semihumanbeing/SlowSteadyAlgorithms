package boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main24445 {

	static boolean visited[];
	static ArrayList<Integer>[] A;
	static int N;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		int M = scanner.nextInt();
		int R = scanner.nextInt();

		A = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {
			int S = scanner.nextInt();
			int E = scanner.nextInt();
			A[S].add(E);
			A[E].add(S);

		}
		for (int i = 1; i <= N; i++) {
			Collections.sort(A[i],Collections.reverseOrder());
		}

		visited = new boolean[N + 1];
		BFS(R);

	}

	private static void BFS(int Node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		int[] order = new int[N+1];
		visited[Node] = true;
		int count = 0;
		
		while (!queue.isEmpty()) {
			int now = queue.poll();
			count++;
			order[now]=count;

			for (int i : A[now]) {
				if (!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
		for(int i=1;i<=N;i++) {
			System.out.println(order[i]);
		}

	}

}
