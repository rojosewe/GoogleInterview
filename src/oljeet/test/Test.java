package oljeet.test;

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
	
	public static void main(String... args){
		Test.test2(10);
	}

}
