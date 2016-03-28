package oljeet.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BottomUpLevelOrderTrasversal {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
	
		if(root == null)
			return result;
		
		orderBottomPush(result, root, 1);
	    Collections.reverse(result);
		
        return result;
    }
	
	private void orderBottomPush(ArrayList<List<Integer>> result, TreeNode root, int level) {
		if(root == null)
			return;
		if(level > result.size())
			result.add(new ArrayList<Integer>());
		result.get(level - 1).add(root.val);
		orderBottomPush(result, root.left, level + 1);
		orderBottomPush(result, root.right, level + 1);
	}

	public static void main(String... args){
		BottomUpLevelOrderTrasversal cst = new BottomUpLevelOrderTrasversal();
		TreeNode convert = ArrayToTree.build();
		System.out.println(convert);
		List<List<Integer>> t = cst.levelOrderBottom(convert);
		System.out.println(t);
	}
	
	/*		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
    LinkedList<TreeNode> next = new LinkedList<TreeNode>();
    current.offer(root);
 
    ArrayList<Integer> numberList = new ArrayList<Integer>();
 
    // need to track when each level starts
    while(!current.isEmpty()){
        TreeNode head = current.poll();
 
        numberList.add(head.val);
 
        if(head.left != null){
            next.offer(head.left);
        }
        if(head.right!= null){
            next.offer(head.right);
        }
 
        if(current.isEmpty()){
            current = next;
            next = new LinkedList<TreeNode>();
            result.add(numberList);
            numberList = new ArrayList<Integer>();
        }
    }
*/
}
