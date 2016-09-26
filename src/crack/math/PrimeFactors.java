package crack.math;

import java.util.TreeSet;

import oljeet.input.Int;

public class PrimeFactors {
	public static int primeFactor(int k){
		if(k <= 0)
			return -1;
		int i3 = 0;
		int i5 = 0;
		int i7 = 0;
		TreeSet<Integer> set = new TreeSet<Integer>();
		TreeSet<Integer> q = new TreeSet<Integer>();
		q.add(1);
		set.add(1);
		while(set.size() < k){
			System.out.println(q);
			int y = q.pollFirst();
			i3 = y * 3;
			i5 = y * 5;
			i7 = y * 7;
			if(!set.contains(i3)){
				set.add(i3);
				q.add(i3);
			}
			if(!set.contains(i5)){
				set.add(i5);
				q.add(i5);
			}
			if(!set.contains(i7)){
				set.add(i7);
				q.add(i7);
			}
		}
		while(!q.isEmpty()){
			int x = q.pollFirst();
			set.add(x * 3);
			set.add(x * 5);
			set.add(x * 7);
		}
		System.out.println(set);
		for (Integer integer : set) {
			k--;
			if(k == 0)
				return integer;
		}
		return -1;
	}

	public static void main(String... args){
		while(true)
			System.out.println(PrimeFactors.primeFactor(Int.build()));
	}

}
