package models.InanimateObjects.Armor.Torso;

import interfaces.Armor;

public class HeavyChainMail extends Armor {
	
	public HeavyChainMail() {
		this.setProtectionRegion(ProtectionRegion.TORSO);
		this.setProtectionStat(50);
		this.setWeightStat(40);
		this.setLevelRequirement(20);
	}
}
