package boj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main10814 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int countMember = scanner.nextInt();
		String [][] arrayMember = new String [countMember][2];
		
		for(int i = 0; i<countMember;i++) {
			arrayMember[i][0] = scanner.next();
			arrayMember[i][1] = scanner.next();
		}
		
		Arrays.sort(arrayMember, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		
		});
		
		
		for(int i = 0; i <countMember;i++) {
			sb.append(arrayMember[i][0]).append(" ");
			sb.append(arrayMember[i][1]).append("\n");
		}
		System.out.println(sb);
		
		scanner.close();
		
	}

}
