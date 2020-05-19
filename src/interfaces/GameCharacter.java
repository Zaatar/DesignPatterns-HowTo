package interfaces;

public abstract class GameCharacter extends GameObject {
	private int HealthPoints;
	private int MagicPoints;
	private int Strength;
	private int Stamina;
	private int Speed;
	private int Charisma;
	private String Name;
	private Gender Gender;
	
	public enum Gender {
		MALE, FEMALE;
	}
	
	public enum CharacterChoice {
		KING, QUEEN, KNIGHT, MAGICIAN, DEMON, TROLL, MERMAID;
	}

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

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Gender getGender() {
		return Gender;
	}

	public void setGender(Gender gender) {
		Gender = gender;
	}
}
