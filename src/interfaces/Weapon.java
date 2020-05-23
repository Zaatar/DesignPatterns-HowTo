package interfaces;

public class Weapon {
	
	private int DamageStat;
	private int WeightStat;
	private int LevelRequirement;
	private String[] StatusEffects;
	private boolean IsOneHanded;
	
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
	public boolean isOneHanded() {
		return IsOneHanded;
	}
	public void setIsOneHanded(boolean isOneHanded) {
		IsOneHanded = isOneHanded;
	}
	public int getDamageStat() {
		return DamageStat;
	}
	public void setDamageStat(int damageStat) {
		DamageStat = damageStat;
	}

}
