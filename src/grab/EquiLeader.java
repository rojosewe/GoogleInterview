package grab;

import oljeet.input.IntArray;

public class EquiLeader {
	
	public int solution(int[] A){
		int leader = findLeader(A);
		int equis = 0;
		if(leader == -1)
			return 0;
		int n = A.length;
		int times = 0;
		for(int i = 0 ; i < n; i++){
			if(A[i] == leader)
				times++;
		}
		int t1 = 0; 
		for(int i = 0 ; i < n ; i++){
			if(A[i] == leader){
				t1++;
			}
			if(t1 > ((i + 1) / 2) && times - t1 > (n - i - 1) / 2){
				equis++;
			}
				
		}
		return equis;
	}
		
	public int findLeader(int[] A){
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
		EquiLeader scr = new EquiLeader();
		System.out.println(scr.solution(IntArray.buildint()));
	}
}
