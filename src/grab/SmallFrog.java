package grab;

import java.util.BitSet;

import oljeet.input.Int;
import oljeet.input.IntArray;

public class SmallFrog {

	public int solution(int X, int[] A) {
		int earliest = -1;
		BitSet bs = new BitSet(X);
		BitSet and = new BitSet(X);
		and.set(1, X + 1);
		for(int i = 0 ; i < A.length; i++){
			bs.set(A[i]);
			and.xor(bs);
			if(and.nextSetBit(0) == -1){
				return i;
			}
			and.set(1, X + 1);
		}
        return earliest;
    }
	
	public static void main(String... args){
		SmallFrog scr = new SmallFrog();
		System.out.println(scr.solution(Int.build(), IntArray.buildint()));
	}
}
