package grab;

import oljeet.input.IntArray;

public class GoldenLeader {
	
	public int solution(int[] A){
		int n = A.length;
		int size = 0;
		int value = -1;
		for(int i = 0 ; i < n; i++){
			if(size == 0){
				size++;
				value = A[i];
			}else{
				if(value != A[i]){
					size--;
				}else{
					size++;
				}
			}
		}
		int candidate = -1;
		if(size > 0){
			candidate = value;
		}
		int leader = -1;
		int count = 0;
		for(int k = 0; k < n; k++){
			if(A[k] == candidate)
				count++;
		}
		if (count > n / 2){
			leader = candidate;
		}
		return leader;
	}
	
	public static void main(String... args){
		GoldenLeader scr = new GoldenLeader();
		System.out.println(scr.solution(IntArray.buildint()));
	}
}
