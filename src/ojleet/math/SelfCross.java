package ojleet.math;

import input.IntArray;

/**
 * https://leetcode.com/problems/self-crossing/
 * 
 * @author sensefields
 */
public class SelfCross {

	public static void main(String... args){
		SelfCross sc = new SelfCross();
		System.out.println(sc.selfCrossing(IntArray.build()));
	}

	private boolean selfCrossing(Integer[] build) {
		if(build.length < 4)
			return false;
		int p1 = build[0];
		int p2 = build[1];
		
		boolean ascending = false;
		boolean descending = false;
		for(int i = 2; i < build.length; i += 2){
			int p3 = build[2];
			int p4 = build[3];
		}
		// They don't crash if:
		// If parallels continually go up.
		// If parallels go down.
		// If parallels go continually up and then go down, and this if true if the sum of the parallels.
		return true;
	}
}
