package sort;

public class BubbleSort implements ISortAlgorithm{

	@Override
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length; i ++){
			for(int j =  array.length - 1 ; j > i ; j -- ){
				if (array[j] < array[j - 1])
					swap(array, j-1, j);
			}
		}
		return array;
	}

	@Override
	public void swap(int[] array, int pos1, int pos2) {
		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}
}