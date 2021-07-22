package upgrade;

public class Node{
	int data;
	Node next = null;
	
	Node(){}
	
	Node(int d){
		this.data = d;
	}
	static boolean retrieve(Node n){ // 첫번째 노드 가져와야함
		if(n ==null || n.next == null){
			System.out.println("data is not!!");
			return false;
		}
		while(n.next != null){
			System.out.print(n.data + " => ");
			n = n.next;
		}
		System.out.println(n.data);
		return true;
	}
}
