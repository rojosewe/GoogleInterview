package ojleet.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepth {

	public Integer find(TreeNode root) {
		if(root == null)
			return 0;
		
		Queue<TreeNode> l = new LinkedList<TreeNode>();
		l.offer(root);
		int count = 1;
		while(l.peek() != null){
			TreeNode t = l.poll();
			l.offer(t.left);
			l.offer(t.right);
			count++;
		}
		int result = 0;
		while(count > 0){
			count >>= 1;
			System.out.println(count);
			result++;
		}
		
		return result;
    }
	
	public static void main(String... args){
		MinimumDepth cst = new MinimumDepth();
		TreeNode convert = ArrayToTree.build();
		System.out.println(convert);
		System.out.println(cst.find(convert));
	}
}
