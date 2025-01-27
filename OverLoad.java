package udemyTim;

public class OverLoad {
	public static void main(String[] args) {
		System.out.println(convertToCantimeters(2));
		System.out.println(convertToCantimeters(5,5));
	}
	public static double convertToCantimeters(int heightInch) {
		double cantimeter= 2.54*heightInch;
		return cantimeter;
	}
	public static double convertToCantimeters(int feet, int inch) {
		return (convertToCantimeters((feet*12)+inch));
	}
}