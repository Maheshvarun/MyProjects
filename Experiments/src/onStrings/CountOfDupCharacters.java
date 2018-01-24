package onStrings;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CountOfDupCharacters {

	public static void main(String[] args) {
		CountOfDupCharacters countOfDupCharacters = new CountOfDupCharacters();
		System.out.println("Please enter the input String:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		String result = countOfDupCharacters.findCountOfDupCharacters(inputString);
		System.out.println("duplicate Strings With Count:  --  " + result);

		/*
		 * int a = 15; int b = 30;
		 * 
		 * a = a+b; b = a-b; a = a-b;
		 * 
		 * 
		 * System.out.println("a :" + a); System.out.println("b :" + b);
		 * 
		 * int v = 15; int x = 30;
		 * 
		 * int temp = v;
		 * 
		 * v = x;
		 * 
		 * x = temp;
		 * 
		 * System.out.println("v :" + v); System.out.println("x :" + x);
		 */

	}

	private String findCountOfDupCharacters(String inputString) {

		String[] givenString = inputString.split("");
		System.out.println(givenString.length);

		/* int count = 0; */
		char character = 0;

		String result = "";

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		for (int i = 0; i < givenString.length; i++) {

			if (hashMap.containsKey(givenString[i])) {
				// If an element is present, incrementing its count by 1

				hashMap.put(i, hashMap.get(i) + 1);
			}
		}

		/*
		 * for (int i = 0; i < givenString.length; i++) {
		 * 
		 * if(!(inputString.indexOf(givenString[i]) > 0 )){
		 * 
		 * character = givenString[i];
		 * 
		 * result += character + " "; }
		 * 
		 * }
		 */

		return result;
	}
	

}