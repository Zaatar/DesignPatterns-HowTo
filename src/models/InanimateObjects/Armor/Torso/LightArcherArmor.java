package models.InanimateObjects.Armor.Torso;

import java.util.Iterator;

import interfaces.Armor;
import models.InanimateObjects.Forgeable;
import utilities.NullIterator;

public class LightArcherArmor extends Armor implements Forgeable {
	
	public LightArcherArmor() {
		this.setProtectionRegion(ProtectionRegion.TORSO);
		this.setProtectionStat(20);
		this.setWeightStat(10);
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
