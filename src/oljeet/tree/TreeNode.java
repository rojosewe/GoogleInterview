package oljeet.tree;

//Definition for a binary tree node.
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){ 
		val = x; 
	}
	
	TreeNode(TreeNode left, int x, TreeNode right){ 
		val = x; 
		this.left = left;
		this.right = right;
	}

	public String toString(){
		Codec c = new Codec(); 
//		return c.serialize(this);
		return "";
	}

}
