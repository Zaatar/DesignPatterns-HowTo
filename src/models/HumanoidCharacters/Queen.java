package models.HumanoidCharacters;

import interfaces.GameCharacter;

public class Queen extends GameCharacter {
	
	public Queen() {
		this.setHealthPoints(90);
		this.setMagicPoints(120);
		this.setSpeed(70);
		this.setStamina(70);
		this.setStrength(50);
		this.setCharisma(100);
	}
}
