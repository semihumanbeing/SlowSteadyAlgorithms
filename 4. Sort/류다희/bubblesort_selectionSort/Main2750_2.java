package boj;

import java.util.Scanner;

public class Main2750_2 {
	//다시풀기
	public static void selectionSort(int[] arr) {
		selectionSort(arr,0);
	}
	
	private static void selectionSort(int[] arr, int start) {
		if(start < arr.length-1) {
			int minimum = start;
			for(int i = start; i<arr.length;i++) {
				if(arr[i]<arr[minimum]) {
					minimum = i;
				}
			}
			swap(arr, start, minimum);
			selectionSort(arr, start+1);
			
		}
		
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1]= arr[index2];
		arr[index2] = temp;
		
	}
	
	public static void print(int[] arr) {
		for(int i : arr) {
			System.out.printf("%d\n",i);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		selectionSort(arr);
		print(arr);
		
	}
}
