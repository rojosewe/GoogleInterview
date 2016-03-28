package crack.math;

import oljeet.input.Int;

public class IntegerOps {

	public static void main (String... args){
		IntegerOps io = new IntegerOps();
		int i1 = Int.build();
		int i2 = Int.build();
		System.out.println(i1 + ", " + i2);
		System.out.println(io.substract(i1, i2));
		System.out.println(io.multiply(i1, i2));
		System.out.println(io.divide(i1, i2));
	}
	
	public int negate(int i){
		return -i;
//		return i  ^= 1 << 32;
	}
	
	public int substract(int i1, int i2){
		return i1 + negate(i2);
	}
	
	public int abs(int i){
		return i >= 0? i: negate(i);
	}
	
	public int multiply(int i1, int i2){
		if (i1 == 0 || i2 == 0)
			return 0;
		int sum = 0;
		for(int i = 0; i < abs(i2); i++){
			sum += abs(i1);
		}
		if( (i1 < 0 && i2 > 0) || (i2 < 0 && i1 > 0))
			return negate(sum);
		else
			return sum;
	}
	
	public int divide(int i1, int i2){
		int sum = 0;
		int result = 0;
		for(int i = 1; sum + abs(i2) <= abs(i1); i++){
			sum += abs(i2);
			result = i;
		}
		if( (i1 < 0 && i2 > 0) || (i2 < 0 && i1 > 0))
			return negate(result);
		else
			return result;
	}
}
