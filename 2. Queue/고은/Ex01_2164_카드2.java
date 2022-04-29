package _03_응용.큐;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Ex01_2164_카드2 {

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
	    //순서대로 1~N값 입력
		for (int i = 1; i <= N; i++) {
			list.offer(i);
		}
		
		//버리고, 밑으로 내리는 것 반복
		while (list.size() != 1) {			
			list.poll(); //첫번째로 꺼낸 것은 버린다.
			list.offer(list.poll()); //두번째로 꺼낸 것은 가장 마지막에 넣는다.
		}
		System.out.println(list.peek());
		
	}

}
