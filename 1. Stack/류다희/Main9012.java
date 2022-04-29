package boj;

import java.util.EmptyStackException;
import java.util.Scanner;

	class Stack2<T> {
		class Node2<T>{
			private T data; // 값
			private Node2<T> next; // 인덱스??
			
			public Node2(T data) {
				this.data = data;
			}
		}
		
		public int check= 0;
		private Node2<T> top; // node의 포인터가 위치한곳이 top이다
		
		public T pop() {
			if (top == null) {
				throw new EmptyStackException();
			}
			T item = top.data;
			top = top.next;
			return item;
		}
		
		public void push(T item) {
			Node2<T> t = new Node2<T>(item);
			t.next = top; // 다음 node 포인트에 top 자리 마련 
			top = t; // top의 값을 item으로 
		}
		
		public T peek() {
			
			return top.data;
		}
		
		
		public void checkplus() {
			check = check +1;
		}
		public void checkminus() {
			check = check -1;
		}
		public int checknumber() {
			return check;
		}
		
	}
	public class Main9012 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = scanner.nextInt();
		for(int i =0;i<t;i++) {
			Stack2<Integer> s = new Stack2<Integer>();
			String bracket = scanner.next();
			for(int j = 0; j<bracket.length();j++) {
				if(bracket.charAt(j)=='(') {
					s.checkplus();
				} else if (bracket.charAt(j)==')') {
					s.checkminus();
				}
				
			}
			if (s.checknumber() == 0) {
				sb.append("YES").append("\n");
				
			} else if(s.checknumber() > 0 || s.checknumber()< 0) {
				sb.append("NO").append("\n");
			}
			
		}
		System.out.println(sb);
		
	}

}
