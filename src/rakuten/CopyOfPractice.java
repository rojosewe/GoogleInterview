package rakuten;

import java.util.BitSet;

import oljeet.input.IntArray;

/**
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle
 * containing all ones and return its area.
 * 
 * @author root
 *
 */

public class CopyOfPractice {

	public static void solution(int[][] array) {
		// Find ones in horizontal. 
		// This could be recursive.
		// or could you keep track?
		BitSet bs = new BitSet(array.length);
		BitSet rect = new BitSet(array.length);
		rect.set(0, array.length);
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length; j++){
				if(array[i][j] == 1){
					bs.set(j);
				}
				rect.and(bs);
			}
		}
	}

public static void main(String... args) {
	solution(new int[][] { { 1, 0, 1, 0, 1, 1, 1 },
			{ 1, 0, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 1 },
			{ 1, 0, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 1 },
			{ 1, 0, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 1 } });
}
}
