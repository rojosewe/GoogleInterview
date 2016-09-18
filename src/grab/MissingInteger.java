package grab;

import java.util.BitSet;

import oljeet.input.IntArray;

public class MissingInteger {

	public int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
           min = Math.min(min, A[i]);
           max = Math.max(max, A[i]);
        }
        if(min > 1)
        	return 1;
        int n = max - min;
        BitSet base = new BitSet(n);
        for(int i = 0; i < A.length; i++){
        	int x = A[i] - min;
        	base.set(x);
        }
        return base.nextClearBit(0) + 1;
    }
	
	public static void main(String... args){
		MissingInteger scr = new MissingInteger();
		System.out.println(scr.solution(IntArray.buildint()));
	}
	
}
