//**********************************************//
//* Author: 1811286                            *//
//* Week: 1                                    *//
//* Tutorial Task: 1                           *//
//* Description: Week 1 task, resit            *//
//*                                            *//
//* Date: 01/08/2020                           *//
//*                                            *//
//**********************************************//


import java.util.Scanner;

public class Task1c {
		private static int first = 0; // Setting all the default values to 0
		private static int second = 0;
		private static int sum = 0;
		public static Scanner myInput; // User input scanner

	public static void main(String[] args) {
		myInput = new Scanner(System.in);
		
		first = myInput .nextInt(); // User input 1
		System.out.println("The entered first integer is: " + first);
		
		while (true) { //while loop
		
		second = myInput .nextInt(); // User input 2
		System.out.println("The entered first integer is: " + second);
				
		sum = first * second; // the multiplication of the two entered values
		System.out.println("The total of the two integers multiplied is: " + sum); // showing in console the value

		first = second;
		}
	}
}