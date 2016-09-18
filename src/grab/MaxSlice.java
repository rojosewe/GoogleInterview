package grab;

import oljeet.input.IntArray;

public class MaxSlice {

	public int goldenMaxSlice(int[] A){
		int maxEnding = 0;
		int maxSlice = 0;
		for(int a : A){
			maxEnding = Math.max(0, maxEnding + a);
			maxSlice = Math.max(maxEnding, maxSlice);
		}
		return maxSlice;
	}
	
	public static void main(String... args){
		MaxSlice scr = new MaxSlice();
		System.out.println(scr.goldenMaxSlice(IntArray.buildint()));
	}
}
