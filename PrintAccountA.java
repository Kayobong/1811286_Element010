//**********************************************//
//* Author: 1811286                            *//
//* Week: 3                                    *//
//* Tutorial Task: 2                           *//
//* Description: print account A               *//
//*                                            *//
//* Date: 03/08/2020                           *//
//*                                            *//
//**********************************************//

class PrintAccountA {
	
	public static void main(String[] args) {
		PrintAccountATest account1 = new PrintAccountATest((float) 27.00, "Bob "); //Account 1 details
		PrintAccountATest account2 = new PrintAccountATest((float) -120.00, "Jimmy "); //Account 2 details
				
		System.out.printf(account1.getAccHolder() + "Balance: " + account1.getBalance()); //print out account 1 details
		System.out.println("");
		System.out.printf(account2.getAccHolder() + "Balance: " + account2.getBalance());//print out account 2 details
	}
}
class PrintAccountATest {
	
	private String name;  // Name string
	private float balance; //balance string
	
	public PrintAccountATest(float startBalance, String startName) {
		balance = startBalance;
		name = startName;
	}
	public String getAccHolder() { //the account holder	
		return name;
	}
	public float getBalance() { //the balance of the account
		return balance;
	}
	public void setName(String name) { //sets the name of the account holder
		this.name = name;
	}
	public void payIn(float balance) {//sets the balance
		this.balance += balance;
	}
}