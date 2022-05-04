package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class fibo {
	
	//불필요한 반복을 줄이기 위해 이미 계산한 값을 저장할 배열 
	static long [] fibo_s;
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		
		//계산될 수 보다 1칸 더 크게 배열 생성
		fibo_s = new long[N+1];
		
		
		//재귀함수 호출
		sb.append(fibo(N));
		
		System.out.println(sb);
	}

	private static long fibo(int n) {
		
		// base 
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		//이미 계산된 값이 있으면 그값을 반환
		if(fibo_s[n] !=0) {
			return fibo_s[n];
		}
		
		//재귀적으로 호출될때마다 배열인덱스에 값이 저장됨
		fibo_s[n] = fibo(n-1) + fibo(n-2);
		
		return fibo_s[n];
		
	}

}
