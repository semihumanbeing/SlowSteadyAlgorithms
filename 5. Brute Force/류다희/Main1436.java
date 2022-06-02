package boj;

import java.util.Scanner;

public class Main1436 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int answer = 665;
		int count = 0;

		do {
			++answer;
			if (String.valueOf(answer).contains("666")) {
				count++;
			}

		} while (count != N);

		System.out.println(answer);
	}

}
