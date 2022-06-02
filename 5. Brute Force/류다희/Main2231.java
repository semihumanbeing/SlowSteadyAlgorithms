package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2231 {
	static int sum = 0;
	static int answer = 0;
	static int j = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nstr = br.readLine();
		int n = Integer.parseInt(nstr);
		int temp = n;

		for (j = n; j >= 0; j--) {
			sum = j;
			String ntemp = String.valueOf(sum);
			for (int i = 0; i < ntemp.length(); i++) {
				sum = sum + (ntemp.charAt(i) - '0');
			}
			if (sum == temp) {
				answer = j;
			}
		}
		
		System.out.println(answer);

	}

}
