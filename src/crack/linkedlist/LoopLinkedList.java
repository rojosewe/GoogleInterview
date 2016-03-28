package crack.linkedlist;

/**
 * 2.6
 * 	//A   b   c   d   e   f   g   h   c   d   e   f   g   h   c   d   e   f   g   h
 * @author rojosewe
 *
 */

public class LoopLinkedList {

	public class Node{
		int value;
		Node next;
	}
	
	public static void main(String... args){
		
	}
	
	public Node isThereALoopRemove(Node head){
		return null;
	}

	public Node isThereALoopUnfinished(Node head){
		if(head == null)
			return null;
		Node a = head;
		Node b = head;

		int f = 0;
		int s = 0;
		int size = 0;
		while(a.next != null){
			if(a == b){
				break;
			}
			if(f % 2 ==0){
				b = b.next;
				s += 1;
			}
			f += 1;
		}
		size = 1;
		a = a.next;
		while(a.next != b)
			size+= 1;
		Node c = head;
		for(int i = 0; i < s - size; i++)
			c = c.next;
		c = a;
		while(c == b ){
			c= c.next;
		}
		return null;
	}

}
