package upgrade;

public class Main {
	public static void main(String[] args) {
		// append, delete, retrieve 테스트
		SingleLinkedList test = new SingleLinkedList();
		test.append(1); test.append(2); test.append(3); test.append(4);
		test.retrieve();
		test.delete(1);
		test.retrieve();
		test.append(3); test.append(4);
		test.retrieve();
		
		// 뒤에서 r번쨰 노드 제거하기 테스트
		SingleLinkedList ll = new SingleLinkedList();
		ll.append(1); ll.append(2); ll.append(3); ll.append(4);
		ll.retrieve();
		Reference r = new Reference();
		Node found = SingleLinkedList.KthToLast(ll.getFirst(), 3, r);
		System.out.println(found.data);
		SingleLinkedList.deleteMidNode(ll.getFirst(), 3);
		ll.retrieve();
		
		// 두개 분리시키기
		SingleLinkedList ss = new SingleLinkedList();
		ss.append(2); ss.append(5); ss.append(7); ss.append(9); ss.append(3); ss.append(4);
		ss.retrieve();
		Node k = SingleLinkedList.Partition(ss.getFirst(), 4);
		Node.retrieve(k);
	}

}

