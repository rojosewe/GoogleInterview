package oljeet.tree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTrasversal {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
	
		if(root == null)
			return result;
		
		orderPush(result, root, 1);
		
        return result;
    }
	
	private void orderPush(ArrayList<List<Integer>> result, TreeNode root, int level) {
		if(root == null)
			return;
		if(level > result.size())
			result.add(new ArrayList<Integer>());
		result.get(level - 1).add(root.val);
		orderPush(result, root.left, level + 1);
		orderPush(result, root.right, level + 1);
	}

	public static void main(String... args){
		LevelOrderTrasversal cst = new LevelOrderTrasversal();
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
