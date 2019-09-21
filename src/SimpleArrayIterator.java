

public class SimpleArrayIterator implements Iterator {
	
	String[] names;
	int position = 0;
	
	public SimpleArrayIterator(String[] names) {
		this.names = names;
	}
	
	public boolean hasNext() {
		if (position >= names.length || names[position] == null) {
			return false;
		} else {
			return true;
		}
		
	}

	@Override
	public String next() {
		String name = names[position];
		position++;
		return name;
	}

}
