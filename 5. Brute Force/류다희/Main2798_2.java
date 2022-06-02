package boj;

import java.util.Scanner;

public class Main2798_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] arr = new int[n];
		int max = 0;
		int temp = 0;
		int result = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				for (int l = k + 1; l < n; l++) {
					temp = arr[j] + arr[k] + arr[l];
					if (temp <= m) {
						max = Math.max(max, temp);
						if (max == m) {
							result = max;
						} else if (max < m) {
							result = max;
						}
					}
				}
			}
		}

		System.out.println(result);

	}

}
