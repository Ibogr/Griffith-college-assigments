package udemyTim;

import java.time.Month;

public class SwitchCase {

	public static void main(String[] args) {

		System.out.println(printNumberInWord("JANUARY"));

	}

	public static String printNumberInWord(String month) {

		switch (month) {
		case "JANUARY":
		case "FEBRUARY":
		case "MARCH":
			return "1st";
		case "APRIL":
		case "MAY":
		case "JUNE":
			return "2nd";
		case "JULY":
		case "AGUST":
		case "SEPTEMBER":
			return "3th";
		case "OCTOBER":
		case "NOVEMBER":
		case "DECEMBER":
			return "4th";
		}
		return "entered number out of range (1....4)";

	}
}
