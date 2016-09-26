package grab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import oljeet.input.Int;
import oljeet.input.IntArray;

public class CyclicRotation {
	public int[] naive(int[] array, int k){
		int[] aux = new int[array.length];
		int moves = k % array.length;
		for(int i = 0; i < array.length; i++){
			aux[(i + moves) % array.length] = array[i];
		}
		return aux;
	}
	
	public int[] solve(int[] array, int k){
		k = k % array.length;
		reverse(array, 0, array.length - 1);
		reverse(array, 0, k - 1);
		reverse(array, k, array.length - 1);
		return array;
	}
	
	public void reverse(int[] array, int x, int y){
		int half = (y - x + 1) / 2;
		for(int a = 0; a < half; a++){
			int i = a + x;
			int j = y - a;
			int aux = array[i];
			array[i] = array[j];
			array[j] = aux;
		}
	}
	
	public static void main(String... args){
		CyclicRotation cr = new CyclicRotation();
		System.out.println(Arrays.toString(cr.solve(IntArray.buildint(), Int.build())));
	}
}
