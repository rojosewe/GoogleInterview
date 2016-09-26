package grab.test;

import oljeet.input.IntArray;

public class Exercise2 {

	static final int COST_30 = 25;
	static final int COST_7 = 7;
	static final int COST_1 = 2;
	
	public int solution(int[] A) {
		int cost = 0;
		if(A.length == 0)
			return cost;
		cost = Math.min(best1And7Cost(A), COST_30);
        return cost;
    }
	
	private int best1And7Cost(int[] A){
		return Math.min(best1Cost(A, 0), 
				best7Cost(A, 0));
	}
	
	private int best1Cost(int[] A, int pos){
		if(pos >= A.length)
			return 0;
		pos++;
		int rest = Math.min(best1Cost(A, pos), 
				best7Cost(A, pos));
		return COST_1 + rest;
	}
	
	private int best7Cost(int[] A, int pos){
		if(pos >= A.length)
			return 0;
		int init = A[pos];
		while(pos < A.length && init + 6 >= A[pos]){
			pos++;
		}
		int rest = Math.min(best1Cost(A, pos), 
				best7Cost(A, pos));
		return COST_7 + rest;
	}
	
	public static void main(String... args){
		Exercise2 e = new Exercise2();
		//1 2 4 5 7 29 30
		System.out.println(e.solution(IntArray.buildintLine()));
	}
}
