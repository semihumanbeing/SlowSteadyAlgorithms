package boj;

import java.util.Scanner;

public class Main2798 {
	static int max = 0;
	static int n = 0;
	static int m = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		permutation(arr, 0, n);
		System.out.println(max);
	}

	private static void permutation(int[] arr, int depth, int n) {
		if (depth == n) {
			sum(arr, n);
			return;
		}

		for (int i = depth; i < n; i++) {
			swap(arr, i, depth);
			permutation(arr, depth + 1, i);
			swap(arr, i, depth);
		}

	}

	private static int sum(int[] arr, int n) {
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum = arr[i] + arr[i + 1] + arr[i + 2];
			sum = Math.max(sum, max);
			if (sum == m) {
				return sum;
			}
			if(max<sum && sum < m) {
				sum = max;
				return sum;
		}
		
		}
		return sum;

	}

	private static void swap(int[] arr, int i, int depth) {
		int temp = arr[i];
		arr[i] = arr[depth];
		arr[depth] = temp;
	}

}
