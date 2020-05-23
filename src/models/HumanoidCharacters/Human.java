package models.HumanoidCharacters;

import interfaces.GameCharacter;

public class Human extends GameCharacter {
	
	public Human() {
		this.setHealthPoints(80);
		this.setMagicPoints(120);
		this.setSpeed(80);
		this.setStamina(60);
		this.setStrength(50);
		this.setCharisma(120);
	}
	
}
