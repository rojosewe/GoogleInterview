package oljeet.tree;

import java.util.StringTokenizer;

public class Codec {

	// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)
            return null;
        StringBuilder sb = new StringBuilder();
		sb.append('(')
		.append(root.left == null?"":root.left.toString()).
		append(',').append(root.val).append(',')
		.append(root.right == null?"":root.right.toString()).
		append(')');
		return sb.toString();   
    }
    
    enum Mode{
		none,left,mid,right,closed
	}

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null)
            return null;
        data = data.trim();
		TreeNode t = null;
		Mode mode = Mode.none;
		int firstComma = -1;
		for (int i = 0; i < data.length(); i++) {
			switch (mode) {
			case none:
				if('(' == data.charAt(i)){
					t = new TreeNode(0);
					mode = Mode.left;
				}
				break;
			case left:
				if('(' == data.charAt(i)){
					t.left = deserialize(data.substring(i));
					i += t.left.toString().length() - 1;
				}else if(',' == data.charAt(i)){
					firstComma = i;
					mode = Mode.mid;
				}
				break;
			case mid:
				if(',' == data.charAt(i)){
					t.val = Integer.parseInt(data.substring(firstComma + 1, i));
					mode = Mode.right;
				}
				break;
			case right:
				if('(' == data.charAt(i)){
					t.right = deserialize(data.substring(i));
					i += t.right.toString().length() - 1;
				}
				else if(')' == data.charAt(i)){
					mode = Mode.closed;
					return t;
				}
				break;
			case closed:
				return t;	
			default:
				return null;
			}
		}
		return null;
    }
}
