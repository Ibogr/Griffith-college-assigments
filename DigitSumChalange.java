package udemyTim;

public class DigitSumChalange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum up of every single digit of given number: " + sumDigit(10000000));
		System.out.println("sum up of every single digit of given number: " + sumDigit(-4356));
		System.out.println("sum up of every single digit of given number: " + sumDigit(4356));

	}

	public static int sumDigit(int number) {
		// method for sum each digit

		int sDigit = 0;
		// variable for each digit
		if (number < 0)
			// if given number less than 0 return -1
			return -1;
		else {
			// if not...
			while (number > 9) {
				// while loop for each digit. this while loop first takes the last digit of number by calculating mordule 10. it means that last digit then in order to drop the last digit, 
				//divides by 10 and assing it original *number* which is given number.
				
				sDigit += (number % 10);
				// i.e 123: 123%10=3. this "3" assign to the sDigit variable.
				number = number / 10;
				// then 123: divides by 10 to find a remeining numbers. for that: 123/10= 12,3. but since we have datatype "int" the complier reads it 2 digit.
				// sure it can read as 12.3, if we put datatype as "double" or "float". the found number "12" assign to original number given by user.
				// now we have remeining 12. and it still greater than 9. so the while loop keeps running.
				//12: 12%10=2. 2 is sum up with privous digit with 3.
				//12: 12/10=1
				// since 1 is less than 9, the while loop doesn't run and exit the loop, and the remeining "1", sum up with "3+2+.." 
			}
			sDigit += number;
			//and the remaining "1" is here, sum up with others.
		}

		return sDigit;
	}
}
