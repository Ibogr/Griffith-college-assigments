package udemyTim;

public class OverLoad {
	public static void main(String[] args) {
		// main class where all the written codes runs
		System.out.println(convertToCantimeters(2));
		System.out.println(convertToCantimeters(5,5));
	}
	public static double convertToCantimeters(int heightInch) {
		// this medhot takes 1 integer parameter.
		double cantimeter= 2.54*heightInch;
		// convert inch to cantimeter.
		return cantimeter;
		// return cantimeter
	}
	public static double convertToCantimeters(int feet, int inch) {
		return (convertToCantimeters((feet*12)+inch));
	}
}
