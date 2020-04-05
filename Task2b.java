//**********************************************//
//* Author: 1811286                            *//
//* Week: 3                                    *//
//* Tutorial Task: 2                           *//
//* Description: Bank account test             *//
//*                                            *//
//* Date: 14/03/2020                           *//
//*                                            *//
//**********************************************//

import javax.swing.JOptionPane;

class Task2b {
	
	public static void main(String[] args) {
		
		String balance = null;
		String firstName = null; //default value is null
		firstName = JOptionPane.showInputDialog("Enter First Name"); //input box for user
		balance = JOptionPane.showInputDialog("Enter Balance"); //input box for user
				
		BankAccountTest account1 = new BankAccountTest(balance, firstName);
		
		System.out.println(account1.getAccHolder() + "'s bank account: " + account1.getBalance()); //print out the name entered and balances
	}
}
class BankAccountTest {
	
	private String name;  // Name string
	private String balance; //balance string
	
	public BankAccountTest(String balance2, String startName) {
		balance = balance2;
		name = startName;
	}
	public String getAccHolder() {
		return name;
	}
	public String getBalance() {
		return balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void pauIn(float balance) {
		this.balance += balance;
	}
}