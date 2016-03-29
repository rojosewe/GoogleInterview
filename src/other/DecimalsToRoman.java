package other;

public class DecimalsToRoman {

	static String[] symbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM"};

	private static String convert(Integer number) {
		double order = 1000;
		StringBuilder sb = new StringBuilder();

		//Find order of 10s for current number.
		while(order > number)
			order *= 0.1;
		//Find the power of 10 of the order
		double arrayorder = Math.round(Math.log(order) / Math.log(10));

		//Fill the thousands as a special case.
		if(order == 1000){
			while(number >= 1000){
				sb.append("M");
				number -= 1000;
			}
			order = 100;
			arrayorder = 2;
		}

		//Find the next letter based on the current number between 5 repeating patterns
		//by the leading values of 1-3,4,5,6-8,9 and adjust the sumbol to the order of 10.
		while(number > 0){
			int first = new Integer(number.toString().substring(0,1));
			int leftover = 0;
			if(first == 9){
				sb.append(symbols[(int) (arrayorder*4+3)]);
				number -= (int)(9 * order);
			}else if(first >= 5){
				sb.append(symbols[(int) (arrayorder*4+2)]);
				number -= (int)(5 * order);
				leftover = first - 5;
			}else if(first == 4){
				sb.append(symbols[(int) (arrayorder*4+1)]);
				number -= (int)(4 * order);
			}else if(first >= 1){
				sb.append(symbols[(int) (arrayorder*4)]);
				number -= (int)(1 * order);
				leftover = first - 1;
			}
			// Find the order of 10 for the next number, this way we can handle 
			// numbers such as 101, since 0 is not in the roman numerals.
			if(leftover == 0){
				while(order > number)
					order *= 0.1;
				arrayorder = Math.round(Math.log(order) / Math.log(10));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) throws Exception {
		if(args.length != 1)
			throw new Exception("Wrong number of args. Use: java DecimalsToRoman <decimal>");
		
		Integer number = new Integer(args[0]);
		if(number < 1 || number > 3999)
			throw new Exception("Only numbers form 1 to 3999 can be converted.");
		System.out.println(number + " is written as " + convert(number) + " in roman numerals.");
	}
}
