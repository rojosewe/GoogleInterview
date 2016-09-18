package grab.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import string.StringBuild;

public class Exercise1 {

	static final int ENTRANCE = 2;
	static final int FIRST_HOUR = 3;
	static final int EXTRA_HOUR = 4;
	public int solution(String E, String L){
		// 2 for entrance
        // 1st hour 3
        // successive 4
        // t0: E, t1: L
        // HH:MM
        // what if it's smaller? next day? Same day.
		int cost = ENTRANCE + FIRST_HOUR;
        try {
        	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        	sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        	double t0 = ((double)sdf.parse(E).getTime())/3600000;
			double t1 = ((double)sdf.parse(L).getTime())/3600000;
			t0 += 1;
			double timeLeft = t1 - t0;
			if(timeLeft > 0)
				cost += Math.ceil(timeLeft) * 4;
		} catch (ParseException e) {
			e.printStackTrace();
			return -1;
		}        
		return cost;
	}
	
	public static void main(String... args){
		Exercise1 e = new Exercise1();
		System.out.println(e.solution(StringBuild.build(), StringBuild.build()));
	}
}
