//**********************************************//
//* Author: 1811286                            *//
//* Week: 1                                    *//
//* Tutorial Task: 1                           *//
//* Description: Week 1 task 1b, resit         *//
//*                                            *//
//* Date: 01/08/2020                           *//
//*                                            *//
//**********************************************//


import java.util.Scanner;

public class Task1b {
		private static int first = 0; // Setting all the default values to 0
		private static int second = 0;
		private static int third = 0;
		private static int average = 0;
		private static int temp = 0;
		public static Scanner myInput; // User input scanner

	public static void main(String[] args) {
		myInput = new Scanner(System.in);
		
		first = myInput .nextInt(); // User input 1
		System.out.println("The entered first integer is: " + first);
		
		second = myInput .nextInt(); // User input 2
		System.out.println("The second entered integer is: " + second);
		
		third = myInput .nextInt(); // User input 3
		System.out.println("The third entered integer is: " + third);
				
		if (first < second) { // if statement
			temp = first;
			first = second;
			second = temp;
		}
		if (second < third) {
			temp = third;
			third = second;
			second = temp;
		}
		if (first < second) {
			temp = first;
			first = second;
			second = temp;
		}

		System.out.println("The numbers in decending order are: " + first + ", " + second + ", " + third);
		
		average = (first + second + third) / 3; // Working out the average of the values
		
		System.out.println("The average of the values is: " +  average); //print out the sum and average
		
	}
}