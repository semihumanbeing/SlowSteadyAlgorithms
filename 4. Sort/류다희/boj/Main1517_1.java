package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1517_1 {

	static long[] A, temp;
	static long result;

	private static void mergeSort(long[] arr) {
		temp = new long[arr.length];
		mergeSort(arr, temp, 0, arr.length - 1);
	}

	private static void mergeSort(long[] arr, long[] temp, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, temp, start, mid);// 배열의 앞부분
			mergeSort(arr, temp, mid + 1, end); // 배열의 뒷부분
			merge(arr, temp, start, mid, end);
		}

	}

	private static void merge(long[] arr, long[] temp, int start, int mid, int end) {
		for(int i=(int) start; i<=end;i ++) {
			temp[i] = arr[i];
		}
		int part1 = start;
		int part2 = mid+1;
		int index = start;
		
		while(part1<=mid && part2 <=end) {
			if(temp[part1] > temp[part2]) {
				A[index] = temp[part2];
				result = result + (part2 - index)*1l;
				part2++;
			} else {
				A[index] = temp[part1];
				part1++;
			}
			index++;
		}
		for(int i= 0; i<= mid - part1; i++) {
			arr[index+i] = temp[part1+i];
		}

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		A = new long[N];
		temp = new long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		
		result = 0;
		mergeSort(A);
		
		System.out.println(result);
		

	}

}
