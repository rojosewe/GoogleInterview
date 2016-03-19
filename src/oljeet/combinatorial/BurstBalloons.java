package oljeet.combinatorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * https://leetcode.com/problems/burst-balloons/
 * 
 * @author rojosewe
 *
 */
public class BurstBalloons {

	HashMap<List<Integer>, Integer> values = new HashMap<List<Integer>, Integer>();
	
	public void solve(ArrayList<Integer>  bs){
		System.out.println(visitSubTree(bs));
	}
	
	private int visitSubTree(List<Integer> list) {
		if(values.containsKey(list))
			return values.get(list);
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			max = Math.max(max, calculate(list, i) + visitSubTree(copyWithout(list, i)));
		}
		values.put(list, max);
		return max;
	}
	
	private Integer calculate(List<Integer> list, int x){
		int a = x == 0?1:list.get(x - 1);
		int b = list.get(x);
		int c = x == list.size() - 1?1:list.get(x + 1);
		return a * b * c;
	}
	
	private List<Integer> copyWithout(List<Integer> list, int x){
		List<Integer> copy = new ArrayList<Integer>(); 
		copy.addAll(list.subList(0, x));
		if(x < list.size() - 1)
			copy.addAll(list.subList(x + 1, list.size()));
		return copy;
	}

	public static void main(String... args){
		BurstBalloons bb = new BurstBalloons();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int m = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> bs = new ArrayList<Integer>();
		Random r = new Random(12);
		for (int i = 0; i < n; i++) {
			bs.add(r.nextInt(m));
		}
		bb.solve(bs);
	}
}
