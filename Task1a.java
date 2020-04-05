//**********************************************//
//* Author: 1811286                            *//
//* Week: 1                                    *//
//* Tutorial Task: 1                           *//
//* Description: Week 1 task, final draft      *//
//*                                            *//
//* Date: 01/03/2020                           *//
//*                                            *//
//**********************************************//

import java.util.Scanner;

public class Task1a {
		private static int first = 0; // Setting all the default values to 0
		private static int second = 0;
		private static int sum = 0;
		public static Scanner myInput; // User input scanner

	public static void main(String[] args) {
		myInput = new Scanner(System.in);
		
		first = myInput .nextInt(); // users input of first number
		System.out.println("The entered first integer is: " + first); // shows the first entered integer
		
		second = myInput .nextInt(); //users input of second number
		System.out.println("The entered second integer is: " + second); // shows the second entered integer
		
		sum = first + second; // calculation of the values
		System.out.println("The sum of the integers entered is: " + sum); // shows the sum
		}
	}