package models.InanimateObjects.Weaponry;

import interfaces.Weapon;

public class Axe extends Weapon {

	public Axe() {
		this.setDamageStat(40);
		this.setWeightStat(20);
		this.setLevelRequirement(10);
		this.setIsOneHanded(false);
	}

}
