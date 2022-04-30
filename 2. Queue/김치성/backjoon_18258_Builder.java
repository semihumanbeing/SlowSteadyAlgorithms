
package data_structure;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class backjoon_18258_Builder {
	
	static class Queue1<T>{
		//사이즈 확인 변수
		private int count = 0;
		class Node<T>{
			
			private T data;
			private Node<T> next;
			
			
			public Node(T data) {
				// TODO Auto-generated constructor stub
				this.data = data;
			}
		}
		
		//처음과 끝을 확인하기 위한 멤버변수 선언
		
		private Node<T> first;
		private Node<T> last;
		
		public void push(T item) {
			
			count++;
			
			Node<T> t = new Node<T>(item);
			
			//하나라도 데이터가 있을때는
			if(last != null) {
				//마지막다음에 데이터 붙임
				last.next = t;
			}
			//새로 만들어진 객체는 라스트
			last = t;
			
			//데이터가 비었을때는
			if(first == null) {
				first = last;
			}
			
		}
		
		public void pop() {
			
			if(first==null) {
				sb.append(-1).append('\n');
				return;
			}
			//데이터를 뺄때
			if(count<0) {
				count = 0;
			}else count--;
			
			
			//데이터 저장
			T data = first.data;
			first = first.next;
			
			if(first == null){
				last = null;
			}
			//first data 를 리턴
			sb.append(data).append('\n');
		}
		
		public void size() {
			sb.append(count).append('\n');
		}

		
		public void empty() {
			sb.append(first == null ? 1 : 0).append('\n');
		}

		public void front() {
			if (first == null) {
				//처음이 비어있으면 익셉션
				sb.append(-1).append('\n');
				return;
			}
			// 처음을 가르키고 있는 데이터를 반환
			sb.append(first.data).append('\n');
		}
		
		public void back() {
			if (last == null) {
				//처음이 비어있으면 익셉션
				sb.append(-1).append('\n');
				return;
			}
			// 처음을 가르키고 있는 데이터를 반환
			sb.append(last.data).append('\n');
		}

	}// Queue end	
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Queue1<Integer> q = new Queue1<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		
		for (int i = 0; i < N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			/*
			if(st.nextToken().equals("push")) {
				int n = Integer.parseInt(st.nextToken());
				q.push(n);	
			}else if(st.nextToken().equals("front")) {
				q.front();
			}else if(st.nextToken().equals("back")) {
				q.back();
			}else if(st.nextToken().equals("size")) {
				q.size();
			}else if(st.nextToken().equals("empty")) {
				q.empty();
			}else if(st.nextToken().equals("pop")) {
				q.pop();
			}
			*/
			
			switch (st.nextToken()) {
			case "push":
				int n = Integer.parseInt(st.nextToken());
				q.push(n);
				break;
			case "front" :
				q.front();
				break;
			case "back" :
				q.back();
				break;
			case "size" :
				q.size();
				break;
			case "empty" :
				q.empty();
				break;		
			default:
				q.pop();
				break;
			} // switch end
			
			
		} // for end
		
		System.out.println(sb);
	}
}
