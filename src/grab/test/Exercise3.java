package grab.test;

import java.util.Arrays;

import oljeet.input.IntArray;

public class Exercise3 {
	
	public int[] solution(int[] T) {
		if(T.length == 0)
			return T;
		int[] numberOfCities = new int[T.length];
		int capital = findTheCapital(T);
		if(capital == -1)
			return numberOfCities;
		int[] jumps = new int[T.length];
		for(int i = 0; i < T.length; i++){
			if(i != capital && jumps[i] == 0){
				goIn(T, jumps, i, capital);
			}
		}
		for(int i = 0; i < jumps.length; i++){
			if(jumps[i] > 0)
				numberOfCities[jumps[i] - 1] += 1;
		}
		return numberOfCities;
    }
	
	private int goIn(int[] T, int[] jumps, int pos, int capital){
		System.out.println(pos + "," + T[pos]);
		if(T[pos] == capital){
			jumps[pos] = 1;
			return 1;
		}else if(jumps[T[pos]] > 0){
			jumps[pos] = jumps[T[pos]] + 1;
			return jumps[pos]; 
		}else{
			int sum = goIn(T, jumps, T[pos], capital) + 1;
			jumps[pos] = sum;
			return sum;
		}
	}
	
	private int findTheCapital(int T[]){
		for(int i = 0; i < T.length; i++){
			if(i == T[i])
				return i;
		}
		return -1;
	}
	
	public static void main(String... args){
		Exercise3 e = new Exercise3();
		System.out.println(Arrays.toString(e.solution(IntArray.buildintLine())));
	}
}
