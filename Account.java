//******************************************************* 
// Account.java 
// 
// A bank account class with methods to deposit to, withdraw from, 
// change the name on, charge a fee to, and print a summary of the account. 
//******************************************************* 
public class Account {   
	private static int numAcc;
	private double balance;   
	private String name;   
	private long acctNum;   
	//----------------------------------------------   
	//Constructor -- initializes balance, owner, and account number   
	//----------------------------------------------   
	public Account(double initBal, String owner, long number)   {     
		balance = initBal;     
		name = owner;     
		acctNum = number;  
		numAcc++;
		}   
	public Account(String owner, long number)   {     
		balance = 0;     
		name = owner;     
		acctNum = number;
		numAcc++;
		}   
	//----------------------------------------------  
	// Checks to see if balance is sufficient for withdrawal.   
	// If so, decrements balance by amount; if not, prints message.  
	//----------------------------------------------  
	public void withdraw(double amount)   {     
		if (balance >= amount)      
			balance -= amount;    
		
		else        System.out.println("Insufficient funds"); 
		}  
	//----------------------------------------------
	 // Adds deposit amount to balance.  
	//----------------------------------------------   
	public void deposit(double amount)   {     
		balance += amount;
	}
	//----------------------------------------------   
	// Returns balance.   
	//----------------------------------------------  
	public double getBalance()   {   
		System.out.println(name + "'s account now has $" + balance + " in it.");
		return balance;
		}   
	//----------------------------------------------   
	// Returns a string containing the name, account number, and balance.  
	//----------------------------------------------  
	public String toString()   {  
		String info = ("Name: " + name + ", Balance: " + balance + ", Number: " + acctNum );
		System.out.println(info);
		return info;
	}   //----------------------------------------------  
	// Deducts $10 service fee  
	//----------------------------------------------   
	public void chargeFee()   {
		balance = balance - 10;
		System.out.println(name + "'s account now has $" + balance + " in it.");
		
	}   //----------------------------------------------   
	// Changes the name on the account  
	//----------------------------------------------  
	public void changeName(String newName)     {
		name = newName;
		System.out.println("The name on this account is now " + name);
	}
	public void transferFunds(double amount, Account person) {
		balance = balance - amount;
		person.deposit(amount);
	}
	public static int numAccounts() {
		return numAcc;
	}
	public void close(Account person) {
		person.name = "CLOSED";
		person.balance = 0;
		numAcc--;
	}
	public static void consolidate(Account p1, Account p2) {
		if (p1.name != "CLOSED") {
			Account made = new Account(p1.name, 12345);
		}
	}
	
		
	}
		
	
	