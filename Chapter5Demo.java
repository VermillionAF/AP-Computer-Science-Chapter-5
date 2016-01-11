// *************************************************
//  Chapter 5 Demo Program
//  Designer:  J.Foy
//  Revision History:
//   0:  11/23/2015
//
// *************************************************
//
// Exploration 1: Run the code, notice what happens when two integers are swapped vs
// two integers in an array.  Code will print out "before swap" twice, once before calling
// swap method; once at the beginning and inside of the method.  "After swap" also printed
// twice; once inside of swap method before return, once in "main" after control shifts back
// to main.  What is different about the two "after swap" results?
//
// Exploration 2: choose two world languages, preferably ones which will have necessary vocabulary
// (see class Language for vocabulary).  Languages that do not include words such as "array", i.e
// latin, Quechua, Navajo, Cherokee) might not be good candidates.
//
// Exploration 3: create two additional classes, one per chosen language.  With instructor help
// implement the same methods that you see in class Language, however Strings should be in the
// appropriate language.  You will need to edit Case 3 in "main" of this file so that it refers
// to your language classes.  Remember to create these two classes using guidance provided in
// paragraphs 5 and 6 of file "Ch5Demo.docx".   THIS WILL BE GRADED.  You will receive extra
// credit if you have a native speaker validate your vocabulary.  In your language file, list as
// comments your source for vocabulary (i.e. Google translate...)
//
// Exploration 4:  Modify Case 3 in "main" in this file, so that it calls a language selection menu.
// This will require adding a new method to interface "UserPrompts", and a new language specific
// method to each of the three language classes; Language plus your two classes.
//

import java.util.*;

public class Chapter5Demo 
{
	static public UserPrompts Language = new Language();
	static int languageindicator = 0;
	
// ************************************************************************
// method swap: swaps two integers, prints out pre-swap and post swap values
	
 public static void swap (int x, int y)
 {
	int temp;
	String swapstring;
	
	swapstring = Language.beforeSwap() + x + " , " + y;
	System.out.println(swapstring);
	temp = x;
	x = y;
	y = temp;
	swapstring = Language.afterSwap() + x + " , " + y;
	System.out.println(swapstring);
 }// end of method swap
//************************************************************************
// overloaded method swap: swaps two integers in an integer array, prints
// array pre and post values

 public static void swap(int[] integerlist, int x, int y)
 {
	 int temp;
	 String outstring;
	 
	 outstring = Language.beforeSwap();
	 System.out.println(outstring);
	 for (int i = 0; i < 20; i++)
		{
		 System.out.print(integerlist[i] + ", ");
		 if (((i + 1) % 10) == 0) System.out.println();
		}
	 
	 temp = integerlist[x];
	 integerlist[x] = integerlist[y];
	 integerlist[y] = temp;
	 outstring = Language.afterSwap();
	 System.out.println(outstring);
		for (int i = 0; i < 20; i++)
		{
		 System.out.print(integerlist[i] + ", ");
		 if (((i + 1) % 10) == 0) System.out.println();
		}
	 
 }
//************************************************************************
 public static void main(String[] args)
 {
	int selection;
	String outstring;
	boolean done = false;
	int[] intlist = new int[20];
	int n1, n2;
	Random generator = new Random();
	
	
	// load array intlist with random integers between 0 and 50
	
	for (int i = 0; i < 20; i++)
	{
		intlist[i] = generator.nextInt(51);
	}  // end of for
	
	while (!done)
	{
	selection = Language.menu();
	switch (selection)
	{
	case 0:
		done = true;
		break;
	case 1:        // swap two numbers.  Random generator creates integer between 0 and 5
			       // inclusive, then adds 5 to this for the second number to swap
		n1 = generator.nextInt(6);
		n2 = generator.nextInt(6) + 5;
		outstring = Language.beforeSwap() + n1 + " , " + n2;
		System.out.println(outstring);
		swap(n1, n2);
		outstring = Language.afterSwap() + n1 + " , " + n2;
		System.out.println(outstring);
		break;
	case 2:			// swap two numbers in array, print the array before and after swap
		n1 = Language.idSwapNrs(intlist);
		n2 = Language.idSwapNrs(intlist);
		outstring = Language.printHeader();
		System.out.println(outstring);
		outstring = Language.beforeSwap();
		System.out.println(outstring);
		for (int i = 0; i < 20; i++)
		{
		 System.out.print(intlist[i] + ", ");
		 if (((i + 1) % 10) == 0) System.out.println();
		}
		swap(intlist, n1, n2);
		outstring = Language.afterSwap();
		System.out.println(outstring);
		for (int i = 0; i < 20; i++)
		{
		System.out.print(intlist[i] + ", ");
		if (((i + 1) % 10) == 0) System.out.println();
		}
		break;
	
// Exploration 4: you will change these if statements to instead call some new method; i.e.
// languageMenu.  That method will need to be added to UserPrompts, and then implemented in
// the three language classes

// Exploration 3: you will have two languages of your choice, not Dutch or Russian.  Modify
// the following code appropriately.
		
	case 3:		// change to second or third language
		languageindicator++;
		if ((languageindicator % 3) == 0)
		  Language = new Language();
		if ((languageindicator % 3) == 1)
		  Language = new Sprak();
		if ((languageindicator % 3) == 2)
			Language = new Lang2();
		break;
	case 4:			// reload array
		for (int i = 0; i < 20; i++)
		{
			intlist[i] = generator.nextInt(51);
		}  // end of for
		break;
	case 5:		// print array
		outstring = Language.printHeader();
		System.out.println(outstring);
		for (int i = 0; i < 20; i++)
		{
		 System.out.print(intlist[i] + ", ");
		 if (((i + 1) % 10) == 0) System.out.println();
		}
		break;
	} // end of switch
	} // end of while !done
 } // end of main
 
}  // end of class
