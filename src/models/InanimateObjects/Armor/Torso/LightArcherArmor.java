package models.InanimateObjects.Armor.Torso;

import interfaces.Armor;

public class LightArcherArmor extends Armor {
	
	public LightArcherArmor() {
		this.setProtectionRegion(ProtectionRegion.TORSO);
		this.setProtectionStat(20);
		this.setWeightStat(10);
		this.setLevelRequirement(20);
	}

}
