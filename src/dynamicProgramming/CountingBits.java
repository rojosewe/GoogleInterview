package dynamicProgramming;

import input.Int;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/counting-bits/
 * 
 * Solution DP
 * 
 * @author sensefields
 */
public class CountingBits {

	public static void main(String... args){
		CountingBits sc = new CountingBits();
		System.out.println(Arrays.toString(sc.solve(Int.build())));
	}

	private int[] solve(int n) {
		if( n < 0)
			return null;
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		int[] count = new int[n + 1];
		int exp = 0;
		map.put(0, 0);
		count[0] = 0;
		for (int i = 1; i <= n; i++){
			int x = i - (int) Math.pow(2, exp);
			count[i] = map.get(x) + 1;
			map.put(i, count[i]);
			if(count[i] == exp + 1)
				exp++;
		}
		return count;
	}
}
