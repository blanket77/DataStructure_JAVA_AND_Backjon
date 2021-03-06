class Node{
	int data;
	Node next = null;
	
	Node(){}
	
	Node(int d){
		this.data = d;
	}
}
	
class LinkedList{
	Node header;
	
	LinkedList() {
		header = new Node();
	}
	


	void append(int d)
	{
		Node end = new Node(d);
		Node n = header;
		while(n.next != null)
			n = n.next;
		n.next = end;
	}
	
	void delete(int d){
		Node n = header;
		while(n.next !=null){
			if(n.next.data ==d){
				n.next = n.next.next;
				break;
			}
			n = n.next;
		}
	}
	
	boolean retrieve() {
		if(header.next == null)
		{
			System.out.println("data is not!!");
			return false;
		}
		Node n = header.next;
		while(n.next != null) {
			System.out.print(n.data+ " => ");
			n = n.next;
			}
		System.out.println(n.data);
		return true;	
	}
	
	boolean deleteDup() {
		if(header.next==null) {
			System.out.println("data is not!!");
			return false;
		}
		Node n = header.next;
		while(n != null && n.next != null) {
			Node r = n;
			while(r.next != null) {
				if(n.data == r.next.data) {
					r.next = r.next.next;
				}
				else {
					r = r.next;
				}
			}
			n = n.next;
		}
		return true;
	}
	
	Node getFirst()
	{
		if(header.next==null) {
			System.out.println("data is not!!");
			return null;
		}
		return header.next;
	}
}

class Reference{
	int count = 0;
}
public class SingleLinkedList2 {
	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.append(1); test.append(2); test.append(3); test.append(4);
		test.retrieve();
		test.delete(1);
		test.retrieve();
		test.append(3); test.append(4);
		test.retrieve();
		LinkedList ll = new LinkedList();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.retrieve();
		Reference r = new Reference();
		Node found = KthToLast(ll.getFirst(), 3, r);
		System.out.println(found.data);
	}
	
	private static Node KthToLast(Node n ,int k , Reference r){
		if(n == null){
			return null;
		}
		Node found = KthToLast(n.next, k, r);
		r.count++;
		if(r.count == k) {
			return n;
		}
		return found;
	}

}
