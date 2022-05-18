package practice;

public class SelectSort {

	public static void selectionSort(int[] arr) {
		selectionSort(arr,0);
	}
	
	public static void selectionSort(int [] arr, int start) {
		if(start < arr.length-1) {
			int minimumIndex = start;
			for(int i = start; i<arr.length; i++) {
				if(arr[i] < arr[minimumIndex]) {
					minimumIndex = i;
				}
			}
				swap(arr,start,minimumIndex);
				selectionSort(arr, start+1);
			
		}
			
	}
	
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void printArray(int[] arr) {
		for(int data: arr) {
			System.out.printf("%d ",data);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,7,1,8,2,4};
		printArray(arr);
		selectionSort(arr);
		printArray(arr);
	}

}
