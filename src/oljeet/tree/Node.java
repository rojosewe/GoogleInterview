package oljeet.tree;

public class Node{
	public int value;
	public Node next;

	public Node(int x) {
		this.value = x;
	}

	public Node append(int x){
		Node next = new Node(x);
		this.next = next;
		return next;
	}
	
	public String toString(){
		Node node  = this;
		StringBuilder sb = new StringBuilder();
		while(node.next != null){
			sb.append(node.value).append("->");
			node = node.next;
		}
		sb.append(node.value);
		return sb.toString();
	}
}