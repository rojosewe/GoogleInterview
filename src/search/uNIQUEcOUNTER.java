package search;

public class uNIQUEcOUNTER{

	public uNIQUEcOUNTER(){
		super();
	}

	public static int binSearch(int searchTerm, int[] array, int loTerm, int maxTerm){
		int mid = (maxTerm + loTerm) / 2;

		if (searchTerm < array[mid])
			return binSearch(searchTerm, array, loTerm, mid);
		else if (searchTerm > array[mid])
			return binSearch(searchTerm, array, mid, maxTerm);
		else if (array[mid] == searchTerm)
			return mid;	
		else if (maxTerm < loTerm)
			return -1;
		return -1;
	}

	public static int itBinSearch(int value, int[] array){
		if (array.length == 0)
			return -1;
		int hi = array.length - 1;
		int lo = 0;

		while(lo <= hi){
			int mid  = (hi + lo) / 2;
			if(array[mid] == value)
				return mid;
			else if(array[mid] < value)
				lo = mid + 1;
			else 
				hi = mid - 1;
		}

		return -1;
	}



	// It will only work if it’s ordered.
	public static void main(String[] args){
		int[] array = {1,5,6,8,12,14,17,19,21,30};
		int pos = itBinSearch(17, array);
		if (pos > 0)
			System.out.println("The search term is in position " + pos);
		else
			System.out.println("The search term is not in the array");
	}
}