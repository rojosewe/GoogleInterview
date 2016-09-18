package grab;

import java.util.Stack;

import oljeet.input.IntArray;

public class Flood {

	public static void main(String... args){
    	Flood bp = new Flood ();
    	System.out.println(bp.solution(IntArray.buildintLine()));
    }
	
	private int solution(int[] A) {
		Stack<Integer> sml = new Stack<Integer>();
		Stack<Integer> sms = new Stack<Integer>();
		int v = 0;
		if(A.length < 3)
			return 0;
		sml.push(1);
		sms.push(1);
		int localMax = 1;
		for(int i = 0; i < A.length; i++){
			int a = A[i];
			if(a > localMax){
				sml.push(localMax);
				sms.push(sms.peek());
				sml.push(a);
				sms.push(a);
				localMax = a;
			}else{
				if(sms.peek() < a)
					sml.push(Math.min(localMax, a));
				else if(sms.peek() == localMax)
					sml.push(a);
				else
					sml.push(sml.peek());
				sms.push(Math.min(sml.peek(), a));	
			}
		}
		boolean smsup = false;
		int lastSms = Integer.MAX_VALUE;
		for(int i = 0; i < sms.size(); i++){
			smsup = lastSms < sms.peek();
			if(!smsup && i == sms.size() - 1)
				return v;
			v = Math.max(v, sml.pop() - sms.pop());
		}
		return v;
	}

}
//1 3 2 1 2 1 5 3 3 4 2