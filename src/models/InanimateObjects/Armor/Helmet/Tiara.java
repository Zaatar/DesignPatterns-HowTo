package models.InanimateObjects.Armor.Helmet;

import java.util.Iterator;

import interfaces.Armor;
import models.InanimateObjects.Forgeable;
import utilities.NullIterator;

public class Tiara extends Armor implements Forgeable {

	public Tiara() {
		this.setProtectionRegion(ProtectionRegion.HEAD);
		this.setProtectionStat(3);
		this.setWeightStat(1);
		this.setLevelRequirement(20);
	}

	@Override
	public void add(Forgeable forgeable) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void remove(Forgeable forgeable) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public Forgeable getChild(int x) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Iterator<Forgeable> createIterator() {
		return new NullIterator();
	}
}
