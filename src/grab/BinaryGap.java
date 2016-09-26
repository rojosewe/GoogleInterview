package grab;
import input.Int;

public class BinaryGap {

	public int solve(int x){
		int gap  = 0;
		
		return gap;
	}
	
	public static void main(String... args){
		BinaryGap bg = new  BinaryGap();
		bg.solve(Int.build());
	}
	
	private double findFirstBitOn(int x){
		double pow = 0;
		for( double i = 1;  pow < x; i++){
			i = Math.pow(2, pow);
		}
		return pow;
	}
}
