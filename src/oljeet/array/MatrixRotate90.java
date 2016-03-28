package oljeet.array;

import java.util.Arrays;

import oljeet.input.Int2DArray;

public class MatrixRotate90 {

	public static void main(String... args){
		Integer[][] array = Int2DArray.build();
		MatrixRotate90 r = new MatrixRotate90();
		r.solve(array);
	}
	/*
	 n = 8
	 00 01 02 03 04 05 06 07
	 10 11 12 13 14 15 16 17   
	 .....
	 60 61 62 63 64 65 66 67 
	 70 71 72 73 74 75 76 77
	 t 00 t 06 t 11 .... t 33
	 r 07 r 67 r 16 .... r 34
	 b 77 b 71 b 66 .... b 44 
	 l 70 l 10 l 61 .... l 43
	 */
	
	
	public Integer[][] solve(Integer[][] array){
		int n = array.length;
		int l  = n - 1;
		for (Integer[] a : array){
			System.out.println(Arrays.toString(a) + "\n");	
		}
		for (int i = 0; i < n/2; i++){
			for (int j = i; j < l; j++){
				System.out.println(i + "," + j);
				int top = array[i][j];
				int right = array[l - j][i];
				int bottom = array[l - i][l - j];
				int left = array[j][l - i];
				System.out.println(i + "," + j + " > " + (i) + "," + (l - j));
				System.out.println(i + "," + (l - j) + " > " + (l - i) + "," + (l - j));
				System.out.println((l - i) + "," + (l - j) + " > " + (l - i) + "," + (j));
				System.out.println((l - i) + "," + (j) + " > " + (i) + "," + (j));
				array[l - j][i] = top;
				array[l - i][l -j] = right;
				array[j][l - i] = bottom;
				array[i][j] = left;
				
			}
		}
		System.out.println("---------");
		for (Integer[] a : array){
			System.out.println(Arrays.toString(a) + "\n");	
		}
		return array;
	}
}
