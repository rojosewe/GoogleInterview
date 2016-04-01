package sort;
//SelectionSort.java
public class SelectionSort implements ISortAlgorithm{

	public void swap(int[] array, int pos1, int pos2){
		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}

	public int[] sort(int[] array){
		int min;
		int minPos;
		for (int i = 0; i < array.length - 1; i++){
			min = array[i];
			minPos = i;
			for (int j = i + 1; j < array.length; j++){
				if (min > array[j]){
					min = array[j];
					minPos = j;
				}
			}
			swap(array, minPos, i);
		}
		return array;
	}
}