package models.InanimateObjects.Weaponry;

import interfaces.Weapon;

public class Sword extends Weapon {

	public Sword() {
		this.setDamageStat(20);
		this.setWeightStat(10);
		this.setLevelRequirement(10);
		this.setIsOneHanded(true);
	}

}
