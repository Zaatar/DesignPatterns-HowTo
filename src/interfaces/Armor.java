package interfaces;

import models.InanimateObjects.ArmorState;
import models.InanimateObjects.Armor.States.CoolingState;
import models.InanimateObjects.Armor.States.HammeringState;
import models.InanimateObjects.Armor.States.MaterialsState;
import models.InanimateObjects.Armor.States.MeldingState;

public abstract class Armor {
	
	public enum ProtectionRegion {
		HEAD, TORSO, LEGS, ARMS
	}
	
	public ArmorState armorState;
	public ArmorState coolingState;
	public ArmorState hammeringState;
	public ArmorState materialsState;
	public ArmorState meldingState;
	private ProtectionRegion ProtectionRegion;
	private int ProtectionStat;
	private int WeightStat;
	private int LevelRequirement;
	private String[] StatusEffects;
	
	public ProtectionRegion getProtectionRegion() {
		return ProtectionRegion;
	}
	public void setProtectionRegion(ProtectionRegion protectionRegion) {
		ProtectionRegion = protectionRegion;
	}
	public int getProtectionStat() {
		return ProtectionStat;
	}
	public void setProtectionStat(int protectionStat) {
		ProtectionStat = protectionStat;
	}
	public int getWeightStat() {
		return WeightStat;
	}
	public void setWeightStat(int weightStat) {
		WeightStat = weightStat;
	}
	public int getLevelRequirement() {
		return LevelRequirement;
	}
	public void setLevelRequirement(int levelRequirement) {
		LevelRequirement = levelRequirement;
	}
	public String[] getStatusEffects() {
		return StatusEffects;
	}
	public void setStatusEffects(String[] statusEffects) {
		StatusEffects = statusEffects;
	}
	
	public void setState(ArmorState state) {
		this.armorState = state;
	}
	
	public ArmorState getCoolingState() {
		return new CoolingState(this);
	}
	
	public ArmorState getMaterialsState() {
		return new MaterialsState(this);
	}
	
	public ArmorState getMeldingState() {
		return new MeldingState(this);
	}
	
	public ArmorState getHammeringState() {
		return new HammeringState(this);
	}
	
	public void hammerNails() {
		armorState.hammerNails();
	}
	
	public void meldMaterials() {
		armorState.meldMaterials();
	}
	
	public void coolMaterials() {
		armorState.coolMaterials();
	}
	
	public void finishingTouches() {
		armorState.finishingTouches();
	}
}
