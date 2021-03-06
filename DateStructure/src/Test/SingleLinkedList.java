package Test;

class LinkedList{
	Node header;
	
	LinkedList(){
		header = new Node();
	}
	
	static class Node{
		int data;
		Node next = null;
		
		Node(){};
		Node(int d){
			this.data = d;
		}
	}
	
	void append(int d){
		Node end = new Node(d);
		Node n = header;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	boolean delete(int d){
		if (header.next == null){
			System.out.println("data is not!!");
			return false;
		}
		Node n = header.next;
		while(n.next != null) {
			if(n.next.data == d){
				n.next = n.next.next;
				}
			else
				n = n.next;
			}
		return true;
	}
	
	boolean retrieve(){
		if (header.next == null){
			System.out.println("data is not!!");
			return false;
		}
		Node n = header.next;
		while(n.next != null) {
			System.out.print(n.data + " => ");
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

}


public class SingleLinkedList {
	public static void main(String[] arg){
		LinkedList ll = new LinkedList();
		ll.retrieve();
		ll.delete(1);
		
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(3);
		ll.retrieve();
		ll.delete(3);
		ll.retrieve();
		
		LinkedList ls = new LinkedList();
		ls.append(1);
		ls.append(1);
		ls.append(1);
		ls.append(2);
		ls.append(3);
		ls.append(1);
		ls.append(2);
		ls.append(3);
		ls.append(1);
		ls.retrieve();
		ls.deleteDup();
		ls.retrieve();
	}
}
