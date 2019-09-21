
public class NamePrinter {
	NameArray nameArray;
	NameArrayList nameArrayList;
	
	public NamePrinter(NameArray nameArray, NameArrayList nameArrayList) {
		this.nameArray = nameArray;
		this.nameArrayList = nameArrayList;
	}
	
	public void printNames() {
		Iterator nameArrayIterator = nameArray.createIterator();
		Iterator nameArrayListIterator = nameArrayList.createIterator();
		System.out.println("Array of Names:");
		printNames(nameArrayIterator);
		System.out.println("\nArrayList of Names:");
		printNames(nameArrayListIterator);
	}
	
	public void printNames(Iterator iterator) {
		while (iterator.hasNext()) {
			String name = (String)iterator.next();
			System.out.println(name);
		}
	}
}
