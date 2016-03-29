package search;

public class LinearSearch{

	public LinearSearch(){
		super();
	}

	public static int search(int[] array, int searchTerm){
		for (int i = 0; i < array.length; i++){
			if(array[i] == searchTerm)
				return i;
		}
		return -1;
	}

	public static void main(String args[]){
		int searchTerm = Integer.parseInt(args[0]);
		int[] array = new int[]{1,5,4,67,12,123,1,6,8,0,3,2};
		int position = search(array, searchTerm);
		if (position > 0)
			System.out.println("The search term is in the position " + position);
		else
			System.out.println("The search term could not be found");
	}
}
