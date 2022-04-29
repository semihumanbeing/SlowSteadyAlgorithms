package boj;

import java.util.EmptyStackException;
import java.util.Scanner;

class Stack<T>{
	@SuppressWarnings("hiding")
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
		
	}
	
	public int sum = 0;
	public Node<T> top; 
	
	public T pop() {
		if (top == null) {
			throw new EmptyStackException();
		}
		T item = top.data;
		top = top.next;
		sum = sum -(int) item;
		return item;
	}
	
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
		sum = sum + (int) item;
	}
}

public class Main10773 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		
		for(int i = 0; i<k; i++) {
			int num = scanner.nextInt();
			if (num ==0) {
				s.pop();
			} else {
				s.push(num);
			}
		}
		
		System.out.println(s.sum);
		scanner.close();
	}

}
