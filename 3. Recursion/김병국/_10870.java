package recursion;

import java.util.Scanner;

public class _10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		/*for(int i=0; i<=n;i++) {
			System.out.print(fibonacci(i) + " ");
		}*/
		System.out.println(fibonacci(n));
	}

	private static int fibonacci(int n) {
		// TODO Auto-generated method stub
		
		if(n==0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
