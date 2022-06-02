package boj;

import java.util.Scanner;

public class Main10819 {

	static int max = 0;

	private static void perm(int[] a, int depth, int n) {
		if (depth == n) {
			sum(a, n);
			return;
		}
		for (int i = depth; i < n; i++) {
			swap(a, i, depth);
			perm(a, depth + 1, n);
			swap(a, i, depth);
		}

	}

	private static void swap(int[] a, int depth, int i) {
		int temp = a[depth];
		a[depth] = a[i];
		a[i] = temp;

	}

	private static void sum(int[] a, int k) {
		int sum = 0;
		for (int i = 2; i <= k; i++) {
			sum += Math.abs(a[i - 2] - a[i - 1]);
		}
		if (max < sum) {
			max = sum;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}

		perm(num, 0, n);
		System.out.println(max);

	}

}
