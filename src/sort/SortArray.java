package sort;

import java.util.Stack;

//SortArray.java
public class SortArray{

	public static void main(String args[]){
		
		int[] array = {1,5,8,76,45,34,23,7,8,14,16,98};
//		int[] array = {1,14,3,8,6,12,4,15};
				
		ISortAlgorithm sortAlg = new QuickSort();
		sortAlg.sort(array);
		printArray(array);
		
//		int[] array = {1,2,12,65,4,3,4,8,1,0,12};
//		ISortAlgorithm sortAlgorithm = new InsertionSort();
//		int[] sorted = sortAlgorithm.sort(array);
//		printArray(sorted);
	}
	
	private static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + ", ");	
		}
	}
}
