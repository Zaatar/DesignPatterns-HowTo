package models.HumanoidCharacters;

import interfaces.GameCharacter;

public class King extends GameCharacter {
	
	public King() {
		this.setHealthPoints(100);
		this.setMagicPoints(100);
		this.setSpeed(75);
		this.setStamina(75);
		this.setStrength(60);
		this.setCharisma(100);
	}
}
