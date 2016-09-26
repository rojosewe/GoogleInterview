package search;

import java.util.Arrays;

import oljeet.input.IntArray;

public class FindPeak {

	public int findPeakElement(Integer[] nums) {
		return binSearch(nums, 0, nums.length - 1);
	}
	
	public static int binSearch(Integer[] nums, int lo, int hi){
		System.out.println(Arrays.toString(nums) + ", " + lo + ", " + hi);
		if(hi < lo)
			return -1;
		int mid = (hi + lo) / 2;
		int prev = mid > 0? nums[mid - 1]:Integer.MIN_VALUE;
		int post = mid == nums.length - 1? Integer.MAX_VALUE:nums[mid + 1];
		if(prev < nums[mid] && nums[mid] > post)
			return mid;
		if (prev >= nums[lo]){
			int result = binSearch(nums, lo, mid - 1);
			if(result == -1)
				result = binSearch(nums, mid + 1, hi);
			return result;
		}else{
			int result = binSearch(nums, mid + 1, hi);
			if(result == -1)
				result = binSearch(nums, lo, mid -1);
			return result;
		}
	}

	public static void main(String... args){
		System.out.println(new FindPeak().findPeakElement(IntArray.build()));
	}
}