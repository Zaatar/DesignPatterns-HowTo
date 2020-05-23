package models.InanimateObjects.Armor.Helmet;

import interfaces.Armor;

public class Tiara extends Armor {

	public Tiara() {
		this.setProtectionRegion(ProtectionRegion.HEAD);
		this.setProtectionStat(3);
		this.setWeightStat(1);
		this.setLevelRequirement(20);
	}
}
