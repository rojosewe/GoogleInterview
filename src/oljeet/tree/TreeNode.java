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
		Codec c = new Codec(); 
		return c.serialize(this); 
	}

}
