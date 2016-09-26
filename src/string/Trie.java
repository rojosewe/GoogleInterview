package string;


public class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	// Inserts a word into the trie.
	public void insert(String word) {
		if(word == null || word.isEmpty())
			return;
		word = sanitize(word.toLowerCase());
		TrieNode current = root;
		for(int i = 0; i < word.length(); i++){
			int c = word.charAt(i) - ((int)'a');
			TrieNode child = current.children[c];
			if(child == null){
				child = new TrieNode(word.charAt(i));
				current.children[c] = child;
			}
			current = child;
		}
		current.fullWord = true;
	}

	// Returns if the word is in the trie.
	private String sanitize(String lowerCase) {
		return lowerCase;
	}

	public boolean search(String word) {
		if(word == null || word.isEmpty())
			return false;
		word = sanitize(word.toLowerCase());
		TrieNode current = root;
		for(int i = 0; i < word.length(); i++){
			int c = word.charAt(i) - ((int)'a');
			TrieNode child = current.children[c];
			if(child == null)
				return false;
			else
				current = child;
		}
		return current.fullWord;
	}

	// Returns if there is any word in the trie
	// that starts with the given prefix.
	public boolean startsWith(String prefix) {
		if(prefix == null || prefix.isEmpty())
			return false;
		prefix = sanitize(prefix.toLowerCase());
		TrieNode current = root;
		for(int i = 0; i < prefix.length(); i++){
			int c = prefix.charAt(i) - ((int)'a');
			TrieNode child = current.children[c];
			if(child == null)
				return false;
			else
				current = child;
		}
		return true;
	}
	
	class TrieNode {
		// Initialize your data structure here.
		char value;
		boolean fullWord; 
		TrieNode[] children;
		
		public TrieNode() {
			this(' ');
		}
		
		public TrieNode(char value) {
			children = new TrieNode[26];
			this.value = value;
		}
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		depPrint(sb, root);
		return sb.toString();
	}
	
	private void depPrint(StringBuilder sb, TrieNode node){
		sb.append("[").append(node.value).append(":");
		for(int i = 0; i < node.children.length; i ++){
			if(node.children[i] != null)
				depPrint(sb, node.children[i]);
		}
		sb.setLength(sb.length() - 1);
		sb.append("]");
		
	}
	
	public static void main(String... args){
		Trie root = new Trie();
//		for(int i = 0; i < 3; i++){
//			root.insert(StringInput.build());
//			System.out.println(root.toString());
//		}
//		System.out.println("Correct");
//		System.out.println(root.search(StringInput.build()));
////		System.out.println("not found");
////		System.out.println(root.search(StringInput.build()));
//		System.out.println("prefix");
//		System.out.println(root.startsWith(StringInput.build()));
////		System.out.println("notpre");
////		System.out.println(root.startsWith(StringInput.build()));
		root.insert("abc");
		System.out.println(root.search("abc"));
		System.out.println(root.search("ab"));
		root.insert("ab");
		System.out.println(root.search("ab"));
		root.insert("ab");
		System.out.println(root.search("ab"));
	}
}


