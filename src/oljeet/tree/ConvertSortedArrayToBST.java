package oljeet.tree;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * 
 * @author rojosewe
 *
 */
public class ConvertSortedArrayToBST {

	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0)
			return null;
		return push(nums, 0, nums.length - 1);
	}

	private TreeNode push(int[] nums, int start, int end){
		if(end < start)
			return null;
		int mid = start + (end - start) / 2;
		TreeNode t = new TreeNode(nums[mid]);
		t.left = push(nums, start, mid - 1);
		t.right = push(nums, mid + 1, end);
		return t;
	}
	
	public static void main(String... args){
		ConvertSortedArrayToBST cst = new ConvertSortedArrayToBST();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
//		Random r = new Random(12);
		int[] bs = new int[n];
		for (int i = 0; i < n; i++) {
//			bs[i] = r.nextInt(n);
			bs[i] = i * 2;
		}
		TreeNode t = cst.sortedArrayToBST(bs);
		System.out.println(t);
	}
}
