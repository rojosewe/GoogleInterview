package grab;

import oljeet.input.IntArray;

public class ArraysPermutation {

	public int solution(int[] A) {
		int n = A.length;
		int x = (n  * (n + 1)) / 2;
		System.out.println(x);
		int sum = 0;
		for(int i = 0; i < A.length; i++){
			sum += A[i];
		}
		System.out.println(sum);
		if(x == sum)
			return 1;
		return 0;
	}

	public static void main(String... args){
		ArraysPermutation bg = new ArraysPermutation();
		System.out.println(bg.solution(IntArray.buildint()));
	}
}
