package oljeet.input;

import java.util.Random;
import java.util.Scanner;

public class Int2DArray {

	public static Integer[][] build() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size N");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Size M");
		int m = Integer.parseInt(sc.nextLine());
		Integer[][]  bs = new Integer[n][m];
		System.out.println("Type: 1 typed, 2 random");
		if(1 == Integer.parseInt(sc.nextLine())){
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.println("value " + i);
					bs[i][j] = Integer.parseInt(sc.nextLine());
				}
			}
		}else{
			System.out.println("Max value");
			int x = Integer.parseInt(sc.nextLine());
			Random r = new Random(12);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					bs[i][j] = r.nextInt(x);
				}
			}
		}
		sc.close();
		return bs;
	}
}
