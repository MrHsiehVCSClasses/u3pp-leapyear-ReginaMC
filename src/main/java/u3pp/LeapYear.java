package u3pp;

/**
 * the LeapYear class determines whether a year is a leap year or not with the method isLeapYear
 * 
 * @author //Regina
 *
 */

public class LeapYear {
	/**
	 * if the year is less than 1582 then it returns false
	 * if the year is divisible by 4, not 100, and not 400, it returns true 
	 * if it is divisible by 4, not 100, and 400, it returns true
	 * otherwise it returns false
	 */
	public static boolean isLeapYear(int year) {
		if (year < 1582) {
			return false; 
		}
		else if ((year % 4 == 0) && !(year % 100 == 0)) {
			return true;
		}
		else if ((year % 400 == 0)) {
			return true;
		}
		else { return false;}
	}
}