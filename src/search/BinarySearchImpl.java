package search;

public class BinarySearchImpl{

	public BinarySearchImpl(){
		super();
	}

	public static int binSearch(int searchTerm, int[] array, int loTerm, int maxTerm){
		if (array == null)
		return -1;
		if (maxTerm <= loTerm)
			return -1;
		int mid  = (maxTerm + loTerm) / 2;
		if(array[mid] == searchTerm)
			return mid;
		else if (array[mid] > searchTerm)
			return binSearch(searchTerm, array, loTerm, mid);
		else if (array[mid] < searchTerm)
			return binSearch(searchTerm, array, mid, maxTerm);
		return -1;
	}


	// It will only work if it’s ordered.
	public static void main(String[] args){
		int[] array = {1,5,6,8,12,14,17,19,21,30};
		int pos = binSearch(17, array, 0, array.length);
		if (pos > 0)
			System.out.println("The search term is in position " + pos);
		else
			System.out.println("The search term is not in the array");
	}
}