package grab;

import oljeet.input.IntArray;

public class TapeEquilibrium {
	public int solve(int[] array){
		int[] aux = new int[array.length];
		aux[0] = array[0]; 
		for(int i = 1; i < array.length; i++){
			aux[i] = aux[i - 1] + array[i];
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 1; i < aux.length; i++){
			int cur = aux[i - 1] - (aux[aux.length- 1] - aux[i - 1]);  
			min = Math.min(min, Math.abs(cur));
		}
		
		return min;
	}
	
	public static void main(String... args){
		TapeEquilibrium te = new TapeEquilibrium();
		System.out.println(te.solve(IntArray.buildint()));
	}
}
