package crack.math;

import string.StringBuild;

public class ExcelSheetColumnTable {

	public int titleToNumber(String s) {
        int total = 0;
        for(int i = 0; i < s.length(); i++){
            int x = s.charAt(i) - 'A' + 1;
            int j = s.length() - 1 - i;
            total += x * Math.pow(26, j);
        }
        return total;
    }
	
	public static void main(String... args){
		ExcelSheetColumnTable e = new ExcelSheetColumnTable();
		System.out.println(e.titleToNumber(StringBuild.build()));
	}
}
