package models.HumanoidCharacters;

import interfaces.GameCharacter;

public class Magician extends GameCharacter {
	
	public Magician() {
		this.setHealthPoints(75);
		this.setMagicPoints(140);
		this.setSpeed(50);
		this.setStamina(50);
		this.setStrength(30);
		this.setCharisma(60);
	}

}
