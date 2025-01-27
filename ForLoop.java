package udemyTim;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateInterest(100, 0.25);
	}

	public static void calculateInterest(double amountOfMoney, double rate) {
		// takes 2 parameter
		for (double i = rate; i <= 10; i += 0.25) {
			
			if (i == 9.25) {
				// when the i equal to the 9.25, the loop stops
				break;
			}
			// rate enter by user and goes to up to 10 by incrementing 0.25.
			double newMoney = amountOfMoney + (amountOfMoney * i);
			// each money calculate by incremented rate and assing it new variable
			System.out
					.println("this Money: " + amountOfMoney + "this rate: " + i + "this new calculation: " + newMoney);
			// monitoring each calculation

		}
	}

}
