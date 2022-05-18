package mergesort;

public class MergeSortPractice {

	// 머지소트는 임시저장공간이 필요하다.
	private static void mergeSort(int[] arr) {
		int[] temp = new int[arr.length]; // 배열의 크기만큼 임지저장공간을만들기
		mergeSort(arr, temp, 0, arr.length-1);
	}
	private static void mergeSort(int[] arr, int[] temp, int start, int end) {
		if(start < end) {
			int mid = (start+end)/2;
			mergeSort(arr,temp,start,mid); // 배열의 앞부분에 START , END 포인트 조정
			mergeSort(arr,temp,mid+1,end); // 배열의 뒷부분도 MID+1, END 포인트 조정
			merge(arr,temp,start,mid,end); // 두개의 재귀함수가 돌아오면 두개의 배열이 정렬이 되어있으니 머지를해준다.
		}
	}
	
	private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
		for(int i = start; i<=end; i++) {
			temp[i] = arr[i]; // 임시저장소에 배열의 값을 넣어둔다.
		}
		int part1 = start; // 첫번쨰 배열방의 첫번째 인덱스
		int part2 = mid+1;  // 두번째 배열방의 첫번째 인덱스
		int index = start; // 양쪽 인덱스에서 작은값을 복사할 때마다 다음에 저장할 곳을 저장
		
		while(part1<=mid && part2 <= end) { // 첫번쨰 배열의 끝까지 가거나 두번째 배열의 끝까지 갈때까지
			if(temp[part1] <= temp[part2]) {
				arr[index] = temp[part1]; // 앞이 작으면 앞의 값을 옮기고 앞의 포인터를 옮기고
				part1++;
			} else {
				arr[index] = temp[part2]; // 뒤가 작으면 뒤의 배열의 값을 복사하고 뒷쪽 포인터를 옮겨준다.
				part2++;
			}
			index ++; // 인덱스는 어떤 상황에도 올려준다.
		}
		// 두번째 배열이 끝까지 갔을 때 앞쪽에 남은 값들을 최종적으로 저장할 배열에 남은 값을 채워준다.
		for(int i =0; i<=mid -part1; i++) {  
			arr[index +i] = temp[part1 + i]; 
		}
	}

	
	public static void printArray(int[] arr) {
		for(int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
		printArray(arr);
		mergeSort(arr);
		printArray(arr);
		
	}

}
