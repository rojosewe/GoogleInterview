package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PermutateString {

	public static void permutate(String word){
		if(word == null)
			return;
		p("", word);
	}
	
	private static void p(String prefix, String rest){
		int n = rest.length();
		if (n == 0)
			System.out.println(prefix);
		StringBuilder  sb = new StringBuilder(rest);
		for(int i = 0; i < rest.length(); i++){
			p(prefix + sb.charAt(i), sb.substring(0,i) + sb.substring(i +1));
		}
	}
	
	public static void itPermutate(String word){
		Queue<String> prefixes = new LinkedList<String>();
		Stack<String> rest = new Stack<String>();
		prefixes.add("");
		for(int i = 0; i < word.length(); i++){
			StringBuilder  sb = new StringBuilder(rest.pop());
			String prefix = prefixes.poll();
			for(int j = 0; j < sb.length(); j++){
				rest.add(sb.substring(0,j) + sb.substring(i +j));
				prefixes.add(prefix + sb.charAt(i));
			}
		}
		System.out.println(prefixes);
		
	}
	
	public static void main(String... args) throws IOException{
		System.out.println("Enter a word");
		permutate(new BufferedReader(new InputStreamReader(System.in)).readLine());
	}
}
