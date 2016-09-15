package sort;

import input.IntArray;

import java.util.Arrays;

import oljeet.input.Int;

public class QuickSelect {

	public void quickSelect(Integer[] array, int lo, int hi, int k){
		if(lo < hi){
			int p = partition(array, lo, hi);
			System.out.println("partit " + p);
			if(k == p)
				return;
			else if(k < p)
				quickSelect(array, lo, p -1, k);
			else
				quickSelect(array, p + 1, hi, k);
		}
	}

	private static int partition(Integer[] array, int lo, int hi){
		int pivot = array[hi];
		int i = lo;
		for (int j = lo; j < hi; j++){
			if(array[j] <= pivot){
				swap(array, i, j);
				System.out.println(Arrays.toString(array));
				i++;
			}
		}
		swap(array, i, hi);
		System.out.println("swap full");
		System.out.println(Arrays.toString(array));
		return i;

	}

	private static void swap(Integer[] array, int i, int j){
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

	public static void main(String... args){
		Integer[] array = IntArray.build();
		QuickSelect qs = new QuickSelect();
		int k = Int.build();
		qs.quickSelect(array, 0, array.length -1, k);
		System.out.println(Arrays.toString(array));
		System.out.println("Result: " + array[k]);
	}
}
