package sort;

import java.util.ArrayList;

public class StringRadixSort{

	public String[] sort(String [] array) {
		int maxDigits = 0;
		int possible = 27;
		for(int i = 0; i < array.length; i++){
			maxDigits = Math.max(maxDigits, array[i].length());
		}

		for(int i =0; i < maxDigits; i++){
            ArrayList<String> bucketList[] = new ArrayList[possible];
            for(int k=0; k < possible; k++){
                bucketList[k] = new ArrayList<String>();
            }
            
            for(int j =0; j < array.length; j++){
            	if(array[j].length() > i){
            		int number = Character.getNumericValue(array[j].toUpperCase().charAt(i))-9;
            		bucketList[number].add(array[j]);
            	}else{
            		bucketList[0].add(array[j]);
            	}
            }
            
            int index =0;
            for(int k=0; k < possible; k++){
                for(String word: bucketList[k]){
                    array[index] = word;
                    index++;
                }
            }
        }
 
        return array;
	}

	public static void main(String args[]){
		
		String[] array = {"Joe" , "Laura" , "Lau" , "Mai" , "mom" , "juan" , "tomas"};
				
		StringRadixSort sortAlg = new StringRadixSort();
		sortAlg.sort(array);
		printArray(array);
		
//		int[] array = {1,2,12,65,4,3,4,8,1,0,12};
//		ISortAlgorithm sortAlgorithm = new InsertionSort();
//		int[] sorted = sortAlgorithm.sort(array);
//		printArray(sorted);
	}
	
	private static void printArray(String[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + ", ");	
		}
	}
}
