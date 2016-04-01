package oljeet.tree;

import java.util.LinkedList;
import java.util.Queue;

public class RecursiveBFS {

	public static void recursiveBFS(TreeNode root, Queue<TreeNode> q){
		if(root == null)
			return;
		System.out.println(root.val);
		q.add(root.left);
		q.add(root.right);
		recursiveBFS(q.poll(), q);
	}

	public static void iterativeBFS(TreeNode root){
		if(root == null)
			return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()){
			TreeNode node = q.poll();
			if(node == null)
				continue;
			System.out.println(node.val);
			q.add(node.left);
			q.add(node.right);
		}
	}

	public static void main(String... args){
		TreeNode treeNode = new TreeNode(
				new TreeNode(
						new TreeNode(3), 1, new TreeNode(4)), 
						0, 
						new TreeNode(
								new TreeNode(5), 
								2, 
								null));
		System.out.println(treeNode);
		RecursiveBFS.recursiveBFS(treeNode, new LinkedList<TreeNode>());
		RecursiveBFS.iterativeBFS(treeNode);
	}
}
