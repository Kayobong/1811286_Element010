//**********************************************//
//* Author: 1811286                            *//
//* Week: 3                                    *//
//* Tutorial Task: 3                           *//
//* Description: Course stats                  *//
//*                                            *//
//* Date: 03/08/2020                           *//
//*                                            *//
//**********************************************//

import java.util.Scanner; //importing the scanner

public class CourseStatsA { // initialising all of my variables
	public static int passes = 0;
	public static int failures = 0;
	public static int Result;
	
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		int studentCounter = 1;	
		
		scan = new Scanner(System.in);
		
		while(studentCounter <= 40) {
			System.out.println("Enter whether student number " + studentCounter + " has passed (1 or 0):1");
			Result = scan.nextInt();
		if (Result == 1) {
			passes++;
		}
		else if (Result ==0) {
			failures++;
		}
		studentCounter++;
		
		}
		scan.close();
		
	System.out.println("The amount of people who passed in the class was: " + passes); //shows amount of people who
	System.out.println("The amount of people who failed in the class was: " + failures);
	
		if (passes > 32) { //if statement which will activate if more than 32 students pass
			System.out.println();
			System.out.println("Congratulations to the tutors!"); //this message will show on activation
		}
	}
}
