package _자료구조;
import java.util.Scanner;

public class _10828_stack {

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	/*
	
			정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
			
			명령은 총 다섯 가지이다.
			
			push X: 정수 X를 스택에 넣는 연산이다.
			pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			size: 스택에 들어있는 정수의 개수를 출력한다.
			empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
			top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	
		
	 */
	
	int N = sc.nextInt();
	int [] stackbox = new int[N]; 
	
	push(N);
	pop();
	size();
	empty();
	top();
	


}

private static int top() {
	// TODO Auto-generated method stub
	
	return -1;
}

private static int empty() {
	// TODO Auto-generated method stub
	
	return 1;
}

private static void size() {
	// TODO Auto-generated method stub
	
}

private static int pop() {
	// TODO Auto-generated method stub
	
	return -1;
}

private static int push(int a) {
	// TODO Auto-generated method stub
	
	return 1;
}

}


/*
14
push 1
push 2
top
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
top
*/