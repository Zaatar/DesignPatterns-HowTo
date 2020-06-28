package utilities;

import java.util.Iterator;

import models.InanimateObjects.Forgeable;

public class NullIterator implements Iterator<Forgeable> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Forgeable next() {
		return null;
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
