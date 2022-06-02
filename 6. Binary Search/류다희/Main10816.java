package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main10816 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int N = Integer.parseInt(br.readLine()); // 1

		String[] nstr = br.readLine().split(" ");
		int[] nArr = Arrays.stream(nstr).mapToInt(Integer::parseInt).toArray(); // 2

		int M = Integer.parseInt(br.readLine()); // 3
		
		String[] mStr = br.readLine().split(" ");
		int[] mArr = Arrays.stream(mStr).mapToInt(Integer::parseInt).toArray(); // 4

		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < M; i++) { // M 어레이 길이만큼 맵에 값 집어넣기 value는 0
			numMap.put(Integer.parseInt(mStr[i]), 0);
		} 

		for (int key : nArr) { // nArr의 key번째 값을 검색해서 값이 있으면 value 에 1을 더해준다.
			numMap.replace(key, numMap.getOrDefault(key, 0) + 1);
		}

		for (int i = 0; i < M; i++) {
			sb.append(numMap.get(mArr[i])).append(" ");
		}
		
		System.out.println(sb);

	}

}
