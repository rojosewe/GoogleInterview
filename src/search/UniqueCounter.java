package search;

import java.util.ArrayList;
import java.util.List;

public class UniqueCounter {

	public UniqueCounter() {
		super();
	}

	public static List<Integer> countUniques(int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		if (array.length == 0)
			return list;
		int last = 0;
		int prev = 0;
		while (last != array.length) {
			last = binSearch(array, last, (array.length - 1), array[last]);
			list.add((last - prev));
			prev = last;
		}
		return list;
	}

	public static int binSearch(int[] array, int lo, int hi, int value) {
		while (lo <= hi && lo < array.length - 1) {
			int mid = (hi + lo) / 2;
			if (array[mid] == value && array[mid + 1] != value)
				return mid + 1;
			else if (array[mid] == value && array[mid + 1] == value)
				lo = mid + 1;
			else
				hi = mid - 1;
		}

		return array.length;
	}

	public static void main(String args[]) {
		// int[] array = new
		// int[]{5,5,5,5,5,5,5,5,5,5,5,8,8,8,8,8,8,8,8,8,8,8,6,6,6,6,6,6,6,6,6,6,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,9,9,9,9,9,9,9};
		int[] array = new int[] { 1, 3, 4, 5 };
		System.out.println("Therer are " + countUniques(array) + " uniques.");
	}
}
