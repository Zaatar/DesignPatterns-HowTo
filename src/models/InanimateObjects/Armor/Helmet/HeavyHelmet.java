package models.InanimateObjects.Armor.Helmet;

import java.util.Iterator;

import interfaces.Armor;
import models.InanimateObjects.Forgeable;
import utilities.NullIterator;

public class HeavyHelmet extends Armor implements Forgeable {

	public HeavyHelmet() {
		this.setProtectionRegion(ProtectionRegion.HEAD);
		this.setProtectionStat(10);
		this.setWeightStat(7);
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

