package B10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

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
	
	int size() {
		int num =0;
		Node t = top;
		while(t != null)
		{
			num++;
			t = t.next;
		}
		return num;
	}
	
	int empty() {
		if(top == null)
			return 1;
		else
			return 0;
	}
	
	int top() {
		if(top == null)
			return -1;
		else
			return top.data;
		}
}


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Stack p = new Stack();
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
			case "top":{
				bw.write(p.top() + "\n");
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
