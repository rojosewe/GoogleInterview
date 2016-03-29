package sort;

import input.Int;

import java.io.IOException;
import java.util.Stack;

public class StackSort<T extends Comparable> {

	public void sortStack(Stack<T> stack){
		if(stack == null || stack.isEmpty())
			return;
		Stack<T> aux = new Stack<T>();
		while(!stack.isEmpty()){
			T a = stack.pop();
			if(a == null)
				continue;
			if (aux.isEmpty() || a.compareTo(aux.peek()) > -1){
				aux.push(a);
			}else{
				while(!aux.isEmpty() && a.compareTo(aux.peek()) == -1){
					stack.push(aux.pop());
				}
				aux.push(a);
			}
		}
		while(!aux.isEmpty()){
			stack.push(aux.pop());
		}
	}
	
	public static void main(String... args) throws NumberFormatException, IOException{
		Stack<Integer> newStack = new Stack<Integer>();
		StackSort<Integer> st = new StackSort<Integer>();
		for(int i = 0; i < 4; i++){
			newStack.push(Int.build());
		}
		st.sortStack(newStack);
		System.out.println(newStack);
	}
}
