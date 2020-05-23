package models.InanimateObjects.Weaponry;

import interfaces.Weapon;

public class BowAndArrow extends Weapon {
	
	public BowAndArrow() {
		this.setDamageStat(20);
		this.setWeightStat(8);
		this.setLevelRequirement(10);
		this.setIsOneHanded(false);
	}
	
}
