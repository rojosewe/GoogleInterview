package doing;

import input.Int;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import oljeet.input.IntArray;

/*
Given a set of candidate numbers (C) and a target number (T), 
find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [2, 3, 6, 7] and target 7, 
A solution set is: 
[
  [7],
  [2, 2, 3]
]
 */
public class CombinationSum {

	private void recSolve(Integer[] array, int target, int sum, List<Integer> added, Set<List<Integer>> set){
		for(int i = 0; i < array.length; i++){
			int copySum = sum + array[i];
			if(copySum < target){
				// keep going deeper
				LinkedList<Integer> copy = new LinkedList<Integer>(added);
				copy.add(array[i]);
				recSolve(array, target, copySum, copy, set);
			}else if(copySum == target){
				LinkedList<Integer> copy = new LinkedList<Integer>(added);
				copy.add(array[i]);
				Collections.sort(copy);
				set.add(copy);
			}
		}
	}
	
	public List<List<Integer>> solve(Integer[] array, int target){
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		recSolve(array, target, 0, new LinkedList<Integer>(), set);
		return new ArrayList<List<Integer>>(set);
	}
	
	public static void main(String... args){
		CombinationSum cs = new CombinationSum();
		Integer[] array = IntArray.build();
		System.out.println(cs.solve(array, Int.build()));
	}
}

