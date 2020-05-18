package interfaces;

public abstract class Character extends GameObject {
	private int HealthPoints;
	private int MagicPoints;
	private int Strength;
	private int Stamina;
	private int Speed;
	private int Charisma;
	
	protected abstract void Attack();

	public int getHealthPoints() {
		return HealthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		HealthPoints = healthPoints;
	}

	public int getMagicPoints() {
		return MagicPoints;
	}

	public void setMagicPoints(int magicPoints) {
		MagicPoints = magicPoints;
	}

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}

	public int getStamina() {
		return Stamina;
	}

	public void setStamina(int stamina) {
		Stamina = stamina;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}

	public int getCharisma() {
		return Charisma;
	}

	public void setCharisma(int charisma) {
		Charisma = charisma;
	}
}
