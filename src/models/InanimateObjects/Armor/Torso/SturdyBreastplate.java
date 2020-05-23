package models.InanimateObjects.Armor.Torso;

import interfaces.Armor;

public class SturdyBreastplate extends Armor {
	
	public SturdyBreastplate() {
		this.setProtectionRegion(ProtectionRegion.TORSO);
		this.setProtectionStat(20);
		this.setWeightStat(10);
		this.setLevelRequirement(20);
	}

}
