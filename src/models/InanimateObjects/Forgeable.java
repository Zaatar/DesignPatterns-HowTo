package models.InanimateObjects;

import java.util.Iterator;

public interface Forgeable {
	public void add(Forgeable forgeable);
	public void remove(Forgeable forgeable);
	public Forgeable getChild(int x);
	public int getProtectionStat();
	public int getWeightStat();
	public int getLevelRequirement();
	public Iterator<Forgeable> createIterator();
}
