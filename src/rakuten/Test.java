package rakuten;

import java.awt.Rectangle;

public class Test {

	public static int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
		long w1 = (long)M - (long)K;
		long h1 = (long)N - (long)L;
//		Rectangle r1 = new Rectangle(K, L, w1, h1);
		long area1 = w1 * h1;
		
		long w2 = (long)R - (long)P;
		long h2 = (long)S - (long)Q;
//		Rectangle r2 = new Rectangle(P, Q, w2, h2);
		long area2 = w2 * h2;
		
		//find the corners
		long x3 = Math.max(K, P);
		long y3 = Math.min(N, S);
		long xd3 =Math.min(M, R);
		long yd3 =Math.max(L, Q);
		// calculate the areas
		long w3 = xd3 - x3;
		long h3 = y3 - yd3;
		long area3 = w3 + h3;
		if( w3 <= 0 || h3 <= 0)
			area3 = 0;
		long area = area1 + area2 - area3;
		if(area > 2147483647)
			area = -1;

		return (int)area;
	}
	
	public static void main(String... args){
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(solution(-4, 1, 2, 6, 0, -1, 4, 3));
//		System.out.println(solution(-4, 3, 2, 6, 0, -1, 4, 3));
//		System.out.println(solution(0, -1, 4, 3, -4, 1, 2, 6));
//		System.out.println(solution(Integer.MIN_VALUE + 2, 1, 2, 6, 0, -1, 4, 3));		
//		System.out.println(solution(-4, 1, Integer.MAX_VALUE, 6, 0, -1, 4, 3));
		System.out.println(solution(-4 , -1, 4, 6, 0, -1, 4, 3));
	}

}