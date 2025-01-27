package udemyTim;

public class KilometreToHour {

	public static void main(String[] arg) {

		System.out.println(toMilesPerHour(3));
		// calling method

	}

	public static double toMilesPerHour(double kilomettersPerHour) {
		//method to convert kilometres to miles.

		double perKilomToMiles = 0.621371192;
		// variable to save how a kilometer per miles.
		double miles = 0;
		// variable to save the miles as datatype double 

		if (kilomettersPerHour < 0) {
			// this if block returns -1 when given attribute is lower than 0.
			return -1;
			
		} else {
			miles = kilomettersPerHour * perKilomToMiles;
			// to save the result to miles variable, after computing 

		}
		System.out.println("with double datatype: " + miles);
		// always prints whole number of compute with fraction.
		return Math.round(miles);
		// return whole number of result by using math class, round method.

	}
}
