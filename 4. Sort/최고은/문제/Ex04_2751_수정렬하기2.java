package _02_정렬응용;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex04_2751_수정렬하기2 {

	public static void main(String[] args) throws Exception{
		//Scanner scan = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer buffer = new StringBuffer();
		
		int N = Integer.parseInt(reader.readLine()); //총 갯수
		
		int[] arr = new int[N];
		
		//입력
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(reader.readLine()); 
		}
		
		quickSort(arr);
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				buffer.append(arr[i]);
			}else {
				buffer.append(arr[i]).append("\n");
			}
		}
		System.out.println(buffer);
	}
	
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		int newPivot = partition(arr, left, right);
		if (left < newPivot-1) {
			quickSort(arr,left,newPivot-1);
		}
		if (right > left) {
			quickSort(arr,newPivot,right);
		}
	}
	
	private static int partition(int[] arr, int left, int right) {
		
		int pivot = arr[(left + right)/2];
		
		while (left <= right) {
			
			while (arr[left] < pivot) left++;
			while (arr[right] > pivot) right--;
			
			if(left <= right) {
				swap(arr,left,right);
				left++;
				right--;
			}
		}
		
		return left;
	}

	public static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

}
