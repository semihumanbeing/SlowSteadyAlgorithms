package boj;

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
		
		if(last !=null) {
			last.next = t;
		}
		last = t;
		
		if(first == null) {
			first = last;
		}
		
	}
	public void remove() {
		if(first == null) {
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
	
}

public class Main2164 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> q = new Queue<Integer>();
		int N = scanner.nextInt();
		int size = N;
		
		for(int i = 1; i<=N;i++) {
			q.add(i);
		}
		
		while(size>1) {
			q.remove();
			q.moveToLast();
			size --;
			
		}
		System.out.println(q.peek());
		
	}

}
