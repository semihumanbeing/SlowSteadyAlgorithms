package _03_응용.큐;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex02_11866_요세푸스문제0 {

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder buffer = new StringBuilder();
		StringTokenizer token = new StringTokenizer(reader.readLine());
		
		int N = Integer.parseInt(token.nextToken());
		int K = Integer.parseInt(token.nextToken());
		
		//1~N까지의 데이터를 담을 연결리스트
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		//inner Loop에서 임시로 받은 배열들
		int[] tmp = new int[N];
		
		int pos = K - 1; //K번째의 위치
		int m = 0;   //임시 배열의 인덱스
		
		//outer while에서 아무도 없을 때까지 x바퀴를 돌린다.
		while (!list.isEmpty()) {
			
			//남아있는 사람들의 수보다 돌아야하는 k번이 더 크면
//			if (pos > list.size() - 1) {
//				for (int data : list) {
//					tmp[m] = data;
//					m++;
//				}
//				break;
//			}
			
			//inner while에서 한바퀴씩 돌고 탈락할 사람을 tmp에 저장
			for (int i = 0; pos < list.size(); i++) {
				tmp[m] = list.get(pos);
				m++;
				pos += K;
			}
			//한바퀴 돌린 후 사이즈 수정
			if (pos > list.size() - 1) pos -= list.size();
			removeAll(list, tmp, m); //탈락할 사람들 모두 탈락시키기
		}
		
		//출력하기
		buffer.append("<");
		for (int i = 0; i < m; i++) {
			if (i == 0) {
				buffer.append(tmp[i]);
				continue;
			}
			buffer.append(", ");
			buffer.append(tmp[i]);
		}
		buffer.append(">");
		System.out.println(buffer);
		
	}

	private static void removeAll(LinkedList<Integer> list, int[] tmp, int length) {
		for (int i = 0; i < length; i++) {
			list.remove(new Integer(tmp[i]));
		}
	}

}
