package grab;
import input.Int;

public class BinaryGap {

	public int solve(int N){
		int gap = 0;
		int l = -1;
		for(int i = 0; i < 32; i++){
			if((N & 1) == 1){
				if(l >= 0)
					gap = Math.max(gap, i - l - 1);
				l = i;
			}else if (N == 0)
				return gap;
			N >>= 1;
		}
		return gap;
	}
	
	public static void main(String... args){
		BinaryGap bg = new BinaryGap();
		System.out.println(bg.solve(Int.build()));
	}
}
