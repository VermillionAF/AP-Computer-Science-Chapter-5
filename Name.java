
public class Name {
	private static String first, last;
	
	public Name(String firstName, String lastName) {
		first = firstName;
		last = lastName;
	}// end of public name
	
	public static boolean compareTo(String firstName, String lastName) {
		if (lastName.equalsIgnoreCase(last)) {
			if (firstName.equalsIgnoreCase(first)) {
				return true;
			} else {
				return false;
			}//end of if-last, not-first
		
		} else {
			return false;
		}//end of else
	}//end of compareTo
	
	public String toString() {
		String full = first + " " + last;
		return full;
	}// end of toString

}// end of class
