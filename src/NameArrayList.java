import java.util.ArrayList;

public class NameArrayList {
	ArrayList<String> names;
	
	public NameArrayList() {
		names = new ArrayList<String>();
		names.add("Jack");
		names.add("Henry");
		names.add("Gracie");
		names.add("Jacob");	
	}
	
	public Iterator createIterator() {
		return new SimpleArrayListIterator(names);
	}
}
