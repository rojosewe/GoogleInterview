package grab;

import java.util.Stack;

import string.StringBuild;

public class ProperlyNested {
	public int solution(String S) {
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < S.length(); i ++){
			char c = S.charAt(i);
			if(c == '('){
				stack.push(c);
			}else{
				if(stack.isEmpty())
					return 0;
				stack.pop();
			}
		}
		if(stack.size() > 0)
			return 0;
        return 1;
    }
	
	public static void main(String... args){
		ProperlyNested pn = new ProperlyNested();
		System.out.println(pn.solution(StringBuild.build()));
	}
}
