import java.util.*;
public class NameStuff {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert a first and last name: ");
		String one = scan.next();
		String two = scan.next();
		System.out.println("Insert a first and last name to compare: ");
		String three = scan.next();
		String four = scan.next();
		String name1 = one + " " + two;
		String name2 = three + " " + four;
		if (name1.equalsIgnoreCase(name2)) {
			System.out.println(name1 + " = " + name2);
		} else {
			if (name1.compareTo(name2) > 0) {
				System.out.println(name1 + " > " + name2);
			} else if (name1.compareTo(name2) < 0) {
				System.out.println(name1 + " < " + name2);
			}
		}
	}// end of main

}
