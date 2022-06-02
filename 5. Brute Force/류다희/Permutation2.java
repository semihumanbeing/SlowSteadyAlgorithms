package practice;

import java.util.Arrays;

public class Permutation2 {
	
	// 중복 선택한 결과도 나오는 순열 구하기

	static int[] target = new int[] { 1, 2, 3 };
	static int[] result = new int[2];

	public static void main(String[] args) {
		permutation(0);
	}

	private static void permutation(int count) {
		if (count == 2) {
			System.out.println(Arrays.toString(result));
			return;
		}

		for (int i = 0; i < 3; i++) {
			result[count] = target[i];
			permutation(count + 1);
		}

	}

}
