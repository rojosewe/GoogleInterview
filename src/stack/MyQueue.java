package stack;

import java.util.Stack;

public class MyQueue<T>{

	Stack<T> stack;
	Stack<T> queue;
	public MyQueue(){
		stack = new Stack<T>(); 
		queue = new Stack<T>();
	}

	public int size(){
		return stack.size() + queue.size();
	}

	public void push(T obj){
		stack.push(obj);
	}

	private void transferToQueue(){
		if(queue.isEmpty()){
			while(!stack.isEmpty()){
				queue.push(stack.pop());
			}
		}
	}

	public T pop() throws Exception{
		transferToQueue();
		if(!queue.isEmpty())
			return queue.pop();
		else 
			throw new Exception();
	}

	public T peek() throws Exception{
		transferToQueue();
		if(!queue.isEmpty())
			return queue.peek();
		else 
			throw new Exception();
	}
}
