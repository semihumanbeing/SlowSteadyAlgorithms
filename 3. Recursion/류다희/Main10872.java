package recursion;

import java.util.Scanner;

public class Main10872 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.println(func(m));
	}

	public static int func(int n) {
		if (n == 0) {
			return 1;
		} else {
			return func(n - 1) * n;
		}

	}
}
	