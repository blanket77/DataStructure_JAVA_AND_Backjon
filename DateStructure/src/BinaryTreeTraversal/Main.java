package BinaryTreeTraversal;

class Node{
	Node left;
	Node right;
	int data;
	Node next = null;
	Node(){};
	Node(int d){
		this.data = d ;
	}
}

class Tree{
	Node root;
	
	public void setRoot(Node node) {
		this.root = node;
	}
	
	public Node getRoot() {
		return root;
	}
	
	public Node makeNode(int data, Node left, Node right) {
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		return node;
	}
	
	//root �߾�
	public void Inorder(Node node) {
		if(node != null) {
			Inorder(node.left);
			System.out.println(node.data);
			Inorder(node.right);
		}
	}
	
	//root ��
	public void preorder(Node node) {
		if(node != null) {
			System.out.println(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	//root ��
	public void postorder(Node node) {
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.data);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
