package Queue;

class Node
{
	int data;
	Node next = null;
	Node(){};
	Node(int d){
		this.data = d ;
	}
}

class Queue{
	Node first;
	Node last;
	
	void push(int data) {
		Node n = new Node(data);
		if(last != null)
			last.next = n;
		last = n;
		
		if(first == null)
			first = n;
	}
	
	int pop() {
		if(first == null){
			System.out.println("데이터가 없습니다.");
			return -1;
		}
		int data = first.data;
		first = first.next;
		return data;
	}
}

public class QueuePRo {
	public static void main(String arg[]) {
		Queue s = new Queue();
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
