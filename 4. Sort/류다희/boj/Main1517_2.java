package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1517_2 {
	
	public static int[] A, temp;
	public static long result;
	
	private static void mergeSort(int start, int end) {
		if(end - start<1) {
			return;
		}
		int mid = start+(end - start) / 2;
		
		mergeSort(start,mid);
		mergeSort(mid+1,end);
		
		for(int i = start;i<=end;i++) {
			temp[i] = A[i];
		}
		
		int k = start;
		int index1 = start;
		int index2 = mid+1;
		
		while(index1 <= mid && index2 <= end) {
			if(temp[index1] > temp[index2]) {
				A[k] = temp[index2];
				result = result + (index2 - k) * 1l; // 뒷쪽 데이터 값이 작은 경우 result업데이트
				k++;
				index2++;
			}else {
				A[k] = temp[index1];
				k++;
				index1++;
			}
		}
		while(index1<=mid) {
			A[k] = temp[index1];
			k++;
			index1++;
		}
		
		while(index2 <=end) {
			A[k] = temp[index2];
			k++;
			index2++;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		A = new int[N+1];
		temp = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<=N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		result = 0;
		
		mergeSort(1,N);
		System.out.println(result);
		
	}

}
