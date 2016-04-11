package search;

import java.util.ArrayList;
import java.util.List;

import oljeet.input.IntArray;
import oljeet.tree.Codec;

public class CountSmaller {


	public class Tree{
		TreeNode root;

		void add(int x){
			add(root, x);
		}

		void add(TreeNode node, int x){
			if(node == null){
				this.root = new TreeNode(x);
				node = root;
			}else{

				if(node.value < x){
					if(node.right != null)
						add(node.right, x);
					else{
						node.right = new TreeNode(x);
						node.right.smaller = node.smaller + 1;
					}
				}else{
					node.smaller++;
					if(node.left != null)
						add(node.left, x);
					else{
						node.left = new TreeNode(x);
					}
				}
			}
		}


		TreeNode search(int x){
			return search(root, x);
		}

		TreeNode search(TreeNode t, int x){
			if(t == null)
				return null;
			if(t.value > x){
				if(t.right != null) 
					return search(t.right, x);
				else
					return t;
			}
			else{
				if(t.left != null) 
					return search(t.left, x);
				else
					return t;
			}
		}

		void remove(int x){
			this.root = remove(x, this.root);
		}
		
		private TreeNode remove(Integer x, TreeNode t )
        {
            if( t == null )
                return t;   // Item not found; do nothing
            if( x.compareTo( t.value ) < 0 )
                t.left = remove( x, t.left );
            else if( x.compareTo( t.value ) > 0 )
                t.right = remove( x, t.right );
            else if( t.left != null && t.right != null ) // Two children
            {
                t.value = findMin( t.right ).value;
                t.right = remove( t.value, t.right );
            }
            else
                t = ( t.left != null ) ? t.left : t.right;
            return t;
        }
		
		/**
         * Internal method to find the smallest item in a subtree.
         * @param t the node that roots the tree.
         * @return node containing the smallest item.
         */
        private TreeNode findMin( TreeNode t )
        {
            if( t == null )
                return null;
            else if( t.left == null )
                return t;
            return findMin( t.left );
        }


		public String toString(){
			if(root == null)
				return "()";
			return this.root.toString(); 
		}
	}
	public class TreeNode{

		public int value;
		public int smaller = 0;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int i) {
			this.value = i;
		}

		public String toString(){
			Codec c = new Codec(); 
			return c.serialize(this); 
		}
	}



	public List<Integer> countSmaller(Integer[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		Tree t = new Tree();
		for(int x : nums){
			t.add(x);
			System.out.println(t);
		}
		for(int x : nums){
			TreeNode n = t.search(x);
			list.add(n.smaller);
			t.remove(x);
			System.out.println(t);
		}
		return list;
	}

	public static void main(String... args){
		System.out.println(new CountSmaller().countSmaller(IntArray.build()));
	}
}
