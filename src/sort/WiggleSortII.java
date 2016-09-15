package sort;

import java.util.Arrays;

import input.IntArray;

public class WiggleSortII {

	public Integer[] solution(Integer[] array){
		int n = array.length;
		Integer[] res = new Integer[n];
		int k = 0;
		k = (n / 2);
		quickSelect(array, 0, n - 1, k);
		int j = 0;
		int i = 0;
		while(j < k){
			res[i] = array[j];
			j++;
			i++;
			res[i] = array[n - j];
			i++;
		}
		if(n % 2 == 1)
;			res[n - 1] = array[k];
		return res;
	}
	
	private void quickSelect(Integer[] array, int lo, int hi, int k){
		if(lo < hi){
			int p = partition(array, lo, hi);
			if(k == p)
				return;
			else if(k < p)
				quickSelect(array, lo, p - 1, k);
			else
				quickSelect(array, p + 1, hi, k);
		}
		
	}
	
	private int partition(Integer[] array, int lo, int hi){
		int p = array[hi];
		int pivot = hi;
		int i = lo; 
		while(i < pivot){
			if(array[i] > p){
				swap(array, i, pivot - 1);
				swap(array, pivot, pivot - 1);
				pivot--;
			}else{
				i++;
			}
			System.out.println(Arrays.toString(array));
		}
		return pivot;
	}
	
	private void swap(Integer[] array, int i, int j){
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}
	
	public static void main(String... args){
		WiggleSortII ws = new WiggleSortII();
		Integer[] solution = ws.solution(IntArray.build());
		System.out.println(Arrays.toString(solution));
	}
}
