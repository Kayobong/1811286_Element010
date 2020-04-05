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

public class Task1b {
		private static int first = 0; // Setting all the default values to 0
		private static int second = 0;
		private static int third = 0;
		private static int sum = 0;
		private static int average = 0;
		private static int temp = 0;
		public static Scanner myInput; // User input scanner

	public static void main(String[] args) {
		myInput = new Scanner(System.in);
		
		while (true) {
		
		first = myInput .nextInt(); // User input 1
		second = myInput .nextInt(); // User input 2
		third = myInput .nextInt(); // User input 3
				
		if (first > second) { // if statement
			temp = first;
			first = second;
			second = temp;
		}
		if (second > third) {
			temp = third;
			third = second;
			second = temp;
		}
		if (first > second) {
			temp = first;
			first = second;
			second = temp;
		}

		sum = first + second + third; // Working out the sum of the values
		average = (first + second + third) / 3; // Working out the average of the values
		
		System.out.println("The sum of the values = " + sum + " and the average of the values = " +  average); //print out the sum and average
		
		}
	}
}