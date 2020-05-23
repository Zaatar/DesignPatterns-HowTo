package models.HumanoidCharacters;

import interfaces.GameCharacter;

public class Elf extends GameCharacter {
	
	public Elf() {
		this.setHealthPoints(80);
		this.setMagicPoints(120);
		this.setSpeed(80);
		this.setStamina(60);
		this.setStrength(50);
		this.setCharisma(120);
	}

}
