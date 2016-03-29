package input;

import java.util.Scanner;

public class Int {

	public static int build() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number");
		int n = Integer.parseInt(sc.nextLine());
		return n;
	}
}
