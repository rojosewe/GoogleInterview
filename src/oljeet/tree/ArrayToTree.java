package oljeet.tree;

import java.util.Scanner;

public class ArrayToTree {

	public TreeNode convert(Integer[] array){
		return push(array, 0);
	}

	private TreeNode push(Integer[] array, int current) {
		if(current >= array.length || array[current] == null)
			return null;
		TreeNode t = new TreeNode(array[current]);
		t.left = push(array, 2*current + 1);
		t.right = push(array, 2*current + 2);
		return t;
	}


	public static TreeNode build() {
		ArrayToTree cst = new ArrayToTree();
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		Integer[] bs = null;
		if("def".equalsIgnoreCase(first)){
			bs = new Integer[]{3,9,20,null,null,15,7};
		}else{
			int n = Integer.parseInt(first);
			bs = new Integer[n];
			for (int i = 0; i < n; i++) {
				int x = Integer.parseInt(sc.nextLine());
				bs[i] = x == -1? null : x;
			}
		}
		TreeNode t = cst.convert(bs);
		return t;
	}

	public static void main(String... args){
		TreeNode t = build();
		System.out.println(t);
	}
}

