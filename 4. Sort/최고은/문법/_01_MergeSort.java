package _02_정렬;

public class _01_MergeSort {
	
	//[[부스트 코스 방식]]
	static int[] array, temp;
	
	public static void mergeSort(int[] arr) {
		array = arr;
		temp = new int[array.length];
		split(0, array.length-1);
	}
	
	//리스트가 1개가 남을 때까지 나눈다.
	private static void split(int low, int high) {
		if (low == high) return; //값이 하나만 있으면 정렬할 필요 없음
		int mid = high + low / 2;
		split(low, mid);
		split(mid+1,high);
		merge(low,mid,high);
	}
	
	//대소 비교 후 순서에 맞게 열거한다.
	private static void merge(int low, int mid, int high) {
		int i = low, j = mid+1, tempposn = low;
		
		//나눈 리스트의 대소 비교와 정렬
		while (i <= mid && j <= high) {
			if (array[i] <= array[j]) {
				temp[tempposn++] = array[i++];
			}
			else {
				temp[tempposn++] = array[j++];
			}
		}
		
		//i가 mid로 가고, j가 high로 갈 때까지 반복
		while (i <= mid) temp[tempposn++] = array[i++];
		while (j <= high) temp[tempposn++] = array[j++];
		
		//원래 배열에 다시 복사
		for (tempposn = low; tempposn <= high; tempposn++)
			array[tempposn] = temp[tempposn];
		
	}
	
	//[[엔지니어 대한민국 방식]]
	private static void mergeSort2(int[] arr2) {
		int[] tmp = new int[arr2.length];
		mergeSort2(arr2, tmp, 0, arr2.length - 1);
	}
	
	private static void mergeSort2(int[] arr2, int[] tmp, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort2(arr2, tmp, start, mid);
			mergeSort2(arr2, tmp, mid+1, end);
			merge2(arr2, tmp, start, mid, end);
		}
	}
	
	private static void merge2(int[] arr, int[] tmp, int start, int mid, int end) {
		for (int i = start; i <= end; i++) {
			tmp[i] = arr[i];
		}
		int part1 = start;
		int part2 = mid + 1;
		int index = start;
		while (part1 <= mid && part2 <= end) {
			if (tmp[part1] <= tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			}else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		for (int i = 0; i <= mid - part1; i++) {
			arr[index+i] = tmp[part1+i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
