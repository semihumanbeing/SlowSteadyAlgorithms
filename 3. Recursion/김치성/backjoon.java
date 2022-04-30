package recursion;

import java.util.Scanner;

public class backjoon {

	static int fac(int n) {
		if(n==0) {
			return 1;
		}else
			return n * fac(n-1);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
				
		int N = fac(sc.nextInt());
		
		System.out.println(N);
		
	}

}
