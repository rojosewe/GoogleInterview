package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort implements ISortAlgorithm{

	@Override
	public int[] sort(int[] array) {
		int maxDigits = 0;
		for(int i = 0; i < array.length; i++){
			maxDigits = (int) Math.max(maxDigits, Math.ceil(Math.log10(array[i])/Math.log10(10)));
		}

		int exp = 1;//10^0;
        for(int i =0; i < maxDigits; i++){
            ArrayList<Integer> bucketList[] = new ArrayList[10];
            for(int k=0; k < 10; k++){
                bucketList[k] = new ArrayList<Integer>();
            }
            for(int j =0; j < array.length; j++){
                int number = (array[j]/exp)%10;
                bucketList[number].add(array[j]);
            }
            
            exp *= 10;
            int index =0;
            for(int k=0; k < 10; k++){
                for(int num: bucketList[k]){
                    array[index] = num;
                    index++;
                }
            }
        }
 
        System.out.println("Sorted numbers");
        for(int i =0; i < array.length; i++){
            System.out.print(array[i] +", ");
        }
        return array;
	}

	@Override
	public void swap(int[] array, int pos1, int pos2) {
		// TODO Auto-generated method stub
		
	}

}
