//**********************************************//
//* Author: 1811286                            *//
//* Week: 3                                    *//
//* Tutorial Task: 2                           *//
//* Description: Bank account test             *//
//*                                            *//
//* Date: 14/03/2020                           *//
//*                                            *//
//**********************************************//

class Task2a {
	
	public static void main(String[] args) {
		BankAccountTest account1 = new BankAccountTest(2700, "Bob"); // Account 1 details
		BankAccountTest account2 = new BankAccountTest(-120, "Jimmy"); // Account 2 details
		
		System.out.println(account1.getAccHolder() + "Bank account: " + account1.getBalance()); //print out account 1 name and balance
		System.out.println(account2.getAccHolder() + "Bank account: " + account2.getBalance()); // Print out account 2 name and balance
	}
}
class BankAccountTest {
	
	private String name;  // Name string
	private float balance; //balance float
	
	public BankAccountTest(float startBalance, String startName) {
		balance = startBalance;
		name = startName;
	}
	public String getAccHolder() {
		return name;
	}
	public float getBalance() {
		return balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void pauIn(float balance) {
		this.balance += balance;
	}
}