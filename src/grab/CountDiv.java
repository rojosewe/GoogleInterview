package grab;

import oljeet.input.Int;

class CountDiv{

	public int solution(int A, int B, int K) {
		if(A == B)
			return A % K == 0? 1 : 0;
		
        int b = (B/K) + 1;  // From 0 to B the integers divisible by K
        int a = (A/K) + 1;  // From 0 to A the integers divisible by K

        if (A % K == 0) { // "A" is inclusive; if divisible by K then
            --a;        //   remove 1 from "a"
        }
        
        return b-a;     // return integers in range
    }
	
	public static void main(String... args){
		CountDiv cd = new CountDiv();
		System.out.println(cd.solution(Int.build(), Int.build(), Int.build()));
	}
}