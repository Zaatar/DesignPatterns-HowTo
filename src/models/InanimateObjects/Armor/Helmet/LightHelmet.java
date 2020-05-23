package models.InanimateObjects.Armor.Helmet;

import interfaces.Armor;

public class LightHelmet extends Armor{

	public LightHelmet() {
		this.setProtectionRegion(ProtectionRegion.HEAD);
		this.setProtectionStat(5);
		this.setWeightStat(5);
		this.setLevelRequirement(20);
	}
}
