package models.NonHumanCharacters;

import interfaces.GameCharacter;

public class Troll extends GameCharacter {
	
	public Troll() {
		this.setHealthPoints(200);
		this.setMagicPoints(20);
		this.setSpeed(30);
		this.setStamina(50);
		this.setStrength(80);
		this.setCharisma(0);
	}

}
