package oljeet.input;

import java.util.Scanner;

public class StringInput {

	static Scanner sc = new Scanner(System.in);
	
	public static String build() {
		System.out.println("Word:");
		String n = sc.nextLine();
		return n;
	}
	
	public static void close() {
		sc.close();
	}
}
