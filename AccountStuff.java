import java.util.*;
public class AccountStuff {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert three names: ");
		String n1 = scan.next(); 
		String n2 = scan.next(); 
		String n3 = scan.next();
		Account a1 = new Account(100, n1, 44444); 
		Account a2 = new Account(100, n2, 55555); 
		Account a3 = new Account(100, n3, 66666);
		a1.toString(); a2.toString(); a3.toString();
		a1.close();
		Account a4 = Account.consolidate(a2, a3);
		a1.toString(); a2.toString(); a3.toString(); a4.toString();
		
	}
}
