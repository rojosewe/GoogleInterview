package sort;

import java.util.Random;

public class QuickSort implements ISortAlgorithm{

	@Override
	public int[] sort(int[] array) {
		int n = array.length;
		recSort(array, 0, n-1);
		return array;
	}

	public void recSort(int[] array, int start, int end){
		if(start >= end)
			return;
		
		Random r = new Random(1);
		int pivot = start + r.nextInt(end-start);

		partArray(array, start, end, pivot);
		recSort(array, start, pivot - 1);
		recSort(array, pivot + 1, end);
	}

	public void partArray(int[] array, int start, int end, int pivot){
		System.out.println("pivot " + pivot + ", val: " + array[pivot]);
		int pivotValue = array[pivot];
		int leftP = start;
		int rightP = end;
		while(true){
			while(array[leftP] < pivotValue) leftP++;
			
			while(array[rightP] >= pivotValue && rightP > start) rightP--;	
			
			if(leftP >= rightP)
				break;
			else{
				System.out.println("swap " + array[leftP] + ", " + array[rightP]);
				swap(array, leftP, rightP);
			}
		}
	}

	@Override
	public void swap(int[] array, int pos1, int pos2) {
		int temp = array[pos2];
		array[pos2] =array[pos1];
		array[pos1] = temp;

	}
}

//public class QuickSort implements ISortAlgorithm{
//
//	@Override
//	public int[] sort(int[] array) {
//		int n = array.length;
//		recSort(array, 0, n-1);
//		return array;
//	}
//
//	public void recSort(int[] array, int left, int right){
//		if(left >= right)
//			return;
//		
//		int pivot = array[right];
//		int part = partArray(array, left, right, pivot);
//		recSort(array, left, part-1);
//		recSort(array, part+1, right);
//	}
//
//	public int partArray(int[] array, int left, int right, int pivot){
//		int leftP = left;
//		int rightP = right-1;
//		while(true){
//			while(array[leftP] < pivot){
//				leftP++;	
//			}
//
//			while(array[rightP] >= pivot && rightP > left){
//				rightP--;	
//			}
//			
//			if(leftP >= rightP)
//				break;
//			else{
//				swap(array, leftP, rightP);
//			}
//		}
//		swap(array, leftP, right);
//		return leftP;
//	}
//
//	@Override
//	public void swap(int[] array, int pos1, int pos2) {
//		int temp = array[pos2];
//		array[pos2] =array[pos1];
//		array[pos1] = temp;
//
//	}
//}