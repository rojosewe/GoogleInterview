package grab;

import string.StringBuild;

public class BankPassword {
	public int solution(String S) {
        // only a-zA-Z0-9
        // even letters
        // odd digits
        // words by adding and removing spaces
        // k spaces and k + 1 words
		int maxLength = 0;
		for(String word: S.split(" ")){
            if(complies(word)){
            	maxLength = Math.max(maxLength, word.length());
            }
        }
		return maxLength;
    }
    
    private boolean complies(String word){
    	boolean ok = word.replaceAll("[a-zA-Z0-9]+", "").length() == 0
    			&& word.replaceAll("[a-zA-Z]+", "").length() % 2 == 1
    			&& word.replaceAll("[0-9]+", "").length() % 2 == 0;
    	return ok;
    }
    
    public static void main(String... args){
    	BankPassword bp = new BankPassword();
    	System.out.println(bp.solution(StringBuild.build()));
    }
}
