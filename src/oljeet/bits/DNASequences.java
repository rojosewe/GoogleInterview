package oljeet.bits;

import java.util.HashMap;

import oljeet.input.StringInput;

public class DNASequences {

	public static void main(String... args){
		DNASequences ds = new DNASequences();
		ds.solve(StringInput.build());
	}

	private HashMap<Integer, Integer> solve(String build) {
		if(build.length() < 10)
			return null;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Character, Integer> cgmap = new HashMap<Character, Integer>();
		cgmap.put('A', 4);
		cgmap.put('C', 5);
		cgmap.put('G', 6);
		cgmap.put('T', 7);
		int eraser = Integer.parseInt("00111111111111111111111111111111",2);
		int mark = 0;
		for(int i = 0; i < build.length(); i++){
			mark |= cgmap.get(build.charAt(i));
			if(i >= 10){
				if(!map.containsKey(mark))
					map.put(mark, 0);
				map.put(mark, map.get(mark) + 1);
			}
			mark <<= 3;
			mark &= eraser;
		}
		for(Integer key : map.keySet()){
			if(map.get(key) > 1){
				System.out.println(Integer.toBinaryString(key));
			}
		}
		return map;
	}

}
