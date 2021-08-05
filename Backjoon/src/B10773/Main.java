package B10773;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Node{
	int data;
	Node next = null;
	
	Node(){}
	Node(int d){
		this.data = d;
	}
}

class Stack{
	Node top;
	
	void push(int d) {
		Node n = new Node(d);
		n.next = top;
		top = n;
	}
	
	int pop() {
		if(top == null)
			return -1;
		else
		{
			int data = top.data;
			top = top.next;
			return data;
		}
	}
	
	int sum() {
		int result = 0;
		Node t = top;
		while(t != null) {
			result += t.data;
			t = t.next;
		}
		return result;
	}
}


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack p = new Stack();
		int n = Integer.parseInt(br.readLine());
		while(n-- >0) {
			int d = Integer.parseInt(br.readLine());
			if (d==0){
				p.pop();
			}
			else {
				p.push(d);
			}
		}
		bw.write(p.sum()+"");
		bw.flush();
		br.close();
		bw.close();
	}

}
