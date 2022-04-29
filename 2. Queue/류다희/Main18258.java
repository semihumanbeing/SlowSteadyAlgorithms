package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main18258 {
	
	public static void main(String[] args) throws Exception {
		Queue<Integer> q = new LinkedList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int command = Integer.parseInt(br.readLine());
		int size = 0;
		int num = 0;
		StringTokenizer N;

		for (int i = 0; i < command; i++) {
			try {
				N = new StringTokenizer(br.readLine(), " ");
				switch (N.nextToken()) {
				case "push":
					num = Integer.parseInt(N.nextToken());
					q.offer(num);
					size++;
					break;
				case "pop":
					if (size <= 0) {
						size = 0;
						sb.append(-1).append("\n");
					} else {
						sb.append(q.peek()).append("\n");
						size--;
						q.remove();
					}
					break;
				case "size":
					if (size <= 0) {
						size = 0;
					}
					sb.append(size).append("\n");
					break;
				case "empty":
					if (size <= 0) {
						size = 0;
						sb.append(1).append("\n");
					} else
						sb.append(0).append("\n");
					break;
				case "front":
					if (size <= 0) {
						sb.append(-1).append("\n");
					} else {
						sb.append(q.peek()).append("\n");
					}
					break;
				case "back":
					if (size <= 0) {
						sb.append(-1).append("\n");
					} else {
						sb.append(num).append("\n");
					}
				}
			} catch (Exception e) {
				sb.append(-1).append("\n");
			}
		}
		System.out.println(sb);
	}
}
