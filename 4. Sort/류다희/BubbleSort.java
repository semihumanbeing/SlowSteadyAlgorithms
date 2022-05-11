package practice;

public class BubbleSort {
	private static void bubbleSort(int[] arr) {
		bubbleSort(arr, arr.length -1);
		
	}
	// 버블정렬은 제일 큰 값을 찾아서 인덱스의 마지막 값이랑 바꾸는것이다.
	private static void bubbleSort(int[] arr, int last) {
		if(last>0) {
			for(int i =1; i<=last;i++) {
				if(arr[i-1]>arr[i]) {
					swap(arr,i-1,i);
				}
			}
			bubbleSort(arr,last-1);
		}
	}
	
	private static void swap(int[] arr, int source, int target) {
		int temp = arr[source];
		arr[source] = arr[target];
		arr[target] = temp;
		
	}
	
	private static void print(int[]arr) {
		for(int data : arr) {
			System.out.printf("%d ",data);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {3,5,4,2,1};
		print(arr);
		bubbleSort(arr);
		print(arr);
	}

}
