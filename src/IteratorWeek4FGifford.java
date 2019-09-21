/*
 * Frederick Gifford
 * CPSC-60000 Week 4 Iterator Pattern
 * Gave an Array and an ArrayList of Strings (names) a common Iterator interface
 * So a common set of methods could be applied to iterate over and print the 
 * lists of names in the separate data structures
 * 9.21.2019
 * Prof Nowak
 */


public class IteratorWeek4FGifford {

	public static void main(String[] args) {
		System.out.println("Frederick Gifford\nCPSC-60000\nWeek 4 Iterator Pattern\n");
		
		NameArray nameArray = new NameArray();
		NameArrayList nameArrayList = new NameArrayList();
		NamePrinter namePrinter = new NamePrinter(nameArray, nameArrayList);
		namePrinter.printNames();
		

	}

}
