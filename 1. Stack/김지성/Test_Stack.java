package _자료구조;

import java.util.EmptyStackException;

class Stack<T>{
	//클래스 안의 클래스
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data){
			this.data = data;
		}
	}
	
	private Node<T> top;
	
	public T pop(){
		if(top==null){
			throw new EmptyStackException();
		}
		
		T item  = top.data;
		top = top.next;
		return item;
	}//팝이라는 메소드
	
	public void push(T item){
	Node<T> t = new Node<T>(item);
	t.next = top;
	top = t;
	}
	
	
	public T peek(){
		if(top == null){
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	
	public boolean isEmpty(){
		return top == null;
	}
}//스택 클래스

public class Test_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
	}

}
