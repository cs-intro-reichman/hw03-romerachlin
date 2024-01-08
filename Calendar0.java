/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(int year) == true) ;
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  	
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		System.out.println("Month " +nDaysInMonth(, year)
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	  boolean isLeapYear;
		if (isLeapYear = ((year % 400) == 0) || ((year % 4) == 0) && ((year % 100) != 0)); {
			isLeapYear = true;
		}
		return true;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		if (isLeapYear(int year) == true) {
			String monthString;
			switch (month) {
			case 1: monthString = "31";
			break;
			case 2: monthString = "29";
			break;
			case 3: monthString = "31";
			break;
			case 4: monthString = "30";
			break;
			case 5: monthString = "31";
			break;
			case 6: monthString = "30";
			break;
			case 7: monthString = "31";
			break;
			case 8: monthString = "31";
			break;
			case 9: monthString = "30";
			break;
			case 10: monthString = "31";
			break;
			case 11: monthString = "30";
			break;
			case 12: monthString = "31";
			break;
			default: monthString = "Invalid month";
			break;
		}
			
		}else {
			String monthString;
			switch (month) {
			case 1: monthString = "31";
			break;
			case 2: monthString = "28";
			break;
			case 3: monthString = "31";
			break;
			case 4: monthString = "30";
			break;
			case 5: monthString = "31";
			break;
			case 6: monthString = "30";
			break;
			case 7: monthString = "31";
			break;
			case 8: monthString = "31";
			break;
			case 9: monthString = "30";
			break;
			case 10: monthString = "31";
			break;
			case 11: monthString = "30";
			break;
			case 12: monthString = "31";
			break;
			default: monthString = "Invalid month";
			break;
		}
		}
		return monthString;
	}
}
