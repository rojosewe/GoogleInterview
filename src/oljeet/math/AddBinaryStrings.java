package oljeet.math;

import oljeet.input.StringInput;

public class AddBinaryStrings {

	public static void main(String... args){
		AddBinaryStrings abs = new AddBinaryStrings();
		System.out.println(abs.solve(StringInput.build(), StringInput.build()));
		StringInput.close();
	}
	
	private String solve(String a, String b) {
		if(a == null || b == null)
    		return null;
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int i = a.length();
		int j = b.length();
		// Mientras te queden bits vivos o lleves uno
        while (i > 0 || j > 0 || carry == 1) {
        	// si te quedan bits en A
            if (i > 0){
            	// Asigna el length - 1 y baja
            	char c = a.charAt(--i);
            	if(c - '0' > 1)
            		return null;
            	// 0 o 1
                carry += c - '0';
            }
            if (j > 0){
            	char c = b.charAt(--j);
            	if(c - '0' > 1)
            		return null;
                carry += c - '0';
            }
            // carry lleva el valor que te falta por representar
            // asigna el caracter de 0 o 1
            sb.append((char) ((carry % 2) + '0'));
            // Sigue al siguiente bit.
            carry >>>= 1;
        }
        return sb.reverse().toString();
	}

	private String solveUsingFunctions(String num1, String num2) {
		if(num1 == null || num2 == null)
			return null;
		int x = Integer.parseInt(num1, 2);
		int y = Integer.parseInt(num2, 2);
		return Integer.toBinaryString(x + y);
	}
}
