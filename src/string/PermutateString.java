package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	
	public static void main(String... args) throws IOException{
		System.out.println("Enter a word");
		permutate(new BufferedReader(new InputStreamReader(System.in)).readLine());
	}
}
