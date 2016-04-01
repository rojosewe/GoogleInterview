package string;

import java.io.*;
public class Palindrome{

	public static boolean isPalindrome(String word){
		StringBuilder sb = new StringBuilder(word);
		int a = 0;
		int b = word.length() - 1;
		while(a < b){
			if (toLower(sb.charAt(a)) != toLower(sb.charAt(b)))
					return false;
			a++;
			b--;
		}
		return true;
	}
	
	public static char toLower(char a){
		return (char) (a < 'a' ? a + ('a' - 'A') : a);
	}

	public static void main(String args[]) throws IOException{
		while(true){
			System.out.println("Enter a word");
			String word1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.println(isPalindrome(word1));
		}
	}
}