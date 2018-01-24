package onStrings;

import java.util.Scanner;

public class EleminateVowels {

	String  _myvar = "wew";
	public static void main(String arg[]) {
		EleminateVowels eleminateVowels = new EleminateVowels();
		System.out.println("Please enter the input String:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		String result = eleminateVowels.removeVowels(inputString);
		System.out.println("The Result of given Stirng :" + result);
		int val = 11 & 5;
		System.out.println("The Result of given Stirng :" + val);
		
		
	}

	private String removeVowels(String inputString) {

		String vowelsArr[] = { "A", "a", "E", "e", "I", "i", "O", "o", "U", "u" };

		for (int i = 0; i <= vowelsArr.length - 1; i++) {

			if (inputString.contains(vowelsArr[i])) {
				inputString = inputString.replaceAll(vowelsArr[i], "");
			}

		}

		return inputString;
	}

}
