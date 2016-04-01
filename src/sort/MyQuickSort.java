package sort;

import java.util.Arrays;

public class MyQuickSort {

	public static void quicksort(int[] array, int lo, int hi){
		if(lo < hi){
			int p = partition(array, lo, hi);
			System.out.println("partit " + p);
			quicksort(array, lo, p -1);
			quicksort(array, p + 1, hi);
		}
	}

	private static int partition(int[] array, int lo, int hi){
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

	private static void swap(int[] array, int i, int j){
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

	public static void main(String... args){
		int[] array = new int[]{5,4,6,9,3,2,8};
		System.out.println(Arrays.toString(array));
		quicksort(array, 0, array.length -1);
		System.out.println(Arrays.toString(array));
	}

}
