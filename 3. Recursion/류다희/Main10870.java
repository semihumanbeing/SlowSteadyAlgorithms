package recursion;

import java.util.Scanner;

public class Main10870 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n) {
		if(n<2) {
			return n;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2); 
		}
	}

}
