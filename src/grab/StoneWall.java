package grab;

import java.util.Stack;

import oljeet.input.IntArray;

public class StoneWall {

	public int solution(int[] H) {
		Stack<Integer> stack = new Stack<Integer>();
		int blocks = 0;
		for(int i = 0; i < H.length; i ++){
			int h = H[i];
			while(!stack.isEmpty() && stack.peek() > h ){
				stack.pop();
				blocks++;
			}
			if(stack.isEmpty() || stack.peek() < h){
				stack.push(h);
			}
		}
		while(!stack.isEmpty()){
			stack.pop();
			blocks++;
		}
        return blocks;
    }
	
	public static void main(String... args){
		StoneWall pn = new StoneWall();
		System.out.println(pn.solution(IntArray.buildint()));
	}
}
