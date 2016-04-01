package sort;

import java.util.Random;

public class QuickSortInPlace implements ISortAlgorithm{

//	{3,5,17,8,6,4,3,234,76,12,9}
	@Override
	public int[] sort(int[] array) {
		if(array == null || array.length < 2)
			return array;
		
		recSort(array, 0, array.length - 1);
		return array;
	}
	
	private void recSort(int[] array, int left, int right){
		if(left >= right)
			return;
		
		Random r = new Random(10);
		int pivot = array[r.nextInt(right - left) + left];
		System.out.println("Pivot: " + pivot);
		int partition = findPartition(array, left, right, pivot);
		recSort(array, left, partition - 1);
		recSort(array, partition + 1, right);
	}
	
	private int findPartition(int[] array, int left, int right, int pivot){
		int leftP = left;
		int rightP = right;
		
		while(true){
			
			while(pivot > array[leftP]) leftP++;
			
			while(pivot <= array[rightP] && rightP > left) rightP--;
			
			if(leftP >= rightP)
				break;
			else
				swap(array, leftP, rightP);
		}
		
		swap(array, leftP, right);
		return leftP;
	}

	@Override
	public void swap(int[] array, int pos1, int pos2) {
//		a = 4
//		b = 7
//		a = a + b = 4 + 7 = 11
//		b = a - b = 11 - 7 = 4
//		a = a - b = 11 - 4 = 7
		array[pos1] = array[pos1] + array[pos2];
		array[pos2] = array[pos1] - array[pos2];
		array[pos1] = array[pos1] - array[pos2];
	}

}
