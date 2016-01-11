import java.util.Scanner;

 // For references, I utilized Google translate, Bablyon.com, and ImTranslator.net
 
public class Sprak implements UserPrompts 
{

	public static Scanner invalue = new Scanner(System.in);
	
	//@Override
	public int menu() 
	{
	 int selection = 1;
	 
	 System.out.println("\nKapittel 5 Demo-program");
	 System.out.println("Aksjon\t\t\t\tAlternativ");
	 System.out.println("Bytte ut to numre:\t\t1");
	 System.out.println("Bytte ut to tall i et matrise:\t2");
	 System.out.println("Endre språk:\t\t\t3");
	 System.out.println("Laste matrise:\t\t\t4");
	 System.out.println("Skrive ut matrise:\t\t5");
	 System.out.println("Slutte:\t\t\t\t0");
	 System.out.print("Angi alternativ:  ");
	 selection = invalue.nextInt();
	 if ((selection < 0) || (selection > 5))
	 {
	  System.out.println("Ugyldig valg, til bytte to tall");
	  selection = 1;
	 }
		return selection;
	}

//	@Override
	public int idSwapNrs(int[] intlist) 
	{
	 int itemindex = 0;
	 System.out.print("\n  Angi indeksen skal byttes: ");
	 itemindex = invalue.nextInt();
	 if ((itemindex < 0) || (itemindex > 19))
	 {
		System.out.println("Ugyldig oppføring, til indeks 3");
		itemindex = 3;
	 }
		return itemindex;
	}

//	@Override
	public String printHeader() 
	{
		String headstring = new String("Matrise");
		// TODO Auto-generated method stub
		return headstring;
	} // end of header string

//	@Override
	public String beforeSwap() 
	{
		String localstring = "\n ...Før Bytte...";
		return localstring;
	}  // end of beforeSwap

//	@Override
	public String afterSwap() {
		String localstring = "\n ...Etter Bytte...";
		return localstring;
	} // end of afterSwap

}
