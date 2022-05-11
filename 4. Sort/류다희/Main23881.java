package practice;

import java.util.Scanner;

public class Main23881 {

	static int A, K;
	static int resultKey = 0;

	private static void selectionSort(int[] array) {
		selectionSort(array, 0);
	}

	private static void selectionSort(int[] array, int start) {
		if (start < array.length - 1) {

			int minimum = start;
			for (int i = start; i < array.length; i++) {
				if (array[i] < array[minimum]) {
					minimum = i;
				}
			}
			swap(array, start, minimum);
			selectionSort(array, start + 1);
		}
	}

	private static void swap(int[] array, int index1, int index2) {
		resultKey++;
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		
		if(resultKey==K) {
			System.out.printf("%d %d", array[index1], array[index2]);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		A = scanner.nextInt();
		K = scanner.nextInt();
		int[] array = new int[A];

		
		for (int i = 0; i < A; i++) {
			array[i] = scanner.nextInt();
		}

		selectionSort(array);

	}

}
