package udemyTim;

import org.w3c.dom.ls.LSOutput;

public class KilometreToHour {

	public static void main(String[] arg) {

		System.out.println(toMilesPerHour(3));

	}

	public static double toMilesPerHour(double kilomettersPerHour) {

		double perKilomToMiles = 0.621371192;
		double miles = 0;

		if (kilomettersPerHour < 0) {
			return -1;
		} else {
			miles = kilomettersPerHour * perKilomToMiles;

		}
		System.out.println("with double datatype: " + miles);
		return Math.round(miles);

	}
}
