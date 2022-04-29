package _자료구조;

import java.util.Scanner;
//스택하고 차이점 pop front back이 다르다


public class _18258_큐문제 {

	public static int[] que;
	public static int size = 0;
	public static int count = 0;
	public static int front = 0;
	public static int back =0;
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = in.nextInt();
		
		que = new int[n];
		
		for(int i = 0; i<n;i++){
			
			String str = in.next();
			//string은 equal로
		
		if(str.equals("push")){
			push(in.nextInt());
			
		}
		else if(str.equals("pop")){
		sb.append(pop()).append('\n');
		
		}
		 
		else if(str.equals("size")){
			sb.append(size()).append('\n');
			
			}
			
		else if(str.equals("empty")){
			sb.append(empty()).append('\n');
			
			}
			
		else if(str.equals("front")){
			sb.append(front()).append('\n');
			
			}
			
		else if(str.equals("back")){
			sb.append(back()).append('\n');
		
			}
	}System.out.println(sb);
		
	}

	private static int empty() {
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}// 알겟음

	private static int back() {
		// TODO Auto-generated method stub
		
		if(size == 0){
		return -1;
	}else{
		return que[back];
		}
	}// 

	private static int front() { //바꿔야함
		//size + count 
		// TODO Auto-generated method stub
		if(size == 0){
			return -1;
		}else{
			return que[front];
			}
		}

	public static int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public static int pop() { //count 사용
		// TODO Auto-generated method stub
		if(size == 0){
		return -1;
	}else{
		int res = que[count];
		//0 1 2 3 ... 숫자를 참조하게 됨
		count++;
		size--;
		front++;
		return res;
		
	   }
	}
	
	private static void push(int num) {
		// TODO Auto-generated method stub
		que[size] = num;
		//back을 더해준다
		size++;
		back++;
	}
  }

/*
15
push 1
push 2
front
back
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
front
  
  
  
 
1
2
2
0
1
2
-1
0
1
-1
0
3
 */

