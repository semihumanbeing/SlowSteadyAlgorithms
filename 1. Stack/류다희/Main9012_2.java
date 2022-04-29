package boj;

import java.util.Scanner;

class CheckBracket {
	public int checkNumber = 0;

	public void plus() {
		checkNumber = checkNumber + 1;
	}

	public void minus() {
		checkNumber = checkNumber - 1;
	}

	public int peek() {
		return checkNumber;
	}
}

public class Main9012_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int amount = scanner.nextInt();
		String bracket = scanner.nextLine();
		for (int i = 0; i < amount; i++) {
			CheckBracket c = new CheckBracket();
			for (int j = 0; j < bracket.length(); j++) {

				if (bracket.charAt(j) == '(') {
					c.plus();
				} else if (bracket.charAt(j) == ')') {
					c.minus();
				}

			}
			
			System.out.println(c.peek());
			
		}
	}

}
