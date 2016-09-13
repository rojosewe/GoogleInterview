package rakuten;

import input.Int;
import oljeet.tree.Node;


/**
 * @author root
 *
 */

public class Practice {

	public static Node solution(Node head, int n) {
		Node x = head;
		Node nth = x;
		int i = 1;
		while(x.next != null){
			if(i > n)
				nth = nth.next;
			x = x.next;
			i++;
		}
		if(i < n)
			return head;
		if(i == 1)
			return null;
		if(i == n)
			return head.next;
		if(nth.next != null)
			nth.next = nth.next.next;
		return head;
	}

	public static void main(String... args) {
		Node node = new Node(1);
//		node.append(2).append(3).append(4).append(5);
		System.out.println(node);
		System.out.println(solution(node, Int.build()));
	}
}
