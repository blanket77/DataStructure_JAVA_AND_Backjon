package upgrade;

class SingleLinkedList{
	Node header;
	
	SingleLinkedList() {
		header = new Node();
	}
	

	// 노드 추가
	void append(int d)
	{
		Node end = new Node(d);
		Node n = header;
		while(n.next != null)
			n = n.next;
		n.next = end;
	}
	
	// 노드 삭제	
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

	// 노트 다 출력
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
	
	// 중복된 것 삭제(단, 버퍼없이)
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
	
	// 노드 첫번째꺼 출력
	Node getFirst()
	{
		if(header.next==null) {
			System.out.println("data is not!!");
			return null;
		}
		return header.next;
	}
	
	// 뒤에서 두번째 생성
	static Node KthToLast(Node n ,int k , Reference r){
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
	
	static boolean deleteMidNode(Node n, int k) {//노드의 첫번째꺼 가져옴
		if(n == null || n.next == null)
			return false;
		
		for(int i=0 ; i<k-1; i++){
			n = n.next;
		}
		n.data = n.next.data;
		n.next = n.next.next;
		return true;
	}
	
	static Node Partition(Node n, int a) { //노드의 첫번째꺼 가져옴
		if(n == null || n.next == null)
			return null;
		
		Node head = n;
		Node tail = n;
		n = n.next;
		while(n != null) {
			Node next = n.next;
			if(n.data >= a) {
				tail.next = n;
				tail = n;
			}
			else {
				n.next = head;
				head = n;
			}
			n = next;
		}
		tail.next = null;
		return head;
	}
}

class Reference{
	int count = 0;
}