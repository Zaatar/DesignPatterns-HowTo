package models.NonHumanCharacters;

import interfaces.GameCharacter;

public class Demon extends GameCharacter {
	
	public Demon() {
		this.setHealthPoints(125);
		this.setMagicPoints(90);
		this.setSpeed(80);
		this.setStamina(30);
		this.setStrength(50);
		this.setCharisma(80);
	}
}
