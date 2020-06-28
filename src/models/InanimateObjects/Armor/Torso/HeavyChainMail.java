package models.InanimateObjects.Armor.Torso;

import java.util.Iterator;

import interfaces.Armor;
import models.InanimateObjects.Forgeable;
import utilities.NullIterator;

public class HeavyChainMail extends Armor implements Forgeable {
	
	public HeavyChainMail() {
		this.setProtectionRegion(ProtectionRegion.TORSO);
		this.setProtectionStat(50);
		this.setWeightStat(40);
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
