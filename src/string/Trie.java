package string;

import java.util.Arrays;

public class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode(' ');
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
		return isEmpty(current.children);
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
		return !isEmpty(current.children);
	}
	
	private boolean isEmpty(TrieNode[] array){
		for(int i = 0; i < array.length; i++){
			if(array[i] != null)
				return false;
		}
		return true;
	}

	class TrieNode {
		// Initialize your data structure here.
		char value;
		TrieNode[] children;
		public TrieNode(char value) {
			children = new TrieNode[26];
		}
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		depPrint(sb, root);
		return sb.toString();
	}
	
	private String depPrint(StringBuilder sb, TrieNode node){
		sb.append("[");
		for(int i = 0; i < node.children.length; i ++){
			if(node.children[i] != null)
				sb.append(node.value).append("[").append(depPrint(sb, node.children[i])).append("\n");
		}
		sb.setLength(sb.length() - 1);
		sb.append("]");
		return sb.toString();
		
	}
	
	public static void main(String... args){
		
	}
}


