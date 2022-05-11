package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1427 {

	private static void selectionSort(int[] arr) {
		selectionSort(arr, 0);
	}

	private static void selectionSort(int[] arr, int start) {
		if (start < arr.length - 1) {
			int minimum = start;
			for (int i = start; i < arr.length; i++) {
				if (arr[i] > arr[minimum]) {
					minimum = i;
				}
			}
			swap(arr, start, minimum);
			selectionSort(arr, start + 1);

		}

	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();

		int[] arr = new int[N.length()];
		for (int i = 0; i < N.length(); i++) {
			arr[i] = N.charAt(i) - '0';
		}
		selectionSort(arr);

		for (int a : arr) {
			System.out.printf("%d", a);

		}
	}

}
