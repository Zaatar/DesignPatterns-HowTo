package models.InanimateObjects.Armor.Helmet;

import interfaces.Armor;

public class HeavyHelmet extends Armor {

	public HeavyHelmet() {
		this.setProtectionRegion(ProtectionRegion.HEAD);
		this.setProtectionStat(10);
		this.setWeightStat(7);
		this.setLevelRequirement(20);
	}
}

