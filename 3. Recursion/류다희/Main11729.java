package boj;

import java.util.Scanner;

public class Main11729 {
	static int count;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		sb.append((int)Math.pow(2, n)-1).append("\n");
		
		hanoi(n,1,2,3);
		System.out.println(sb);
		
	}

	private static void hanoi(int n,int start,int to,int last) {
		
		if(n==1) {
			sb.append(start).append(" ").append(last).append("\n");
			return;
		}
		hanoi(n-1,start,last,to);
		sb.append(start).append(" ").append(last).append("\n");
		
		hanoi(n-1,to,start,last);
	}

}
