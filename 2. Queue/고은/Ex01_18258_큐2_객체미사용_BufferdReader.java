package _02_구현하기;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_18258_큐2_객체미사용_BufferdReader {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int[] queue = new int[N];
		Arrays.fill(queue, -1);
		
		String input;
		int firstCursor = 0; //아직 아무것도 안 들어간 상태
		int lastCursor = 0;  //아직 아무것도 안 들어간 상태
		int size = 0;
		
		int k = N;
		while (k > 0) {
			input = scanner.next();
			
			//각각의 명령어에 따른 처리
			if (input.equals("push")) {
				
				int data = scanner.nextInt();
				
				if (queue[firstCursor] != -1) { //첫번째 위치에 이미 요소가 있을때만
					lastCursor = lastCursor+1;
				}
				queue[lastCursor] = data;
				
			}else if (input.equals("pop")) {
				
				if (firstCursor == 0 && queue[firstCursor] == -1) { //아무 요소도 없는 경우 = 첫요소 없음
					System.out.println(-1);
					continue;
				}
				System.out.println(queue[firstCursor]); //요소 읽기
				queue[firstCursor] = -1; //요소 빼기
				
				//첫번째 요소 인덱스 변경
				if (firstCursor != lastCursor) {
					firstCursor++;
				}
				
			}else if (input.equals("size")) {
				
				System.out.println(size);
				
			}else if (input.equals("empty")) {
				
				if (size == 0) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				
			}else if (input.equals("front")) {
				
				System.out.println(queue[firstCursor]);
				
			}else if (input.equals("back")) {
				
				System.out.println(queue[lastCursor]);
				
			}
			
			//사이즈를 알려주는 if문
			if (firstCursor == lastCursor && queue[firstCursor] == -1){
				size = 0;
			}else {
				size = (lastCursor - firstCursor) + 1;
			}
			
			k--;
		}
		
		scanner.close();
		
	}	
}
