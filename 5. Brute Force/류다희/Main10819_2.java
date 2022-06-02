package boj;

import java.util.Scanner;

public class Main10819_2 {
	static int max = 0;
	
	private static void permutation(int[] arr, int depth, int n) {
		if (depth == n) {
			sum(arr, n);
			return;
		}
		for (int i = depth; i < n; i++) {
			swap(arr, i, depth);
			permutation(arr, depth + 1, n);
			swap(arr, i, depth);
		}

	}

	private static void swap(int[] arr, int depth, int n) {
		int temp = arr[depth];
		arr[depth] = arr[n];
		arr[n] = temp;
	}

	private static void sum(int[] arr, int n) {
		int sum = 0;

		for (int i = 2; i <= n; i++) {
			sum += Math.abs(arr[i - 2] - arr[i - 1]);
		}
		if (max < sum) {
			max = sum;
		}

	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ;i<n; i++) {
			arr[i] = scanner.nextInt();
		}

		permutation(arr, 0, n);

		System.out.println(max);

	}

	
}
