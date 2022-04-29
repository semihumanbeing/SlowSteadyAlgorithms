package _자료구조;

import java.util.NoSuchElementException;

class Queue<T>{
	
	class Node<T>{ //객체 만들기
		private T data; // 데이타 선언
		private Node<T> next; //다음 노드 선언	
	
		public Node(T data){//생성자에서 해당타입을 받아서 내부변수에 저장
			this.data = data;
		}
 }
	private Node<T> first;
	private Node<T> last;
	
	public void add(T item){
		Node<T> t = new Node<T>(item);
		
		if(last != null){
			last.next = t;
		}
		last = t;
		if(first == null){
			first = last;
		}
	}
	
	public T remove(){
		if(first == null){
			throw new NoSuchElementException();
		}
		T data = first.data;
		first  = first.next;
		
		if(first == null){
			last = null;
		}
		
		return data;
	}
	
	public T peek(){
		if(first == null){
			throw new NoSuchElementException();
		}
		return first.data;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
}
public class Test_Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new Queue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
		
		
		
		
	}

}
