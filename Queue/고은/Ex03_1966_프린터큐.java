package _03_응용.큐;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex03_1966_프린터큐 {

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		StringBuilder buffer = new StringBuilder();
		
		//인쇄 요청 순서에 따른 중요도(data) 담는 곳 : LinkedList
		LinkedList<Integer> printList;
		
		int caseNum = Integer.parseInt(reader.readLine()); //케이스 수
		int N;//문서의 갯수
		int M;//찾으려는 문서순서
		int data = -1; //찾으려는 문서
		int thNum = 0;
		
		while (caseNum > 0) {
			//int[] request에 요청받은 문서를 순서대로 입력
			
			//입력 첫번째줄 : 문서의 갯수 N, 찾으려는 문서의 순번 M
			token = new StringTokenizer(reader.readLine());
			N = Integer.parseInt(token.nextToken()); //문서갯수 초기화
			M = Integer.parseInt(token.nextToken()); //찾으려는 출력순번 초기화
			
			//입력 두번째 줄 : (우선순위) 입력값을 하나씩 배열과 list에 저장
			token = new StringTokenizer(reader.readLine());
			request = new int[N];
			printList = new LinkedList<Integer>();
			
			for (int i = 0; i < N; i++) {
				int tmp = Integer.parseInt(token.nextToken());
				request[i] = tmp;
				printList.add(tmp);

				if (i == M) { //순서가 M인 경우, data값 초기화
					data = tmp;
				}
			}
			
			//처리 : 
			//(1) 정렬
			
			
			//(2) int[] request의 M번째 데이터가 LinkedList의 몇번째인지 찾는다.
			buffer.append(fintElement(printList,data));
			if (caseNum != 1) {
				buffer.append("\n");
			}
			
			caseNum--;
			
		}//end while
		
		System.out.println(buffer);
		
	}

	///////////
	private static int fintElement(LinkedList<Integer> printList, int data) {
		
		for (int i = 0; i < printList.size(); i++) {
			
			if (printList.get(i) == data) {
				
				//////
				
				return i + 1;
			}
		}
		
		return -1; //오류가 있을 경우 확인용 -1
	}



}
