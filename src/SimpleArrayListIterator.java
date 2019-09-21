import java.util.ArrayList;

public class SimpleArrayListIterator implements Iterator {
	ArrayList<String> names;
	int position = 0;
	
	public SimpleArrayListIterator(ArrayList<String> names) {
		this.names = names;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= names.size()) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public String next() {
		String name = names.get(position);
		position++;
		return name;
	}

}
