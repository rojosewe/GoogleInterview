package oljeet.tree;

//Definition for a binary tree node.
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){ 
		val = x; 
	}

	public String toString(){
		String l = "";
		if(left == null && right != null)
			l = "*<-";
		else if(left != null)
			l = left.toString() + "<-";
		String r = "";
		if(right == null && left != null)
			r = "->*";
		else if(right != null)
			r = "->" + right.toString();
		return l + val + r; 
	}
}
