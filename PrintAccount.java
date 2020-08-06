//**********************************************//
//* Author: 1811286                            *//
//* Week: 3                                    *//
//* Tutorial Task: 2                           *//
//* Description: print account B               *//
//*                                            *//
//* Date: 03/08/2020                           *//
//*                                            *//
//**********************************************//

import javax.swing.JOptionPane; //gives the ability to display outputs/inputs

class PrintAccount {
	
	public static void main(String[] args) {
		
		String balance = null; //default balance is null
		String firstName = null; //default value is null
		firstName = JOptionPane.showInputDialog("Enter First Name"); //input box for user
		balance = JOptionPane.showInputDialog("Enter Balance"); //input box for user
				
		PrintAccountTest account1 = new PrintAccountTest(balance, firstName); //the account being created needing first name and their balance
		
		JOptionPane.showMessageDialog(null, account1.getAccHolder() + "'s bank account: " + account1.getBalance()); //print out the name entered and balances
	}
}
class PrintAccountTest {
	
	private String name;  // Name string
	private String balance; //balance string
	
	public PrintAccountTest(String balance2, String startName) {
		balance = balance2;
		name = startName;
	}
	public String getAccHolder() { //the account holder	
		return name;
	}
	public String getBalance() { //the balance of the account
		return balance;
	}
	public void setName(String name) { //sets the name of the account holder
		this.name = name;
	}
	public void payIn(float balance) {//sets the balance
		this.balance += balance;
	}
}