package practice;

import java.util.Arrays;

public class Permutation1 {
	
	// 중복 선택한 결과가 나오지 않는 순열 구하기

	static int[] target = new int[] {1,2,3};
	// 방문했는지를 체크하는 배열
	static boolean[] visited = new boolean[3];
	// 결과 값을 담는 배열
	static int [] result = new int [2];
	
	public static void main(String[] args) {
		permutation(0);
		
	}

	private static void permutation(int count) {
		// 두 수를 전부 선택하면 출력하고 나오기
		if(count ==2) {
			System.out.println(Arrays.toString(result));
			return;
		}
		
		for(int i =0 ;i <3; i++) {
			// 방문한적이 있으면 스킵
			if(visited[i]) {
				continue;
			}
			//아닐 시 방문한 것으로 만들어준다.
			visited[i] = true;
			// 결과 배열에 숫자를 담는다.
			result[count] = target[i];
			// 재귀 호출
			permutation(count +1);
			// 선택을 해제하기
			visited[i] = false;
		}
	}
		

}
