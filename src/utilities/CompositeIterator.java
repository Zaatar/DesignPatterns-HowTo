package utilities;

import java.util.Iterator;
import java.util.Stack;

import models.InanimateObjects.ArmorList;
import models.InanimateObjects.Forgeable;

public class CompositeIterator implements Iterator {
	Stack<Object> stack = new Stack<Object>();
	
	public CompositeIterator(Iterator<Forgeable> iterator) {
		stack.push(iterator);
	}
	
	public Object next() {
		if (hasNext()) {
			Iterator<Forgeable> iterator = (Iterator<Forgeable>) stack.peek();
			Forgeable forgeable = (Forgeable) iterator.next();
			if (forgeable instanceof ArmorList) {
				stack.push(forgeable);
			}
			return forgeable;
		} else {
			return null;
		}
	}

	@Override
	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		} else {
			Iterator<Forgeable> iterator = (Iterator<Forgeable>) stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
}
