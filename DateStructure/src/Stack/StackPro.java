package Stack;

class Node{
	int data;
	Node next = null;
	
	Node(){};
	Node(int d){
		this.data = d;
	}
}

class Stack{
	Node top = null;
	
	public void push(int d)
	{
		 Node n = new Node(d);
		 n.next = top;
		 top = n;
	}
	
	public int pop() {
		if (top == null) {
			System.out.println("값이 없습니다.");
			return -1;
		}
		int r = top.data;
		top = top.next;
		return r;
	}
}

public class StackPro {
	public static void main(String args[])
	{
		Stack s = new Stack();
		s.push(3);
		s.push(4);
		s.push(2);
		s.push(1);
		s.push(5);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
