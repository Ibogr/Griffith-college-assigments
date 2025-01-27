package griffith;

import java.util.Scanner;

//3174894
//IBRAHIM GURSES
public class labTwo {
	
public static void main(String[] args) {

	
	Scanner askScanner = new Scanner(System.in);
	//to recognize Scanner class
	// this class will be use following project
	
	          // Task_One

	
/*while (true) {
 //creating while loop
 
	System.out.print("Enter number : ");
	// print to console
	 
	boolean primeNumber=true;
	//creating boolean variable in order to assign false if 'if block' return condition we want .
	 
	int input =askScanner.nextInt();
	// creating integer variable.
	int squareRoot =(int)Math.sqrt(input);
	//creating integer variable.
	
	
	for (int i=2; i<=squareRoot; i++) {
	// creating for loop in order to find a correct number.
		
		if (input%i== 0) {
		//creating if block to catch the number inside the for loop.
			primeNumber=false;
			//assigning false to created boolean variable above.
			break;
		}
	}
	if (primeNumber==false) {
	//creating if block out of previous if block to print something on the console.
		System.out.println("this isn\'t prime number");
	}
	else {
		System.out.println("this is prime number");
	}
}
}
}*/
	
	
	

		// Task Two

/*	int count=0;
	double grade=0;
	int highest=Integer.MIN_VALUE;
	int failed = 0;
	//creating double and integer variables in order to store numbers respectively we found. 
	
	while (count++<6) {
	//creating while loop and set to 6 attend.
		
		System.out.print("enter the grade: ");
		
		int input =askScanner.nextInt();
		//creating integer variable and collect data from user.
		 
		grade+=input;
		// to increment 'grade' variable's data like user entered
		
		if (input>highest) {
			highest=input;
		// creating if block in order to determine maximum grade.	 
		} 
		if (input<40) {
			failed++;
		// creating if block in order to find number of failure and increment it 1 by 1.  
		}
		System.out.println("tatol grade :"+grade);
		System.out.println("avarage grade :"+(double)grade/count);
		System.out.println("faild :"+ failed);
		System.out.println("highest grade :"+highest+"\n");	
		//display the last situation on the console.
}
}
}*/


	
	
	System.out.print("Enter the number of rows: ");
	// ask for user to enter how many rows desired to print 
	
	int rows = askScanner.nextInt();
	//creating integer variable for call scanner calss as a integer
	
	System.out.print("Enter the number of columns: ");
	int columns = askScanner.nextInt();
		
	
		
	creatBox(columns,rows);
	// calling method in the main method.
}



	public static void creatBox(int columns, int rows) {
	// creating method. this method takes 2 integer data.
	
		for (int q = 1; q<=columns; q++) {
		// creating for loop as long as columns size for display number of column.
			System.out.print(" "+q+" ");
		}
		System.out.print("\n");
		//aim for creating outside of for loop to let it one space
		
		for (int r =0; r<columns; r++) {
		// creating for loop as number as rows numbers to cover the boxes.
			System.out.print("  _");
		}
		
		for(int j =1; j<=rows; j++){
		// creating for loop as number as rows numbers to give number for each row and print boxes.
			// in this case, created columns by using print class instead of println class.
			System.out.print("\n"+j);
			System.out.print("|_|");
			
        	for (int a =1; a <columns; a++) {
        		// creating for loop as number as columns numbers to print boxes.
    			// in this case, created rows     		
        		System.out.print("|_|");
        	}
        
}
}
}