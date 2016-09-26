package crack.math;

import input.Int;

public class ReverseInteger {

	public int reverse(int x) {
		int n = 0;
		boolean minus = x < 0;
		x = Math.abs(x);
		while(x >= 1){
			int old = n;
			int y = x % 10;
			n *= 10;
			n += y;
			if(new Long(old) * 10 + y > Integer.MAX_VALUE)
				return 0;
			x /= 10;
		}
		return minus?-n:n;
	}
	
	public static void main(String... args){
		System.out.println(new ReverseInteger().reverse(Int.build()));
	}
}
