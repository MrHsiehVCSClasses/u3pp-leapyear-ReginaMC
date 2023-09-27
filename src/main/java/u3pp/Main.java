package u3pp;

import java.util.Scanner;

/**
 * the Main class uses a scanner to take in input by the user
 * the input is converted to an integer
 * with an inputed year, the method isLeapYear determines whether or not 
 * and prints the year and if it is nor isn't a leap year
 * the user can stop the input when STOP is the input
 * 
 * @author Regina
 */

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		System.out.print("Enter a year (or enter STOP to end): ");
		String input = sc .nextLine();

		while (!input.toUpperCase().equals("STOP")) {
			/* 
			 * testYear becomes an integer and if isLeapYear is true then it is a 
			 * leapyear and if not then it is not a leapyear
			 */
			System.out.print("Enter a year (or enter STOP to end): ");
			int testYear = Integer.parseInt(input);
			if (LeapYear.isLeapYear(testYear)== true) {
				System.out.println(testYear + " is a leap year");}
			else {
				System.out.println(testYear + " is not a leap year");}
			input = sc.nextLine();}
		sc.close();
		
	}
}