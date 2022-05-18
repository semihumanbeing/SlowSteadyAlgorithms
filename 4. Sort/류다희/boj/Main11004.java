package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11004 {
	
	/*
	 StringBuffer 
	  N, K
	  A[] 
	  for(N만큼){
	  A[i] = sb.readline.split
	  }
	  퀵소트 실행
	  K번째 데이터 출력
	  
	  퀵소트함수(시작, 종료, K){
		피벗 구하기 함수 (시작, 종료)
		if(피벗==K) 종료
		else if(K<피벗) 퀵소트 수행하기(시작, 피벗-1, K)
	 	else 퀵소트 수행하기 (피벗+1, 종료, K)
	  }
	  
	  피벗구하기 함수(시작, 종료)
	  {
	  중앙값을 피벗으로 설정하기
	  i(시작), j(종료)
	  while(i<j){
	  	피벗보다 큰 수가 나올때까지 i++
	  	피벗보다 작은 수가 나올때까지 j--
	  	i와 j를 swap
	  }
	  데이터를 두 그룹의 경계 index에 저장하기
	 */
	
	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);
		if(start < part2 -1) {
			// 시작지점이 파티션의 시작지점보다 작다면 오른쪽 파티션의 시작점 바로 전으로 재귀
			quickSort(arr,start,part2-1);
		} if(part2<end) {
			// 파티션함수에서 가져온 오른쪽 파티션의 시작값부터 range의 끝까지 재귀
			quickSort(arr, part2, end);
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start+end)/2]; // 피봇은 중간값
		while(start<=end) {
			while(arr[start]<pivot) start++;
			while(arr[end]>pivot) end--;
			if(start <=end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}

	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
	}


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N  = Integer.parseInt(st.nextToken());
		int K  = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		
		String[] numStr = br.readLine().split(" ");		
		for(int i =0;i<N;i++) {
			A[i] = Integer.valueOf(numStr[i]);
		}
		
		quickSort(A);
		
		System.out.println(A[K-1]);
		
		
	}
	
}
