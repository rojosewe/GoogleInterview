package test;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class Test {

	public static void test1(int x){
		// Testing what --i does.
		int i = x;
		int j = x;
		while(i > 0){
			System.out.println(--i);
		}
		while(j > 0){
			System.out.println(j--);
		}
	}
	
	public static void test2(int x){
		int i = x;
		while(i > 0){
			i >>= 1;
			System.out.println(i);
		}
	}
	
	public static void test3(int x){
		StringBuilder sb = new StringBuilder();
	}
	
	public static void test4(){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.pop();
	}
	
	public static void test5(){
		DecimalFormat df = new DecimalFormat("#.#####");
		df.setRoundingMode(RoundingMode.FLOOR);
		System.out.println(df.format(0.55555555555555) + "x+" + df.format(0.010000));
	}
	
	public static void test6(int x){
		TreeSet<Integer> set = new TreeSet<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		set.add(x);
		q.add(x);
		set.contains(x);
		
	}
	
	public static void test7(int x){
		BigInteger res = new BigInteger(new Integer(x).toString());
		res.divide(BigInteger.TEN);
		res.multiply(BigInteger.valueOf(new Long(x) - 1));
	}
	
	public static void test8(){
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(0);
		q.add(1);
		System.out.println(q.poll());
	}
	
	public static void test9(String word){
	}
	
	public static void main(String... args){
		Test.test8();
	}
}
