package sort;

import java.util.*;

public class AgeSorter{
	
	private final static int MAX_AGE = 150;
		
	public static int[] sort(int[] original) throws ArrayIndexOutOfBoundsException{
		try{
			int[] data = new int[original.length];
			int[] ages = new int[MAX_AGE];
			
			for(int i = 0; i < original.length; i++){
				ages[original[i]]++;
			}
			
			int counter = 0;
			for(int i = 0; i < ages.length; i++){
				// You know it is going to be of the desired size. if you count only the frequency, then you fill positions x to y with the i value. 
				Arrays.fill(data, counter, counter + ages[i], i);
				counter += ages[i];
			}
			return data;
		}catch(Exception e){
			System.out.println("Someone is over a hundred or a negative went through, time to change the max. "
					+ "Could not sort the array.");
		}
		return original;
	}

	public static void main(String[] args) throws IllegalStateException{
		int[] original = {1,56,34,6,98, 5,5,5,5,7,6,9,6,3,2,54,6,87,6,5,6,8,90,1,7,12,12,23};
		//sorting doesn't always make sense to use quicksort right away. if an array is large but has very 
		// limited values (age), then it iks easier to count the frequency and add to another array by frequency.
		// leaving it O(n) instead of O(nlgn) 
		original = sort(original);
		for(int i = 0; i < original.length; i++){
			System.out.println(original[i]);
		}
	}
}