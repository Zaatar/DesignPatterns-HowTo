package interfaces;

public abstract class Armor {
	
	public enum ProtectionRegion {
		HEAD, TORSO, LEGS, ARMS
	}
	
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
}
