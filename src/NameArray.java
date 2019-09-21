
public class NameArray {
	static final int MAX_NAMES = 4;
	int numberOfNames = 0;
	String[] names;
	
	public NameArray() {
		names = new String[MAX_NAMES];
		
		names[0] = "Frederick";
		names[1] = "Emily";
		names[2] = "Pebbles";
	}
	
	public Iterator createIterator() {
		return new SimpleArrayIterator(names);
	}
}
