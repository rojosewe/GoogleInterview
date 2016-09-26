package oljeet.input;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class IntArray {

	public static Integer[] build() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size");
		int n = Integer.parseInt(sc.nextLine());
		Integer[]  bs = new Integer[n];
		System.out.println("Type: 1 typed, 2 random");
		if(1 == Integer.parseInt(sc.nextLine())){
			for (int i = 0; i < n; i++) {
				System.out.println("value " + i);
				bs[i] = Integer.parseInt(sc.nextLine());
			}
		}else{
			System.out.println("Max value");
			int m = Integer.parseInt(sc.nextLine());
			Random r = new Random(12);
			for (int i = 0; i < n; i++) {
				bs[i] = r.nextInt(m);
			}
		}
		System.out.println(Arrays.toString(bs));
		return bs;
	}
	
	public static int[] buildint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size");
		int n = Integer.parseInt(sc.nextLine());
		int[]  bs = new int[n];
		System.out.println("Type: 1 typed, 2 random");
		if(1 == Integer.parseInt(sc.nextLine())){
			for (int i = 0; i < n; i++) {
				System.out.println("value " + i);
				bs[i] = Integer.parseInt(sc.nextLine());
			}
		}else{
			System.out.println("Max value");
			int m = Integer.parseInt(sc.nextLine());
			Random r = new Random(12);
			for (int i = 0; i < n; i++) {
				bs[i] = r.nextInt(m);
			}
		}
		System.out.println(Arrays.toString(bs));
		return bs;
	}
	
	public static int[] buildintLine() {
		Scanner sc = new Scanner(System.in);
		int[]  bs = null;
		System.out.println("Type: 1 typed, 2 random");
		if(1 == Integer.parseInt(sc.nextLine())){
			System.out.println("Type spaced array");
			String nl = sc.nextLine();
			String[] p = nl.split(" ");
			int n = p.length;
			bs = new int[n];
			for (int i = 0; i < p.length; i++) {
				bs[i] = Integer.parseInt(p[i]);
			}
		}else{
			System.out.println("Max value");
			int m = Integer.parseInt(sc.nextLine());
			System.out.println("Size");
			int n = Integer.parseInt(sc.nextLine());
			bs = new int[n];
			Random r = new Random(12);
			for (int i = 0; i < n; i++) {
				bs[i] = r.nextInt(m);
			}
		}
		System.out.println(Arrays.toString(bs));
		return bs;
	}
}
