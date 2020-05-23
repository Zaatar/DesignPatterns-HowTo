package models.HumanoidCharacters;

import interfaces.GameCharacter;

public class Dwarf extends GameCharacter {
	
	public Dwarf() {
		this.setHealthPoints(150);
		this.setMagicPoints(40);
		this.setSpeed(40);
		this.setStamina(100);
		this.setStrength(80);
		this.setCharisma(40);
	}
	
}
