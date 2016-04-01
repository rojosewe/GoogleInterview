package sort;

import java.util.Arrays;

public class ShellSort {

	public static void shellSort(Integer[] array)
	{
		int n = array.length;
		int h = 1; // find initial value of h
		int temp = 0;
		//Get the step size.
		while(h <= n / 3)
			h = h*3 + 1; // (1, 4, 13, 40, 121, ...)
		
		while(h > 0) // decreasing h, until h=1
		{
			// h-sort the file
			//4,5,6,7 so it will be "arranged" for each step value.
			for(int i = h; i < n; i++)
			{
				// one subpass (eg 0, 4, 8)
				int j = i;
				//value of 4
				temp = array[i];
				//
				while(j > h-1 && array[j - h] >= temp)
				{
					array[j] = array[j - h];
					j -= h;
				}
				array[j] = temp;
			}
			h = (h-1) / 3; // decrease h
		} // end for
	} // end while(h>0)
	
	public static void main(String[] args){
		Integer[] array = {7,10,1,9,2,5,8,6,4,3};
		shellSort(array);
		for(Integer a : Arrays.asList(array)){
			System.out.print(a + ", ");	
		}
		
	}
} 
