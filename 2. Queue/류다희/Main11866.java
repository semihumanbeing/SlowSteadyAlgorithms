package boj;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Queue<T>{
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	private Node<T> first;
	private Node<T> last;
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		
		if(last != null) {
			last.next = t;
		}
		last = t;
		if(first == null) {
			first = last;
		}
	}
	
	public void remove(int n) {
		if(first==null) {
			throw new NoSuchElementException();
		}
		first = first.next;
		
		if(first == null) {
			last = null;
		}
	}
	
	public void moveToLast() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		Node<T> t = first;
		last.next = t;
		last = t;
		first = first.next;
	}
	
	public T peek() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}
	public boolean isEmpty() {
		return first == null;
	}
}


public class Main11866 {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		List<Integer> answer = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		
		for(int i = 1 ; i <=N; i++) {
			q.add(i);
		}
		sb.append("<");
		while(answer.size()<N) {
			for(int i = 0; i<K-1; i++) {
				q.moveToLast();
			}
			answer.add(q.peek());
			if(answer.size()<N) {
				sb.append(q.peek()).append(", ");
			} else {
				sb.append(q.peek());
			}
			q.remove(q.peek());
		}
		
		sb.append(">");
		
		System.out.println(sb);
		scanner.close();
		
	}

}
