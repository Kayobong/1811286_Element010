//**********************************************//
//* Author: 1811286                            *//
//* Week: 3                                    *//
//* Tutorial Task: 3                           *//
//* Description: Course stats                  *//
//*                                            *//
//* Date: 03/08/2020                           *//
//*                                            *//
//**********************************************//

import javax.swing.JOptionPane; //importing the option pane

public class CourseStats { // initialising all of my variables
	public static int passes = 0;
	public static int failures = 0;
	public static int Result;
	
	public static void main(String[] args) {
		int studentCounter = 1;	 //initalising the student counter
		
		while(studentCounter <= 40) { //while loop until 40 is reached
			Result = Integer
			.parseInt(JOptionPane.showInputDialog("Enter whether student number " + studentCounter + " has passed (1 or 0): "));
		if (Result == 1) { // if statement for adding up passes
			passes++;//total passes
		}
		else if (Result ==0) { //else statement for adding failures
			failures++; //total failures
		}
		studentCounter++; //total students
		}
		
		JOptionPane.showMessageDialog(null, "The amount of people who passed in the class was: " + passes); //shows amount of people who have passed
		JOptionPane.showMessageDialog(null, "The amount of people who failed in the class was: " + failures);//shows amount of people who have failed
	
		if (passes > 32) { //if statement which will activate if more than 32 students pass
			JOptionPane.showMessageDialog(null, "Congratulations to the tutors!"); //this message will show on activation
		}
	}
}
