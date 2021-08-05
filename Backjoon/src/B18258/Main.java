package B18258;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Head{
	Node next = null;
}

class Node extends Head{
	int data;
	Node next = null;
	Node(){}
	Node(int d){
		this.data = d;
	}
}

class Queue{
	Head head = new Head();
	
	void push(int d) {
		Node n = new Node(d);
		Head s = head;
		while(s.next != null)
		{
			s = s.next;
		}
		s.next = n;
	}
	
	int pop() {
		if(head.next == null)
			return -1;
		else
		{
			int data = head.next.data;
			head = head.next;
			return data;
		}
	}
	
	int size() {
		int num =0;
		Head h = head;
		while(h.next != null)
		{
			num++;
			h = h.next;
		}
		return num;
	}
	
	int empty() {
		if(head.next == null)
			return 1;
		else
			return 0;
	}
	
	int front() {
		if(head.next == null)
			return -1;
		else
			return head.next.data;
		}
	
	int back() {
		if(head.next == null)
			return -1;
		else{
			Head h = head;
			while(h.next.next != null){
				h = h.next;
			}
			return h.next.data;
		}
	}
}


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Queue p = new Queue();
		int n = Integer.parseInt(st.nextToken());
		while(n-- >0) {
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			switch (s1.nextToken()) {
			case "push": {
				int d = Integer.parseInt(s1.nextToken());
				p.push(d);
				break;
			}
			case "pop": {
				bw.write(p.pop() + "\n");
				break;
			}
			
			case "size":{
				bw.write(p.size() + "\n");
				break;
			}
			case "empty":{
				bw.write(p.empty() + "\n");
				break;
			}
			case "front":{
				bw.write(p.front() + "\n");
				break;
			}
			case "back":{
				bw.write(p.back() + "\n");
				break;
			}
			default:
				bw.write("잘못입력했습니다.");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
