package oljeet.tree;

import java.util.ArrayList;
import java.util.List;

public class Traverse {

	public static List<Integer> inorder(TreeNode t){
		List<Integer> array = new ArrayList<Integer>();
		inorderPush(array, t);
		return array;
	}

	private static void inorderPush(List<Integer> array, TreeNode t) {
		if(t.left != null)
			inorderPush(array, t.left);
		array.add(t.val);
		if(t.right != null)
			inorderPush(array, t.right);
	}
	
	public static List<Integer> preorder(TreeNode t){
		List<Integer> array = new ArrayList<Integer>();
		preorderPush(array, t);
		return array;
	}

	private static void preorderPush(List<Integer> array, TreeNode t) {
		array.add(t.val);
		if(t.left != null)
			preorderPush(array, t.left);
		if(t.right != null)
			preorderPush(array, t.right);
	}
	
	public static List<Integer> postorder(TreeNode t){
		List<Integer> array = new ArrayList<Integer>();
		postorderPush(array, t);
		return array;
	}

	private static void postorderPush(List<Integer> array, TreeNode t) {
		if(t.left != null)
			postorderPush(array, t.left);
		if(t.right != null)
			postorderPush(array, t.right);
		array.add(t.val);
	}
	
	public static void main(String... args) throws Exception{
		TreeNode convert = ArrayToTree.build();
		Codec c = new Codec();
//		System.out.println("Tree: " + c.serialize(convert));
		convert = c.deserialize(convert.toString());
		System.out.println("Deserialized:" + convert);
		System.out.println("InOrder: " + Traverse.inorder(convert));
		System.out.println("PreOrder: " + Traverse.preorder(convert));
		System.out.println("PostOrder: " + Traverse.postorder(convert));
	}
}
