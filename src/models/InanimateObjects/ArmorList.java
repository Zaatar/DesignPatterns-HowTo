package models.InanimateObjects;

import java.util.ArrayList;
import java.util.Iterator;

import utilities.CompositeIterator;

public class ArmorList implements Forgeable{
	Iterator<Forgeable> iterator = null;
	ArrayList<Forgeable> listofArmors = new ArrayList<Forgeable>();
	int protectionStat;
	int weightStat;
	int levelRequirement;

	@Override
	public void add(Forgeable forgeable) {
		listofArmors.add(forgeable);
	}

	@Override
	public void remove(Forgeable forgeable) {
		listofArmors.remove(forgeable);
		
	}

	@Override
	public Forgeable getChild(int x) {
		return (Forgeable)listofArmors.get(x);
	}

	@Override
	public int getProtectionStat() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getWeightStat() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getLevelRequirement() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<Forgeable> createIterator() {
		if(iterator == null) {
			iterator = new CompositeIterator(listofArmors.iterator());
		}
		return iterator;
	}

}
