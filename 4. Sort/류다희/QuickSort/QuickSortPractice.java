package QuickSort;

public class QuickSortPractice {
	
	private static void quickSort(int[] arr) {
		quickSort(arr,0,arr.length-1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);
		if(start < part2 -1) {
			// 오른쪽 파티션의 시작점 바로 전으로 퀵소트 재호출
			quickSort(arr, start, part2-1); 
		}if(part2 < end) {
			// 시작은 파티션함수에서 가져온 오른쪽 파티션의 시작값, 끝나는지점은 처음 range의 끝나는값으로 퀵소트 재호출
			quickSort(arr, part2, end); 
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start+end)/2];
		while(start<=end) {
			while(arr[start]<pivot) start++;
			while(arr[end]> pivot) end--;
			if(start<=end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	private static void printArray(int[] arr) {
		for(int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
		printArray(arr);
		quickSort(arr);
		printArray(arr);
	}

}
