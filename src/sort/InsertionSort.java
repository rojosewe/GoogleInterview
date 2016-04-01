package sort;

public class InsertionSort implements ISortAlgorithm{

	public int[] sort(int[] array){
		int firstDisordered = 	findFirstDisordered(array);
		for(int i = firstDisordered; i < array.length; i++){
			int temp = array[i];
			for(int j = i - 1; j >= 0; j--){
				if(array[j] <= temp){
					array[j  + 1] = temp;
					break;
				}
				array[j + 1] = array[j];
			}
		}
		return array;
	}

	public int findFirstDisordered(int[] array)
	{
		for(int i = 0; i < array.length-1; i++){
			if(array[i] > array[i+1])
				return i+1;
		}
		return array.length;
	}


	public void swap(int[] array, int pos1, int pos2){
		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = array[pos1];
	}
}